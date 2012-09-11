<%@ page import="java.util.Map" %>
<%@ page import="display.*" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sistema Universitario</title>
  </head>
  <h1>Sistema Universitario</h1>
  <h2>Detalle de Grupo</h2>
  <% GrupoDTO grupo = (GrupoDTO)request.getAttribute("grupo"); %>
  <form name="ActualizarGrupo" action="/universidad/actualizarGrupo" method="get">
  <input type="hidden" name="id" value="<%= grupo.id %>"/>
  <table>
    <tr><td>Numero:</td><td><input type="text" name="numero" value="<%= grupo.numero %>"/></td></tr>
    <tr><td>Sigla:</td><td><input type="text" name="sigla" value="<%= grupo.sigla %>"/></td></tr>
    <tr><td>Nombre:</td><td><input type="text" name="nombre" value="<%= grupo.nombre %>"/></td></tr>
    <tr><td>Horario:</td><td><input type="text" name="horario" value="<%= grupo.horario %>"/></td></tr>
    <tr><td>Aula:</td><td><input type="text" name="aula" value="<%= grupo.aula %>"/></td></tr>
	<tr><td>Id profesor:</td><td><input type="text" name="id_profesor" value="<%= grupo.id_profesor %>"/></td></tr>
    <tr><td></td><td><input type="submit" value="Actualizar" /></td></tr>
  </table>
  </form>
</html>