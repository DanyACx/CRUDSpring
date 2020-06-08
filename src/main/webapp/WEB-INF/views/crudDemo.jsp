<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<title>CRUD MVC CUARENTENA</title>
</head>
<body>

	<div class="container mt-4">
		<div class="card border-info">
			<div class="card-header bg-info text-white">
				<a class="btn btn-light" href="agregar">Nuevo Registro</a>
			</div>
			
			<div class="card-body">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>NOMBRES</th>
							<th>CORREO</th>
							<th>NACIONALIDAD</th>
							<th>ACCIONES</th>
						</tr>
					</thead>
					
					<tbody>
						<c:forEach var="dato" items="${lista}"> 
						<tr>
							<td>${dato.ide}</td>
							<td>${dato.nombres}</td>
							<td>${dato.correo}</td>
							<td>${dato.nacionalidad}</td>
							<td>
								<a href="editar?id=${dato.ide}" class="btn btn-warning">Editar</a>
								<a href="delete?id=${dato.ide}" class="btn btn-danger">Delete</a>
							</td>
						</tr>
						</c:forEach> 
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>