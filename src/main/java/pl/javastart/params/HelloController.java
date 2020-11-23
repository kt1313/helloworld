package pl.javastart.params;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/hello")
public class HelloController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        System.out.println("Cześć " + firstName + " " + lastName + "!");
    }
}