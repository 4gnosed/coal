<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<title>Flat Admin V.2 - Free Bootstrap Admin Templates</title>
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
								<li class="active">采购申请信息表</li>
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
							<!--采购审核-->
							<div class="col-xs-12">
								<div class="card card-success">
									<div class="card-header">
										<div class="card-title">
											<div class="title">
												<i class="fa fa-comments-o">采购申请信息表</i>
											</div>
										</div>
										<div class="clear-both"></div>
									</div>
								</div>
							</div>
							<div class="col-xs-12">

								<form class="form-horizontal" action="${pageContext.request.contextPath}/submitPurchase?purid=${purchase.purId}&userid=${sessionuser.userId}" method="post">
									<div class="card" style="margin-bottom: 10px;">
										<div class="card-header">
											<div class="card-title">
												<div class="title">
													<i class="fa">采购信息</i>
												</div>
											</div>
											<div class="clear-both"></div>
										</div>
										<div class="card-body" style="padding: 2% 5%;">

											<div class="form-group">
												<label for="inputEmail3" class="col-sm-2 control-label">报价截止日期:</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.deadLine}</div>
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">申请单位：</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.companyId}</div>
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">单据编号：</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.docNumber}</div>
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">交货时间：</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.deliTimeMin}至${purchase.deliTimeMax}</div>
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">煤种：</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.coal1Id},${purchase.coal2Id}</div>
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">采购数量(万吨）：</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.quantity}</div>
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">运输方式：</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.transId}</div>
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">交货地点：</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.deliPlace}</div>
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">结算方式：</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.cashId}</div>
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">验收方式：</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.checkId}</div>
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">最高限价（元/卡.吨）：</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.priceCeiling}(元/卡·吨)</div>
												</div>
												<label for="inputPassword3" class="col-sm-2 control-label">最低限价（元/卡.吨）：</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.priceBottom}(元/卡·吨)</div>
												</div>
											</div>
											<div class="form-group">
												<label for="inputPassword3" class="col-sm-2 control-label">限价说明：</label>
												<div class="col-sm-2">
													<div class="control-div">${purchase.priceStatement}/div>
													</div>
													<label for="inputPassword3" class="col-sm-2 control-label">结付款方式：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.payType}</div>
													</div>
												</div>
												<div class="form-group">
													<label for="inputPassword3" class="col-sm-2 control-label">保证金要求：</label>
													<div class="col-sm-21">
														<div class="control-div">本次采购报价保证金标准：10元/吨，履约保证金标准：10元/吨； 参与报价时，供应商须先通过平台开立的保证金虚拟账户缴纳500,000元报价保证金； 中标信息公布后，未中标供应商的报价保证金将自动返回供应商保证金虚拟账户； 中标供应商与电厂签订采购合同时，供应商按电厂履约保证金要求及签约量缴纳履约保证金；在双方完成合同履约后，电厂将解冻履约保证金，履约保证金将返还供应商保证金虚拟账户。

														</div>
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
											<div class="card-body" style="padding: 2% 10%;">
												<div class="sub-title">收到基基准</div>
												<div class="form-group">
													<label for="inputPassword3" class="col-sm-2 control-label">收到基低位发热量Qnet,ar≥(KCal/kg)：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.receQnet}</div>
													</div>
													<label for="inputPassword3" class="col-sm-2 control-label">收到基全硫St,ar≤(%)：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.receSt}</div>
													</div>
													<label for="inputPassword3" class="col-sm-2 control-label">全水分M≤(%)：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.receM}</div>
													</div>

												</div>
												<div class="form-group">
													<label for="inputPassword3" class="col-sm-2 control-label">收到基灰分Aar≤(%)：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.receAar}</div>
													</div>
													<label for="inputPassword3" class="col-sm-2 control-label">收到基挥发分Var(%)：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.receVarMin}至${purchase.receVarMax}</div>
													</div>
												</div>
												<div class="sub-title">空气干燥基基准</div>
												<div class="form-group">
													<label for="inputPassword3" class="col-sm-2 control-label">空干基水分Mad≤(%)：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.airMad}</div>
													</div>
													<label for="inputPassword3" class="col-sm-2 control-label">空干基全硫St,ad≤(%)：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.airSt}</div>
													</div>
													<label for="inputPassword3" class="col-sm-2 control-label">空干基挥发分Vad(%)：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.airVadMin}至${purchase.airVadMax}</div>
													</div>
												</div>
												<div class="sub-title">干基基准</div>
												<div class="form-group">
													<label for="inputPassword3" class="col-sm-2 control-label">干基高位发热量Qgr,d≥(KCal/kg)：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.driedQgr}</div>
													</div>
													<label for="inputPassword3" class="col-sm-2 control-label">干基全硫St,d≤(%)：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.driedSt}</div>
													</div>
													<label for="inputPassword3" class="col-sm-2 control-label">干燥无灰基挥发分(%)：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.driedVadMin}至${purchase.driedVadMax}</div>
													</div>
												</div>
											</div>
										</div>
										<div class="card" style="margin-bottom: 10px;">
											<div class="card-body" style="padding: 2% 10%;">
												<div class="form-group">
													<label for="inputPassword3" class="col-sm-2 control-label">粒度(mm)≤：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.particleSize}</div>
													</div>
													<label for="inputPassword3" class="col-sm-2 control-label">灰熔点ST(℃)≥：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.ST}</div>
													</div>
													<label for="inputPassword3" class="col-sm-2 control-label">哈式可磨系数(HGI)≥：</label>
													<div class="col-sm-2">
														<div class="control-div">${purchase.HGI}</div>
													</div>
												</div>
												<div class="form-group">
													<label for="inputPassword3" class="col-sm-2 control-label">备注：</label>
													<div class="col-sm-21">
														<div class="control-div">${purchase.remark}</div>
													</div>
												</div>

											</div>
										</div>

										<c:if test="${sessionuser.roleId!=2}">
											<div class="card">
												<div class="card-header">
													<div class="card-title">
														<div class="title">
															<i class="fa">审核意见</i>
														</div>
													</div>
												</div>
												<div>
													<input type="text" name="opinion" id="opinionid" placeholder="在此填写您的审核意见" style="width: 530px; height: 160px; margin-left: 330px;margin-top: 40px;margin-bottom: 30px;text-align: center;" />
												</div>
											</div>
										</c:if>

										<div class="form-group">
											<center>

												<c:if test="${sessionuser.roleId==2}">

													<c:if test="${purchase.statement == '草稿'}">
														<input type="submit" value="提交" name="submitType" class="btn btn-default"></input>
													</c:if>

												</c:if>
												<c:if test="${sessionuser.roleId==3}">

													<input type="submit" value="审核" name="submitType" class="btn btn-default "></input>
													<input type="submit" value="驳回" name="submitType" class="btn btn-default "></input>

												</c:if>

												<input type="button" value="返回" onclick="javascript:history.back(-1)" class="btn btn-default"></input>
											</center>
										</div>

										<c:if test="${sessionuser.roleId!=2}">
											<div class="card">
												<div class="card-header">
													<div class="card-title">
														<div class="title">
															<i class="fa">单据审批记录</i>
														</div>
													</div>
													<div class="clear-both"></div>
												</div>
												<div class="card-body" style="padding: 2% 10%;">
													<table class="table">
														<thead>
															<tr class="active">
																<th>序号</th>
																<th>单据</th>
																<th>操作人员</th>
																<th>审核时间</th>
																<th>操作</th>
																<th>审核意见</th>
															</tr>
														</thead>
														<tbody>

															<c:forEach items="${checkedInfos}" var="n" varStatus="status">
																<th scope="row">${status.index+1}</th>
																<td>${n.purId}</td>
																<td>${n.userId}</td>
																<td>${n.time}</td>
																<td>${n.operate}</td>
																<td>${n.opinion}</td>
																</tr>
															</c:forEach>

														</tbody>
													</table>

												</div>
											</div>
										</c:if>
								</form>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div>

	</body>

</html>