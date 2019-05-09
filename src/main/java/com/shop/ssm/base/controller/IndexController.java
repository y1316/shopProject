package com.shop.ssm.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class IndexController {
    @RequestMapping("/shop/shop.shtml")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/shop/toWelcome")
    public String toWelcome(){
        return "welcome";
    }

    @RequestMapping("/shop/toArticleList")
    public String toArticleList(){
        return "ia/article-list";
    }

    @RequestMapping("/shop/toArticleAdd")
    public String toArticleAdd(){
        return "ia/article-add";
    }

    @RequestMapping("/shop/toArticle")
    public String toArticle(){
        return "ia/article-add";
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



    @RequestMapping("/shop/toOrderList")
    public String toOrderList(){
        return "or/order-list";
    }



    @RequestMapping("/shop/toFeedbackList")
    public String toFeedbackList(){
        return "op/feedback-list";
    }

    @RequestMapping("/shop/toProductList")
    public String toProductList(){
        return "pd/product-list";
    }

    @RequestMapping("/shop/toProductAdd")
    public String toProductAdd(){
        return "pd/product-add";
    }

    @RequestMapping("/shop/toMemberList")
    public String toMemberList(){
        return "me/member-list";
    }

    @RequestMapping("/shop/toMemberDel")
    public String toMemberDel(){
        return "me/member-del";
    }

    @RequestMapping("/shop/toMemberAdd")
    public String toMemberAdd(){
        return "me/member-add";
    }

    @RequestMapping("/shop/toChangePassword")
    public String toChangePassword(){
        return "me/change-password";
    }

    @RequestMapping("/shop/toMemberLevel")
    public String toMemberLevel(){
        return "me/member-level";
    }

    @RequestMapping("/shop/toMemberScoreoperation")
    public String toMemberScoreoperation(){
        return "me/member-scoreoperation";
    }

    @RequestMapping("/shop/toMemberRecordBrowse")
    public String toMemberRecordBrowse(){
        return "me/member-record-browse";
    }

    @RequestMapping("/shop/toMemberRecordDownload")
    public String toMemberRecordDownload(){
        return "me/member-record-download";
    }

    @RequestMapping("/shop/toMemberRecordShare")
    public String toMemberRecordShare(){
        return "me/member-record-share";
    }

    @RequestMapping("/shop/toMemberRecordDetails")
    public String toMemberRecordDetails(){
        return "me/member-record-details";
    }

    @RequestMapping("/shop/toChartsSt")
    public String toChartsSt(){
        return "st/charts-1";
    }

    @RequestMapping("/shop/toChartsNd")
    public String toChartsNd(){
        return "st/charts-2";
    }

    @RequestMapping("/shop/toChartsRd")
    public String toChartsRd(){
        return "st/charts-3";
    }
    @RequestMapping("/shop/toChartsFourth")
    public String toChartsFourth(){
        return "st/charts-4";
    }
    @RequestMapping("/shop/toChartsFifth")
    public String toChartsFifth(){
        return "st/charts-5";
    }
    @RequestMapping("/shop/toChartsSixth")
    public String toChartsSixth(){
        return "st/charts-6";
    }

    @RequestMapping("/shop/toChartsSeventh")
    public String toChartsSeventh(){
        return "st/charts-7";
    }

    @RequestMapping("/shop/toSystemBase")
    public String toSystemBase(){
        return "sys/system-base";
    }

    @RequestMapping("/shop/toSystemCategory")
    public String toSystemCategory(){
        return "sys/system-category";
    }

    @RequestMapping("/shop/toSystemCategoryAdd")
    public String toSystemCategoryAdd(){
        return "sys/system-category-add";
    }

    @RequestMapping("/shop/toSystemData")
    public String toSystemData(){
        return "sys/system-data";
    }

    @RequestMapping("/shop/toSystemShielding")
    public String toSystemShielding(){
        return "sys/system-shielding";
    }

    @RequestMapping("/shop/toSystemLog")
    public String toSystemLog(){
        return "sys/system-log";
    }


    @RequestMapping("/i18n")
    public String toI18n(String locale, HttpSession session){
        if (null != locale && "zh".equals(locale)) {
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.CHINA);
        }
        else{
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.US);
        }
        return "index";
    }
}
