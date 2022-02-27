<%@ taglib uri= "http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Student List</h1>

<table>
	<tr>
		<th>ID</th><th>Name</th><th>Email</th><th>Edit</th><th>Delete</th>
	</tr>
	<c:forEach var="st" items="${list}" >
	<tr>
		<td>${st.sid}</td>
		<td>${st.sname}</td>
		<td>${st.semail}</td>
		<td><a href="editStudent/${st.sid}">Edit</a></td>	
		<td><a href="deleteStudent/${st.sid}">Delete</a></td>
	</tr>
	</c:forEach>
</table>
<a href="addStudent">Add new Student</a>