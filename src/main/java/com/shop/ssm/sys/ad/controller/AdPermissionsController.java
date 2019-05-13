package com.shop.ssm.sys.ad.controller;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ad.model.AdPermissions;
import com.shop.ssm.sys.ad.service.IAdPermissionsService;
import com.shop.ssm.sys.ad.service.IPsTypeService;
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

    @Autowired
    private IPsTypeService psTypeService;
    @ModelAttribute
    public void init(Model model) {
        AdPermissions adPermissions = new AdPermissions();
        PsType psType = new PsType();
        model.addAttribute("adPermissions", adPermissions);
        model.addAttribute("psType",psType);
    }

    @RequestMapping("/toAdminPermission")
    public String toAdminPermission() {
        return "admin/admin-permission";
    }

    @RequestMapping("/toAdminPermissionAdd")
    public String toAdminPermissionAdd() {
        return "admin/admin-permission-add";
    }

    @RequestMapping("/toAdminPermissionEdit")
    public String toAdminPermissionEdit() {
        return "admin/admin-permission-edit";
    }

    @RequestMapping("/add")
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

    @RequestMapping("/listPsType")
    public ModelAndView listPsType(PsType psType, ModelAndView modelAndView, HttpServletRequest req){
        List<PsType> psTypeList = psTypeService.list(psType);
        modelAndView.addObject("psTypeList",psTypeList);
        String path = req.getParameter("path");
        if("per".equals(path)){
            modelAndView.setViewName("admin/admin-permission-add");
        }
        else if("perEdit".equals(path)){
            modelAndView.setViewName("forward:/admin/AdPer/loadPer?pid="+req.getParameter("pid"));
        }
        else{
            modelAndView.setViewName("forward:/admin/AdminRole/toAdminRoleAdd");
        }
        return modelAndView;
    }

    @RequestMapping("/loadPer")
    public ModelAndView loadPer(AdPermissions adPermissions, ModelAndView modelAndView, HttpServletRequest req){
        adPermissions.setPid(new Integer(req.getParameter("pid")));
        AdPermissions adPermissions1 = adPermissionsService.selectByPrimaryKey(adPermissions.getPid());
        modelAndView.addObject("selectPer",adPermissions1);
        modelAndView.setViewName("admin/admin-permission-edit");
        return modelAndView;
    }

    @RequestMapping("/editPer")
    public ModelAndView editPer(AdPermissions adPermissions, ModelAndView modelAndView){
        adPermissionsService.updateByPrimaryKeySelective(adPermissions);
        modelAndView.setViewName("redirect:/admin/AdPer/listPsType?path=perEdit&pid="+adPermissions.getPid());
        return modelAndView;
    }

    @RequestMapping("/delPer")
    public ModelAndView delPer(AdPermissions adPermissions, ModelAndView modelAndView){
      adPermissionsService.deleteByPrimaryKey(adPermissions.getPid());
      System.err.println(adPermissions);
      modelAndView.setViewName("redirect:/admin/AdPer/listPer");
      return modelAndView;
    }
}
