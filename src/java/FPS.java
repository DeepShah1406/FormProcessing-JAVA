
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FPS extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Your Details</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Your Details</h1>");
            
            String Name = request.getParameter("Name");
            out.println("Nmae = "+Name);
            out.println("<br>");
            
            String Aadhar = request.getParameter("Aadhar");
            out.println("Aadhar = "+Aadhar);
            out.println("<br>");
            
            String PAN = request.getParameter("PAN");
            out.println("PAN = "+PAN);
            out.println("<br>");
            
            String Email = request.getParameter("Email");
            out.println("Email = "+Email);
            out.println("<br>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
