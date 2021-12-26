
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


<div style= "width: 20%;
        height: 30px;
        margin: 10px;
        border-radius: 3px;
        background-color: powderblue;"><h4>

	
	Login Page	
		
	
</h4></div>



<!-- <nav class="navbar navbar-expand-sm bg-dark">

	<ul class="navbar-nav">
		<li class="nav-item" style="color: white"><a class="nav-link"
			href="index" style="color: white">IndexPage</a></li>

		<li class="nav-item"><a class="nav-link" href="addEmployee"
			style="color: white">AddEmployee</a></li>
		
                <li class="nav-item"> 
                    <a class="nav-link" href="editEmployee" style="color:white">EditEmployee</a> 
                </li> 
              
		<li class="nav-item"><a class="nav-link" href="listEmployees"
			style="color: white">EmployeeList</a></li>
	</ul>
</nav>
 -->



<style>
div {
	padding: 0px 5px 0px;
}
</style>
</head>








<c:if test="${message ne null}">
	<c:out value="${message }" />
</c:if>
<form action="login" method="post">

	<table>
		<tr>
			<td>Username</td>
			<td><input type="text" name="username" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" /></td>
		</tr>

		<tr>
			<td>Remember Me:</td>
			<td><input type="checkbox" name="remember-me" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="login" /></td>
		</tr>
	</table>



</form>