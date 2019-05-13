package com.shop.ssm.sys.ad.controller;

import com.shop.ssm.sys.ad.model.AdRole;
import com.shop.ssm.sys.ad.model.AdRolePermission;
import com.shop.ssm.sys.ad.service.IAdRolePerService;
import com.shop.ssm.sys.ad.service.IAdRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/RolePer")
public class AdRolePerController {
    @Autowired
    private IAdRolePerService adRolePerService;
    @Autowired
    private IAdRoleService adRoleService;

    @ModelAttribute
    public void inti(Model model){
        AdRolePermission adRolePermission = new AdRolePermission();
        AdRole adRole =  new AdRole();
        model.addAttribute("adRolePermission",adRolePermission);
        model.addAttribute("adRole",adRole);
    }

    @RequestMapping("/insertRole")
    public ModelAndView insertRole(AdRole adRole,ModelAndView modelAndView){
        adRoleService.insertSelective(adRole);
        adRolePerService.insertRole(adRole);
        modelAndView.setViewName("redirect:admin/AdminRole/toAdminRoleAdd");
        return modelAndView;
    }
}
