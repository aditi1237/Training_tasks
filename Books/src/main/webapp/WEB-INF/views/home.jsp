<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Library</title>
	<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>
<form style="border:1px solid #ccc">
<div class="container">
    <h1 align="center">Library</h1>
   
    <hr>
    <label for="book_id"><b>Book ID:</b></label>
	<input type="text" placeholder="Enter book id" name="book_id" ><br>

    <label for="book_name"><b>Book name:</b></label>
    <input type="text" placeholder="Enter Book Name" name="book_name">

    <label for="title"><b>Book Title:</b></label>
    <input type="text" placeholder="Enter Title" name="title">
    
    
    <label for="author"><b>Book Author:</b></label>
    <input type="text" placeholder="Enter Author" name="author">
    
    
	
	


<div class="clearfix">

      <button type="submit" class="addbook" formaction="addbook">Add book</button>
      <button type="submit" class="displaybook" formaction="displaybook">Display books</button>
      <button type="submit" class="deletebook" formaction="deletebook">Delete book</button>
      
      <button type="submit" class="updatebook" formaction="updatebook">Update book</button>
       <button type="submit" class="searchbook" formaction="searchbook">Search book</button>
    </div>
</div>
</form>



</body>


</html>
