<%--
  Created by IntelliJ IDEA.
  User: 长沙帅哥
  Date: 2019/5/6
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <head>
        <meta charset="utf-8">
        <meta name="renderer" content="webkit|ie-comp|ie-stand">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
        <meta http-equiv="Cache-Control" content="no-siteapp" />
        <link rel="Bookmark" href="/favicon.ico" >
        <link rel="Shortcut Icon" href="/favicon.ico" />
        <!--[if lt IE 9]>
        <script type="text/javascript" src="lib/html5shiv.js"></script>
        <script type="text/javascript" src="lib/respond.min.js"></script>
        <![endif]-->
        <link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
        <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
        <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
        <link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
        <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
        <!--[if IE 6]>
        <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
        <script>DD_belatedPNG.fix('*');</script>
        <![endif]-->
        <!--/meta 作为公共模版分离出去-->

        <title>新建角色权限 - 管理员管理 - H-ui.admin v3.1</title>
        <meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
        <meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
    </head>
<body>
<article class="page-container">
    <f:form action="${ctx}/admin/AdPer/add" method="post" class="form form-horizontal" id="form-admin-role-add" modelAttribute="adPermissions">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>权限名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <f:input type="text" class="input-text" value="" placeholder="" id="roleName" name="roleName" path="pname"></f:input>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>等级：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <f:input type="text" class="input-text" value="" placeholder="" id="roleName" name="roleName" path="level"></f:input>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>分类：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <f:select path="ptype" items="${psTypeList}" itemLabel="tname" itemValue="tid"></f:select>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">父级：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <f:input type="text" class="input-text" value="" placeholder="" id="roleName" name="roleName" path="parenPid"></f:input>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>功能：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <f:input type="text" class="input-text" value="" placeholder="" id="roleName" name="roleName" path="rdescribe"></f:input>
                <f:input path="pstate" type="hidden" value="2"></f:input>
            </div>
        </div>
        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <button type="submit" class="btn btn-success radius" id="admin-role-save" name="admin-role-save"><i class="icon-ok"></i> 确定</button>
            </div>
        </div>
    </f:form>
</article>
</body>
</html>
