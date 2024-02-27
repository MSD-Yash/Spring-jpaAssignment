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
<h4 class="display-6" style=color:purple>Search By publication year -<%=session.getAttribute("year") %></h4>
<hr>
<table class="table table-bordered table-hover">
<tr>

<th>Isbn
<th>Title
<th>Author
<th>Genre

<th>Language
<th>Description
<th>Price Rs
<th> pages
</tr>
<c:forEach items="${ly}" var="ly" >
<tr>

<td>${ly.isbn}</td>
<td>${ly.title}</td>
<td>${ly.author}</td>
<td>${ly.genre}</td>

<td>${ly.langauge}</td>
<td>${ly.description}</td>
<td>${ly.price}</td>
<td>${ly.pages}</td>
</tr>
</c:forEach>
</table>
<hr>



<a href="/"><button>Home </button></a>

</div>
</body>
</html>