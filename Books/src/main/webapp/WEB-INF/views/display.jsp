<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<p>
<h1 align="center">List Of Books</h1> 
</p>

<%-- <c:forEach  items= "${displayList.Restaurant_id}" var="Lists">
${Lists.Restaurant_name };
${Lists.FoodName};
${Lists.Price};
</c:forEach>  --%>


<table align="center">
<th>BOOK ID</th>
<th>TITLE</th>
<th>AUTHOR</th>
<th>BOOK NAME</th>
<c:forEach items="${displayList}" var="rescue" >
<tr>
<td>${rescue.book_id}</td>
<td>${rescue.title}</td> 
<td>${rescue.author}</td> 
<td>${rescue.book_name}</td>
</tr>
</c:forEach>
</table>
</body>
</html>