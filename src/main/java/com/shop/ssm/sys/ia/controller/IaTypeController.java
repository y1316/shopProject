package com.shop.ssm.sys.ia.controller;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ia.model.IaNews;
import com.shop.ssm.sys.ia.model.IaType;
import com.shop.ssm.sys.ia.service.IaTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/ia/iaType")
public class IaTypeController {

//    @Autowired
//    private IaTypeService iaTypeService;
//
//    @ModelAttribute
//    public void init(Model model){
//        IaType iaType=new IaType();
//        model.addAttribute("iaType" ,iaType);
//    }
//
//    @RequestMapping("/IaNewslist")
//    public ModelAndView IaNewslist(IaType iaType, ModelAndView modelAndView){
//        List<IaType> IaNewslist = iaTypeService.list(iaType);
//        modelAndView.addObject("IaNewslist",IaNewslist);
//        modelAndView.setViewName("ia/article-add");
//        return modelAndView;
//    }



}
