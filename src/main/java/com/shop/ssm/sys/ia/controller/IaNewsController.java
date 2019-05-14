package com.shop.ssm.sys.ia.controller;


import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ia.model.IaNews;
import com.shop.ssm.sys.ia.model.IaState;
import com.shop.ssm.sys.ia.model.IaType;
import com.shop.ssm.sys.ia.service.IaStateService;
import com.shop.ssm.sys.ia.service.IaTypeService;
import com.shop.ssm.sys.ia.service.IiaNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.lang.model.type.NoType;
import javax.servlet.http.HttpServletRequest;
import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/ia/article")
public class IaNewsController {

    @Autowired
    private IiaNewsService iiaNewsService;
    @Autowired
    private IaTypeService iaTypeService;
    @Autowired
    private IaStateService iaStateService;

    @ModelAttribute
    public void init(Model model){
        IaNews iaNews = new IaNews();
        IaType iaType=new IaType();
        IaState iaState=new IaState();
        model.addAttribute("iaType" ,iaType);
        model.addAttribute("iaNews",iaNews);
        model.addAttribute("iaState",iaState);
    }

    @RequestMapping("toArticleList")
    public String toArticleList(){
        return "ia/article-list";
    }

    @RequestMapping("toArticle")
    public String toArticle(){
        return "ia/article/article-add";
    }

    @RequestMapping("/shop/toproduce")
    public String toproduct(){
        return "ia/picture-add";
    }

    @RequestMapping("/shop/topicturt")
    public String topicture(){
        return "ia/product-add";
    }

    @RequestMapping("/shop/tomember")
    public String tomember(){
        return "ia/member-add";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "ia/article-add";
    }


    @RequestMapping("addInews")
    public String addInews(IaNews iaNews, Model model){
        iiaNewsService.insert(iaNews);
        return "ia/article-list";
    }

    @RequestMapping("/del")
    public String del(IaNews iaNews,Model model){
        boolean b = model.containsAttribute("iaNews");
        iiaNewsService.deleteByPrimaryKey(iaNews);
        return "redirect:/ia/article/list";
    }


//    @RequestMapping("/edit")
//    public ModelAndView edit(IaNews iaNews,ModelAndView modelAndView){
//        IaNews iaNews1 = iiaNewsService.selectByPrimaryKey(iaNews);
//        modelAndView.addObject("iaNews1",iaNews1);
//        modelAndView.setViewName("ia/article-edit");
//        return modelAndView;
//    }


    @RequestMapping("/iaTypelist")
    public ModelAndView iaTypelist(IaType iaType, ModelAndView modelAndView){
        List<IaType> iaTypelist = iaTypeService.list(iaType);
        modelAndView.addObject("iaTypelist",iaTypelist);
        modelAndView.setViewName("ia/article-add");
        return modelAndView;
    }

    @RequestMapping("/Typelist")
    public ModelAndView Typelist(IaType iaType, ModelAndView modelAndView,IaNews iaNews){
        List<IaType> Typelist = iaTypeService.list(iaType);
        IaNews iaNews1 = iiaNewsService.selectByPrimaryKey(iaNews);
        modelAndView.addObject("iaNews1",iaNews1);
        modelAndView.addObject("Typelist",Typelist);
        modelAndView.setViewName("ia/article-edit");
        return modelAndView;
    }


    @RequestMapping("/update")
    public String update(IaNews iaNews){
        iiaNewsService.updateByPrimaryKey(iaNews);
        return "redirect:/ia/article/list";
    }

    @RequestMapping("/list")
    public ModelAndView list(IaNews iaNews,IaState iaState, ModelAndView modelAndView, HttpServletRequest req, PageBean pageBean){
        //分页初始化
        pageBean.setRequest(req);
        System.out.println(pageBean);
        List<IaNews> IaNewslist = iiaNewsService.list(iaNews, pageBean);
        List<IaState> iaStatelist = iaStateService.list(iaState);
        modelAndView.addObject("iaStatelist",iaStatelist);
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.addObject("IaNewslist",IaNewslist);
        modelAndView.setViewName("ia/article-list");
        return modelAndView;
    }

}
