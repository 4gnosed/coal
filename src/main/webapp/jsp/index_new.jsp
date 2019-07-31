<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<nav class="navbar1 navbar-default navbar-fixed-top navbar-top">
					<div class="container-fluid">
						<div class="navbar-header">

							<ol class="breadcrumb navbar-breadcrumb" style="background-color: #FFF;">
								<li class="active">
									<h4 style="color: #353d47; font-size: 1.5em;">国家煤炭交易平台</h4>
								</li>
							</ol>
						</div>
						<div style="float: right; margin-right: 2%;">
							<a href="${pageContext.request.contextPath}/jsp/login.jsp">
								<button type="button" class="btn btn-success">登录</button>
							</a>
						</div>

					</div>
				</nav>

				<!-- Main Content -->
				<div class="container-fluid">
					<div class="side-body padding-top" style="margin-left: 15px;">
						<div class="row  no-margin-bottom">
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
							<!--<div class="col-md-7">
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
											<a href="noticelogin.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="noticelogin.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="noticelogin.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="noticelogin.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="noticelogin.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="noticelogin.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="noticelogin.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="noticelogin.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="noticelogin.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="noticelogin.html">
												<li>
													<div class="message-block">
														<div>
															<span class="username">【公司名称】标题</span> <span class="message-datetime">2019-07-18</span>
														</div>
													</div>
												</li>
											</a>
											<a href="noticelogin.html">
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