<jsp:useBean id="u" class="Test.Employee" scope="session"></jsp:useBean>

<jsp:setProperty property="*" name="u"></jsp:setProperty> 


Record:<br>
<jsp:getProperty property="name" name="u"></jsp:getProperty><br>
<jsp:getProperty property="password" name="u"></jsp:getProperty><br>
<jsp:getProperty property="email" name="u"></jsp:getProperty><br>

<a href="Second.jsp" >Visit Next</a>