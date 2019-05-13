package com.shop.ssm.sys.pd.controller;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.pd.model.PdProduce;
import com.shop.ssm.sys.pd.service.IPdProduceService;
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
@RequestMapping("pd/pdPd")
public class PdProduceController {
    @Autowired
    private IPdProduceService pdProduceService;

    @ModelAttribute
    public void init(Model model){
        PdProduce pp = new PdProduce();
        model.addAttribute("pdProduce",pp);
    }

    @RequestMapping("/toProductAdd")
    public String toProductAdd(){
        return "/pd/product-add";
    }

    @RequestMapping("/toListPdProduce")
    public String toList(){
        return "pd/product-list";
    }

    @RequestMapping("/toProductUpdate")
    public String toProductUpdate(){
        return "pd/product-edit";
    }


    @RequestMapping("/addPdProduce")
    public @ResponseBody void add(PdProduce pdProduce,ModelAndView modelAndView,HttpServletResponse response)throws Exception{
        pdProduce.setPimage(pdProduce.getPimage().replace("C:\\fakepath\\","image/"));
        pdProduceService.insert(pdProduce);
        PrintWriter out = response.getWriter();
        out.println("<script>window.parent.location.href='listPdProduce';</script>");
        out.flush();
        out.close();
    }

    @RequestMapping("/deletePdProduce")
    public @ResponseBody void deletePdProduce(PdProduce pdProduce, ModelAndView modelAndView, HttpServletResponse response)throws  Exception{
        pdProduceService.deleteByPrimaryKey(pdProduce);
        PrintWriter out = response.getWriter();
        out.print("<script>window.parent.location.href='listPdProduce';</script>");
        out.flush();
        out.close();
    }

    @RequestMapping("/listPdProduce")
    public ModelAndView listPdProduce(PdProduce pdProduce, ModelAndView modelAndView, HttpServletRequest request){
        PageBean pageBean = new PageBean();
        pageBean.setPage(1);
        pageBean.setRows(10);
        pageBean.setRequest(request);
        List<PdProduce> pdProduceList = pdProduceService.list(pdProduce,pageBean);
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.addObject("pdProduceList",pdProduceList);
        modelAndView.setViewName("pd/product-list");
        return modelAndView;
    }

    @RequestMapping("/updatePdProduce")
    public String updatePdProduce(PdProduce pdProduce,Model model){
        pdProduce.setPimage(pdProduce.getPimage().replace("C:\\fakepath\\","image/"));
        pdProduceService.updateByPrimaryKeySelective(pdProduce);
        return "redirect:/pd/pdPd/listPdProduce";
    }


    @RequestMapping("/selectPdProduce")
    public ModelAndView selectPdProduce(Integer id,ModelAndView modelAndView,HttpServletRequest req){
        String prid = req.getParameter("prid");
        PdProduce produce = pdProduceService.selectByPrimaryKey(new Integer(prid));
        modelAndView.addObject("produce",produce);
        modelAndView.setViewName("pd/product-edit");
        return modelAndView;
    }
}
