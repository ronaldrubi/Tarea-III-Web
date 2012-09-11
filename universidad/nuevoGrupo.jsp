<%@ page import="java.util.Map" %>
<%@ page import="display.*" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sistema Universitario</title>
  </head>
  <h1>Sistema Universitario</h1>
  <h2>Nuevo Grupo</h2>
  <form name="NuevoGrupo" action="/universidad/nuevoGrupo" method="get">
  <input type="hidden" name="id" value="<%= grupo.id %>"/>
  <table>
    <tr><td>Numero:</td><td><input type="text" name="numero" value=""/></td></tr>
    <tr><td>Sigla:</td><td><input type="text" name="sigla" value=""/></td></tr>
    <tr><td>Nombre:</td><td><input type="text" name="nombre" value=""/></td></tr>
    <tr><td>Horario:</td><td><input type="text" name="horario" value=""/></td></tr>
    <tr><td>Aula:</td><td><input type="text" name="aula" value=""/></td></tr>
	<tr><td>Id profesor:</td><td><input type="text" name="id_profesor" value=""/></td></tr>
    <tr><td></td><td><input type="submit" value="Agregar" /></td></tr>
  </table>
  </form>
</html>