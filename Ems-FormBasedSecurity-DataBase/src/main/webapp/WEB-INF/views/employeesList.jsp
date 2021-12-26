<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${message ne null}">
	<u><c:out value="${message}" /></u>
</c:if>
















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






<nav class="navbar navbar-expand-sm bg-dark" style="line-height: 5px;">

	<ul class="navbar-nav">
		<li class="nav-item" style="color: white"><a class="nav-link"
			href="index" style="color: white">IndexPage</a></li>

		<li class="nav-item"><a class="nav-link" href="addEmployee"
			style="color: white">AddEmployee</a></li>

		<%-- <li class="nav-item"><a class="nav-link"
			href="editEmployee?empno=${request.var2}" style="color: white">EditEmployee</a></li>
 --%>
		<li class="nav-item"><a class="nav-link" href="listEmployees"
			style="color: white">EmployeeList</a></li>
	
	
	
			
				<li class="nav-item" style="color: white"><a class="nav-link"
					href="logout" style="color: white">Logout</a></li>
			</ul>
		
</nav>



<style>
div {
	padding: 0px 5px 0px;
}
</style>







</head>


<div
	style="background-color: white; color: navy; text-decoration: underline;">
	<h3 style="color: navy">Employees in Organizations</h3>
</div>






























<div>
	<body style="background-color: MintCream;padding=3">
		<form action="search" method="get" style="border: 1 cyan solid">
			DeptNo:<input type="text" name="deptNo">&nbsp;&nbsp; <input
				type="submit" value="search" />
</div>






</form>

<div>
	<table border="" cellpadding="3">




		<tr>
			<div class="container">
				<div class="row">
					<div class="col-2">
						<th>EMPNO</th>
					</div>
					<div class="col-2">
						<th>ENAME</th>
					</div>
					<div class="col-2">
						<th>SALARY</th>
					</div>
					<div class="col-2">
						<th>DEPTNO</th>
					</div>
					<div class="col-2">
						<th>ACTION</th>
					</div>
				</div>
			</div>
		</tr>















		<c:if test="${!empty list}">
			<c:forEach items="${list}" var="employee">


				<tr>
					<td><c:out value="${employee.empNo}" /></td>
					<td><c:out value="${employee.ename}" /></td>
					<td><c:out value="${employee.salary}" /></td>
					<td><c:out value="${employee.deptNo}" /></td>
					<td><a href="editEmployee?empno=${employee.empNo}"><div
								class="btn-group" role="group" aria-label="Basic example">
								<button type="button" class="btn btn-info">
									<img src="images/edit.png" width="30" height="30" />
								</button></a> &nbsp; &nbsp; &nbsp; &nbsp;<a
						href="deleteEmployee?empno=${employee.empNo}"><button
								type="button" class="btn btn-danger btn-lg">
								<img src="images/delete.png" width="30" height="30" />
							</button>
							</div></a></td>


				</tr>
			</c:forEach>

		</c:if>

		
	</table>
	<br> <br>
</div>



</body>
















</html>
















