<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台管理-淘表网</title>
<meta name="Keywords" content="男士手表" />
<meta name="Description" content="世界十大名表价格VIP折扣促销中, 正品男士手表选购来淘表商城,支持全球联保.男士手表品牌排榜热卖手表推荐:江诗丹顿男表,劳力士男表,浪琴男表" />
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<link href="../css/slides-chanel.css" rel="stylesheet" type="text/css" />
<link href="../css/user.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/share.js"></script>
<script type="text/javascript" src="../js/jquery.js"></script>
<script language="javascript">
	jQuery(function($){
		/*$("#h-warp1").hover(function(){
			$("#h-con1").show();	
		},function(){
			$("#h-con1").show();	
		});	*/
	});
</script>
</head>

<body>
<div id="container">
<!---顶部start---->
<div id="top">
  <div class="header">
  	 <div class="logo"><a href="index.jsp" title="聚风尚全球顶级名表商城"><img src="../images/logo.jpg" alt="聚风尚全球顶级名表商城" /></a></div>
    <div class="topnav">
      <div class="nav1"><span >[<a href="../login_register.html"> 登录</a> | <a href="../login_register.html" >注册 </a>]&nbsp;<a class="nav-cart" href="../cart.html">我的购物车（<font color="#AB4419">0</font>）&nbsp;&nbsp;</a><a href="orderList.html">我的订单</a> </span>
	  <div class="orderBox hab" id="h-warp1" onmouseover="showFq(1,1)" onmouseout="hiddenFq(1,1)">
	  <p><a href="index.html" rel="nofollow">我的淘表</a></p>
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
        <div class="Search"><form action="/list" method="get"><input name="keyword" type="text" id="keyword" value="输入商品关键字，比如'天梭'..." onmouseover="if(this.value=='输入商品关键字，比如天梭...'){this.value='';this.focus();}"  onmouseout="if(this.value=='')this.value='输入商品关键字，比如天梭...'" /><input name="btsearch" type="submit" id="btsearch" value="搜索" />
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
<div class="ur_here" style="text-align:left">
当前位置: <a href=".">首页</a> <code>&gt;</code> 后台管理<code>&gt;</code>欢迎页</div></div>

<div class="block clearfix">
  <div class="EarLeft fl">
     <div class="attrbox">
     <h2></h2>
         <div class="attrcontent">
           <ul class="userMenu">
           <li><a href="index.html" class="curs"> 欢迎页</a></li>
          <li><a href="userinfo.jsp"> 用户管理</a></li>
          <li><a href="managerbrand.jsp"> 品牌管理</a></li>
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
   <div class="us_contentBox default clearfix">
     <font class="price">stone</font> 欢迎您来到淘表网后台管理中心<br /><br />
     您的上一次登录时间: 2011-10-29 16:19:35<br />
     <font class="f1">您的等级是 注册用户  </font><br />
     <div class="us_notice"><img src="../images/user/note.gif" alt="note" />&nbsp;用户中心公告！</div>
     <div class="fl" style="width:350px;">
     <h5>您的账户</h5>
     余额:<a href="" style="color:#f60;">￥0.00元</a><br />
     积分:<font class="price">0积分</font><br />
     </div>
     <div class="fr" style="width:350px;">
     <h5>用户提醒</h5>
   您最近30天内提交了<font class="price">1</font>个订单<br />
  	 </div>
  </div>
 </div>
</div>

</div>

</body>
</html>

</html>
