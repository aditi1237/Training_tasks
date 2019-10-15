<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<p>
<h1 align="center">Fill the details to update...!!!!</h1> 
</p>


<form action="updatebook1" style="text-align: center;">
<table align="center">

<tr><td>Enter Book Id:</td><td><input type ="text" name ="book_id"></td><br><br></tr>
<tr><td>Enter Book Name:</td><td><input type = "text"  name = "book_name"><br><br></td></tr>
<tr><td>Enter Title:</td><td><input type = "text"  name = "title"></td><br><br></tr>
<tr><td>Enter Author Name:</td><td><input type = "text"  name = "author"></td><br><br></tr>

 
 </table>
 <br><br>
<input type = "submit" value = "UPDATE BOOK" align="center">

</form>



</body>
</html>
