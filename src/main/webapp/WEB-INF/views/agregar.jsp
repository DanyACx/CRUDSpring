<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
		integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" 
		crossorigin="anonymous">
<title>Agregar</title>
</head>
<body>
	
	<div class="container mt-4 col-lg-4">
		<div class="card border-info">
			<div class="card-header bg-info">
				<h4>Agregar Nuevo Registro</h4>
			</div>
			<div class="card-body">
				<form method="POST">
					<label>Nombres</label>
					<input type="text" name="nombres" class="form-control"> 
					<label>Correo</label>
					<input type="text" name="correo" class="form-control"> 
					<label>Nacionalidad</label>
					<input type="text" name="nacionalidad" class="form-control"><br>
					<input type="submit" value="agregar" class="btn btn-success">
					<a href="crudDemo">Regresar</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>