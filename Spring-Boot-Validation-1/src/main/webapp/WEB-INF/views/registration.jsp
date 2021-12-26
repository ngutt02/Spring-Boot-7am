<%@taglib uri="hhtp://www.springframework.org/tags/form" prefix="form"%>
<form:form action="process" method="post" modelAttribute="registerBean">
	<table>
		<tr>
			<td>username</td>
			<td><form:input path="username" /></td>
			<td><form:errorssername /></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><form:input path="email" /></td>
			<td><form:errors path="email" /></td>
		</tr>
		<tr>
			<td>Age</td>
			<td><form:input path="age" /></td>
			<td><form:errors path="age" /></td>
		</tr>
		<tr>
			<td>DOB</td>
			<td><form:input path="dob" /></td>
			<td><form:error path="dod" /></td>
			<td></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><form:radio path="gender" value="MALE" label="M" /> <formradio
					path="gender" value="FEMALE" label="F" /> <form:radio
					path="gender" value="OTHERS" label="O" /></td>


		</tr>

		<tr>
			<td>Country</td>
			<td><form:select path="country">
					<form:option>----Select------</form:option>
					<form:option items="${contriesList}"
						itemsLabel="${country.countryName}" itemskeys="${countryName}" />

				</form:select></td>
			<td><form:errors path="country" /></td>




		</tr>

		<tr>
			<td colspan="3" align="center"><input type="submit"
				value="Submit" /></td>
		</tr>







	</table>

</form:form>