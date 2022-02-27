<%@ taglib uri= "http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Add Details of Student</h1>
<form:form method="post" action="save">
	<table>
		<tr>
			<td>Id : </td>
			<td><form:input path="sid"/></td>
		</tr>
		<tr>
			<td>Name : </td>
			<td><form:input path="sname"/></td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><form:input path="semail"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Register"/></td>
		</tr>
	</table>	
</form:form>