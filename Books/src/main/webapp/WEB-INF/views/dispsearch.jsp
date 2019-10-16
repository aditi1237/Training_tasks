<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>
<p>
<h1 align="center">Your searched Book</h1> 
</p>

<table align="center">
<th>BOOK ID</th>
<th>TITLE</th>
<th>AUTHOR</th>
<th>BOOK NAME</th>
<tr>

<td>${rescue.book_id}</td>
<td>${rescue.title}</td> 
<td>${rescue.author}</td> 
<td>${rescue.book_name}</td>

</tr>

</table>
</body>
</html>