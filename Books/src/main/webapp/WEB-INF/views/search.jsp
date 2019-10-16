<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>
<h1 align="center">Enter the Book ID to search!</h1>

<form action="searchbook1" style="text-align: center;">
Enter Book Id:<input type ="text" name ="book_id"><br><br>
<input type ="submit" value = "SEARCH BOOK"> 
 


</form>



</body>
</html>
