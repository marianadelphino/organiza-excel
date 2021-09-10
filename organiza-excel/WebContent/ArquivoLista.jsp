<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Arquivos Encontrados</title>
<%@ include file="header.jsp" %>
</head>
<body>
<%@ include file="menu.jsp" %>



<div class="container">

<h3>Lista de Arquivos Encontrados</h3>
<table class="table table-striped">

<thead>
<tr>

<th><center>Arquivo caminho</center></th>
</tr>
</thead>


<tbody>
<c:forEach items="${lista}" var="arquivo">
<tr>

<td style="font-size:12px;font-weight:bold;text-align:center;">${arquivo}</td>
</tr>
</c:forEach>
</tbody>
</table>


</div>


<%@ include file="footer.jsp" %>
</body>
</html>