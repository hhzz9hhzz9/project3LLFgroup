<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
	<head>
    	<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>Proton - Admin Template</title>		

		<!-- Favicon and touch icons -->
		<link rel="shortcut icon" href="${APPPATH }/assets/ico/favicon.ico" type="image/x-icon" />

	    <!-- Css files -->
	    <link href="${APPPATH }/assets/css/bootstrap.min.css" rel="stylesheet">		
		<link href="${APPPATH }/assets/css/jquery.mmenu.css" rel="stylesheet">		
		<link href="${APPPATH }/assets/css/font-awesome.min.css" rel="stylesheet">
		<link href="${APPPATH }/assets/plugins/jquery-ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
	    <link href="${APPPATH }/assets/css/style.min.css" rel="stylesheet">
		<link href="${APPPATH }/assets/css/add-ons.min.css" rel="stylesheet">

	</head>
</head>

<body>
		<!-- start: Header -->
	<div class="navbar" role="navigation">
	
		<div class="container-fluid">
	
			<ul class="nav navbar-nav navbar-actions navbar-left">
				<li class="visible-md visible-lg"><a href="table.html#" id="main-menu-toggle"><i class="fa fa-th-large"></i></a></li>
				<li class="visible-xs visible-sm"><a href="table.html#" id="sidebar-menu"><i class="fa fa-navicon"></i></a></li>
			</ul>
	
			<form class="navbar-form navbar-left">
				<a type="submit" class="fa fa-search"></a>
				<input type="text" class="form-control" placeholder="Search...">
			</form>
	
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown visible-md visible-lg">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope-o"></i><span class="badge">5</span></a>
					<ul class="dropdown-menu">
						<li class="dropdown-menu-header">
							<strong>消息</strong>
							<div class="progress thin">
								<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="30" aria-valuemin="0"
								 aria-valuemax="100" style="width: 30%">
									<span class="sr-only">30% 已完成 (success)</span>
								</div>
							</div>
						</li>
						<li class="avatar">
							<a href="page-inbox.html">
								<img class="avatar" src="${APPPATH }/assets/img/avatar1.jpg">
								<div>新消息</div>
								<small>1 分钟 前</small>
								<span class="label label-info">NEW</span>
							</a>
						</li>
						<li class="avatar">
							<a href="page-inbox.html">
								<img class="avatar" src="${APPPATH }/assets/img/avatar2.jpg">
								<div>新消息</div>
								<small>3 分钟 前</small>
								<span class="label label-info">NEW</span>
							</a>
						</li>
						<li class="avatar">
							<a href="page-inbox.html">
								<img class="avatar" src="${APPPATH }/assets/img/avatar3.jpg">
								<div>新消息</div>
								<small>4 分钟 前</small>
								<span class="label label-info">NEW</span>
							</a>
						</li>
						<li class="avatar">
							<a href="page-inbox.html">
								<img class="avatar" src="${APPPATH }/assets/img/avatar4.jpg">
								<div>新消息</div>
								<small>30 分钟 前</small>
							</a>
						</li>
						<li class="avatar">
							<a href="page-inbox.html">
								<img class="avatar" src="${APPPATH }/assets/img/avatar5.jpg">
								<div>新消息</div>
								<small>1 分钟 前</small>
							</a>
						</li>
						<li class="dropdown-menu-footer text-center">
							<a href="page-inbox.html"> -查看所有信息- </a>
						</li>
					</ul>
				</li>
				<li class="dropdown visible-md visible-lg">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell-o"></i><span class="badge">3</span></a>
					<ul class="dropdown-menu">
						<li class="dropdown-menu-header">
							<strong>通知</strong>
							<div class="progress thin">
								<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="30" aria-valuemin="0"
								 aria-valuemax="100" style="width: 30%">
									<span class="sr-only">30% 完成 (success)</span>
								</div>
							</div>
						</li>
						<li class="clearfix">
							<i class="fa fa-comment"></i>
							<a href="page-activity.html" class="notification-user"> Sharon Rose </a>
							<span class="notification-action"> 回复了您 </span>
							<a href="page-activity.html" class="notification-link"> 评论</a>
						</li>
						<li class="clearfix">
							<i class="fa fa-pencil"></i>
							<a href="page-activity.html" class="notification-user"> Nadine </a>
							<span class="notification-action"> 6 分钟 前编辑了 </span>
							<a href="page-activity.html" class="notification-link"> 日志</a>
						</li>
						<li class="clearfix">
							<i class="fa fa-trash-o"></i>
							<a href="page-activity.html" class="notification-user"> Lorenzo </a>
							<span class="notification-action"> 刚刚移除了<a href="#" class="notification-link"> 12 个文件</a></span>
						</li>
						<li class="dropdown-menu-footer text-center">
							<a href="page-activity.html">查看所有通知</a>
						</li>
					</ul>
				</li>
				<li class="dropdown visible-md visible-lg">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-gears"></i></a>
					<ul class="dropdown-menu update-menu" role="menu">
						<li><a href="#"><i class="fa fa-database"></i> 数据库 </a>
						</li>
						<li><a href="#"><i class="fa fa-bar-chart-o"></i> 关系 </a>
						</li>
						<li><a href="#"><i class="fa fa-bell"></i> 通知 </a>
						</li>
						<li><a href="#"><i class="fa fa-envelope"></i> 消息 </a>
						</li>
						<li><a href="#"><i class="fa fa-flash"></i> 贸易 </a>
						</li>
						<li><a href="#"><i class="fa fa-credit-card"></i> 单据 </a>
						</li>
						<li><a href="#"><i class="fa fa-dollar"></i> 资产 </a>
						</li>
						<li><a href="#"><i class="fa fa-thumbs-o-up"></i> 订单 </a>
						</li>
						<li><a href="#"><i class="fa fa-folder"></i> 目录 </a>
						</li>
						<li><a href="#"><i class="fa fa-users"></i> 用户 </a>
						</li>
					</ul>
				</li>
				<li class="dropdown visible-md visible-lg">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img class="user-avatar" src="${APPPATH }/assets/img/drinkTea.jpg"
						 alt="user-mail">管理员@qq.com</a>
					<ul class="dropdown-menu">
						<li class="dropdown-menu-header">
							<strong>账户</strong>
						</li>
						<li><a href="page-profile.html"><i class="fa fa-user"></i> 个人资料</a></li>
						<li><a href="page-login.html"><i class="fa fa-wrench"></i> 设置</a></li>
						<li><a href="page-invoice.html"><i class="fa fa-usd"></i> 账单 <span class="label label-default">10</span></a></li>
						<li><a href="gallery.html"><i class="fa fa-file"></i> 文件 <span class="label label-primary">27</span></a></li>
						<li class="divider"></li>
						<li><a href="index.html"><i class="fa fa-sign-out"></i> 登出 </a></li>
					</ul>
				</li>
				<li><a href="index.html"><i class="fa fa-power-off"></i></a></li>
			</ul>
	
		</div>
	
	
	
	</div>
	<!-- end: Header -->
	
	<div class="container-fluid content">
	
		<div class="row">
				
			<!-- start: Main Menu -->
			<div class="sidebar ">
								
				<div class="sidebar-collapse">
					<div class="sidebar-header t-center">
                        <span><img class="text-logo" src="${APPPATH }/assets/img/logo1.png"><i class="fa fa-space-shuttle fa-3x blue"></i></span>
                    </div>										
					<div class="sidebar-menu">						
						<ul class="nav nav-sidebar">
							<li><a href="${APPPATH }/index.jsp"><i class="fa fa-laptop"></i><span class="text"> Dashboard</span></a></li>
							<li>
								<a href="#"><i class="fa fa-file-text"></i><span class="text"> Pages</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">
									<li><a href="page-activity.html"><i class="fa fa-car"></i><span class="text"> Activity</span></a></li>
									<li><a href="page-inbox.html"><i class="fa fa-envelope"></i><span class="text"> Mail</span></a></li>
									<li><a href="page-invoice.html"><i class="fa fa-credit-card"></i><span class="text"> Invoice</span></a></li>
									<li><a href="page-profile.html"><i class="fa fa-heart-o"></i><span class="text"> Profile</span></a></li>
									<li><a href="page-pricing-tables.html"><i class="fa fa-columns"></i><span class="text"> Pricing Tables</span></a></li>
									<li><a href="page-404.html"><i class="fa fa-puzzle-piece"></i><span class="text"> 404</span></a></li>
									<li><a href="page-500.html"><i class="fa fa-puzzle-piece"></i><span class="text"> 500</span></a></li>
									<li><a href="page-lockscreen.html"><i class="fa fa-lock"></i><span class="text"> LockScreen1</span></a></li>
									<li><a href="page-lockscreen2.html"><i class="fa fa-lock"></i><span class="text"> LockScreen2</span></a></li>
									<li><a href="page-login.html"><i class="fa fa-key"></i><span class="text"> Login Page</span></a></li>
									<li><a href="page-register.html"><i class="fa fa-sign-in"></i><span class="text"> Register Page</span></a></li>
								</ul>	
							</li>
							<li>
								<a href="#"><i class="fa fa-list-alt"></i><span class="text"> Forms</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">
									<li><a href="form-elements.html"><i class="fa fa-indent"></i><span class="text"> Form elements</span></a></li>
									<li><a href="form-wizard.html"><i class="fa fa-tags"></i><span class="text"> Wizard</span></a></li>
									<li><a href="form-dropzone.html"><i class="fa fa-plus-square-o"></i><span class="text"> Dropzone Upload</span></a></li>
									<li><a href="form-x-editable.html"><i class="fa fa-pencil"></i><span class="text"> X-editable</span></a></li>
								</ul>
							</li>
							<li>
								<a href="#"><i class="fa fa-table"></i><span class="text"> 数据列表</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">
									<li><a href="#"><i class="fa fa-building-o"></i><span class="text">部门信息</span></a></li>
									<li class='active opened' id='user-table'><a href="table-emps.html" ><i class="fa fa-group"></i><span class="text"> 用户信息</span></a></li>
								</ul>
							</li>
						
							<li>
								<a href="#"><i class="fa fa-signal"></i><span class="text"> Visual Chart</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">
									<li><a href="chart-flot.html"><i class="fa fa-random"></i><span class="text"> Flot Chart</span></a></li>
									<li><a href="chart-xchart.html"><i class="fa fa-retweet"></i><span class="text"> xChart</span></a></li>
									<li><a href="chart-other.html"><i class="fa fa-bar-chart-o"></i><span class="text"> Other</span></a></li>
								</ul>
							</li>
							<li>
								<a href="#"><i class="fa fa-briefcase"></i><span class="text"> UI Features</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">
									<li><a href="ui-sliders-progress.html"><i class="fa fa-align-left"></i><span class="text"> Progress</span></a></li>
									<li><a href="ui-nestable-list.html"><i class="fa fa-outdent"></i><span class="text"> Nestable Lists</span></a></li>
									<li><a href="ui-elements.html"><i class="fa fa-list"></i><span class="text"> Elements</span></a></li>
									<li><a href="ui-panels.html"><i class="fa fa-list-alt"></i><span class="text"> Panels</span></a></li>
									<li><a href="ui-buttons.html"><i class="fa fa-th"></i><span class="text"> Buttons</span></a></li>
								</ul>
							</li>
							<li><a href="widgets.html"><i class="fa fa-life-bouy"></i><span class="text"> Widgets</span></a></li>
							<li><a href="typography.html"><i class="fa fa-font"></i><span class="text"> Typography</span></a></li>
							<li>
								<a href="#"><i class="fa fa-bolt"></i><span class="text"> Icons</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">									
									<li><a href="icons-font-awesome.html"><i class="fa fa-meh-o"></i><span class="text"> Font Awesome</span></a></li>
									<li><a href="icons-climacons.html"><i class="fa fa-meh-o"></i><span class="text"> Climacons</span></a></li>
								</ul>
							</li>
							<li><a href="gallery.html"><i class="fa fa-picture-o"></i><span class="text"> Gallery</span></a></li>							
							<li><a href="calendar.html"><i class="fa fa-calendar"></i><span class="text"> Calendar</span></a></li>
						</ul>
					</div>					
				</div>
				<div class="sidebar-footer">					
					
					<div class="sidebar-brand">
						Proton
					</div>
					
					<ul class="sidebar-terms">
						<li><a href="index.html#">Terms</a></li>
						<li><a href="index.html#">Privacy</a></li>
						<li><a href="index.html#">Help</a></li>
						<li><a href="index.html#">About</a></li>
					</ul>
					
					<div class="copyright text-center">
						<small>Proton <i class="fa fa-coffee"></i> from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></small>
					</div>					
				</div>	
				
			</div>
			<!-- end: Main Menu -->
						
		<form class="form-horizontal" name="mainform" action="" role="form" >
		
					<!-- start: Content -->
					<div class="main sidebar-minified">
						<div class="row">
							<div class="col-lg-12">
								<h3 class="page-header"><i class="fa fa-table"></i>列表</h3>
								<ol class="breadcrumb">
									<li><i class="fa fa-home"></i><a href="index.html">主页</a></li>
									<li><i class="fa fa-table"></i>员工表</li>
								</ol>
							</div>
						</div>
						<!-- 搜索 -->
						<div class="row">
							<div class="col-lg-12">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h2><i class="fa fa-indent red"></i><strong>顾客信息筛选</strong></h2>
										<div class="panel-actions">
											<a href="#" class="btn-link" onclick="clear_search()"><i class="fa fa-rotate-right"></i></a>
											<a href="#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
											<a href="#" class="btn-close"><i class="fa fa-times"></i></a>
										</div>
									</div>
									<div class="panel-body">
											<div class="form-group">
												<label class="col-lg-2 col-md-2 col-sm-12 control-label">姓名</label>
												<div class="col-lg-10 col-md-10">
												
													<div class="row">
														<div class="col-lg-4 col-md-4">
															<input type="text" class="form-control" id="customer_cusname">
														</div>
														<label class="col-lg-2 col-md-2 col-sm-12 control-label">密码</label>
														<div class="col-lg-4 col-md-4">
															<input type="text" class="form-control" id="customer_cuspwd">
														</div>
													</div>
												</div>
											</div>
											
											<div class="form-group">
												<label class="col-lg-2 col-md-2 col-sm-12 control-label">电话</label>
												<div class="col-lg-4 col-md-4">
													<input type="text" class="form-control" id="customer_cusphone" >
												</div>
											</div>
											
											<div class="form-group">
												<label class="col-lg-2 col-md-2 col-sm-12 control-label">地址</label>
												<div class="col-lg-10 col-md-10">
												
													<div class="row">
														<div class="col-lg-4 col-md-4">
															<input type="text" class="form-control" id="customer_cusadd">
														</div>
														<label class="col-lg-2 col-md-2 col-sm-12 control-label">状态</label>
														<div class="col-lg-4 col-md-4">
															<input type="text" class="form-control" id="customer_cusstatus">
														</div>
													</div>
												</div>
											</div>
											
											
											<div class="form-group pull-right">
												<a class="btn btn-primary" href="#" onclick="list(1)">查找</a>
												<a class="btn btn-success" href="#" onclick="add_customer()">增加</a>
											</div>
									</div>
								</div>
							</div>
							<!--.col-->
						</div>
						<!--.row-->
						
						<div class="row">
							<div class="col-lg-12">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h2><i class="fa fa-table red"></i><span class="break"></span><strong>Members</strong></h2>
										<div class="panel-actions">
											<a href="${APPPATH }/user/table-emps.jsp#" class="btn-setting"><i class="fa fa-rotate-right"></i></a>
											<a href="${APPPATH }/user/table-emps.jsp#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
											<a href="${APPPATH }/user/table-emps.jsp#" class="btn-close"><i class="fa fa-times"></i></a>
										</div>
									</div>
									<div class="panel-body" >
										<div id='emplist-show'>
										<table class="table table-striped table-bordered bootstrap-datatable datatable">
											<thead>
												<tr>
													<th>序号</th>
													<th>姓名</th>
													<th>职位</th>
													<th>上级</th>
													<th>日期</th>
													<th>工资</th>
													<th>奖金</th>
													<th>部门</th>
													<th>编辑</th>
													<th>删除</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>emp.empno </td>
													<td>emp.ename </td>
													<td>emp.job </td>
													<td>emp.manager.ename </td>
													<td>emp.hiredate </td>
													<td><span class="label label-warning">emp.sal </span></td>
													<td>emp.comm </td>
													<td>emp.dept.dname </td>
													<td>
														<a class="btn btn-success" href="#" title="详情">
															<i class="fa fa-search-plus "></i>
														</a>
														<a class="btn btn-info" href="#" title="编辑">
															<i class="fa fa-edit "></i>
														</a>
														
													</td>
													<td>
														<div class="checkbox">
					                            			<label for="checkbox4">
					                            				<input type="checkbox" name="empno" value="emp.empno">确认删除
					                            			</label>
					                        			</div>
													</td>
												</tr>
											
											</tbody>
										</table>
										</div>
										<div id="page-show-area">
										<ul class="pagination">
											<li><a href='#' onclick='goPage()' >上一页</a></li>
											
													<li><a href='#' onclick='goPage()'>1</a></li>
													<li class='active'>
													<a href='#' onclick='goPage()' >
													2
													</a></li>
													<li><a href='#' onclick='goPage()'>3</a></li>
											
											<li><a href='#' onclick='goPage()' >下一页</a></li>
										</ul>
										<input type='hidden' name='page.currentPage' value='' />
										</div>
										<!-- 当前页 -->
									</div>
								</div>
							</div>
							<!--/col-->
				
						</div>
						<!--/row-->
				
					</div>
					<!-- end: Content -->
					</form>
		<br><br><br>		

		
		
		<div id="usage">
			<ul>
				<li>
					<div class="title">Memory</div>
					<div class="bar">
						<div class="progress">
						  	<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%"></div>
						</div>
					</div>			
					<div class="desc">4GB of 8GB</div>
				</li>
				<li>
					<div class="title">HDD</div>
					<div class="bar">
						<div class="progress">
						  	<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100" style="width: 25%"></div>
						</div>
					</div>			
					<div class="desc">250GB of 1TB</div>
				</li>
				<li>
					<div class="title">SSD</div>
					<div class="bar">
						<div class="progress">
					  		<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%"></div>
						</div>
					</div>			
					<div class="desc">700GB of 1TB</div>
				</li>
				<li>
					<div class="title">Bandwidth</div>
					<div class="bar">
						<div class="progress">
					  		<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%"></div>
						</div>
					</div>			
					<div class="desc">90TB of 100TB</div>
				</li>				
			</ul>	
		</div>			
		
	</div><!--/container-->
		
	
	<div class="modal fade" id="myModal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<a type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
					<h4 class="modal-title">Modal title</h4>
				</div>
				<div class="modal-body">
					<p>操作成功</p>
				</div>
				<div class="modal-footer">
					<a type="button" class="btn btn-default" data-dismiss="modal">关闭</a>
					<a type="button" class="btn btn-primary">保存设定</a>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	
	<!-- 增加模块 -->
	<div class="modal fade" id="customer_add_modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<a class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
					<h4 class="modal-title">增加</h4>
				</div>
				<div class="modal-body">
					<div class="panel-body">
						<label class="col-lg-2 col-md-2 col-sm-12 control-label">用户名</label>
						<div class="col-lg-10 col-md-10">
							<input type="text" class="form-control" id="add_customer_cusname" >
						</div>
						<label class="col-lg-2 col-md-2 col-sm-12 control-label">密码</label>
						<div class="col-lg-10 col-md-10">
							<input type="text" class="form-control" id="add_customer_cuspwd" >
						</div>
						<label class="col-lg-2 col-md-2 col-sm-12 control-label">联系方式</label>
						<div class="col-lg-10 col-md-10">
							<input type="text" class="form-control" id="add_customer_cusphone" >
						</div>
						<label class="col-lg-2 col-md-2 col-sm-12 control-label">地址</label>
						<div class="col-lg-10 col-md-10">
							<input type="text" class="form-control" id="add_customer_cusadd" >
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<a class="btn btn-default" data-dismiss="modal">关闭</a>
					<a class="btn btn-success" id='confirm_customer_add' data-dismiss="modal">确认增加</a>
				</div>
			</div><!-- /.modal-content -->
		</div>
	</div><!-- /.modal -->
	
	<!-- 编辑模块 -->
	<div class="modal fade" id="customer_edit_modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<a class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
					<h4 class="modal-title"><span id="edit_customer_cusid"></span>号用户编辑</h4>
				</div>
				<div class="modal-body">
					<div class="panel-body">
						<label class="col-lg-2 col-md-2 col-sm-12 control-label">用户名</label>
						<div class="col-lg-10 col-md-10">
							<input type="text" class="form-control" id="edit_customer_cusname" >
						</div>
						<label class="col-lg-2 col-md-2 col-sm-12 control-label">密码</label>
						<div class="col-lg-10 col-md-10">
							<input type="text" class="form-control" id="edit_customer_cuspwd" >
						</div>
						<label class="col-lg-2 col-md-2 col-sm-12 control-label">联系方式</label>
						<div class="col-lg-10 col-md-10">
							<input type="text" class="form-control" id="edit_customer_cusphone" >
						</div>
						<label class="col-lg-2 col-md-2 col-sm-12 control-label">地址</label>
						<div class="col-lg-10 col-md-10">
							<input type="text" class="form-control" id="edit_customer_cusadd" >
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<a class="btn btn-default" data-dismiss="modal">关闭</a>
					<a class="btn btn-success" id='confirm_customer_edit' data-dismiss="modal">确认编辑</a>
				</div>
			</div><!-- /.modal-content -->
		</div>
	</div><!-- /.modal -->
	
	<!-- 角色模块 -->
	<div class="modal fade" id="role_assign_modal">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
							<h4 class="modal-title"><label id='assign_customer_cusid'></label>号用户角色分配</h4>
						</div>
						<div class="modal-body">
						<form role="form" class="form-inline" id="assignRoleForm">
							<div class="col-lg-2 col-md-2 col-sm-12"></div>
							<div class="form-group col-lg-3 col-md-3 col-sm-12">
								<label class="control-label" for="selectError1">可选角色</label>
								<div class="controls">
									<select id="can_add_roles" class="form-control" multiple data-rel="chosen">
										<option>Option 1</option>
										<option selected>Option 2</option>
										<option>Option 3</option>
										<option>Option 4</option>
										<option>Option 5</option>
									</select>
								</div>
							</div>
							<div class="form-group col-lg-2 col-md-2 col-sm-6">
								<br/>
								<div >
									<a class="btn btn-default btn-lg" id="roles_leftToRight"><i class="fa fa-chevron-circle-right"></i></a>
								</div>
								<br/>
								<div >
									<a class="btn btn-default btn-lg" id="roles_rightToLeft"><i class="fa fa-chevron-circle-left"></i></a>
								</div>
							</div>
							<div class="form-group col-lg-3 col-md-3 col-sm-12">
								<label class="control-label" for="selectError1">已分配角色</label>
								<div class="controls">
									<select id="selected_roles" class="form-control" multiple data-rel="chosen">
										<option>Option 1</option>
										<option selected>Option 2</option>
										<option>Option 3</option>
										<option>Option 4</option>
										<option>Option 5</option>
									</select>
								</div>
							</div>
						</form>
							<br/><br/><br/><br/><br/><br/>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary">Save changes</button>
						</div>
					</div><!-- /.modal-content -->
				</div><!-- /.modal-dialog -->
			</div><!-- /.modal -->
	
	<div class="clearfix"></div>
	
		
	<!-- start: JavaScript-->
	<script src="${APPPATH }/assets/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript">
		window.jQuery || document.write("<script src='assets/js/jquery-2.1.1.min.js'>"+"<"+"/script>");
	</script>
	<script src="${APPPATH }/assets/js/jquery-migrate-1.2.1.min.js"></script>
	<script src="${APPPATH }/assets/js/bootstrap.min.js"></script>	
	
	
	<!-- page scripts -->
	<script src="${APPPATH }/assets/plugins/jquery-ui/js/jquery-ui-1.10.4.min.js"></script>
	<script src="${APPPATH }/assets/plugins/datatables/js/jquery.dataTables.min.js"></script>
	<script src="${APPPATH }/assets/plugins/datatables/js/dataTables.bootstrap.min.js"></script>
	
	<!-- theme scripts 
	<script src="${APPPATH }/assets/js/SmoothScroll.js"></script>    -->
	<script src="${APPPATH }/assets/js/jquery.mmenu.min.js"></script>
	<script src="${APPPATH }/assets/js/core.min.js"></script>
	<script src="${APPPATH }/layer/layer.js"></script>
	<!-- inline scripts related to this page -->
	<script src="${APPPATH }/assets/js/pages/table.js"></script>
	
	<!-- end: JavaScript-->
		
	<script>
	
	list(1);
	
	function list(nowPage){
		$.ajax({
			url:"findAll3",
			type:"post",
			data:{"nowPage":nowPage,
				"cusname":$("#customer_cusname").val(),
				"cuspwd":$("#customer_cuspwd").val(),
				"cusphone":$("#customer_cusphone").val(),
				"cusadd":$("#customer_cusadd").val(),
				"cusstatus":$("#customer_cusstatus").val()},
			dataType:"json",
			success:function(data){
				//循环json集合
				var str="<table class='table table-striped table-bordered bootstrap-datatable datatable'><tr>"
						+"<th><label class='switch switch-info'><input type='checkbox' class='switch-input'>"
						+"<span class='switch-label' data-on='On' data-off='Off'></span>"
						+"<span class='switch-handle'></span></label></th>"
						+"<th>编号</th><th>姓名</th><th>密码</th><th>电话</th><th>地址</th><th>状态</th><th>操作</th></tr>";
				
				$.each(data.obj1.list,function(index,customer){
				      str=str+"<tr>";
				      //str=str+"<td><input type='checkbox' name='del-one-emp' value='"+customer.cusid+"'>";
				      str=str+"<td><label class='switch switch-info'>";
				      str=str+"<input type='checkbox' class='switch-input' value='"+customer.cusid+"'>";
				      str=str+"<span class='switch-label' data-on='On' data-off='Off'></span>";
				      str=str+"<span class='switch-handle'></span>";
				      str=str+"</label></td>";
				      str=str+"<td>"+customer.cusid+"</td><td>"+customer.cusname+"</td><td>"+customer.cuspwd+"</td>";
						str=str+"<td>"+customer.cusphone+"</td><td>"+customer.cusadd+"</td><td>"+customer.cusstatus+"</td>";
						str=str+"<td><a class='btn btn-success' href='#' title='"+customer.cusid+"' name='customer_assign'><i class='fa fa-search-plus '></i></a>"
							+"<a class='btn btn-info' href='#' title='"+customer.cusid+"'  name='customer_edit'><i class='fa fa-edit '></i></a>"
							+"<a class='btn btn-danger' href='#' title='"+customer.cusid+"'  name='customer_del'><i class='fa fa-trash-o '></i></a>"
							+"</td>";
						
						str=str+"</tr>";
				});
				str=str+"</table>";
				
				
				str2="<ul class='pagination'>";
				str2+="<li class='"+(data.obj1.nowPage==1?'disabled':'')+"']><a href='#' onclick='list("+(data.obj1.nowPage-1)+")' >上一页</a></li>";
				for(var i=1;i<=data.obj1.countPage;i++){
					if(i==data.obj1.nowPage){
					str2+="<li class='active'><a href='#' onclick='list("+(i)+")'>"+(i)+"</a></li>";
					}else{
					str2+="<li><a href='#' onclick='list("+(i)+")'>"+(i)+"</a></li>";
					}
				}
				str2+="<li class='"+(data.obj1.nowPage==data.obj1.countPage?'disabled':'')+"'><a href='#' onclick='list("+(data.obj1.nowPage+1)+")' >下一页</a></li>";
				str2+="</ul>";
				
				
				$("#emplist-show").html(str);
				$("#page-show-area").html(str2);
				
				//编辑
				edit_customer();
				//删除
				del_customer();
				//增加
				confirm_customer_add();
				//分配角色
				assign_customer();
			}
		});
	}
	//查询框清空
	function clear_search(){
		$("#customer_cusname").val("");
		$("#customer_cuspwd").val("");
		$("#customer_cusphone").val("");
		$("#customer_cusadd").val("");
		$("#customer_cusstatus").val("");
		list(1);
	}
	//增加顾客的弹窗
	function add_customer(){
		$('#customer_add_modal').modal("show");
		return false;
	}
	//增加顾客确认
	function confirm_customer_add(){
		$("#confirm_customer_add").click(function(){
			//发送到controller
			$.ajax({
				url: "addCustomer",
				data:{"cusname":$("#add_customer_cusname").val(),
					"cuspwd":$("#add_customer_cuspwd").val(),
					"cusphone":$("#add_customer_cusphone").val(),
					"cusadd":$("#add_customer_cusadd").val(),
					"cusstatus":$("#add_customer_cusstatus").val()},
				method: "post",
				aysnc: true,
				//dataType : "json",
				error : function(XMLHttpRequest, textStatus, errorThrown){
		            debugger
		            // 状态码
		            console.log(XMLHttpRequest.status);
		            // 状态
		            console.log(XMLHttpRequest.readyState);
		            // 错误信息
		            console.log(textStatus);
				},
				success : function(data) {
					alert(data);
					//清空输入框
					$("#add_customer_cusname").val("");
					$("#add_customer_cuspwd").val("");
					$("#add_customer_cusphone").val("");
					$("#add_customer_cusadd").val("");
					$("#add_customer_cusstatus").val("");
				}
				})
				list();
				$('#customer_add_modal').modal("hide");
			return false;
		})
	}
	
	//编辑顾客的弹窗
	function edit_customer(){
		$("a[name='customer_edit']").click(function(){
			//获取id
			var cusid=$(this).attr("title");
			//alert(cusid);
			$("#edit_customer_cusid").html(cusid);
			//发送到controller
			$.ajax({
				url: "findCustomerById",
				data:{"cusid":cusid},
				method: "post",
				aysnc: true,
				//dataType : "json",
				error : function(XMLHttpRequest, textStatus, errorThrown){
		            debugger
		            // 状态码
		            console.log(XMLHttpRequest.status);
		            // 状态
		            console.log(XMLHttpRequest.readyState);
		            // 错误信息
		            console.log(textStatus);
				},
				success : function(data) {
					alert(data);
					//传送数据至输入框
					$("#edit_customer_cusname").val(data.cusname);
					$("#edit_customer_cuspwd").val(data.cuspwd);
					$("#edit_customer_cusphone").val(data.cusphone);
					$("#edit_customer_cusadd").val(data.cusadd);
					$("#edit_customer_cusstatus").val(data.cusstatus);
				}
				})
				$('#customer_edit_modal').modal("show");
			
			//编辑顾客确认
			confirm_customer_edit();
			return false;
		})
	}
	//编辑顾客确认
	function confirm_customer_edit(){
		$("#confirm_customer_edit").click(function(){
			//发送到controller
			$.ajax({
				url: "editCustomer",
				data:{"cusid":$("#edit_customer_cusid").html(),
					"cusname":$("#edit_customer_cusname").val(),
					"cuspwd":$("#edit_customer_cuspwd").val(),
					"cusphone":$("#edit_customer_cusphone").val(),
					"cusadd":$("#edit_customer_cusadd").val(),
					"cusstatus":$("#edit_customer_cusstatus").val()},
				method: "post",
				aysnc: true,
				//dataType : "json",
				error : function(XMLHttpRequest, textStatus, errorThrown){
		            debugger
		            // 状态码
		            console.log(XMLHttpRequest.status);
		            // 状态
		            console.log(XMLHttpRequest.readyState);
		            // 错误信息
		            console.log(textStatus);
				},
				success : function(data) {
					alert(data);
					//清空输入框
					$("#edit_customer_cusid").html("");
					$("#edit_customer_cusname").val("");
					$("#edit_customer_cuspwd").val("");
					$("#edit_customer_cusphone").val("");
					$("#edit_customer_cusadd").val("");
					$("#edit_customer_cusstatus").val("");
				}
				})
				list();
				$('#customer_edit_modal').modal("hide");
			return false;
		})
	}
	
	
	//删除顾客确认
	function del_customer(){
		$("a[name='customer_del']").click(function(cindex){
			var cusid=$(this).attr("title");
			layer.confirm("是否删除选中的用户?", {icon: 3, title:'提示'}, function(cindex){
				 layer.close(cindex);
				//获取id
				alert(cusid);
				//发送到controller
				$.ajax({
					url: "delCustomerById",
					data:{"cusid":cusid},
					method: "post",
					aysnc: true,
					//dataType : "json",
					error : function(XMLHttpRequest, textStatus, errorThrown){
			            debugger
			            // 状态码
			            console.log(XMLHttpRequest.status);
			            // 状态
			            console.log(XMLHttpRequest.readyState);
			            // 错误信息
			            console.log(textStatus);
					},
					success : function(data) {
						alert(data);
					}
				})
			}, function(cindex){
			    layer.close(cindex);
			});
			list();
			return false;
		})
	}
	
	
	
	//分配角色的弹窗
	function assign_customer(){
		$("a[name='customer_assign']").click(function(){
			//获取id
			var cusid=$(this).attr("title");
			//alert(cusid);
			$("#assign_customer_cusid").html(cusid);
			//传送顾客Id,显示列表
			role_cus_list();
			//显示模板
			$('#role_assign_modal').modal("show");
			//分配角色的方法
			roles_leftToRight();
			roles_rightToLeft();
			return false;
		})
	}
	//从左到右分配
	function roles_leftToRight(){
		$("#roles_leftToRight").click(function(){
			var cusid=$("#assign_customer_cusid").html();
			//获取多选的id
			var selectedValues = new Array();  
 			$("#can_add_roles :selected").each(function(){
   			  selectedValues.push($(this).val()); 
 			});
 			alert(selectedValues);
 			
 			
			//发送到controller
			$.ajax({
				url: "addRoles",
				data:{"cusid":cusid,"rid":selectedValues},
				method: "post",
				aysnc: true,
				//dataType : "json",
				error : function(XMLHttpRequest, textStatus, errorThrown){
		            debugger
		            // 状态码
		            console.log(XMLHttpRequest.status);
		            // 状态
		            console.log(XMLHttpRequest.readyState);
		            // 错误信息
		            console.log(textStatus);
				},
				success : function(data) {
					alert(data);
					role_cus_list();
				}
				})
			return false;
		})
	}
	//从右到左分配
	function roles_rightToLeft(){
		$("#roles_rightToLeft").click(function(){
			var cusid=$("#assign_customer_cusid").html();
			//获取多选的id
			var selectedValues = new Array(); 
 			$("#selected_roles :selected").each(function(){
   			  selectedValues.push($(this).val()); 
 			});
 			alert(selectedValues);
			$.ajax({
				url: "removeRoles",
				data:{"cusid":cusid,"rid":selectedValues},
				method: "post",
				aysnc: true,
				//dataType : "json",
				error : function(XMLHttpRequest, textStatus, errorThrown){
		            debugger
		            // 状态码
		            console.log(XMLHttpRequest.status);
		            // 状态
		            console.log(XMLHttpRequest.readyState);
		            // 错误信息
		            console.log(textStatus);
				},
				success : function(data) {
					alert(data);
					list();
				}
				})
			return false;
		})
	}
	//传送顾客Id,显示列表
	function role_cus_list(){
		var cusid=$("#assign_customer_cusid").html();
		$.ajax({
			url: "findRolesById",
			data:{"cusid":cusid},
			method: "post",
			aysnc: true,
			//dataType : "json",
			error : function(XMLHttpRequest, textStatus, errorThrown){
	            debugger
	            // 状态码
	            console.log(XMLHttpRequest.status);
	            // 状态
	            console.log(XMLHttpRequest.readyState);
	            // 错误信息
	            console.log(textStatus);
			},
			success : function(data) {
				//alert(data);
				//传送数据至标签选择框
				var str_left="";
				for(var i=0;i<data.obj1.length;i++){
					str_left+="<option name='left_roles_list' value='"+data.obj1[i].rid+"'>"+data.obj1[i].rname+"</option>";
				}
				$("#can_add_roles").html(str_left);
				
				
				var str_right="";
				for(var i=0;i<data.obj2.length;i++){
					str_right+="<option name='right_roles_list' value='"+data.obj2[i].rid+"'>"+data.obj2[i].rname+"</option>";
				}
				$("#selected_roles").html(str_right);
			}
			})
	}
	
	</script>
</body>
</html>