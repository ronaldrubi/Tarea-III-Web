<%@ page import="java.util.Map" %>
<%@ page import="display.*" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Error</title>
  </head>
  <h1>Error</h1>
  <% String mensaje = (String)request.getAttribute("mensaje"); %>
  <h4><%= mensaje %></h4>
</html>