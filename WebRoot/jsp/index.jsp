<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="com.ssm.originality.po.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
	<meta name="description" content="">
    <meta name="author" content="">
	<title>主页</title>

	<!-- Link Swiper's CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/jsp/css/swiper.min.css">
	<link href="${pageContext.request.contextPath }/jsp/css/bootstrap.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/jsp/css/cover.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/jsp/css/carousel.css" rel="stylesheet">
	<!-- Demo styles -->
	<style>
		html, body {
			position: relative;
			height: 100%;
			background-color: #fff;
		}
		body {
			background: #eee;
			font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
			font-size: 14px;
			color:#fff;
			margin: 0;
			padding: 0;
		}
		.swiper-container {
			width: 100%;
			height: 100%;
			margin-left: auto;
			margin-right: auto;
		}
		.swiper-slide {
			text-align: center;
			font-size: 18px;
			background: #fff;

			/* Center slide text vertically */
			display: -webkit-box;
			display: -ms-flexbox;
			display: -webkit-flex;
			display: flex;
			-webkit-box-pack: center;
			-ms-flex-pack: center;
			-webkit-justify-content: center;
			justify-content: center;
			-webkit-box-align: center;
			-ms-flex-align: center;
			-webkit-align-items: center;
			align-items: center;
		}
		#inputverify,#getverify{
			width: 50%;
			display: inline-block;
		}
		.remember-me{
			color: #000;
		}
		.form-signin-heading{
			color: #000;
		}
		.tab-text-regi{
			color:#000;
		}
		.tab-email-regi{
			color:#000;
		}
	</style>
