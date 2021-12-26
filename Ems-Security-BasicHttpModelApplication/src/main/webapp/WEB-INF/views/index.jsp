<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>






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
<body style="background-color: MintCream;padding=3">









	<h3>
	<c:if test="${message ne null}">
		<div class="alert alert-light" role="alert">
		<!-- <strong>/strong> -->
		<c:out value="${message}" />
	</div>
	</c:if>
	
	<div><a href="addEmployee">Add Employee</a>
	<br>
	<br>
	<a href="listEmployees">List Employee</a></div>


	
</body>
</html>
