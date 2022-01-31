
<%@page import="br.com.entidades.Container"%>
<%@page import="br.com.entidades.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">

    <title>PROJETO FINAL</title>
</head>

<body>

    <header class="bg-success">
        <div class="container-fluid">
            <div class="row mb-5">
                <h4> Jeff - Novo Usuario</h4>
            </div>
        </div>
    </header>


    <div class="container mt-5 ">
     <a class="btn btn-lg btn-success w-30 " href="./cadastro.jsp">Novo Usuario</a>
     
     <table class="table mt-5">
    <thead class="thead-dark">
      <tr>
        <th scope="col">Id</th>
        <th scope="col">Nome</th>
        <th scope="col">Email</th>
        <th scope="col">Telefone</th>
        <th scope="col">Pais</th>
        <th scope="col">acoes</th>
      </tr>
    </thead>
    <tbody>

    <c:forEach var="user" items="${user}"> 
    <input type="text" name="id" value="${user.id}">
    	<tr>
            <td>${user.id} </td>
            <td>${user.nome}</td>
            <td>${user.email}</td>
            <td>${user.telefone}</td>
            <td>${user.pais}</td>
            <td><a href="?id=${user.id}&alterar=1" class="btn-primary btn ">Alterar</a></td>
			<td><a href="?id=${user.id}&alterar=0" class="btn-warning btn ">deletar</a></td>           
        </tr>
    
    </c:forEach>
 
    </tbody>
    </table>
  </div>

</body>

</html>