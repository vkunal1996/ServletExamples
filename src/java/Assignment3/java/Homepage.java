import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Homepage extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw;
        res.setContentType("text/html");
        pw=res.getWriter();
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>Welcome to Servlet Example</title></head>");
        pw.print("<body bgcolor='yellow' text='navy'>");
        pw.print("<form action='./Secondpage' method=post>");
                pw.print("<center>");
					pw.print("<table>");
						
						pw.print("<tr>");
							pw.print("<td>");
								pw.print("Choose");
							pw.print("</td>");
						
							pw.print("<td>");
								pw.print("<select name='options'><option>Choose..</option><option value='O1'>Old Hindi Mp3</option><option value='O2'>New Hindi Mp3</option><option value='O3'>Old Punjabi Mp3</option><option value='O4'>New Punjabi Mp3</option></select>");
							pw.print("</td>");
							
							pw.print("<td>");
								pw.print("<input type='submit' value='Submit'>");
							pw.print("</td>");
						pw.print("</tr>");

					pw.print("</table>");
                pw.print("</center>");
                
        pw.print("</form>");
        pw.print("</body>");
        pw.print("</html>");
    }
}