package ConvertidorServlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConvertidorServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res)
        
        throws ServletException, IOException {
        double op1, result;
        String opci;
        int operacion;
        String simb_op[] = {"USD", "YENES"};
        ServletOutputStream out = res.getOutputStream();
        op1 = Double.parseDouble(req.getParameter("operando1"));
        opci =req.getParameter("opci");
        operacion = Integer.parseInt(req.getParameter("operacion"));
        result = calcula(op1, operacion);
        out.println("<html>");
        out.println("<head><title>RESULTADO DE CALCULAR CON SERVLET</title></head>");
        out.println("<body   BGCOLOR   =   \"white\"     TEXT=   \"blue\">");
        out.println("<h1><center>LA   CONVERSION ES :</center></h1>");
        out.println("<h2><b><center>" +result+ "</center></b></h2>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    public double calcula(double op1, int operacion) {
        double result = 0;
        switch (operacion) {
            case 1:
                return op1 * 20;
            case 2:
                return op1 / 20;
        }
        return result;
    }
}
