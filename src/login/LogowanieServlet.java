package login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LogowanieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String userName = request.getParameter("userName");
        final String password = request.getParameter("password");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        final PrintWriter writer = response.getWriter();
        if(userName.equals("admin") && password.equals("admin")){
            writer.println("Zalogowano pomyślnie");
        } else writer.println("Logowanie nie powiodło się");

    }
}
