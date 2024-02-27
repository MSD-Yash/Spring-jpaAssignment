<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<body style="margin-top:35px">
<div class="container">
<h4 class="display-6" style=color:purple>Search By genre -<%=session.getAttribute("pages") %></h4>
<hr>
<table class="table table-bordered table-hover">
<tr>
<th>Book ID
<th>Isbn
<th>Title
<th>Author
<th>Genre
<th>Publi yrs
<th>Language
<th>Description
<th>Price Rs
<th> pages
</tr>
<c:forEach items="${listp}" var="listp" >
<tr>
<td>${listp.bookid}</td>
<td>${listp.isbn}</td>
<td>${listp.title}</td>
<td>${listp.author}</td>
<td>${listp.genre}</td>
<td>${listp.publication_year}</td>
<td>${listp.langauge}</td>
<td>${listp.description}</td>
<td>${listp.price}</td>
<td>${listp.pages}</td>
</tr>
</c:forEach>
</table>
<hr>



<a href="/"><button>Home </button></a>

</div>
</body>
</html>