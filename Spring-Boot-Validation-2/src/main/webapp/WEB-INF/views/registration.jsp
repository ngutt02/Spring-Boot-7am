<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="process" method="post" modelAttribute="bean">
	<table>
		<tr>
			<td>username</td>
			<td><form:input path="username" /></td>
			<td><form:errors path="username" /></td>
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
			<td><form:errors path="dob" /></td>
			
		</tr>
		<tr>
			<td>Gender</td>
			<td><form:radiobutton path="gender" value="MALE" label="M" /> 
			
			<form:radiobutton path="gender" value="FEMALE" label="F" /> 
			<form:radiobutton path="gender" value="OTHERS" label="OTH" /></td>
			<td><form:errors path="gender" /></td>

		</tr>

		<tr>
			<td>Country</td>
			<td><form:select path="country">
					<form:option value="">----Select------ </form:option>
					<form:options items="${bean.countriesList}" itemValue="countryName"
						itemLabel="countryName" />


				</form:select></td>
			<td><form:errors path="country" /></td>
		</tr>
		<tr>
			<td colspan="3" align="center"><input type="submit"
				value="Submit" /></td>
		</tr>







	</table>

</form:form>