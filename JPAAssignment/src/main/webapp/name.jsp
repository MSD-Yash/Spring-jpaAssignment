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
<h4 class="display-6" style=color:purple>Search By genre -<%=session.getAttribute("name") %></h4>
<hr>
<table class="table table-bordered table-hover">
<tr>
<th>Member Id

<th>gender
<th>age
<th> Mobile NO
<th>join year

</tr>
<c:forEach items="${listmn}" var="listmn" >
<tr>
<td>${listmn.memberid}</td>
<td>${listmn.gender}</td>
<td>${listmn.age}</td>
<td>${listmn.mobileno}</td>
<td>${listmn.joinyear}</td>

</tr>
</c:forEach>

<a href="/"><button>Home </button></a>

</table>
<hr>
</body>
</html>
