<!--Pulling Awesome Font -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ZoneNone - Chart</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/example.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/prettify.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/morris.css" rel="stylesheet" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/rapheal.min.js"></script>
<script src="${pageContext.request.contextPath}/js/morris.js"></script>
<script src="${pageContext.request.contextPath}/js/prettify.js"></script>
<script src="${pageContext.request.contextPath}/js/example.js"></script>
</head>
<body>
<div class="container">
<%@ include file="header.jsp"%>
<%@ include file="menu.jsp"%>
<%@ include file="chartmenu.jsp"%>
<div class="col-md-5 pull-center" style="margin-top: 20px;">
<div id="graph"></div>
<pre id="code" class="prettyprint linenums" style="display: none;">
//Use Morris.Bar
<%-- Morris.Bar({
  element: 'graph',
  data: ${morrisBarValue },
  xkey: 'planNme',
  ykeys: ['text', 'voice', 'amt'],
  labels: ['Text', 'Voice', 'Amt']
}).on('click', function(i, row){
  console.log(i, row);
});
 --%>
Morris.Bar({
  element: 'graph',
  data: ${morrisBarValue },
  xkey: 'state',
  ykeys: ['maleCount', 'femaleCount'],
  labels: [ 'Male', 'Female']
}).on('click', function(i, row){
  console.log(i, row);
});

</pre>
<br />
</div>
<div class="col-md-12" style="margin-top: 20px;">
<%@ include file="footer.jsp"%></div>
</div>
</body>
</html>