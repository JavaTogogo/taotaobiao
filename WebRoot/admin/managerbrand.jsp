<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户中心-淘表网</title>
<meta name="Keywords" content="男士手表" />
<meta name="Description" content="世界十大名表价格VIP折扣促销中, 正品男士手表选购来淘表商城,支持全球联保.男士手表品牌排榜热卖手表推荐:江诗丹顿男表,劳力士男表,浪琴男表" />
<link href="/taotaobiao/css/style.css" rel="stylesheet" type="text/css" />
<link href="/taotaobiao/css/slides-chanel.css" rel="stylesheet" type="text/css" />
<link href="/taotaobiao/css/user.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="/taotaobiao/js/share.js"></script>
<script type="text/javascript" src="/taotaobiao/js/jquery.js"></script>

</head>

<body>
<div id="container">
<!---顶部start---->
<div id="top">
  <div class="header">
  	 <div class="logo"><a href="index.html" title="聚风尚全球顶级名表商城"><img src="/taotaobiao/images/logo.jpg" alt="聚风尚全球顶级名表商城" /></a></div>
    <div class="topnav">
      <div class="nav1"><span >[<a href="/taotaobiao/login_register.html"> 登录</a> | <a href="../login_register.html" >注册 </a>]&nbsp;<a class="nav-cart" href="">我的购物车（<font color="#AB4419">0</font>）</a>&nbsp;&nbsp;<a href="">我的订单</a> </span>
	  <div class="orderBox hab" id="h-warp1" onmouseover="showFq(1,1)" onmouseout="hiddenFq(1,1)">
	  <p><a href="" rel="nofollow">我的淘表</a></p>
		<ul id="h-con1" style="display:none;">
		<li><a href="" rel="nofollow">我的订单</a></li>
		<li><a href="" rel="nofollow">我的咨询</a></li>
		<li><a href="" rel="nofollow">我的收藏</a></li>
		<li><a href="" rel="nofollow">收货地址</a></li>
		<li><a href="" rel="nofollow">修改密码</a></li>
		</ul>
	  </div>
	  <div class="helpBox hab" id="h-warp2" onmouseover="showFq(2,2)" onmouseout="hiddenFq(2,2)">
		<p><a href="" rel="nofollow">帮助中心</a></p>
		<ul id="h-con2" style="display:none;">
		<li><a href="" rel="nofollow">帮助中心</a></li>
		<li><a href="" rel="nofollow">留言咨询</a></li>
		<li><a href="" rel="nofollow">售后服务</a></li>
        <li><a href="" rel="nofollow">联系客服</a></li>
		</ul>
	  </div></div>
      <div class="nav2">
        <div class="Search"><form action="/list" method="get"><input name="keyword" type="text" id="keyword" value="输入商品关键字，比如天梭..." onmouseover="if(this.value=='输入商品关键字，比如天梭...'){this.value='';this.focus();}"  onmouseout="if(this.value=='')this.value='输入商品关键字，比如天梭...'" /><input name="btsearch" type="submit" id="btsearch" value="搜索" />
        </form>
        </div>
        <div class="Service">订购热线(免长途费)：<font> 13751801572</font></div>
      </div>
    </div>
  </div>
  <div id="nav">
    <div class="mainNav" id="mainNav">
      <div class="mN-item mN-nobg" id="mN-current">
        <div class="nobg mN-h1"><a rel="nofollow" title="淘表奢侈品商城" href="../index.html">首页</a></div>
      </div>
      <div class="mN-item">
        <div class="mN-h1 mantit"><a title="男表" href="">男士手表</a></div>
      </div>
      <div class="mN-item">
        <div class="mN-h1 womentit"><a title="女表" href="">女士手表</a></div>
      </div>
      <div class="mN-item">
        <div class="mN-h1 lovetit"><a title="情侣表" href="">情侣对表</a></div>
      </div>
	  <div class="mN-item">
        <div class="mN-h1 h1bg allsbtit"><a title="所有手表" href="">所有手表</a></div>
      </div>
      <div class="mN-item">
        <div class="mN-h1 h1bg allpptit"><a rel="nofollow" title="瑞士手表牌" href="">所有品牌</a></div>
      </div>
      <div class="mN-item">
        <div class="mN-h1 h1bg story"><a rel="nofollow"  href="">品牌故事</a></div>
      </div>
      <div class="mN-item">
        <div class="mN-h1 h1bg knowledge"><a rel="nofollow"  href="">手表常识</a></div>
      </div>
      <div class="mN-item mN-nobg mN_right">
		<div class="mN-h1 zhongqiu"><a title="名表夜晏" href="">名表抢购</a></div>
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
当前位置: <a href=".">首页</a> <code>&gt;</code> 用户中心</div></div>

