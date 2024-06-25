<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-widht, initial-scale=1">
<title>Desafío - JEE y Java Server Pages (I)</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<header></header>
	<main class="m-1 p-1">
		<div id="container">
			<table class="table">
				<thead>
					<th scope="col" class="bg-success text-light text-center">#</th>
					<th scope="col" class="bg-success text-light text-center">Número</th>
					<th scope="col" class="bg-success text-light text-center">Calcular Factorial</th>
					<th scope="col" class="bg-success text-light text-center">¿Es par o impar?</th>
				</thead>
				<tbody>
					<%
					for (int i = 1; i <= 10; i++) {
					%>
					<tr>
						<th scope="row" class="text-center"><%=i%></th>
						<td class="text-center">Número Mes <%=i%></td>
						<td class="text-center"><a href="GetFactorial?valor=<%=i%>">Factorial de <%=i%></a></td>
						<td class="text-center"><a href="GetParEImpar?valor=<%=i%>">¿Es par o impar el número <%=i%>?
						</a></td>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>

		</div>
	</main>
	<footer><section><div class="bg-success text-light text-center py-4 px-4"><h5>©2024 Cristopher Montecinos. Todos los derechos reservados.</h5></div></section></footer>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>