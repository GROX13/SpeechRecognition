<%@page import="search.VideoInfo"%>
<%@page import="java.util.List"%>
<%@page import="search.Videoes"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
	
	
    <title>Speech Recognition</title>
    
	<link rel="shortcut icon" href="WEB-RES/images/icons/circle.ico" rel="icon"/>

    <link href="WEB-RES/css/bootstrap.min.css" rel="stylesheet">

    <link href="WEB-RES/css/main.css" rel="stylesheet">

    <link href="WEB-RES/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,900,700,500" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

    <nav class="navbar navbar-custom navbar-fixed-top top-nav-collapse" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                    <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">
                    Home
                </a>
            </div>

            <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
                <ul class="nav navbar-nav">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li class="">
                        <a class="page-scroll" href="#works">Projects</a>
                    </li>
                    <li class="active">
                        <a class="page-scroll" href="#about">about</a>
                    </li>
                    <li class="">
                        <a class="page-scroll" href="#contact">Contact</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <header class="intro text-center">
        <div class="intro-body">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="brand-heading">
                        	<span>Speech recognition</span>
                        	Usage in education &amp; daily life
                        </h1>
                        <p class="intro-text">BASED IN TBILISI !</p>
                    </div>
                </div>
            </div>

            <div class="go-down">
                <a href="#works" class="btn btn-circle page-scroll">
                    <i class="fa fa-angle-double-down animated"></i>
                </a>
            </div>
            
        </div>

        
    </header>

    

    <section class="content-section text-center">
        <div class="skills">
            <div class="container">
                <%
                String searchValue = request.getParameter("searchValue");
                List<VideoInfo> res = Videoes.getVideoes(searchValue);
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
	                <div class="col-md-4">
	                  <div class="skill-icon">
	                    <img src=<%=thmb %> >
	                  </div>
	                  <div class="skill-details">
	                    <h2><a href="<%=URL %>" > <%=name %> </a></h2>
	                    <p><%=desc %></p>
	                  </div>
	                </div>
                <%} %>
               

                <!-- <div class="col-md-6 col-md-offset-3">
                  <div class="promising">
                    <h2>I can create your amazing interface</h2>
                    <p>I love to bring awesome ideas to life for clients that have cool ideas.
                    Making a career out of something that is creative, fun and rewarding for both me and my clients.</p>
                  </div>
                </div> -->
            </div>
        </div>
    </section>

    <section id="about" class="content-section" data-stellar-background-ratio="0.5" style="background-position: -25px 211.8203125px;">
        <div class="about-section">
            <div class="container">
                <div class="col-md-8 col-md-offset-4">
                    <h2>Hi !</h2>
                    <p>For language learning, speech recognition can be useful for learning a second language. It can teach proper pronunciation, in addition to helping a person develop fluency with their speaking skills.</p>
					<p>Students who are blind (see Blindness and education) or have very low vision can benefit from using the technology to convey words and then hear the computer recite them, as well as use a computer by commanding with their voice, instead of having to look at the screen and keyboard.</p>
                  	<p>Students who are physically disabled or suffer from Repetitive strain injury/other injuries to the upper extremities can be relieved from having to worry about handwriting, typing, or working with scribe on school assignments by using speech-to-text programs. They can also utilize speech recognition technology to freely enjoy searching the Internet or using a computer at home without having to physically operate a mouse and keyboard.</p>
                </div>

                <div class="col-md-8 col-md-offset-4">
                    <h2>Interested in</h2>
                    <ul class="list-inline interests">
                        <li><span class="glyphicon glyphicon-camera"></span></li>
                        <li><span class="glyphicon glyphicon-headphones"></span></li>
                        <li><span class="glyphicon glyphicon-play"></span></li>
                        <li><span class="fa fa-gamepad"></span></li>
                    </ul>
                </div>
            </div>
        </div>
    </section>

    <section id="contact" class="text-center">

         <div class="contact-body">
            <div class="container">
                <div class="row">
                <div class="contact-detail">
                    <ul class="list-inline">
                        <li><span class="glyphicon glyphicon glyphicon-map-marker"></span> Tbilisi</li>
                        <li><span class="glyphicon glyphicon-earphone"></span>+995 999 99 99 99</li>
                        <li><span class="glyphicon glyphicon-send"></span><a href="mailto:mail@gmail.com"> mail@gmail.com</a></li>
                    </ul>
                </div>
                <hr>
                <div class="social">
                    <ul class="list-inline social-buttons">
                        <li><a href="#" target="blank"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#" target="blank"><i class="fa fa-behance"></i></a></li>
                        <li><a href="#" target="blank"><i class="fa fa-instagram"></i></a></li>
                        <li><a href="#" target="blank"><i class="fa fa-linkedin"></i></a></li>
                    </ul>
                </div>
                </div>
            </div>
        </div>   

     <div class="video-wrapper" style="overflow: hidden;">
            <video class="contact-video" autoplay="" loop="" style="position: absolute; top: 50%; left: 50%; -webkit-transform: translate(-50%, -50%); transform: translate(-50%, -50%); height: auto; width: 1349px;">
                <source src="videos/bg.mp4" type="video/mp4">
                <source src="videos/bg.webm" type="video/webm">
            </video>
        </div>

        <footer>
            <div class="container text-center">
                <p>� 2014 Giorgi Rokhadze</p>
            </div>
        </footer>
    </section>


    
    <script async="" src="//www.google-analytics.com/analytics.js"></script>
    <script src="WEB-RES/javascript/jquery-1.11.0.js"></script>
    <script src="WEB-RES/javascript/bootstrap.min.js"></script>
    <script src="WEB-RES/javascript/plugin.js"></script>
    <script src="WEB-RES/javascript/main.js"></script>

    <script>
      (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

      ga('create', 'UA-53661321-1', 'auto');
      ga('send', 'pageview');

    </script>




</body>
</html>