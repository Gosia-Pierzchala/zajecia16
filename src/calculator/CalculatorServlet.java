package calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        calculate(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        calculate(req, resp);
    }

    private void calculate(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        final String a = req.getParameter("a");
        final String b = req.getParameter("b");
        double liczba1 = Double.valueOf(a);
        double liczba2 = Double.valueOf(b);
        System.out.println("Suma: " + (liczba1+liczba2));
        System.out.println("Odejmowanie: " + (liczba1-liczba2));
        System.out.println("Mnozenie: " + (liczba1*liczba2));
        System.out.println("Dzielenie: " + (liczba1/liczba2));

        final PrintWriter writer = resp.getWriter();
        writer.println(liczba1 + " + " + liczba2 + " = " + (liczba1+liczba2));
    }


}
