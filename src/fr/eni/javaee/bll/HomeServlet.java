package fr.eni.javaee.bll;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("btn").equals("add")){
            request.getRequestDispatcher("/add.jsp").forward(request, response);
        }else if (request.getParameter("btn").equals("lst")){
            request.getRequestDispatcher("/list.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("/home.jsp").forward(request,response);
        }
    }
}
