<!DOCTYPE html>
<%@include file="Header.jsp"%>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="global.css" />
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
								<form id="register-form" action="#" method="post" role="form"
									style="display: block;">
									<div class="form-group">
										<label for="username">Username</label> <input type="text"
											name="username" id="username" tabindex="1"
											class="form-control" placeholder="Username" value="">
									</div>
									<div class="form-group">
										<label for="password">Password</label> <input type="password"
											name="password" id="password" tabindex="2"
											class="form-control" placeholder="Password">
									</div>
									<div class="form-group">
										<label for="password">Confirm Password</label> <input
											type="password" name="password" id="password" tabindex="2"
											class="form-control" placeholder="Password">
									</div>
									<div class="form-group">

										<label class="control-label col-sm-3">Date of Birth <span
											class="text-danger">*</span></label>

									</div>
									<div class="form-group">
										<select name="dd" class="form-control">
											<option value="">Date</option>
											<option value="1">1</option>
											<option value="2">2</option>
											<option value="3">3</option>
											<option value="4">4</option>
											<option value="5">5</option>
											<option value="6">6</option>
											<option value="7">7</option>
											<option value="8">8</option>
											<option value="9">9</option>
											<option value="10">10</option>
											<option value="11">11</option>
											<option value="12">12</option>
											<option value="13">13</option>
											<option value="14">14</option>
											<option value="15">15</option>
											<option value="16">16</option>
											<option value="17">17</option>
											<option value="18">18</option>
											<option value="19">19</option>
											<option value="20">20</option>
											<option value="21">21</option>
											<option value="22">22</option>
											<option value="23">23</option>
											<option value="24">24</option>
											<option value="25">25</option>
											<option value="26">26</option>
											<option value="27">27</option>
											<option value="28">28</option>
											<option value="29">29</option>
											<option value="30">30</option>
											<option value="31">31</option>
										</select>
									</div>
									<div class="form-group">
										<select name="mm" class="form-control">
											<option value="">Month</option>
											<option value="1">Jan</option>
											<option value="2">Feb</option>
											<option value="3">Mar</option>
											<option value="4">Apr</option>
											<option value="5">May</option>
											<option value="6">Jun</option>
											<option value="7">Jul</option>
											<option value="8">Aug</option>
											<option value="9">Sep</option>
											<option value="10">Oct</option>
											<option value="11">Nov</option>
											<option value="12">Dec</option>
										</select>
									</div>
									<div class="form-group">
										<select name="yyyy" class="form-control">
											<option value="0">Year</option>
											<option value="1955">1955</option>
											<option value="1956">1956</option>
											<option value="1957">1957</option>
											<option value="1958">1958</option>
											<option value="1959">1959</option>
											<option value="1960">1960</option>
											<option value="1961">1961</option>
											<option value="1962">1962</option>
											<option value="1963">1963</option>
											<option value="1964">1964</option>
											<option value="1965">1965</option>
											<option value="1966">1966</option>
											<option value="1967">1967</option>
											<option value="1968">1968</option>
											<option value="1969">1969</option>
											<option value="1970">1970</option>
											<option value="1971">1971</option>
											<option value="1972">1972</option>
											<option value="1973">1973</option>
											<option value="1974">1974</option>
											<option value="1975">1975</option>
											<option value="1976">1976</option>
											<option value="1977">1977</option>
											<option value="1978">1978</option>
											<option value="1979">1979</option>
											<option value="1980">1980</option>
											<option value="1981">1981</option>
											<option value="1982">1982</option>
											<option value="1983">1983</option>
											<option value="1984">1984</option>
											<option value="1985">1985</option>
											<option value="1986">1986</option>
											<option value="1987">1987</option>
											<option value="1988">1988</option>
											<option value="1989">1989</option>
											<option value="1990">1990</option>
											<option value="1991">1991</option>
											<option value="1992">1992</option>
											<option value="1993">1993</option>
											<option value="1994">1994</option>
											<option value="1995">1995</option>
											<option value="1996">1996</option>
											<option value="1997">1997</option>
											<option value="1998">1998</option>
											<option value="1999">1999</option>
											<option value="2000">2000</option>
											<option value="2001">2001</option>
											<option value="2002">2002</option>
											<option value="2003">2003</option>
											<option value="2004">2004</option>
											<option value="2005">2005</option>
											<option value="2006">2006</option>
										</select>
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
										<label for="Address">Address</label> <input type="Address"
											name="Address" id="Address" tabindex="2" class="form-control"
											placeholder="Address">
									</div>
									<div class="form-group">
										<label for="Country">Country</label> <input type="Country"
											name="Country" id="Country" tabindex="2" class="form-control"
											placeholder="Country">
									</div>
									<div class="form-group">
										<label for="Contact No">Contact No</label> <input
											type="Contact No" name="Contact No" id="Contact No"
											tabindex="2" class="form-control" placeholder="Contact No">
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