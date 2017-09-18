import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Summary extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw;
        res.setContentType("text/html");
        pw=res.getWriter();
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>Welcome to Servlet Example</title>");
        pw.print("<style>body {background: azure;color:navy;}#heading{background:pink;color:white;border-style: inset;font-family: sans-serif;font-size: 50px;}</style></head>");
        
        pw.print("<body bgcolor='azure' text='navy'>");
         pw.println("Good");
        pw.print("<h1 id='heading'>Welcome</h1>");
        HttpSession session=req.getSession(true);
        pw.println("Good");
           pw.println(session.getAttribute("username"));
        pw.print("</body>");
        pw.print("</html>");

    }
}