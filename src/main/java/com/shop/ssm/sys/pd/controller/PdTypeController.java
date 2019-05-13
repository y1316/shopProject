package com.shop.ssm.sys.pd.controller;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.pd.model.PdType;
import com.shop.ssm.sys.pd.service.IPdTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/pd/pdTp")
public class PdTypeController {

    @Autowired
    private IPdTypeService pdTypeService;

    @ModelAttribute
    public void init(Model model){
        PdType pt = new PdType();
        model.addAttribute("pdType",pt);
    }

    @RequestMapping("/toProductCategory")
    public String toProductCategory(){
        return "pd/product-category";
    }

    @RequestMapping("/toProductCategoryAdd")
    public String toProductCategoryAdd(){
        return "pd/product-category-add";
    }



    @RequestMapping("/toAddPdType")
    public String toAddPdType(){
        return "addPdType";
    }

    @RequestMapping("/addPdType")
    public @ResponseBody
    void add(PdType pdType, ModelAndView modelAndView, HttpServletResponse response)throws Exception{
        pdTypeService.insert(pdType);
        PrintWriter out = response.getWriter();
        out.println("<script>window.parent.location.href='listPdType?path=list';</script>");
        out.flush();
        out.close();
    }

    @RequestMapping("/listPdType")
    public ModelAndView listPdType(PdType pdType, ModelAndView modelAndView, HttpServletRequest request){
        PageBean pageBean = new PageBean();
        pageBean.setPage(1);
        pageBean.setRows(10);
        pageBean.setRequest(request);
        List<PdType> pdTypeList = pdTypeService.list(pdType,pageBean);
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.addObject("pdTypeList",pdTypeList);
        String pa = request.getParameter("path");
        if (pa.equals("add")){
            modelAndView.setViewName("forward:/pd/pdPd/toProductAdd");
        }
        if(pa.equals("list")){
            modelAndView.setViewName("forward:/pd/pdTp/toProductCategory");
        }
        return modelAndView;
    }


}
