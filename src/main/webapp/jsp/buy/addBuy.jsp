<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<title>采购申请</title>
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
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/theming.js"></script>
		<!-- Javascript -->
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
								<li>采购</li>
								<li class="active">采购申请</li>
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
						<div class="row  no-margin-bottom">
							<!--采购申请创建-->
							<div class="col-xs-12">
								<div class="card card-success">
									<div class="card-header">
										<div class="card-title">
											<div class="title">
												<i class="fa fa-comments-o">采购申请创建</i>
											</div>
										</div>
										<div class="clear-both"></div>
									</div>
								</div>
							</div>
							<div class="col-xs-12">

								<!--
                                	表单提交
                                -->
								<form class="form-horizontal" action="${pageContext.request.contextPath}/addBuy?userid=${sessionuser.userId}&companyid=${sessionuser.companyId}" method="post">
									<div class="card" style="margin-bottom: 10px;">
										<div class="card-header">
											<div class="card-title">
												<div class="title">
													<i class="fa">基本情况</i>
												</div>
											</div>
											<div class="clear-both"></div>
										</div>
										<div class="card-body">

											<div class="form-group">
												<label for="inputEmail3" class="col-sm-2 control-label">报价截止日期:</label>
												<div class="col-sm-3">
													<input type="date" class="form-control " value="2019-07-26" name="purdeadline">
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">单据编号：</label>
												<div class="col-sm-3">
													<input type="text" readonly="true" class="form-control" value="${fnumber}" name="purnumber">
												</div>

											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">申请单位：</label>
												<div class="col-sm-3">
													<input type="text" class="form-control" readonly="true" value="${company.companyName}">
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">运输方式：</label>
												<div class="col-sm-3">
													<select class="col-sm-12" name="purtrans">
														<option value="1">其他</option>
														<option value="2">火车</option>
														<option value="3">汽车</option>
														<option value="4">船运</option>
													</select>
												</div>

											</div>

											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">煤种1：</label>
												<div class="col-sm-3">
													<select class="col-sm-12" name="purcoal1">
														<option value="1">其它</option>
														<option value="2">烟煤</option>
														<option value="3">无烟煤</option>
														<option value="4">褐煤</option>
														<option value="5">贫瘦煤</option>

													</select>
												</div>

												<label for="inputPassword3" class="col-sm-2 control-label">煤种2：</label>
												<div class="col-sm-3">
													<select class="col-sm-12" name="purcoal2">
														<option value="1">其他</option>
														<option value="2">原煤</option>
														<option value="3">混煤</option>
														<option value="4">中煤</option>
														<option value="5">泥煤</option>
													</select>
												</div>

											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">结算方式：</label>
												<div class="col-sm-3">
													<select class="col-sm-12" name="purcash">
														<option value="1">其他</option>
														<option value="2">二票结算</option>
														<option value="3">铁路大票</option>
														<option value="4">煤款税票</option>
													</select>
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">验收方式：</label>
												<div class="col-sm-3">
													<select class="col-sm-12" name="purcheck">
														<option value="1">到厂验收</option>
														<option selected value="2">到厂第三方验收</option>
														<option value="3">港口第三方验收</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">采购数量(万吨）：</label>
												<div class="col-sm-3">
													<input type="text" class="form-control" name="purquantity">
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">交货地点：</label>
												<div class="col-sm-3">
													<input type="text" class="form-control" name="purdeliplace">
												</div>
											</div>

											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">最高限价（元/卡.吨）：</label>
												<div class="col-sm-3">
													<input type="text" class="form-control" name="purpriceceiling">
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">最低限价（元/卡.吨）：</label>
												<div class="col-sm-3">
													<input type="text" class="form-control" name="purpricebottom">
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">限价说明：</label>
												<div class="col-sm-3">
													<input type="text" class="form-control" name="purpricestatement">
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">结付款方式：</label>
												<div class="col-sm-3">
													<input type="text" class="form-control" name="purpaytype">
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">报价保证金缴纳(元/吨)：</label>
												<div class="col-sm-3">
													<div>
														<div class="radio3 radio-check radio-inline">
															<input type="radio" id="radio4" name="baojia" value="option1" checked="">
															<label for="radio4">不要求</label>
														</div>
														<div class="radio3 radio-check radio-success radio-inline">
															<input type="radio" id="radio5" name="baojia" value="option2">
															<label for="radio5">要求</label>
														</div>
														<input type="text" name="puapppromis">
													</div>
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">履约保证金缴纳(元/吨)：</label>
												<div class="col-sm-3">
													<div>
														<div class="radio3 radio-check radio-inline">
															<input type="radio" id="radio7" name="lvyue" value="option1" checked="">
															<label for="radio7">不要求</label>
														</div>
														<div class="radio3 radio-check radio-success radio-inline">
															<input type="radio" id="radio8" name="lvyue" value="option2">
															<label for="radio8">要求</label>
														</div>
														<input type="text" name="purpricepromise">
													</div>
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">交货时间：</label>
												<div class="col-sm-4">
													<input type="date" class="col-sm-5" value="2019-07-26" name="purdelitimemin">至
													<input type="date" class="col-sm-6" value="2019-07-29" name="purdelitimemax" style="float: right;">
												</div>
											</div>
										</div>
									</div>
									<div class="card" style="margin-bottom: 10px;">
										<div class="card-header">
											<div class="card-title">
												<div class="title">
													<i class="fa">煤质要求</i>
												</div>
											</div>
											<div class="clear-both"></div>
										</div>
										<div class="card-body">
											<div class="sub-title">收到基基准</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">收到基低位发热量Qnet,ar≥(KCal/kg)：</label>
												<div class="col-sm-4">
													<input type="text" class="form-control" name="purreceqnet">
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">收到基全硫St,ar≤(%)：</label>
												<div class="col-sm-4">
													<input type="text" class="form-control" name="purrecest">
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">全水分M≤(%)：</label>
												<div class="col-sm-4">
													<input type="text" class="form-control" name="purrecem">
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">收到基灰分Aar≤(%)：</label>
												<div class="col-sm-4">
													<input type="text" class="form-control" name="purreceaar">
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">收到基挥发分Var(%)：</label>
												<div class="col-sm-4">
													<input type="text" class="col-sm-5" name="purrecevarmin">至

													<input type="text" class="col-sm-6" name="purrecevarmax" style="float: right;">
												</div>
											</div>
											<div class="sub-title">空气干燥基基准</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">空干基水分Mad≤(%)：</label>
												<div class="col-sm-4">
													<input type="text" class="form-control" name="purairmad">
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">空干基全硫St,ad≤(%)：</label>
												<div class="col-sm-4">
													<input type="text" class="form-control" name="purairst">
												</div>
											</div>

											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">空干基挥发分Vad(%)：</label>

												<div class="col-sm-4">
													<input type="text" class="col-sm-5" name="purairmin">至

													<input type="text" class="col-sm-6" name="purairmax" style="float: right;">
												</div>
											</div>
											<div class="sub-title">干基基准</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">干基高位发热量Qgr,d≥(KCal/kg)：</label>
												<div class="col-sm-4">
													<input type="text" class="form-control" name="purdriedqgr">
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">干基全硫St,d≤(%)：</label>
												<div class="col-sm-4">
													<input type="text" class="form-control" name="purdriedst">
												</div>
											</div>

											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">干燥无灰基挥发分(%)：</label>
												<div class="col-sm-4">
													<input type="text" class="col-sm-5" name="purdriedmin">至

													<input type="text" class="col-sm-6" name="purdriedmax" style="float: right;">
												</div>
											</div>
										</div>
									</div>

									<div class="card">
										<div class="card-body">
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">粒度(mm)≤：</label>
												<div class="col-sm-4">
													<input type="text" class="form-control" name="purparaticlesize">
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">灰熔点ST(℃)≥：</label>
												<div class="col-sm-4">
													<input type="text" class="form-control" name="purst">
												</div>
											</div>

											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">哈式可磨系数(HGI)≥：</label>
												<div class="col-sm-4">
													<input type="text" class="form-control" name="purhgi">
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-4 control-label">备注：</label>
												<div class="col-sm-4">
													<textarea class="form-control" rows="3" placeholder="收到基低位发热量值，要求在4300-4400区间内" name="purremak"></textarea>
												</div>
											</div>
											<div class="form-group">
												<center>
													<input type="submit" class="btn btn-default" value="保存" name="submittype"></input>
													<input type="submit" class="btn btn-default" value="提交" name="submittype"></input>
													<input type="button" value="返回" onclick="javascript:history.back(-1)" class="btn btn-default"></input>
												</center>
											</div>

										</div>
									</div>
								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		   

	</body>

</html>