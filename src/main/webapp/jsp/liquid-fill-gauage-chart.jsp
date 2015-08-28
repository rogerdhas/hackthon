<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
			<li><a href="loadplan.do">Plan</a></li>
			<li><a href="liquidfillgauagechart.do">LikeliHood</a></li>
			<li><a href="map.do">DemoGraphical</a></li>
			<li class="active"><a href="morrisbarchart.do">Gender</a></li>
			<li><a href="bubblechart.do">Age Group</a></li>
		</ol>

		<div class="row">
			
			<!-- Article main content -->
			<article class="col-xs-12 maincontent">
				<header class="page-header">
					<h1 class="page-title">LikeliHood - ${currentPlan.planNme}</h1>
				</header>
				
				<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
				<!-- <div class="col-md-offset-1 col-sm-offset-1"> -->
					<div class="panel panel-default">
						<div class="panel-body">							

<script src="${pageContext.request.contextPath}/js/d3.v3.min.js" language="JavaScript"></script>
<script src="${pageContext.request.contextPath}/js/liquidFillGauge.js" language="JavaScript"></script>
<style>
.liquidFillGaugeText {
	font-family: Helvetica;
	font-weight: bold;
}
</style>
<svg id="fillgauge1" width="540px" height="342px"
	onclick="gauge1.update(NewValue());"></svg>

<script language="JavaScript">
	var gaugePercentage = <c:out value="${ageValue}"/>;
	var gauge1 = loadLiquidFillGauge("fillgauge1", gaugePercentage);
	var config1 = liquidFillGaugeDefaultSettings();
	config1.circleColor = "#FF7777";
	config1.textColor = "#FF4444";
	config1.waveTextColor = "#FFAAAA";
	config1.waveColor = "#FFDDDD";
	config1.circleThickness = 0.2;
	config1.textVertPosition = 0.2;
	config1.waveAnimateTime = 1000;
	function NewValue() {
		if (Math.random() > .5) {
			return Math.round(Math.random() * 100);
		} else {
			return (Math.random() * 100).toFixed(1);
		}
	}
</script>


								</div>
		

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


</html>