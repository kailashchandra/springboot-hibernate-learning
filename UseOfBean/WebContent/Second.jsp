Second JSP <br>
<jsp:useBean id="u" class="Test.Employee" scope="session"></jsp:useBean>

<%
	String nama="Yogendra";
%>
<jsp:setProperty property="name" name="u" value="nama"/><br>
Record :<br>
<jsp:getProperty property="name" name="u"/><br>
<jsp:getProperty property="password" name="u"/><br>
<jsp:getProperty property="email" name="u"/><br>