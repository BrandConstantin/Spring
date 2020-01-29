<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmación Registro</title>
</head>
<body>
	<!-- utilizar las jsp tagas que viajan en el modelo -->
	<p>El alumno con nombre <strong>${elAlumno.nombre}</strong> y apellidos <strong>${elAlumno.apellido}</strong> se ha registrado con exito!</p>
	<p>La edad del alumnos es de <strong>${elAlumno.edad}</strong> y su correo es <strong>${elAlumno.email}</strong>
		con CP <strong>${elAlumno.codigoPostal}</strong>
	</p>
	<p>Asignaturas máticulado: <strong>${elAlumno.optativa}</strong> </p>
	<p>Mátriculado en IES <strong>${elAlumno.ciudadEstudios}</strong>
	<p>El alumno estudiara: <strong>${elAlumno.idioma}</strong>
</body>
</html>