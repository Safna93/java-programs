<!DOCTYPE html>
<html lang="en">
<head>
<title>Fatntezy-The Girlz Corner</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="<c:url value="/resources/css/Head.css" />" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<body style="background-color: #f44268">


	<div class="header">
		<div class="container">
			<header style="height: 50px;"></header>
			<!------------- Navbar -------------->
			<nav class="my-nav navbar navbar-inverse bs-dark navbar-fixed-top">
				<div class="navbar-header"></div>

				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<div class="navbar-header">
							<a href="ioo" class="pull-left"><img
								src="http://dailydropcap.com/images/F-9.jpg" width="70"
								height="50"></a>
							<div class="navbar-brand">Fantezy</div>


						</div>



						<li class="active"><a href="ioo"><span class="sr-only">HOME</span></a></li>

						<li><a href="Category">Manage Category</a></li>
						<li><a href="Product">Manage Product</a></li>
						<li><a href="Supplier">Manage Supplier</li>

					</ul>
					<ul>
						<div class="nav navbar-nav navbar-right">
							<a href="#">${sessionScope.username}</a> <a href="logout">Logout</a>
							</a>
						</div>
					</ul>
				</div>







				</li>
				</ul>
		</div>
		</nav>
	</div>

	<!----------- !Navbar End ------------>


	</div>