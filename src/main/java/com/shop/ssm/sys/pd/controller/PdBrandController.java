package com.shop.ssm.sys.pd.controller;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ad.model.AdPermissions;
import com.shop.ssm.sys.pd.model.PdBrand;
import com.shop.ssm.sys.pd.service.IPdBrandService;
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
@RequestMapping("/pd/pdBc")
public class PdBrandController {

    @Autowired
    private IPdBrandService pdBrandService;

    @ModelAttribute
    public void init(Model model){
        PdBrand pb = new PdBrand();
        model.addAttribute("pdBrand",pb);
    }
    @RequestMapping("/toProductBrand")
    public String toProductBrand(){
        return "pd/product-brand";
    }

    @RequestMapping("/toAddPdBrand")
    public String toAddPdBrand(){
        return "addPdBrand";
    }

    @RequestMapping("/toUpdatePdBrand")
    public String toUpdatePdBrand(){
        return "pd/product-brand-edit";
    }

    @RequestMapping("/addPdBrand")
//    @ResponseBody
    public String addtPdBrand(PdBrand pdBrand,Model model){
//        boolean p = model.containsAttribute("pb");
//        System.out.println(p);
        pdBrand.setBlogo(pdBrand.getBlogo().replace("C:\\fakepath\\","image/"));
        System.err.println(pdBrand.getBlogo());
//        pdBrand.getBlogo().substring()
        pdBrandService.insert(pdBrand);
        return "redirect:/pd/pdBc/listPdBrand";
    }

    @RequestMapping("/listPdBrand")
    public ModelAndView listPdBrand(PdBrand pdBrand, ModelAndView modelAndView, HttpServletRequest request){
        PageBean pageBean = new PageBean();
        pageBean.setPage(1);
        pageBean.setRows(10);
        pageBean.setRequest(request);
        List<PdBrand> pdBrandList = pdBrandService.list(pdBrand,pageBean);
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.addObject("pdBrandList",pdBrandList);
        modelAndView.setViewName("pd/product-brand");
        return modelAndView;
    }

    @RequestMapping("/deletePdBrand")
    public @ResponseBody void deletePdBrand(PdBrand pdBrand, ModelAndView modelAndView, HttpServletResponse response)throws  Exception{
        pdBrandService.deleteByPrimaryKey(pdBrand);
        PrintWriter out = response.getWriter();
        out.print("<script>window.parent.location.href='listPdBrand';</script>");
        out.flush();
        out.close();
    }

    @RequestMapping("/updatePdBrand")
    public String updatePdBrand(PdBrand pdBrand, Model model){
        boolean pdb = model.containsAttribute("pb");
        System.out.println(pdb);
        pdBrandService.updateByPrimaryKeySelective(pdBrand);
        return "redirect:/pd/pdBc/listPdBrand";
    }

    @RequestMapping("/selectPdBrand")
    public ModelAndView selectPdBrand(Integer id,ModelAndView modelAndView,HttpServletRequest request){
        String bid = request.getParameter("bid");
        PdBrand brand = pdBrandService.selectByPrimaryKey(new Integer(bid));
        modelAndView.addObject("brand",brand);
        modelAndView.setViewName("pd/product-brand-edit");
        return modelAndView;
    }
}
