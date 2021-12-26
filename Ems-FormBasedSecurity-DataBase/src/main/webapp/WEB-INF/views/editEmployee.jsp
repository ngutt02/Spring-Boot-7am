<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<html lang="en">
<head>
<title></title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=2">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
	
</script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js">
	
</script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js">
	
</script>


<div style="background-color: #00695c;">
	<h1 style="color: white">Employee Management System</h1>
	</header>
</div>






<nav class="navbar navbar-expand-sm bg-dark"  style="line-height: 5px;">

	<ul class="navbar-nav">
		<li class="nav-item" style="color: white"><a class="nav-link"
			href="index" style="color: white">IndexPage</a></li>

		<li class="nav-item"><a class="nav-link" href="addEmployee"
			style="color: white">AddEmployee</a></li>

		<li class="nav-item"><a class="nav-link" href="update"
			style="color: white">EditEmployee</a></li>

		<li class="nav-item"><a class="nav-link" href="listEmployees"
			style="color: white">EmployeeList</a></li>
	</ul>
</nav>




<style>
div {
	padding: 0px 5px 0px;
}
</style>






</head>
<br>































<body style="background-color: MintCream; padding =3; border: 1">
	<form:form action="update" method="post" modelAttribute="employee">

		
			<table width="100%" border="2">


				<div class="row">
					<div class="col-1">EMPNO</div>
					<!-- <div class="col-2"> -->
						<form:input path="empNo" readOnly="true" />
					</div>
				</div>

				<div class="row">
					<div class="col-1">ENAME</div>
					<!-- <div class="col-2"> -->
						<form:input path="ename" />
					</div>
				</div>

				<div class="row">
					<div  class="col-1">SALARY</div>
					<!-- <div class="col-2"> -->
						<form:input path="salary" />
					</div>
				</div>


				<div class="row">
					<div class="col-1">DEPTNO</div>
					<!-- <div class="col-2"> -->
						<form:input path="deptNo" />
					</div>
				</div>


				<div class="row">
					<div class="col-1" align="center">
						<input type="submit" value="Update" />
					</div>
				</div>

			</table>
		
	</form:form>
</body>
</html>
