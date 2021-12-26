<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h3 style="border:2px solid cyan;color:blue;"/>
<c:if test="${message ne null}">
<u><c:out value="${message}"/></u>
</c:if><br><br>
<a href="addEmployee">Add Employee</a><br><br>
<a href="listEmployees">List Employee</a>"


<div class="alert alert-light" role="alert">
    <strong>Well done!</strong><c:out value="${message}"/> 
</div>
