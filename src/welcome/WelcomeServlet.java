package welcome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String firstName = request.getParameter("firstName");
        final String lastName = request.getParameter("lastName");
        final String age = request.getParameter("age");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        final PrintWriter writer = response.getWriter();

        if(firstName != null){
            writer.print("Cześć " + firstName);
        } else
            writer.print("Cześć, niestety nie wiem jak masz na imię");
        if(lastName != null){
            writer.print(" Wiem, że masz na nazwisko " + lastName);
        } else
            writer.print(" Niestety nie wiem jak masz na nazwisko");
        if(age != null){
            writer.print(" Kiedyś też miałem " + age + " lat.");
        } else
            writer.print(" Ja też nie lubię chwalić się wiekiem");

    }
}
