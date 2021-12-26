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






<nav class="navbar navbar-expand-sm bg-dark">

	<ul class="navbar-nav">
		<li class="nav-item" style="color: white"><a class="nav-link"
			href="index" style="color: white">IndexPage</a></li>

		<li class="nav-item"><a class="nav-link" href="addEmployee"
			style="color: white">AddEmployee</a></li>
		<!-- 
                <li class="nav-item"> 
                    <a class="nav-link" href="editEmployee" style="color:white">EditEmployee</a> 
                </li> 
               -->
		<li class="nav-item"><a class="nav-link" href="listEmployees"
			style="color: white">EmployeeList</a></li>
	</ul>
</nav>




<style>
div {
	padding: 0px 25px 0px;
}
</style>




</head>





<div
	style="background-color: white; color: navy; text-decoration: underline;">
	<h3 style="color: navy">Add Employee</h3>
</div>








<body style="background-color: MintCream;padding=3">


	<form:form action="save" method="post" modelAttribute="employee">




		<div>
			<table border="1">


				<tr>
					<div class="row">
						<div class="col-2">
							<td scope="col">Empno</td>
							<td><form:input path="empNo" /></td>
						</div>
				</tr>
				<tr>
					<td>Ename</td>
					<td><form:input path="ename" /></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><form:input path="salary" /></td>
				</tr>
				<tr>
					<td>DeptNo</td>
					<td><form:input path="deptNo" /></td>
				</tr>


				<!-- 		<td colspan="2" align="center"><input type="submit"
			value="SAVE Employee"></td> -->
			</table>
			<td clospan="2" align="center"><input type="submit"
				value="Save Employee" class="btn btn-primary"></td>
		</div>

	</form:form>

</body>
</html>