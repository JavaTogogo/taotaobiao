<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户中心-淘表网</title>
<meta name="Keywords" content="男士手表" />
<meta name="Description"
	content="世界十大名表价格VIP折扣促销中, 正品男士手表选购来淘表商城,支持全球联保.男士手表品牌排榜热卖手表推荐:江诗丹顿男表,劳力士男表,浪琴男表" />
<link href="/taotaobiao/css/style.css" rel="stylesheet" type="text/css" />
<link href="/taotaobiao/css/slides-chanel.css" rel="stylesheet"
	type="text/css" />
<link href="/taotaobiao/css/user.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="/taotaobiao/js/share.js"></script>
<script type="text/javascript" src="/taotaobiao/js/jquery.js"></script>

</head>

<body>
	<div id="container">
		<!---顶部start---->
		<div id="top">
			<div class="header">
				<div class="logo">
					<a href="index.html" title="聚风尚全球顶级名表商城"><img
						src="/taotaobiao/images/logo.jpg" alt="聚风尚全球顶级名表商城" />
					</a>
				</div>
				<div class="topnav">
					<div class="nav1">
						<span>[<a href="/taotaobiao/login_register.html"> 登录</a> |
							<a href="../login_register.html">注册 </a>]&nbsp;<a
							class="nav-cart" href="">我的购物车（<font color="#AB4419">0</font>）</a>&nbsp;&nbsp;<a
							href="">我的订单</a> </span>
						<div class="orderBox hab" id="h-warp1" onmouseover="showFq(1,1)"
							onmouseout="hiddenFq(1,1)">
							<p>
								<a href="" rel="nofollow">我的淘表</a>
							</p>
							<ul id="h-con1" style="display:none;">
								<li><a href="" rel="nofollow">我的订单</a>
								</li>
								<li><a href="" rel="nofollow">我的咨询</a>
								</li>
								<li><a href="" rel="nofollow">我的收藏</a>
								</li>
								<li><a href="" rel="nofollow">收货地址</a>
								</li>
								<li><a href="" rel="nofollow">修改密码</a>
								</li>
							</ul>
						</div>
						<div class="helpBox hab" id="h-warp2" onmouseover="showFq(2,2)"
							onmouseout="hiddenFq(2,2)">
							<p>
								<a href="" rel="nofollow">帮助中心</a>
							</p>
							<ul id="h-con2" style="display:none;">
								<li><a href="" rel="nofollow">帮助中心</a>
								</li>
								<li><a href="" rel="nofollow">留言咨询</a>
								</li>
								<li><a href="" rel="nofollow">售后服务</a>
								</li>
								<li><a href="" rel="nofollow">联系客服</a>
								</li>
							</ul>
						</div>
					</div>
					<div class="nav2">
						<div class="Search">
							<form action="/list" method="get">
								<input name="keyword" type="text" id="keyword"
									value="输入商品关键字，比如天梭..."
									onmouseover="if(this.value=='输入商品关键字，比如天梭...'){this.value='';this.focus();}"
									onmouseout="if(this.value=='')this.value='输入商品关键字，比如天梭...'" /><input
									name="btsearch" type="submit" id="btsearch" value="搜索" />
							</form>
						</div>
						<div class="Service">
							订购热线(免长途费)：<font> 13751801572</font>
						</div>
					</div>
				</div>
			</div>
			<div id="nav">
				<div class="mainNav" id="mainNav">
					<div class="mN-item mN-nobg" id="mN-current">
						<div class="nobg mN-h1">
							<a rel="nofollow" title="淘表奢侈品商城" href="../index.html">首页</a>
						</div>
					</div>
					<div class="mN-item">
						<div class="mN-h1 mantit">
							<a title="男表" href="">男士手表</a>
						</div>
					</div>
					<div class="mN-item">
						<div class="mN-h1 womentit">
							<a title="女表" href="">女士手表</a>
						</div>
					</div>
					<div class="mN-item">
						<div class="mN-h1 lovetit">
							<a title="情侣表" href="">情侣对表</a>
						</div>
					</div>
					<div class="mN-item">
						<div class="mN-h1 h1bg allsbtit">
							<a title="所有手表" href="">所有手表</a>
						</div>
					</div>
					<div class="mN-item">
						<div class="mN-h1 h1bg allpptit">
							<a rel="nofollow" title="瑞士手表牌" href="">所有品牌</a>
						</div>
					</div>
					<div class="mN-item">
						<div class="mN-h1 h1bg story">
							<a rel="nofollow" href="">品牌故事</a>
						</div>
					</div>
					<div class="mN-item">
						<div class="mN-h1 h1bg knowledge">
							<a rel="nofollow" href="">手表常识</a>
						</div>
					</div>
					<div class="mN-item mN-nobg mN_right">
						<div class="mN-h1 zhongqiu">
							<a title="名表夜晏" href="">名表抢购</a>
						</div>
					</div>
				</div>
				<!--主导航end-->
			</div>
		</div>
		<!--------顶部end ----->
		<!--用户中心begin-->
		<div class="blank10"></div>
		<div class="block">
			<div class="ur_here">
				当前位置: <a href=".">首页</a>
				<code>&gt;</code>
				用户中心
			</div>
		</div>

		<div class="block clearfix">
			<div class="EarLeft fl">
				<div class="attrbox">
					<h2></h2>
					<div class="attrcontent">
						<ul class="userMenu">
							<li><a href="index.html" class="curs"> 欢迎页</a>
							</li>
							<li><a href="/taotaobiao/admin/userinfo.jsp"> 用户管理</a>
							</li>
							<li><a href="/taotaobiao/admin/managerbrand.jsp"> 品牌管理</a>
							</li>
							<li><a href="address.html"> 品牌系列管理</a>
							</li>
							<li><a href="/taotaobiao/admin/managerproduct.jsp"> 商品管理</a>
							</li>
							<li><a href="#"> 订单管理</a>
							</li>
							<li><a href="#"> 留言管理</a>
							</li>
							<li><a href="#"> 客服管理</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="EarRight fr">
				<div class="us_contentBox">
					<div class="CarTitle">
						<span class="fwhite f14b">增加商品</span>
					</div>
					<form action="/taotaobiao/ProductAction!addProduct" method="post"
						enctype="multipart/form-data">
						<table width="668" border="" cellpadding="0" cellspacing="0">

							<tr>
								<td width="95" height="24" align="right" nowrap="nowrap">手表名称：</td>
								<td width="280" valign="middle" nowrap="nowrap"><input
									name="productName" type="text" id="username" class="inputBg" />
									<span id="username_notice" style="color:#FF0000"> </span>
								<td width="93">${ProductIsNotNull}</td>
							</tr>

							<tr>
								<td width="95" height="30" align="right">手表产地：</td>
								<td width="195"><input type="text" name="location" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表品牌：</td>
								<td width="195"><input type="text" name="brand_name" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
								<td width="93">${ProductBrandIsNull}</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表系列：</td>
								<td width="195"><input type="text" name="series_name" />
									<span style="color:#FF0000" id="password_notice"> </span>
								</td>
								<td width="93">${ProductSeriesIsNull}</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">款式：</td>
								<td align="left"><input type="radio" checked name="style"
									value="1">男表<input type="radio" name="style" value="2">女表
									<input type="radio" name="style" value="3">中性表 <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表型号：</td>
								<td width="195"><input type="text" name="model" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表尺寸：</td>
								<td width="195"><input type="text" name="size" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表厚度：</td>
								<td width="195"><input type="text" name="thickness" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表机芯：</td>
								<td width="195"><input type="text" name="mechanism" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">机芯类别：</td>
								<td align="left"><input type="radio" checked
									name="mechanismType" value="1">机械<input type="radio"
									name="mechanismType" value="2">石英 <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表表壳：</td>
								<td width="195"><input type="text" name="watchcase" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表表盘：</td>
								<td width="195"><input type="text" name="dial" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表表面：</td>
								<td width="195"><input type="text" name="face" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表表带：</td>
								<td width="195"><input type="text" name="watchband" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">是否防水：</td>
								<td width="195"><input type="text" name="waterproof" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表功能：</td>
								<td width="195"><input type="text" name="function" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表包装：</td>
								<td width="195"><input type="text" name="pack" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表原价：</td>
								<td width="195"><input type="text" name="price" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表特价：</td>
								<td width="195"><input type="text" name="specialPrice" />
									<span style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表备注：</td>
								<td width="195"><input type="text" name="remark" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>

								<td width="95" height="30" align="right">主图片：</td>
								<td><input type="file" name="myFile" value="浏览" />
								</td>
								<td>${FileIsNull}</td>


							</tr>
							<tr>
								<td width="95" align="right" nowrap="nowrap">&nbsp;</td>
								<td height="20">(上传文件不要超过2M)</td>
								<td width="93">${MyFileIsNull}</td>
							</tr>
							<tr>
								<td width="95" align="right">&nbsp;</td>
								<td height="20">&nbsp;</td>
							</tr>

							<tr>
								<td width="95" height="40">&nbsp;</td>
								<td><input type="submit" class="bnt_number2" value="添加" />
								</td>
								<td>${ProductOk}</td>
							</tr>
							<tr>
								<td width="95" align="right">&nbsp;</td>
								<td height="20">&nbsp;</td>
							</tr>
						</table>
					</form>
					<div class="CarTitle">
						<span class="fwhite f14b">查看商品</span>
					</div>

					<form action="/taotaobiao/ProductAction!getProductsByBrandLocation"
						method="post">
						<table width="668" border="1">
							<tr>
								<td>根据产地查找商品:</td>
								<td><input type="text" name="location" />
								</td>
								<td><input type="submit" value="提交" />
								</td>
								<td>${ProductsIsNull}</td>
							</tr>
						</table>
					</form>
					<table width="668" border="1">
						<tr>
							<td>图片</td>
							<td>名称</td>
							<td>价格</td>
							<td>特价</td>
							<td>人气</td>
							<td>更新</td>
							<td>删除${DelOk }</td>

						</tr>

						<s:if test="#session.products!=null">
						   <s:iterator  value="#session.products">
						       <tr>	
						       <td><img width="98" height="98"
										src="/taotaobiao<s:property value="pic" />" />
									</td>
								<td><s:property value="productName" /></td>
								<td><s:property value="price" /></td>	
								<td><s:property value="specialPrice" /></td>

								<td><s:property value="popularity" /></td>
								<td><a href="/taotaobiao/ProductAction!isUpDateProduct?id=<s:property value="id" />" >UpDate</a>${UpDateProductSuccess}</td>	
								<td><a href="/taotaobiao/ProductAction!delProduct?id=<s:property value="id" />" >Delete</a></td>	
								</tr>
						   </s:iterator>
						</s:if>
					</table>

					<!-- 做更新 -->
					<s:if test="#session.flag=='flag'">
						<div class="CarTitle">
							<span class="fwhite f14b">更新品牌</span>
						</div>
										<form action="/taotaobiao/ProductAction!upDateProduct" method="post"
						enctype="multipart/form-data">
						<table width="668" border="" cellpadding="0" cellspacing="0">

							<tr>
								<td width="95" height="24" align="right" nowrap="nowrap">手表名称：</td>
								<td width="280" valign="middle" nowrap="nowrap"><input
									name="productName" type="text" id="username" class="inputBg" value="${product.productName }" />
									<span id="username_notice" style="color:#FF0000"> </span>
								<td width="93">${ProductIsNotNull}</td>
							</tr>

							<tr>
								<td width="95" height="30" align="right">手表产地：</td>
								<td width="195"><input type="text" name="location" value="${product.location }"/> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表品牌：</td>
								<td width="195"><input type="text" name="brand_name" value="${product.brand_1 }" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
								<td width="93">${ProductBrandIsNull}</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表系列：</td>
								<td width="195"><input type="text" name="series_name" />
									<span style="color:#FF0000" id="password_notice"> </span>
								</td>
								<td width="93">${ProductSeriesIsNull}</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">款式：</td>
								<td align="left"><input type="radio" checked name="style"
									value="1">男表<input type="radio" name="style" value="2">女表
									<input type="radio" name="style" value="3">中性表 <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表型号：</td>
								<td width="195"><input type="text" name="model" value="${product.model }" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表尺寸：</td>
								<td width="195"><input type="text" name="size" value="${product.size }" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表厚度：</td>
								<td width="195"><input type="text" name="thickness" value="${product.thickness }" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表机芯：</td>
								<td width="195"><input type="text" name="mechanism" value="${product.mechanism }"  /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">机芯类别：</td>
								<td align="left"><input type="radio" checked
									name="mechanismType" value="1">机械<input type="radio"
									name="mechanismType" value="2">石英 <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表表壳：</td>
								<td width="195"><input type="text" name="watchcase" value="${product.watchcase }" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表表盘：</td>
								<td width="195"><input type="text" name="dial" value="${product.dial }"/> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表表面：</td>
								<td width="195"><input type="text" name="face" value="${product.face }" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表表带：</td>
								<td width="195"><input type="text" name="watchband" value="${product.watchband }" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">是否防水：</td>
								<td width="195"><input type="text" name="waterproof" value="${product.waterproof }"  /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表功能：</td>
								<td width="195"><input type="text" name="function" value="${product.function }" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表包装：</td>
								<td width="195"><input type="text" name="pack" value="${product.pack }" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表原价：</td>
								<td width="195"><input type="text" name="price" value="${product.price }"  /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表特价：</td>
								<td width="195"><input type="text" name="specialPrice" value="${product.specialPrice }"/>
									<span style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>
								<td width="95" height="30" align="right">手表备注：</td>
								<td width="195"><input type="text" name="remark" value="${product.remark }" /> <span
									style="color:#FF0000" id="password_notice"> </span>
								</td>
							</tr>
							<tr>

								<td width="95" height="30" align="right">主图片：</td>
								<td><input type="file" name="myFile" value="浏览" />
								</td>
								<td>${FileIsNull}</td>


							</tr>
							<tr>
								<td width="95" align="right" nowrap="nowrap">&nbsp;</td>
								<td height="20">(上传文件不要超过2M)</td>
								<td width="93">${MyFileIsNull}</td>
							</tr>
							<tr>
								<td width="95" align="right">&nbsp;</td>
								<td height="20">&nbsp;</td>
							</tr>

							<tr>
								<td width="95" height="40">&nbsp;</td>
								<td><input type="submit" class="bnt_number2" value="添加" />
								</td>
								<td>${ProductOk}</td>
							</tr>
							<tr>
								<td width="95" align="right">&nbsp;</td>
								<td height="20">&nbsp;</td>
							</tr>
						</table>
					</form>
					</s:if>

				</div>
			</div>


		</div>
</body>
</html>
