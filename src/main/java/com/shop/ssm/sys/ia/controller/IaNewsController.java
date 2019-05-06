package com.shop.ssm.sys.ia.controller;


import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ia.model.IaNews;
import com.shop.ssm.sys.ia.service.IiaNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/article/ia")
public class IaNewsController {

    @Autowired
    private IiaNewsService iiaNewsService;

    @ModelAttribute
    public void init(Model model){
        IaNews iaNews = new IaNews();
        model.addAttribute("iaNews",iaNews);
    }


    @RequestMapping("/list")
    public ModelAndView list(IaNews iaNews, ModelAndView modelAndView, HttpServletRequest req, PageBean pageBean){
        //分页初始化
        pageBean.setRequest(req);
        System.out.println(pageBean);
        List<IaNews> list = iiaNewsService.list(iaNews, pageBean);
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.addObject("list",list);
        modelAndView.setViewName("article/list");
        return modelAndView;
    }

}
