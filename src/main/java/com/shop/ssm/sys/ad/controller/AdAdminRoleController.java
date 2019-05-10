package com.shop.ssm.sys.ad.controller;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ad.model.AdAdmin;
import com.shop.ssm.sys.ad.model.AdAdminRole;
import com.shop.ssm.sys.ad.model.AdRole;
import com.shop.ssm.sys.ad.service.IAdRolePerService;
import com.shop.ssm.sys.ad.service.IAdRoleService;
import com.shop.ssm.sys.ad.service.IAdminRoleService;
import com.shop.ssm.sys.ad.vo.AdAdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/admin/AdminRole")
public class AdAdminRoleController {
    @Autowired
    private IAdminRoleService adminRoleService;

    @Autowired
    private IAdRolePerService adRolePerService;
    @Autowired
    private IAdRoleService adRoleService;
    @ModelAttribute
    public void inti(Model model){
        AdAdminRole adAdminRole = new AdAdminRole();
        AdRole adRole = new AdRole();
        AdAdminVo adAdminVo = new AdAdminVo();
        model.addAttribute("adAdminRole",adAdminRole);
        model.addAttribute("adRole",adRole);
        model.addAttribute("adAdminVo",adAdminVo);
    }

    @RequestMapping("/toAdminRole")
    public String toAdminRole(){
        return "admin/admin-role";
    }

    @RequestMapping("/toAdminRoleAdd")
    public String toAdminRoleAdd(){
        return "admin/admin-role-add";
    }

    @RequestMapping("/shop/toAdminList")
    public String toAdminList(){
        return "admin/admin-list";
    }

    @RequestMapping("/shop/toAdminAdd")
    public String toAdminAdd(){
        return "admin/admin-add";
    }

    @RequestMapping("/roleOfAdmin")
    public ModelAndView roleOfAdmin(AdRole adRole, ModelAndView modelAndView, HttpServletRequest req){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<AdRole> adRoles = adminRoleService.roleOfAdmin(adRole, pageBean);
        modelAndView.addObject("adRlPageBean",pageBean);
        modelAndView.addObject("roleOfAdmins",adRoles);
        modelAndView.setViewName("admin/admin-role");
        return modelAndView;
    }

    @RequestMapping("/adminOfRole")
    public ModelAndView adminOfRole(AdAdminVo adAdminVo, ModelAndView modelAndView, HttpServletRequest req){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<AdAdmin> adAdmins = adminRoleService.adminOfRole(adAdminVo, pageBean);
        modelAndView.addObject("adAdPageBean",pageBean);
        modelAndView.addObject("adminOfRoles",adAdmins);
        modelAndView.setViewName("admin/admin-list");
        return modelAndView;
    }

    @RequestMapping("/insertRole")
    public ModelAndView insertRole(AdRole adRole,ModelAndView modelAndView){
        System.err.println(adRole);
        adRoleService.insertSelective(adRole);
        adRolePerService.insertRole(adRole);
        modelAndView.setViewName("redirect:admin/AdminRole/toAdminRoleAdd");
        return modelAndView;
    }
}
