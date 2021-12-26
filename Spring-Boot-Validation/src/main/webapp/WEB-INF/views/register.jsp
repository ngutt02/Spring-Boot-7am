<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="save" method="post" modelAttribute="registerBean">
	<table>
		<tr>
			<td><form:input path="username" /></td>
			<td></td>
		</tr>
		<tr>
			<td><form:input path="password" /></td>
			<td></td>
		</tr>
		<tr>
			<td><form:input path="email" /></td>
			<td></td>
		</tr>
		<tr>
			<td><form:input path="address" /></td>
			<td></td>
		</tr>
		<tr>
			<td><form:input path="gender" /></td>
			<td></td>
		</tr>
		<tr>
			<form:input path="country" />
		</tr>

		<tr>
			<td colspan="3"><input type="submit" value="submit" /></td>
		</tr>
	</table>
</form:form>