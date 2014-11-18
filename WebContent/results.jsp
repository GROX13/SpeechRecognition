<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="search.VideoInfo"%>
<%@page import="java.util.List"%>
<%@page import="search.Videoes"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="WEB-RES/css/bootstrap.min.css" rel="stylesheet">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Search Result</title>
	</head>
<body>
	<nav class="navbar navbar-default" role="navigation">
 		<div class="container-fluid">
  			<!-- Brand and toggle get grouped for better mobile display -->
   			<div class="navbar-header">
     			<a class="navbar-brand" href="index.html">Home</a>
   			</div>

   			<!-- Collect the nav links, forms, and other content for toggling -->
   			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
     			<form class="navbar-form navbar-left" role="search" action="results.jsp">
       				<div class="form-group">
         				<input type="text" class="form-control" name="searchValue" placeholder="Search">
       				</div>
       				<button type="submit" class="btn btn-default">Submit</button>
     			</form>
      			<ul class="nav navbar-nav navbar-right">
        			<li><a href="about.html">About Us</a></li>
        			<li><a href="#">Link</a></li>
      			</ul>
   			</div><!-- /.navbar-collapse -->
		</div><!-- /.container-fluid -->
	</nav>
	 <%
     String searchValue = request.getParameter("searchValue").toLowerCase();
     List<VideoInfo> res = Videoes.getVideoes(searchValue);
     if(res.size() == 0){
    	 %>
	    	<div class="jumbotron">
				<h1>No Result for '<%=searchValue %>'</h1>
			</div>
    	 <%
     } else {
	     String thmb;
	     String name;
	     String desc;
	     String URL;
	     for (int i=0; i<res.size(); i++){
	     	thmb = res.get(i).getThamb();
	     	name = res.get(i).getName();
	     	desc = res.get(i).getDescribtion();
	     	URL = res.get(i).getURL();
     	%>
	
		<div class="col-sm-6 col-md-4">
			<div class="thumbnail">
				<img data-src="holder.js/300x300" alt="..." src=<%=thmb %>>
				<div class="caption">
					<h3><%=name %></h3>
					<p><%=desc %></p>
					<p><a href="<%=URL %>" class="btn btn-primary" role="button">See More</a></p>
				</div>
			</div>
		</div>
		<%}
	   }%>
</body>
</html>