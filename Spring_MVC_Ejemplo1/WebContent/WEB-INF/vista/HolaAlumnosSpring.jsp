<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Curso Spring</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/estilo.css" />
</head>
<body>
	<h3>Hola </h3>${param.nombreAlumno }, bienvenido al curso de Spring
			
	<p>Respuesta: ${mensajeFinal }</p>
	
	<!-- ${pageContext.request.contextPath } es la carpeta WebContent -->
	<img alt="foto" src="${pageContext.request.contextPath}/recursos/img/pingu.jpg" width="130px" height="100px"/> 
</body>
</html>