package com.shop.ssm.sys.or.controller;


import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ia.model.IaNews;
import com.shop.ssm.sys.ia.model.IaState;
import com.shop.ssm.sys.ia.model.IaType;
import com.shop.ssm.sys.or.model.Orstorage;
import com.shop.ssm.sys.or.service.IOrstorageService;
import com.shop.ssm.sys.pd.model.PdProduce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/or/orstorage")
public class OrstorageController {

    @Autowired
    private  IOrstorageService orstorageService;

    @ModelAttribute
    public void init(Model model){
        Orstorage orstorage=new Orstorage();
        model.addAttribute("orstorage",orstorage);
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "or/orstorage-add";
    }
    @RequestMapping("addorstorage")
    public String addorstorage(Orstorage orstorage, Model model, HttpServletResponse response) throws Exception{
        orstorageService.insert(orstorage);
        PrintWriter out = response.getWriter();
        out.print("<script>window.parent.location.href='list';</script>");
        out.flush();
        out.close();
        return null;
    }


    @RequestMapping("/del")
    public String del(Orstorage orstorage,Model model){
        boolean b = model.containsAttribute("orstorage");
        orstorageService.deleteByPrimaryKey(orstorage);
        return "redirect:/or/orstorage/list";
    }

    @RequestMapping("/edit")
    public ModelAndView edit(Orstorage orstorage, ModelAndView modelAndView){
        Orstorage orstorage1 = orstorageService.selectByPrimaryKey(orstorage);
        modelAndView.addObject("orstorage1",orstorage1);
        modelAndView.setViewName("or/orstorage-edit");
        return modelAndView;
    }


    @RequestMapping("/update")
    public String update(Orstorage orstorage,HttpServletResponse response) throws Exception{
        orstorageService.updateByPrimaryKey(orstorage);
        return "redirect:/or/orstorage/list";
    }

    @RequestMapping("/list")
    public ModelAndView list(Orstorage orstorage, PdProduce pdProduce, ModelAndView modelAndView, HttpServletRequest req, PageBean pageBean){
        //分页初始化
        pageBean.setRequest(req);
        System.out.println(pageBean);
        List<Orstorage> orstorageList = orstorageService.listOrstorage(orstorage, pageBean);
       // List<IaState> iaStatelist = iaStateService.list(iaState);
        modelAndView.addObject("orstorageList",orstorageList);
        modelAndView.addObject("pageBean",pageBean);
       // modelAndView.addObject("IaNewslist",IaNewslist);
        modelAndView.setViewName("or/orstorage-list");
        return modelAndView;
    }


}
