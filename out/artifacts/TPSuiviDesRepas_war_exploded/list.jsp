<%@ page import="fr.eni.javaee.bo.Repas" %>
<%@ page import="fr.eni.javaee.bo.Aliment" %><%--
  Created by IntelliJ IDEA.
  User: root
  Date: 10/01/19
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste repas</title>
</head>
<body>
<table>
    <tr>
        <td>Date</td>
        <td>Heure</td>
        <td>Actions</td>
    </tr>
    <%
        Repas r = (Repas)request.getAttribute("repas");
        out.append("<td>" + r.getDate() + "</td>");
        for (Aliment element:r.getAliments()) {
            out.append("<td><th><td>" + element.getNom() + "</td></th></td>");
        }
        out.append("<td></td>");
    %>

</table>
<form method="post" action="/TPSuiviDesRepas_war_exploded/home">
<button type="submit" id="add" name="btn" value="add">Ajouter un repas</button>
<button type="submit" id="back" name="btn" value="back">Retourner à l'accueil</button>
</form>
</body>
</html>
