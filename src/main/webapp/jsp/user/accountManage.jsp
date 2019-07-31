<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>用户管理</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
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
								<li>用户</li>
								<li class="active">用户管理</li>
							</ol>
							<button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                            <i class="fa fa-th icon"></i>
                        </button>
						</div>
						<ul class="nav navbar-nav navbar-right">
							<button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                            <i class="fa fa-times icon"></i>
                        </button>

							<!--右上角用户退出登录-->
							<li class="dropdown profile">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${sessionuser.userName}
									<span class="caret"></span>
								</a>
								<ul class="dropdown-menu animated fadeInDown">
									<li class="profile-img">
										<img src="${pageContext.request.contextPath}/img/profile/picjumbo.com_HNCK4153_resize.jpg" class="profile-img">
									</li>
									<li>
										<div class="profile-info">
											<h4 class="username">${sessionuser.userName}</h4>
											<p>${sessionuser.userEmail}</p>
											<div class="btn-group margin-bottom-2x" role="group">
												<a href="${pageContext.request.contextPath}/logout?msg=退出登录"><button type="button" class="btn btn-default">
                                                <i class="fa fa-sign-out"></i> Logout</button></a>
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
					<div class="side-body">

						<div class="row">
							<div class="col-xs-12">
								<div class="card">
									<div class="card-header">

										<div class="card card-success">
											<div class="card-header">
												<div class="card-title">
													<div class="title">
														<i class="fa fa-comments-o"></i>用户管理</div>
												</div>
												<div class="clear-both"></div>
											</div>
										</div>
									</div>
									<div class="card-body">
										<table class="datatable table table-striped" cellspacing="0" width="100%">
											<thead>
												<tr>
													<th>序号</th>
													<th>姓名</th>
													<th>邮箱</th>
													<th>公司</th>
													<th>角色</th>
													<th>操作</th>
												</tr>
											</thead>
											<!--				<tfoot>
												<tr>
													<th>序号</th>
													<th>姓名</th>
													<th>用户名</th>
													<th>部门</th>
													<th>角色</th>
													<th>操作</th>
												</tr>
											</tfoot>-->
											<tbody>

												<c:forEach items="${users}" var="n" varStatus="status">
													<tr class=" datatable-hover ">
														<th scope="row ">${status.index+1}</th>
														<td>${n.userName}</td>
														<td>${n.userEmail}</td>
														<td>

															<c:forEach items="${companies}" var="m">
																<c:if test="${n.companyId == m.companyId}">
																	${m.companyName}
																</c:if>
															</c:forEach>

														</td>
														<td>

															<c:if test="${n.roleId==1}">
																平台管理员
															</c:if>
															<c:if test="${n.roleId==2}">
																公司员工
															</c:if>
															<c:if test="${n.roleId==3}">
																公司经理
															</c:if>

														</td>
														<td>
															<a href="${pageContext.request.contextPath}/alterUserGetUser?userid=${n.userId} ">修改</a>&nbsp;
															<a href="${pageContext.request.contextPath}/deleteUser?userid=${n.userId} ">删除</a>&nbsp;
														</td>
													</tr>
												</c:forEach>

											</tbody>
										</table>
										<a href="${pageContext.request.contextPath}/findAllCompany "><button type="submit " class="btn btn-default ">添加用户</button></a>
										<input type="button" value="返回" onclick="javascript:history.back(-1)" class="btn btn-default"></input>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			 
			<div>
				<!-- Javascript Libs -->
				<script type="text/javascript " src="${pageContext.request.contextPath}/lib/js/jquery.min.js "></script>
				<script type="text/javascript " src="${pageContext.request.contextPath}/lib/js/bootstrap.min.js "></script>
				<script type="text/javascript " src="${pageContext.request.contextPath}/lib/js/Chart.min.js "></script>
				<script type="text/javascript " src="${pageContext.request.contextPath}/lib/js/bootstrap-switch.min.js "></script>

				<script type="text/javascript " src="${pageContext.request.contextPath}/lib/js/jquery.matchHeight-min.js "></script>
				<script type="text/javascript " src="${pageContext.request.contextPath}/lib/js/jquery.dataTables.min.js " charset="utf-8 "></script>
				<script type="text/javascript " src="${pageContext.request.contextPath}/lib/js/dataTables.bootstrap.min.js "></script>
				<script type="text/javascript " src="${pageContext.request.contextPath}/lib/js/select2.full.min.js "></script>
				<script type="text/javascript " src="${pageContext.request.contextPath}/lib/js/ace/ace.js "></script>
				<script type="text/javascript " src="${pageContext.request.contextPath}/lib/js/ace/mode-html.js "></script>
				<script type="text/javascript " src="${pageContext.request.contextPath}/lib/js/ace/theme-github.js "></script>
				<!-- Javascript -->
				<script type="text/javascript " src="${pageContext.request.contextPath}/js/app.js "></script>
	</body>

</html>