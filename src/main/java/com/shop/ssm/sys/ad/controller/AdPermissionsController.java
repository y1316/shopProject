package com.shop.ssm.sys.ad.controller;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ad.model.AdPermissions;
import com.shop.ssm.sys.ad.service.IAdPermissionsService;
import org.apache.shiro.authc.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/admin/AdPer")
public class AdPermissionsController {
    @Autowired
    private IAdPermissionsService adPermissionsService;

    @ModelAttribute
    public void init(Model model) {
        AdPermissions adPermissions = new AdPermissions();
        model.addAttribute("adPermissions", adPermissions);
    }

    @RequestMapping("/toAdminPermission")
    public String toAdminPermission() {
        return "admin/admin-permission";
    }

    @RequestMapping("/toAdminPermissionAdd")
    public String toAdminPermissionAdd() {
        return "admin/admin-permission-add";
    }

    @RequestMapping("/add")
//    @ResponseBody
    public String add(AdPermissions adPermissions, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "admin/admin-permission-add";
        }
        adPermissionsService.insert(adPermissions);
        return "admin/admin-permission-add";
    }

    @RequestMapping("/listPer")
    public ModelAndView listAdPer(AdPermissions adPermissions, ModelAndView modelAndView, HttpServletRequest req) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<AdPermissions> list = adPermissionsService.list(adPermissions, pageBean);
        modelAndView.addObject("pageBean", pageBean);
        modelAndView.addObject("adPermissionsList", list);
        modelAndView.setViewName("admin/admin-permission");
        return modelAndView;
    }

//    public String

}
