<!DOCTYPE html>
<%@include file="Header.jsp"%>
<html lang="en">
<head>
<title>Register</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value="/resources/css/Reg.css" />" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>


	<div id="regContainer" class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-register">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="register-form-link">Register</a>
							</div>

						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="register-form" action="InsertUserRegister" method="post" role="form"
									style="display: block;">
									<div class="form-group">
										<label for="username">Username</label> <input type="text"
											name="username" id="username" tabindex="1"
											class="form-control" placeholder="Username" value="" required>
									</div>
									<div class="form-group">
										<label for="password">Password</label> <input type="password"
											name="password" id="password" tabindex="2"
											class="form-control" placeholder="Password" required>
									</div>
									<div class="form-group">
										<label for="password">Confirm Password</label> <input
											type="password" name="password" id="password" tabindex="2"
											class="form-control" placeholder="Password">
									</div>
									
									<div class="form-group">
										<label for="email">Email</label> <input type="text"
											name="email" id="email" tabindex="2"
											class="form-control" placeholder="email" required>
									</div>
									

									<div class="form-group">
										<label class="control-label col-sm-3">Gender <span
											class="text-danger">*</span></label> <label> <input
											name="gender" type="radio" value="Male" checked> Male
										</label>     <label> <input name="gender" type="radio"
											value="Female"> Female
										</label>
									</div>


									<div class="form-group">
										<label for="address">Address</label> <input type="address"
											name="address" id="address" tabindex="2" class="form-control"
											placeholder="address">
									</div>
									<div class="form-group">
										<label for="country">Country</label> <input type="country"
											name="country" id="country" tabindex="2" class="form-control"
											placeholder="country">
									</div>
									<div class="form-group">
										<label for="mobile">Mobile</label> <input
											type="mobile" name="mobile" id="mobile"
											tabindex="2" class="form-control" placeholder="mobile">
									</div>
									<div class="form-group">
										<div class="col-xs-offset-3 col-md-8 col-sm-9">
											<span class="text-muted"><span
												class="label label-danger">Note:-</span> By clicking Sign
												Up, you agree to our <a href="#">Terms</a> and that you have
												read our <a href="#">Policy</a>, including our <a href="#">Cookie
													Use</a>.</span>
										</div>



									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<button class="btn btn-lg btn-primary btn-block"
													type="submit">Sign up</button>
											</div>
										</div>
									</div>
									
									</div>
									
								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>