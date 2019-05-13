<!--_meta 作为公共模版分离出去-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<%@include file="/common/head.jsp"%>
	<meta charset="utf-8">
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<link rel="Bookmark" href="${ctx}/favicon.ico" >
	<link rel="Shortcut Icon" href="${ctx}/favicon.ico" />
	<!--[if lt IE 9]>
	<script type="text/javascript" src="${ctx}/lib/html5shiv.js"></script>
	<script type="text/javascript" src="${ctx}/lib/respond.min.js"></script>
	<![endif]-->
	<link rel="stylesheet" type="text/css" href="${ctx}/static/h-ui/css/H-ui.min.css" />
	<link rel="stylesheet" type="text/css" href="${ctx}/static/h-ui.admin/css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="${ctx}/lib/Hui-iconfont/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="${ctx}/static/h-ui.admin/skin/default/skin.css" id="skin" />
	<link rel="stylesheet" type="text/css" href="${ctx}/static/h-ui.admin/css/style.css" />
	<!--[if IE 6]>
	<script type="text/javascript" src="${ctx}/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<!--/meta 作为公共模版分离出去-->

	<title>新增文章 - 资讯管理 - H-ui.admin v3.1</title>
	<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
	<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
    <f:form action="${ctx}/ia/article/update" method="post" modelAttribute="iaNews" cssClass="form form-horizontal">
		<input type="hidden" name="nid" value="${iaNews1.nid}"/>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">文章标题：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input name="ntitle" type="ntitle" value="${iaNews1.ntitle}" class="input-text" />
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">简略标题：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input name="nbrieftitle" type="nbrieftitle" value="${iaNews1.nbrieftitle}" class="input-text" />
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">分类栏目：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<span class="select-box">
				<f:select path="ntype" class="select">
					<f:options items="${iaTypelist}" itemLabel="tname" itemValue="tid"></f:options>
				</f:select>
			</span>
				<div class="formControls col-xs-8 col-sm-9">
				</div>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">文章摘要：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input name="nabstract" type="nabstract" value="${iaNews1.nabstract}" class="input-text" />
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">作者：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input name="nwriter" type="nwriter" value="${iaNews1.nwriter}" class="input-text" />
			</div>
		</div>


		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">来源：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="hidden" name="nsource" value="${iaNews1.nsource}"/>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">评论内容：</label>
			<div class="formControls col-xs-8 col-sm-9 skin-minimal">
				<div class="check-box">
					<input type="hidden" name="nlimit" value="${iaNews1.nlimit}"/>
				</div>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">浏览次数：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="hidden" name="nviewed" value="${iaNews1.nviewed}"/>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">发布状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
					<input type="hidden" name="nstate" value="${iaNews1.nstate}"/>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">文章内容：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input name="content" type="content" value="${iaNews1.content}" class="input-text" />
			</div>
		</div>

		<div class="row cl">
                    <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                    <input type="submit" value="保存并提交" class="btn btn-primary radius"/>
                    <button onClick="removeIframe();" class="btn btn-default radius" type="r">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
                </div>
		</div>

	</f:form>

</article>
                <!--_footer 作为公共模版分离出去-->
                <script type="text/javascript" src="${ctx}/lib/jquery/1.9.1/jquery.min.js"></script>
				<script type="text/javascript" src="${ctx}/lib/layer/2.4/layer.js"></script>
				<script type="text/javascript" src="${ctx}/static/h-ui/js/H-ui.min.js"></script>
				<script type="text/javascript" src="${ctx}/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer /作为公共模版分离出去-->

				<!--请在下方写此页面业务相关的脚本-->
				<script type="text/javascript" src="${ctx}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
				<script type="text/javascript" src="${ctx}/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
				<script type="text/javascript" src="${ctx}/lib/jquery.validation/1.14.0/validate-methods.js"></script>
				<script type="text/javascript" src="${ctx}/lib/jquery.validation/1.14.0/messages_zh.js"></script>
				<script type="text/javascript" src="${ctx}/lib/webuploader/0.1.5/webuploader.min.js"></script>
				<script type="text/javascript" src="${ctx}/lib/ueditor/1.4.3/ueditor.config.js"></script>
				<script type="text/javascript" src="${ctx}/lib/ueditor/1.4.3/ueditor.all.min.js"> </script>
				<script type="text/javascript" src="${ctx}/lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
</body>
</html>