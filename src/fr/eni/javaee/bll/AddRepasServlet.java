package fr.eni.javaee.bll;

import fr.eni.javaee.bo.Aliment;
import fr.eni.javaee.bo.Repas;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@WebServlet(name = "AddRepasServlet", urlPatterns = {"/addRepasServlet"})
public class AddRepasServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("add").equals("stop"))
            request.getRequestDispatcher("/home.jsp").forward(request, response);
        Repas r = new Repas();
        System.out.println(request.getParameter("date"));
        String dat = request.getParameter("date");
        dat = dat.replace("T", " ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        try {
            r.setDate(sdf.parse(dat));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(r.getDate());
        Aliment aliment = new Aliment();
        String alim = request.getParameter("aliment");
        String[] tabalim = alim.split(",");
        for (String elment:tabalim) {
            //ajouter l'élément en base
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
