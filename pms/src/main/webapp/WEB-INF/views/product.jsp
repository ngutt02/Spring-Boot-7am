<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="save" method="post" modelAttribute="product">
	<table border="1">
		<tr>
			<td>Product Id</td>
			<td><form:input path="pid" />
			<form:errors path="pid" /></td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td><form:input path="name" />
			<form:errors path="name"/></td>

		</tr>
		<tr>
			<td>Price</td>
			<td><form:input path="price" />
			<form:errors path="price" /></td>

		</tr>
		<tr>
			<td colspan="1" align="center"><input type="submit" value="submit" /></td>
		</tr>




	</table>
</form:form>