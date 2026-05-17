import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class RegistrationServletTwo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String profession = request.getParameter("profession");
        String email = request.getParameter("email");
        String cell = request.getParameter("cell");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body bgcolor = wheat>");
        out.println("<center>");
        out.print("<h1> REGISTRATION SUCCESSFUL.....</h1>");
        out.println("</center>");
        out.println("</body></html>");
        out.close();
    }
}