<div class="block clearfix">
  <div class="EarLeft fl">
     <div class="attrbox">
     <h2></h2>
         <div class="attrcontent">
          <ul class="userMenu">
          <li><a href="index.html" class="curs"> 欢迎页</a></li>
          <li><a href="/taotaobiao/admin/userinfo.jsp"> 用户管理</a></li>
          <li><a href="/taotaobiao/admin/managerbrand.jsp"> 品牌管理</a></li>
          <li><a href="address.html"> 品牌系列管理</a></li>
          <li><a href="/taotaobiao/admin/managerproduct.jsp"> 商品管理</a></li>
          <li><a href="#"> 订单管理</a></li>
          <li><a href="#"> 留言管理</a></li>
          <li><a href="#"> 客服管理</a></li>
            </ul>
         </div>
	</div> 
  </div>
 <div class="EarRight fr">
   <div class="us_contentBox">
    <div class="CarTitle">
  <span class="fwhite f14b">增加品牌</span></div>
    <form action="/taotaobiao/BrandAction!addBrand" method="post"  enctype="multipart/form-data"  >
        <table width="668"  border="0" cellpadding="0" cellspacing="0" >
          <tr>
            <td height="120" colspan="2"><img src="/taotaobiao/images/reg_title.jpg" width="388" height="28" /></td>
          </tr>
          <tr>
            <td width="95" height="24" align="right" nowrap="nowrap">品牌名：</td>
            <td width="280" valign="middle" nowrap="nowrap"><input name="name" type="text" size="25" id="username"  class="inputBg"/>
              <span id="username_notice" style="color:#FF0000"> </span> 
              <td width="93">${BrandIsNotNull}</td>
          </tr>
          <tr>
            <td width="95" align="right" nowrap="nowrap">&nbsp;</td>
            <td height="20"></td>
          </tr>
          <tr>
            <td width="95" height="30" align="right">品牌故事：</td>
            <td width="195"><textarea rows="15" cols="35" name="story"></textarea>
              <span style="color:#FF0000" id="password_notice"> </span></td>
          </tr>
          <tr>
            <td width="95" align="right">&nbsp;</td>
            <td height="20">&nbsp;</td>
          </tr>
        
          <tr>
                
                  <td width="95" height="30" align="right">品牌Logo：</td>
                  <td> <input type="file" name="myFile" value="浏览" /></td>
                  <td>${FileIsNull}</td> 
                  
            
          </tr>
          <tr>
            <td width="95" align="right" nowrap="nowrap">&nbsp;</td>
            <td height="20">(上传文件不要超过2M)</td>
          </tr>
          <tr>
            <td width="95" align="right">&nbsp;</td>
            <td height="20">&nbsp;</td>
          </tr>

          <tr>
            <td width="95" height="40">&nbsp;</td>
            <td>
              <input  type="submit" class="bnt_number2" value="注册" /></td>
             <td>${AddBrandSuccess}</td>
          </tr>
              <tr>
            <td width="95" align="right">&nbsp;</td>
            <td height="20">&nbsp;</td>
          </tr>
        </table>
      </form>
    <div class="CarTitle">
    <span class="fwhite f14b">查看品牌</span></div>
 
      <form action="/taotaobiao/BrandAction!getBrandByName" method="post">
          <table width="668" border="1">
          <tr>
               <td>请输入品牌名:</td>
               <td><input type="text" name="name"/></td>
               <td><input type="submit" value="提交"/></td>
               <td>${BrandIsNull}</td>
          </tr>
          </table>
          </form>
          <table width="668" border="1">
          <tr>
                <td>品牌名</td>
                <td>品牌故事</td>
                <td>品牌Logo</td>
                <td>删除品牌</td>
                <td>更新品牌</td>
                <td>查看产品</td>
                
          </tr>
         
             <s:if test="#session.brand!=null">
                 <tr>
                <td>${brand.name }</td>
                <td>
                <textarea rows="6" cols="20" disabled="disabled">${brand.story }</textarea>
                </td>
                <td><img width="98" height="98" src=" /taotaobiao${brand.logo } ">
               </td>
         
                <td><a href="/taotaobiao/BrandAction!delBrand?name=${brand.name }" >DeleteBrand</a>${Del}</td>
                <td><a href="/taotaobiao/BrandAction!isUpDateBrand?name=${brand.name }" >UpDateBrand</a>${UpDateBrandSuccess}</td>
          </tr>
     </s:if>
          </table>
          
          <!-- 做更新 -->
          <s:if test="#session.flag=='flag'">
           <div class="CarTitle">
  <span class="fwhite f14b">更新品牌</span></div>
    <form action="/taotaobiao/BrandAction!upDateBrand" method="post"  enctype="multipart/form-data"  >
        <table width="668"  border="0" cellpadding="0" cellspacing="0" >
          <tr>
            <td width="95" height="24" align="right" nowrap="nowrap">品牌名：</td>
            <td width="280" valign="middle" nowrap="nowrap"><input name="name" type="text" size="25" id="username"  class="inputBg" value="${brand.name }"/>
              <span id="username_notice" style="color:#FF0000"> </span> 

          </tr>
          <tr>
            <td width="95" align="right" nowrap="nowrap">&nbsp;</td>
            <td height="20"></td>
          </tr>
          <tr>
            <td width="95" height="30" align="right">品牌故事：</td>
            <td width="195"><textarea rows="15" cols="35" name="story" >${brand.story }</textarea>
              <span style="color:#FF0000" id="password_notice"> </span></td>
          </tr>
          <tr>
            <td width="95" align="right">&nbsp;</td>
            <td height="20">&nbsp;</td>
          </tr>
        
          <tr>
                
                  <td width="95" height="30" align="right">品牌Logo：</td>
                  <td> <input type="file" name="myFile" value="浏览" /></td>
                  <td>${FileIsNull}</td> 
                  
            
          </tr>
          <tr>
            <td width="95" align="right" nowrap="nowrap">&nbsp;</td>
            <td height="20">(上传文件不要超过2M)</td>
          </tr>
          <tr>
            <td width="95" align="right">&nbsp;</td>
            <td height="20">&nbsp;</td>
          </tr>

          <tr>
            <td width="95" height="40">&nbsp;</td>
            <td>
              <input  type="submit" class="bnt_number2" value="更新" /></td>
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
