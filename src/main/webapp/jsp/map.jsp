<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ZoneNone - Plan</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<%-- <link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<!--Pulling Awesome Font -->
<link
	href="${pageContext.request.contextPath}/css/font-awesome.min.css"
	rel="stylesheet" />
 --%>
 <link href="${pageContext.request.contextPath}/css/plan.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/map.css" rel="stylesheet" />
 <script
	src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<%--<script
	src="${pageContext.request.contextPath}/css/bootstrap.min.js"></script>
	 --%>
	
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
			<li class="active"><a href="map.do">DemoGraphical</a></li>
			<li><a href="morrisbarchart.do">Gender</a></li>
			<li><a href="bubblechart.do">Bubble</a></li>
		</ol>

		<div class="row">
			
			<!-- Article main content -->
			<article class="col-xs-12 maincontent">
				<header class="page-header">
					<h1 class="page-title">DemoGraphical - ${currentPlan.planNme}</h1>
				</header>
				
				<!-- <div class="col-md-6 col-md-offset-1 col-sm-8 col-sm-offset-1"> -->
				<div class="col-md-offset-1 col-sm-offset-1">
					<div class="panel panel-default">
						<div class="panel-body">							

<div id="tooltip"></div><!-- div to hold tooltip. -->
<svg width="960" height="600" id="statesvg"></svg> <!-- svg to hold the map. -->
</div>
<script src="${pageContext.request.contextPath}/js/uStates.js"></script> <!-- creates uStates. -->
<script src="${pageContext.request.contextPath}/js/d3.v3.min.js"></script>
<script>

	function tooltipHtml(n, d){	/* function to create html content string in tooltip div. */
		return "<h4>"+n+"</h4><table>"+
			"<tr><td>Count</td><td>"+(d.low)+"</td></tr>"+
			"</table>";
	}
	
	var mapDatas = ${mapSrc};
	var sampleMap = new Array();
	
	$.each(mapDatas, function(idx, obj) {
		sampleMap[obj.state] = obj.count;
	});
		
	var sampleData ={};	/* Sample random data. */	
	["HI", "AK", "FL", "SC", "GA", "AL", "NC", "TN", "RI", "CT", "MA",
	"ME", "NH", "VT", "NY", "NJ", "PA", "DE", "MD", "WV", "KY", "OH", 
	"MI", "WY", "MT", "ID", "WA", "DC", "TX", "CA", "AZ", "NV", "UT", 
	"CO", "NM", "OR", "ND", "SD", "NE", "IA", "MS", "IN", "IL", "MN", 
	"WI", "MO", "AR", "OK", "KS", "LS", "VA"]
		.forEach(function(d){ 
			var low=sampleMap[d], 
				mid=Math.round(100*Math.random()), 
				high=Math.round(100*Math.random());
			var colorCoder = Math.round(100*Math.random());
			sampleData[d]={low:sampleMap[d], high:d3.max([low,mid,high]), 
					avg:Math.round((low+mid+high)/3), color:d3.interpolate("#0000CC", "#00FF99")(colorCoder/100)}; 
		});
	
	/* draw states on id #statesvg */	
	uStates.draw("#statesvg", sampleData, tooltipHtml);
</script>

								</div>
		
								<hr>

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
								<a href="plans.html">Plans</a> |
								
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