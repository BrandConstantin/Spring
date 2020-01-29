<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
</head>
<body>
	<form:form action="procesarFormulario" modelAttribute="elAlumno">
		Nombre: <form:input path="nombre" /> <!-- el mismo nombre que el get, sin el get -->
		<br/>
		Apellidos: <form:input path="apellido" />
		<br/>
		Asignaturas: 
		<form:select path="optativa" multiple="true">
			<form:option value="Escoge una opci�n" label="Escoge una opci�n" />
			<form:option value="Dise�o" label="Dise�o" />
			<form:option value="Comercio" label="Comerio" />
			<form:option value="Danza" label="Danza" />
			<form:option value="Pintura" label="Pintura" />
		</form:select>
		<br/>
		<input type="submit" value="&&& Enviar &&&">
	</form:form>
</body>
</html>