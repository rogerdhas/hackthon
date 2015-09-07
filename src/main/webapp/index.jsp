<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport"    content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	
	
	<title>VDSI Hackathon - Zone None</title>

	<link rel="shortcut icon" href="assets/images/gts_favicon.png">
	
	<link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
	<link rel="stylesheet" href="${pageContext. request. contextPath}/assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext. request. contextPath}/assets/css/font-awesome.min.css">

	<!-- Custom styles for our template -->
	<link rel="stylesheet" href="${pageContext. request. contextPath}/assets/css/bootstrap-theme.css" media="screen" >
	<link rel="stylesheet" href="${pageContext. request. contextPath}/assets/css/main.css">

	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
	<script src="${pageContext. request. contextPath}/assets/js/html5shiv.js"></script>
	<script src="${pageContext. request. contextPath}/assets/js/respond.min.js"></script>
	<![endif]-->
</head>

<body class="home">
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
					<li class="active"><a href="#">Home</a></li>
					<li><a href="about.html">About</a></li>
					<li><a href="Plans.html">Plans</a></li>
					
					<li><a class="btn" href="${pageContext. request. contextPath}/loadlogin.do">SIGN IN / SIGN UP</a></li>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</div> 
	<!-- /.navbar -->

	<!-- Header -->
	<header id="head">
		<div class="container">
			<div class="row">
				<h1 class="lead">What will your customer buy next ? </h1>
				<p class="tagline">Zone None: Senthil Retnaswamy,Roger Dhas,Rajesh Ravi</p>
				
			</div>
		</div>
	</header>
	<!-- /Header -->

	<!-- Intro -->
	<div class="container text-center">
		<br> <br>
		<h2 class="thin">"What plan I can sell my customer?"  "Whom should I target?"</h2>
		<p class="text-muted">
			Well what if I can predict?<BR>
The Customer Plan Predictive System does exactly that, it helps the sales and marketing team to predict "What plan will the customer buy next?".  At the heart of the system sits a prediction model that would analyze past customer plans (active and inactive) their behavior and predicts the future plan that he would be interested in.  Analyze which group is interested in the type of plan, where does this group live? What type of device does this group use? And much more before you draw the first blood!.
		</p>
	</div>
	<!-- /Intro-->
		
	

	
	
	<!-- Social links. @TODO: replace by link/instructions in template -->
	<section id="social">
		<div class="container">
			<div class="wrapper clearfix">
				<!-- AddThis Button BEGIN -->
				<div class="addthis_toolbox addthis_default_style">
				<a class="addthis_button_facebook_like" fb:like:layout="button_count"></a>
				<a class="addthis_button_tweet"></a>
				<a class="addthis_button_linkedin_counter"></a>
				<a class="addthis_button_google_plusone" g:plusone:size="medium"></a>
				</div>
				<!-- AddThis Button END -->
			</div>
		</div>
	</section>
	<!-- /social links -->


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
								<a href="${pageContext.request.contextPath}/index.jsp">Home</a> | 
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
	<script src="${pageContext. request. contextPath}assets/js/template.js"></script>
</body>
</html>