</head>
<body>
	<div class="masthead clearfix" style="z-index: 1;">
		<div class="inner">
			<h1 class="masthead-brand">匠心</h1>
			<ul class="nav masthead-nav">
				<li class="active"><a href="#">主页</a></li>
				<li><a href="${pageContext.request.contextPath }/selectArtisan.action">匠人</a></li>
				<li><a href="#">匠铺</a></li>
				<li><a href="#">活动</a></li>
				<!-- Small modal -->
				<c:if test="${index_account==null}">
				<li><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#login-modal">登录</button></li>
				<li><button type="button" class="btn btn-success" data-toggle="modal" data-target="#register-modal">注册</button></li>
				</c:if> 
				<c:if test="${index_account!=null}">
					<li>欢迎你: ${index_account.username}</li> <li> <a href="${pageContext.request.contextPath }/accountLogOut.action">注销</a></li>
				</c:if>
				<div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<!-- 模态框里面的内容 -->
							<div class="login-box" id="login-box">
								<div class="login-container" style="width: inherit;">
									<form id="loginform" <%--  action="${pageContext.request.contextPath }/accountLogin.action"--%> method="post"  class="form-signin" >
										<h2 class="form-signin-heading">登录</h2>
										<label for="inputEmail" class="sr-only">用户名</label>
										<input type="text" name="username" id="inputusername" class="form-control" placeholder="手机号/Email" required autofocus>
										<label for="inputPassword" class="sr-only">密码</label>
										<input type="password" name="password" id="inputPassword" class="form-control" placeholder="请输入密码" required>
										<div class="checkbox">
											<label class="remember-me">
												<input type="checkbox" value="remember-me"> 记住我
											</label>
										</div>
										<a class="btn btn-lg btn-primary btn-block" type="submit" onclick="request_login()">登录</a>
									</form>
									
								</div> 
							</div>
						</div>
					</div>
				</div>
				<div class="modal fade" id="register-modal" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<!-- 模态框里面的内容 -->
							<!-- <div class="register-box" id="register-box">
								<div class="register-container" style="width: inherit;">
									<form class="form-signin">
										<h2 class="form-signin-heading">注册</h2>
										<label for="inputEmail" class="sr-only">手机号</label>
										<input type="email" id="inputEmail" class="form-control" placeholder="请输入手机号" required autofocus>
										<br>
										<label for="inputPassword" class="sr-only">验证码</label>
										<input type="password" id="inputPassword" class="form-control" placeholder="验证码" required>
										<a href="#" class="btn btn-sm btn-info" id="btn-getverify">获取验证码</a>
										<button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
									</form>
								</div> 
							</div> -->
							<div class="bs-example bs-example-tabs" data-example-id="togglable-tabs">
								<ul id="myTabs" class="nav nav-tabs" role="tablist">
									<li role="presentation" class="active" id="tab-text-regi"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true" style="color: #000;">短信注册</a></li>
									<li role="presentation" class="" id="tab-email-regi"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile" aria-expanded="false" style="color: #000;">邮箱注册</a></li>
								</ul>
								<div id="myTabContent" class="tab-content">
									<div role="tabpanel" class="tab-pane fade active in" id="home" aria-labelledby="home-tab">
										<div class="register-box" id="text-register-box">
											<div class="register-container" style="width: inherit;">
												<form class="form-signin">
													<h2 class="form-signin-heading">短信注册</h2>
													<label for="inputText" class="sr-only">手机号</label>
													<input type="text" id="inputText" class="form-control" placeholder="请输入手机号" required autofocus>
													<br>
													<label for="inputPassword" class="sr-only">验证码</label>
													<input type="text" id="inputverify" class="form-control" placeholder="验证码" required>
													<a href="#" class="btn btn-sm btn-info" id="btn-getverify">获取验证码</a>
													<button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
												</form>
											</div> 
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">
										<div class="register-box" id="email-register-box">
											<div class="register-container" style="width: inherit;">
												<form class="form-signin">
													<h2 class="form-signin-heading">Email注册</h2>
													<label for="inputEmail" class="sr-only">Email</label>
													<input type="email" id="inputEmail" class="form-control" placeholder="Email地址" required autofocus>
													<br>
													<input type="password" id="newPassword" class="form-control" placeholder="密码" required autofocus>
													<br>
													<input type="password" id="RetypePassword" class="form-control" placeholder="确认密码" required autofocus>
													<br>
													<button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
												</form>
											</div> 
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</ul>
		</div>
	</div>
	<!-- Swiper -->
	<div class="swiper-container" style="z-index: 0;">
		<div class="swiper-wrapper">
			<div class="swiper-slide" style="background-image:url(${pageContext.request.contextPath }/jsp/images/bgimg1.jpg);background-size:cover;">
				<div class="inner cover">
					<h1 class="cover-heading">中国传统手工艺</h1>
					<p class="lead">中国的传统手工艺有木版年画、扑灰画、纸马、内画、泥塑、面塑、糖塑、吹糖人、砖雕、瓷刻、微雕、木偶、皮影、蜡染、刺绣、织锦、剪纸、风筝、脸谱、面具等70种</p>
					<p class="lead">
						<a href="#" class="btn btn-lg btn-default">了解更多<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a>
					</p>
				</div>
			</div>
			<div class="swiper-slide" style="background-image:url(${pageContext.request.contextPath }/jsp/images/bgimg2.jpg);background-size:cover;">
				<div class="inner cover">
					<h1 class="cover-heading">画瓷</h1>
					<p class="lead">用天然的矿物颜料在瓷器的表面画上各种各样的花纹，让每一件瓷器变得丰富多彩。</p>
					<p class="lead">
						<a href="#" class="btn btn-lg btn-default">了解更多<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a>
					</p>
				</div>
			</div>
			<div class="swiper-slide" style="background-image:url(${pageContext.request.contextPath }/jsp/images/bgimg3.jpg);background-size:cover;">
				<div class="inner cover">
					<h1 class="cover-heading">瓷器雕花</h1>
					<p class="lead">陶瓷刻划花装饰是指在已干或半干的陶瓷坯体表面上，用竹制或铁制工具来刻划出各种深浅、面积不同的纹饰。在陶瓷胎体表面的刻划装饰中，包含了剔花、刻花、划花、镂空、篦划纹、篦点纹等各种不同的工艺技法。</p>
					<p class="lead">
						<a href="#" class="btn btn-lg btn-default">了解更多<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a>
					</p>
				</div>
			</div>
			<div class="swiper-slide" style="background-image:url(${pageContext.request.contextPath }/jsp/images/bgimg4.jpg);background-size:cover;">
				<div class="inner cover">
					<h1 class="cover-heading">瓷器镂空</h1>
					<p class="lead">用刻刀在瓷器的表面镂空出各种各样的花纹，使瓷器具有立体的美感，是中国传统手工艺中技术难度较高的一种。</p>
					<p class="lead">
						<a href="#" class="btn btn-lg btn-default">了解更多<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a>
					</p>
				</div>
			</div>
			<div class="swiper-slide" style="background-image:url(${pageContext.request.contextPath }/jsp/images/bgimg5.jpg);background-size:cover;">
				<div class="inner cover">
					<h1 class="cover-heading">捏陶</h1>
					<p class="lead">在高速转动的转盘上固定好陶，用手捏出各种各样的形状。</p>
					<p class="lead">
						<a href="#" class="btn btn-lg btn-default">了解更多<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a>
					</p>
				</div>
			</div>
			<div class="swiper-slide" style="background-image:url(${pageContext.request.contextPath }/jsp/images/bgimg6.jpg);background-size:cover;">
				<div class="inner cover">
					<h1 class="cover-heading">中国传统手工艺</h1>
					<p class="lead">中国的传统手工艺有木版年画、扑灰画、纸马、内画、泥塑、面塑、糖塑、吹糖人、砖雕、瓷刻、微雕、木偶、皮影、蜡染、刺绣、织锦、剪纸、风筝、脸谱、面具等70种</p>
					<p class="lead">
						<a href="#" class="btn btn-lg btn-default">了解更多<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a>
					</p>
				</div>
			</div>
		</div>
		<!-- Add Pagination -->
		<div class="swiper-pagination"></div>
		<div class="swiper-downpage" style="width:100%;height:50px;position:absolute;"><span class="glyphicon glyphicon-chevron-down" aria-hidden="true"></span></div>
	</div>
	

	<script src="${pageContext.request.contextPath }/jsp/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath }/jsp/js/bootstrap.min.js"></script>
	<!-- Swiper JS -->
	<script src="${pageContext.request.contextPath }/jsp/js/swiper.min.js"></script>
	
	

	<!-- Initialize Swiper -->
	<script>
		var swiper = new Swiper('.swiper-container', {
			pagination: '.swiper-pagination',
			direction: 'vertical',
			slidesPerView: 1,
			paginationClickable: true,
			spaceBetween: 30,
			mousewheelControl: true
		});
	</script>
	<script type="text/javascript">
	 function request_login(){
		
 	 var json={
				"acphone":$(":input[name=username]").val(),
				"password":$("input[name=password]").val()
		};

		var postdata=JSON.stringify(json);  
				
					$.ajax({

						type : "post",
						url : "${pageContext.request.contextPath }/account_login.action",
						contentType : "application/json;charset=UTF-8",
						data : postdata,
						async : false,
						success : function(data) {
							if (data.acId == null || data.acId == "") {
								$(".checkbox")
								.append(
										"<div><p style='color:black;'>账号密码错误</p></div>");
								
							} else {
								window.location.reload();
							}
						},

					});
		}
	</script>
</body>
</html>