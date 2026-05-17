import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;



public class RegistrationServletOne extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String profession = request.getParameter("profession");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body bgcolor = 'wheat'>");
        out.println("<center>");
        out.print("<h1> COMPLETE THE REGISTRATION</h1>");
        out.println("<form action = ./registertwo method = post>");
        out.println("<input type = \"hidden\" name = \"password\" value = " + password + ">");
        out.println("<input type = \"hidden\" name = \"profession\" value = " + profession + ">");
        out.println("EMAIL ID: <input type = text name = email><br><br>");
        out.println("PHONE NO: <input type = text name = cell><br><br>");
        out.println("<input type = 'submit' value = 'Register Now'>");
        out.println("</center>");
        out.println("</body></html>");
        out.close();

    }
}