<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
	<title>Home</title>
</head>
<body>
<h1 align="center">Enter the record ID you want to Delete!</h1>
<form action="deletebook1" style="text-align: center;">
Enter Book Id:<input type ="text" name ="book_id"><br><br>
<input type = "submit" value = "DELETE BOOK"> 
 


</form>



</body>
</html>
