<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmaci�n Registro</title>
</head>
<body>
	<!-- utilizar las jsp tagas que viajan en el modelo -->
	<p>El alumno con nombre <strong>${elAlumno.nombre}</strong> y apellidos <strong>${elAlumno.apellido}</strong> se ha registrado con exito!</p>
	
	<p>Asignaturas m�ticulado: <strong>${elAlumno.optativa}</strong> </p>
	<p>M�triculado en IES <strong>${elAlumno.ciudadEstudios}</strong>
	<p>El alumno estudiara: <strong>${elAlumno.idioma}</strong>
</body>
</html>