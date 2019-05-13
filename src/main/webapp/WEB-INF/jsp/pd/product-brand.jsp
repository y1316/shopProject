<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<%@include file="/common/head.jsp"%>
	<meta charset="utf-8">
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<!--[if lt IE 9]>
	<script type="text/javascript" src="lib/html5shiv.js"></script>
	<script type="text/javascript" src="lib/respond.min.js"></script>
	<![endif]-->
	<link rel="stylesheet" type="text/css" href="${ctx}/static/h-ui/css/H-ui.min.css" />
	<link rel="stylesheet" type="text/css" href="${ctx}/static/h-ui.admin/css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="${ctx}/lib/Hui-iconfont/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="${ctx}/static/h-ui.admin/skin/default/skin.css" id="skin" />
	<link rel="stylesheet" type="text/css" href="${ctx}/static/h-ui.admin/css/style.css" />
	<!--[if IE 6]>
	<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<title>品牌管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 产品管理 <span class="c-gray en">&gt;</span> 品牌管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c">
		<f:form class="Huiform" method="post" action="${ctx}/pd/pdBc/addPdBrand" target="_self" modelAttribute="pdBrand">
			<f:input type="text" placeholder="品牌名称" value="" class="input-text" style="width:120px" path="bname"></f:input>
			<span class="btn-upload form-group">
			<f:input class="input-text upload-url" type="text" name="uploadfile-2" id="uploadfile-2" readonly="readonly" style="width:150px" path="blogo"></f:input>
			<a  class="btn btn-primary upload-btn"><i class="Hui-iconfont">&#xe642;</i> 上传logo</a>
			<input type="file" multiple name="file-2" class="input-file">
			</span>
			<span class="select-box" style="width:200px;padding: 0px;border: 0px">
			<f:input type="text" placeholder="具体描述" value="" class="input-text" style="width:200px" path="bdescribe"></f:input>
			</span><button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe600;</i> 添加</button>
		</f:form>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a></span> <span class="r">共有数据：<strong>54</strong> 条</span> </div>
	<div class="mt-20">

		<table class="table table-border table-bordered table-bg table-sort">
			<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="70">ID</th>
				<th width="200">LOGO</th>
				<th width="120">品牌名称</th>
				<th>具体描述</th>
				<th width="100">操作</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="v" items="${pdBrandList}">
				<tr class="text-c">
					<td><input name="" type="checkbox" value=""></td>
					<td>${v.bid}</td>
					<td><img src="${ctx}/${v.blogo}" width="70px" height="60px"></td>
					<td class="text-l"><img title="国内品牌" src="${ctx}/static/h-ui.admin/images/cn.gif">${v.bname}</td>
					<td class="text-l">${v.bdescribe}</td>
					<td class="f-14 product-brand-manage">
						<a style="text-decoration:none;" onClick="product_brand_edit('品牌编辑','${ctx}/pd/pdBc/selectPdBrand?bid=${v.bid}','1','','400')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
						<a style="text-decoration:none" class="ml-5" onClick="brand_del(this,'${v.bid}')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${ctx}/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${ctx}/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="${ctx}/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${ctx}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${ctx}/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">

	/*品牌-删除*/
	function brand_del(obj, id) {
		layer.confirm('确认要删除吗？', function (index) {
			$.ajax({
				type: 'POST',
				url: '${ctx}/pd/pdBc/deletePdBrand.action',
				data: {"bid": id},
				dataType: '',
				success: function (data) {
					$(obj).parents("tr").remove();
					layer.msg('已删除!', {icon: 1, time: 1000});
				},
				error: function (data) {
					console.log(data.msg);
				},
			});
		});
	}

	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
			//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
			{"orderable":false,"aTargets":[0,5]}// 制定列不参与排序
		]
	});

	/*用户-编辑*/
	function product_brand_edit(title, url, id, w, h) {
		layer_show(title, url, w, h);
	}
</script>
</body>
</html>