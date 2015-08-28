<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>VDSI Hackathon - Zone None</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

	<link rel="shortcut icon" href="${pageContext. request. contextPath}/assets/images/gt_favidcon.png">
	
	<link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
	<link rel="stylesheet" href="${pageContext. request. contextPath}/assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext. request. contextPath}/assets/css/font-awesome.min.css">

	<!-- Custom styles for our template -->
	<link rel="stylesheet" href="${pageContext. request. contextPath}/assets/css/bootstrap-theme.css" media="screen" >
	<link rel="stylesheet" href="${pageContext. request. contextPath}/assets/css/main.css">

</head>



<body>
	<!-- Fixed navbar -->
	<div class="navbar navbar-inverse navbar-fixed-top headroom" >
		<div class="container">
			<div class="navbar-header">
				<!-- Button for smallest screens -->
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
				<a class="navbar-brand" href="index.jsp">Customer Plan Predictive System</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav pull-right">
					<li><a href="index.jsp">Home</a></li>
					<li><a href="about.html">About</a></li>
					
					<li><a href="Plans.html">Plans</a></li>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</div> 
	<!-- /.navbar -->

	<header id="head" class="secondary"></header>

	<!-- container -->
	<div class="container">

		<ol class="breadcrumb">
			<li class="active"><a href="loadplan.do">Plan</a></li>
			<li><a href="liquidfillgauagechart.do">LikeliHood</a></li>
			<li><a href="map.do">DemoGraphical</a></li>
			<li><a href="morrisbarchart.do">Gender</a></li>
		</ol>

		<div class="row">
			
			<!-- Article main content -->
			<article class="col-xs-12 maincontent">
				<header class="page-header">
					<h1 class="page-title">Plan</h1>
				</header>
				
				<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
					<div class="panel panel-default">
						<div class="panel-body">							
							<c:if test="${not empty errorMsg }">
							<div class="alert alert-error bg-danger">  
							  <a class="close" data-dismiss="alert">×</a>  
						  		<strong>Error!</strong>${errorMsg}
						  	</div>
						  	</c:if>
						
							<form:form name="planForm" novalidate="novalidate"
	action="saveplan.do" method="post" commandName="planFormBean" id="planValidate">
							<%-- 	<div class="top-margin">
									<label>Plan Type <span class="text-danger">*</span></label>									
	<form:select class="form-control"
			id="type" path="planType" placeholder="type">
			<form:option value="Small">Small</form:option>
			<form:option value="Medium">Medium</form:option>
			<form:option value="Large">Large</form:option>
			</form:select>
								</div> --%>
								<div class="top-margin">
									<form:input class="form-control"
			id="name" path="planNme" placeholder="Name"/>
								</div>
								<div class="top-margin">
									<form:input class="form-control"
			id="data" path="data" placeholder="Data Size" />
								</div>
								<div class="top-margin">
									<form:input class="form-control"
			id="voice" path="voice" placeholder="Voice" />
								</div>
								<div class="top-margin">
									<form:input class="form-control"
			id="text" path="text" placeholder="# Of SMS" />
								</div>
								<div class="top-margin">
									<form:input class="form-control" id="amt"
			path="amt" placeholder="Plan Amount" />
								</div>
		
								<hr>

								<div class="row">
									<div class="col-lg-8">
										<b>&nbsp;</b>
									</div>
									<div class="col-lg-4 text-right">
										<button class="btn btn-action" type="submit">Predict</button>
									</div>
								</div>
							</form:form>
						</div>
					</div>

				</div>
			</article>
			<!-- /Article -->

		</div>
	</div>	<!-- /container -->
	


	<footer id="footer" class="top-space">
	<div class="footer1">
			<div class="container">
				<div class="row">
					
					<div class="col-md-3 widget">
						<h3 class="widget-title">Contact</h3>
						<div class="widget-body">
							<p>
								<a href="mailto:#">Hackathon@Verizon.com</a><br>
								<br>
								Verizon Data Services,Olympia Tech park <br>Chennai,India
							</p>	
						</div>
					</div>

					<div class="col-md-3 widget">
						<h3 class="widget-title">Follow us</h3>
						<div class="widget-body">
							<p class="follow-me-icons">
								<a href=""><i class="fa fa-twitter fa-2"></i></a>
								<a href=""><i class="fa fa-dribbble fa-2"></i></a>
								<a href=""><i class="fa fa-github fa-2"></i></a>
								<a href=""><i class="fa fa-facebook fa-2"></i></a>
							</p>	
						</div>
					</div>

					

				</div> <!-- /row of widgets -->
			</div>
		</div>

		<div class="footer2">
			<div class="container">
				<div class="row">
					
					<div class="col-md-6 widget">
						<div class="widget-body">
							<p class="simplenav">
								<a href="index.jsp">Home</a> | 
								<a href="about.html">About</a> |
								<a href="Plans.html">Plans</a> |
								
								<b><a href="#">Sign up</a></b>
							</p>
						</div>
					</div>

					<div class="col-md-6 widget">
						<div class="widget-body">
							<p class="text-right">
								Copyright &copy; 2015, Zone None 
							</p>
						</div>
					</div>

				</div> <!-- /row of widgets -->
			</div>
		</div>

	</footer>	
		




	<!-- JavaScript libs are placed at the end of the document so the pages load faster -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<script src="${pageContext. request. contextPath}/assets/js/headroom.min.js"></script>
	<script src="${pageContext. request. contextPath}/assets/js/jQuery.headroom.min.js"></script>
	<script src="${pageContext. request. contextPath}/assets/js/template.js"></script>
</body>




</body>
</html>