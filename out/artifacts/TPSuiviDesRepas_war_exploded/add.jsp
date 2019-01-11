<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 10/01/19
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter repas</title>
</head>
<body>
    <form method="post" action="/TPSuiviDesRepas_war_exploded/addRepasServlet">
        <input type="datetime-local" id="date" name="date">
        <input type="text" name="aliment" id="aliment">
        <button type="submit" name="add" id="add">Ajouter</button>
        <button type="submit" name="add" id="stop" value="stop">Annuler</button>
    </form>
</body>
</html>
