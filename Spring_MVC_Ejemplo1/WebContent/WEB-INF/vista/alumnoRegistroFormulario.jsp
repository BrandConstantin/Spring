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
				<form:errors path="nombre" style="color:red;"/>
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
		<p>Escoge instituto de estudio:</p>
		Barcelona: <form:radiobutton path="ciudadEstudios" value="Barcelona"/>
		Madrid: <form:radiobutton path="ciudadEstudios" value="Madrid"/>
		Bilbao: <form:radiobutton path="ciudadEstudios" value="Bilbao"/>
		La Coru�a: <form:radiobutton path="ciudadEstudios" value="La Coru�a"/>
		<br/>
		<p>Que idiomas quieres estudiar?</p>
		Chino: <form:checkbox path="idioma" value="Chino"/>
		�rabe: <form:checkbox path="idioma" value="�rabe"/>
		Ruso: <form:checkbox path="idioma" value="Ruso"/>
		Alem�n: <form:checkbox path="idioma" value="Alem�n"/>
		Rumano: <form:checkbox path="idioma" value="Rumano"/>
		<br/>
		Edad: <form:input path="edad" />
			<form:errors path="edad" style="color:red;"/>
		<br/>
		Email: <form:input path="email" />
			<form:errors path="email" style="color:red;"/>
		<br/><br/><br/><br/>
		<input type="submit" value="&&& Enviar &&&">
	</form:form>
</body>
</html>