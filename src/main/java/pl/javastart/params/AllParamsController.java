package pl.javastart.params;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.util.Map;

@WebServlet("/allparams")
public class AllParamsController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String key : parameterMap.keySet()) {
            System.out.println(key);
            for (String value : parameterMap.get(key)) {
                System.out.println("  -" + value);
            }
        }
    }
}