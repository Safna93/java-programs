<!DOCTYPE html>
<html lang="en">
<head>
  <title>Fatntezy</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <link href="<c:url value="/resources/css/Head.css" />" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<body background="http://cdn.wallpapersafari.com/93/74/TtYvhA.jpg">

<div class="header">
   <div class="container">
    <header style="height:50px;"></header>
    <!------------- Navbar -------------->
    <nav class="my-nav navbar navbar-inverse bs-dark">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
         <a class="navbar-brand" href="Header">Fantezy</a> <a class="navbar-brand"
					rel="home" href="#" title="Fantezy"> <img
					style="max-width: 100px; margin-top: -7px;"
					src="/resources/images/c.png">
				</a>
        </div>
<c:if test="${sessionScope.loggedIn}">
<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav">
          
            <li class="active"><a href="AdminHome">Homepage<span class="sr-only">HOME</span></a></li>
           
                <li><a href="Category">Manage Category</a></li>
                <li><a href="Product">Manage Product</a></li>
                <li><a href="Supplier">Manage Supplier</li>
      
                  </ul>
                  <div class="nav navbar-nav navbar-right">
                  <a href="#">${sessionScope.username}</a>
                  </div>
                  </div>
                  
                  
                  </c:if>
<c:if test="${!sessionScope.loggedIn}">


        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav">
          
            <li class="active"><a href="Header">Homepage<span class="sr-only">HOME</span></a></li>
           
                <li><a href="AboutUs">AboutUs</a></li>
                <li><a href="ContactUs">ContactUs</a></li>
                <li><a href="displayProducts">Products</li>
                 
                
             
           <li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Categories<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							 
						</ul></li>
                  </ul>
          
					<form class="navbar-form navbar-left form-horizontal" role="search">
						<div class="input-group">
							<input type="text" class="search-box" placeholder="Search">
							<button type="submit" class="btn">
								<span class="glyphicon glyphicon-search"></span>
							</button>
						</div>
					</form>
					
					<ul class="nav navbar-nav navbar-right">
						<li><a href="Register"><span
								class="glyphicon glyphicon-user"></span> Sign Up</a></li>
						<li><a href="login"><span
								class="glyphicon glyphicon-log-in"></span> Login</a></li>
								
					</ul>
					</div>
					
				</c:if>	
				</li>
          </ul>
        </div>
    </nav>
    </div>
    
    <!----------- !Navbar End ------------>

	
</div>
</body>
</html>
