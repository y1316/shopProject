package com.shop.ssm.sys.im.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("imPicture")
public class ImPictureController {
    @RequestMapping("/toUpload")
    public String toUpload(){
        return "";
    }



}
