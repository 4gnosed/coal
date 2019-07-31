<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<title>首页</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- Fonts -->
		<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400' rel='stylesheet' type='text/css'>
		<link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900' rel='stylesheet' type='text/css'>
		<!-- CSS Libs -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/css/font-awesome.min.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/css/animate.min.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/css/bootstrap-switch.min.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/css/checkbox3.min.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/css/jquery.dataTables.min.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/css/dataTables.bootstrap.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/css/select2.min.css">
		<!-- CSS App -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/themes/flat-blue.css">
		<!-- Javascript Libs -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/js/Chart.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/js/bootstrap-switch.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/js/jquery.matchHeight-min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/js/jquery.dataTables.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/js/dataTables.bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/js/select2.full.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/js/ace/ace.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/js/ace/mode-html.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/js/ace/theme-github.js"></script>
		<!-- Javascript -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/app.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
		<!--My CSS-->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mystyle.css">
	</head>

	<body class="flat-blue">
		<div class="app-container">
			<div class="row content-container">
				<nav class="navbar navbar-default navbar-fixed-top navbar-top">
					<div class="container-fluid">
						<div class="navbar-header">
							<button type="button" class="navbar-expand-toggle">
						<i class="fa fa-bars icon"></i>
					</button>
							<ol class="breadcrumb navbar-breadcrumb">
								<li class="active">首页</li>
							</ol>
							<button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
						<i class="fa fa-th icon"></i>
					</button>
						</div>
						<ul class="nav navbar-nav navbar-right">
							<button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
						<i class="fa fa-times icon"></i>
					</button>

							<li class="dropdown profile">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${sessionuser.userName} <span class="caret"></span>
								</a>
								<ul class="dropdown-menu animated fadeInDown">
									<li class="profile-img"><img src="${pageContext.request.contextPath}/img/profile/picjumbo.com_HNCK4153_resize.jpg" class="profile-img"></li>
									<li>
										<div class="profile-info">
											<h4 class="username">${sessionuser.userName}</h4>
											<p>${sessionuser.userEmail}</p>
											<div class="btn-group margin-bottom-2x" role="group">
												<a href="${pageContext.request.contextPath}/logout?msg=退出登录">
													<button type="button" class="btn btn-default">
												<i class="fa fa-sign-out"></i> Logout
											</button>
												</a>
											</div>
										</div>
									</li>
								</ul>
							</li>
						</ul>
					</div>
				</nav>
				<div class="side-menu sidebar-inverse">
					<nav class="navbar navbar-default" role="navigation">
						<div class="side-menu-container">
							<div class="navbar-header">
								<a class="navbar-brand" href="#">
									<div class="icon fa fa-paper-plane"></div>
									<div class="title">国家煤炭交易平台</div>
								</a>
								<button type="button" class="navbar-expand-toggle pull-right visible-xs">
							<i class="fa fa-times icon"></i>
						</button>
							</div>
							<ul class="nav navbar-nav">
								<li class="active">
									<a href="${pageContext.request.contextPath}/jsp/index.jsp"> <span class="icon fa fa-tachometer"></span> <span class="title">首页</span>
									</a>
								</li>
								<!--						<li class="panel panel-default dropdown">
									<a data-toggle="collapse" href="#dropdown-form"> <span class="icon fa fa-file-text-o"></span> <span class="title">公告</span>
									</a>
									<div id="dropdown-form" class="panel-collapse collapse">
										<div class="panel-body">
											<ul class="nav navbar-nav">
												<li>
													<a href="form/addNotice.html">公告创建</a>
												</li>
												<li>
													<a href="form/manageNotice.html">公告管理</a>
												</li>
											</ul>
										</div>
									</div>
								</li>-->
								<!-- Dropdown-->
								<li class=" panel panel-default dropdown">
									<a data-toggle="collapse" href="#dropdown-example"> <span class="icon fa fa-slack"></span> <span class="title">用户</span>
									</a>
									<!-- Dropdown level 1 -->
									<div id="dropdown-example" class="panel-collapse collapse">
										<div class="panel-body">
											<ul class="nav navbar-nav">
												<li>
													<a href="${pageContext.request.contextPath}/findCompany?companyId=${sessionuser.companyId}">用户信息</a>
												</li>
												<c:if test="${sessionScope.sessionuser.roleId==1}">
													<li>
														<a href="${pageContext.request.contextPath}/findAllCompany">用户添加</a>
													</li>
													<li>
														<a href="${pageContext.request.contextPath}/accountManage">用户管理</a>
													</li>
												</c:if>

											</ul>
										</div>
									</div>
								</li>
								<!-- Dropdown-->
								<li class="panel panel-default dropdown">
									<a data-toggle="collapse" href="#component-example"> <span class="icon fa fa-cubes"></span> <span class="title">采购</span>
									</a>
									<!-- Dropdown level 1 -->
									<div id="component-example" class="panel-collapse collapse">
										<div class="panel-body">
											<ul class="nav navbar-nav">
												<c:if test="${sessionuser.roleId != 3}">
													<li>
														<a href="${pageContext.request.contextPath}/findCompanyAfterAddBuy?companyid=${sessionuser.companyId}">采购申请</a>
													</li>
												</c:if>
												<li>
													<a href="${pageContext.request.contextPath}/findAllPurchase?userid=${sessionuser.userId}">

														<c:if test="${sessionuser.roleId==2 || sessionuser.roleId==1}">
															采购申请查找
														</c:if>
														<c:if test="${sessionuser.roleId == 3}">
															采购审核
														</c:if>
													</a>
												</li>
											</ul>
										</div>
									</div>
								</li>
								<!-- Dropdown-->
							</ul>
						</div>
						<!-- /.navbar-collapse -->
					</nav>
				</div>
				<!-- Main Content -->
				<div class="container-fluid">
					<div class="side-body padding-top">
						<div class="row  no-margin-bottom" style="margin-top: 40px;">
							<span style="color: black;margin-left: 450px; font-size: 40px;">国家煤炭交易平台</span>
							<hr/>
							<text style="color: black;margin-left: 40px; font-size: 25px;">说明</text>
							<br/><br/>
							<text style="color: black;margin-left: 90px; font-size: 20px;">1.基于SSM框架实现。</text>
							<br/><br/>
							<text style="color: black;margin-left: 90px; font-size: 20px;">2.功能模块：用户登录，用户管理，采购申请，采购审核等。</text>
							<br/><br/>
							<text style="color: black;margin-left: 90px; font-size: 20px;">3.使用HttpSession保存用户登录状态，用户类型有平台管理员，公司员工（申请人），公司经理（审核人），
								不同角色拥有不同的功能（权限），比如只有个平台管理员才能添加删除用户，再如审核人查看不到申请人未提交的采购记录（状态为草稿）。</text>
							<br/><br/>
							<text style="color: black;margin-left: 90px; font-size: 20px;">4.本平台的不足之处是数据格式没有明确要求，只能单例登录，数据多表操作少等等。</text>
							<br/><br/>
							<text style="color: black;margin-left: 90px; font-size: 20px;">5.本平台作为个人学习SSM框架的DEMO。</text>
							<br/><br/>
						</div>
						<div class="row  no-margin-bottom">
							<!--轮播-->
							<!--					<div class="col-md-7">
								<div id="myCarousel" class="carousel slide">
									<ol class="carousel-indicators">
										<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
										<li data-target="#myCarousel" data-slide-to="1"></li>
										<li data-target="#myCarousel" data-slide-to="2"></li>
									</ol>
									<div class="carousel-inner">
										<div class="item active">
											<img src="${pageContext.request.contextPath}/img/Carousel1.jpg" alt="First slide">
										</div>
										<div class="item">
											<img src="${pageContext.request.contextPath}/img/Carousel2.jpg" alt="Second slide">
										</div>
										<div class="item">
											<img src="${pageContext.request.contextPath}/img/Carousel3.jpg" alt="Third slide">
										</div>
									</div>
									<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev"> <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
										<span class="sr-only">Previous</span>
									</a>
									<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next"> <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
										<span class="sr-only">Next</span>
									</a>
								</div>
							</div>-->
							<!--公告栏-->
							<!--<div class="col-md-5">
								<div class="card card-success" style="min-height: 500px;">
									<div class="card-header">
										<div class="card-title">
											<div class="title">
												<i class="fa fa-comments-o"></i> 公告栏
											</div>
										</div>
										<div class="clear-both"></div>
									</div>
									<div class="card-body no-padding">
										<ul class="message-list">
											<a href="form/notice.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="form/notice.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="form/notice.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="form/notice.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="form/notice.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
										</ul>
									</div>
								</div>
							</div>-->
						</div>
						<div class="row  no-margin-bottom">
							<!--采购审核-->
							<!--<div class="col-md-12">
								<div class="card card-success">
									<div class="card-header">
										<div class="card-title">
											<div class="title">
												<i class="fa fa-comments-o"></i> 采购申请审核
											</div>
										</div>
										<div class="clear-both"></div>
									</div>
								</div>
								<table class="table">
									<thead>
										<tr class="active">
											<th>序号</th>
											<th>单据编号</th>
											<th>创建日期</th>
											<th>煤种</th>
											<th>数量（万吨）</th>
											<th>结算方式</th>
											<th>发起人</th>
											<th>状态</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<tr class="table-hover">
											<th scope="row">1</th>
											<td>中能热电2019071801</td>
											<td>2019-7-18</td>
											<td>烟煤</td>
											<td>3.00</td>
											<td>一票结算</td>
											<td>中能热电</td>
											<td>待审核</td>
											<td>
												<a href="buy/reviewBuy.html">审核</a>
											</td>
										</tr>
										<tr class="table-hover">
											<th scope="row">1</th>
											<td>中能热电2019071801</td>
											<td>2019-7-18</td>
											<td>烟煤</td>
											<td>3.00</td>
											<td>一票结算</td>
											<td>中能热电</td>
											<td>待审核</td>
											<td>
												<a href="buy/reviewBuy.html">审核</a>
											</td>
										</tr>
										<tr class="table-hover">
											<th scope="row">1</th>
											<td>中能热电2019071801</td>
											<td>2019-7-18</td>
											<td>烟煤</td>
											<td>3.00</td>
											<td>一票结算</td>
											<td>中能热电</td>
											<td>待审核</td>
											<td>
												<a href="buy/reviewBuy.html">审核</a>
											</td>
										</tr>
										<tr class="table-hover">
											<th scope="row">1</th>
											<td>中能热电2019071801</td>
											<td>2019-7-18</td>
											<td>烟煤</td>
											<td>3.00</td>
											<td>一票结算</td>
											<td>中能热电</td>
											<td>待审核</td>
											<td>
												<a href="buy/reviewBuy.html">审核</a>
											</td>
										</tr>
										<tr class="table-hover">
											<th scope="row">1</th>
											<td>中能热电2019071801</td>
											<td>2019-7-18</td>
											<td>烟煤</td>
											<td>3.00</td>
											<td>一票结算</td>
											<td>中能热电</td>
											<td>待审核</td>
											<td>
												<a href="buy/reviewBuy.html">审核</a>
											</td>
										</tr>
										<tr class="table-hover">
											<th scope="row">1</th>
											<td>中能热电2019071801</td>
											<td>2019-7-18</td>
											<td>烟煤</td>
											<td>3.00</td>
											<td>一票结算</td>
											<td>中能热电</td>
											<td>待审核</td>
											<td>
												<a href="buy/reviewBuy.html">审核</a>
											</td>
										</tr>
										<tr class="table-hover">
											<th scope="row">1</th>
											<td>中能热电2019071801</td>
											<td>2019-7-18</td>
											<td>烟煤</td>
											<td>3.00</td>
											<td>一票结算</td>
											<td>中能热电</td>
											<td>待审核</td>
											<td>
												<a href="buy/reviewBuy.html">审核</a>
											</td>
										</tr>
										<tr class="table-hover">
											<th scope="row">1</th>
											<td>中能热电2019071801</td>
											<td>2019-7-18</td>
											<td>烟煤</td>
											<td>3.00</td>
											<td>一票结算</td>
											<td>中能热电</td>
											<td>待审核</td>
											<td>
												<a href="buy/reviewBuy.html">审核</a>
											</td>
										</tr>
									</tbody>
								</table>
							</div>-->
						</div>
						<div class="row  no-margin-bottom">
							<!--采购执行填报-->
							<!--<div class="col-md-12">
								<div class="card card-success">
									<div class="card-header">
										<div class="card-title">
											<div class="title">
												<i class="fa fa-star-half-o"></i> 采购执行填报
											</div>
										</div>
										<div class="clear-both"></div>
									</div>
								</div>
								<table class="table">
									<thead>
										<tr class="active">
											<th>序号</th>
											<th>单据编号</th>
											<th>下达日期</th>
											<th>煤种</th>
											<th>采购数量（万吨）</th>
											<th>收到基低位发热量</th>
											<th>运输方式</th>
											<th>订单状态</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<tr class="table-hover">
											<th scope="row">1</th>
											<td>中能热电2019071801</td>
											<td>2019-7-18</td>
											<td>烟煤</td>
											<td>3.00</td>
											<td>5200</td>
											<td>船运</td>
											<td>已下达</td>
											<td>审核</td>
										</tr>
										<tr class="table-hover">
											<th scope="row">1</th>
											<td>中能热电2019071801</td>
											<td>2019-7-18</td>
											<td>烟煤</td>
											<td>3.00</td>
											<td>5200</td>
											<td>船运</td>
											<td>已下达</td>
											<td>审核</td>
										</tr>
										<tr class="table-hover">
											<th scope="row">1</th>
											<td>中能热电2019071801</td>
											<td>2019-7-18</td>
											<td>烟煤</td>
											<td>3.00</td>
											<td>5200</td>
											<td>船运</td>
											<td>已下达</td>
											<td>审核</td>
										</tr>
										<tr class="table-hover">
											<th scope="row">1</th>
											<td>中能热电2019071801</td>
											<td>2019-7-18</td>
											<td>烟煤</td>
											<td>3.00</td>
											<td>5200</td>
											<td>船运</td>
											<td>已下达</td>
											<td>审核</td>
										</tr>
									</tbody>
								</table>
							</div>-->
						</div>
					</div>
				</div>
			</div>
		</div>
		<footer class="app-footer">
			<center>
				<div class="wrapper">
					<a href="#"> <i class="fa fa-long-arrow-up"></i>
					</a>
					<span>版权由gnosed所有</span>
				</div>
			</center>

		</footer>
		<div>
	</body>

</html>