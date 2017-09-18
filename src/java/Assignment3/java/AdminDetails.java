import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class AdminDetails extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw;
        res.setContentType("text/html");
        pw=res.getWriter();
        pw.print("<html>");
        pw.print("<head> <title>Upload Songfiles</title><meta charset='UTF-8><meta name='viewport' content='width=device-width, initial-scale=1.0'>");
       pw.print("<style>body {background: yellow;color:navy;}#heading{background:pink;color:white;border-style: inset;font-family: sans-serif;font-size: 50px;}</style></head>");
    
        pw.print("<body bgcolor='yellow' text='navy'>");
        pw.print("<form action='./LoginSucces' method=post>");
                pw.print("<center>");
                pw.print("<h1 id='heading'>User Admin Panel</h1>");
					pw.print("<table border='1' celspacing=12>");
						
						pw.print("<tr>");
							pw.print("<td align='left'>");
								pw.print("Username :");
							pw.print("</td>");
						
							pw.print("<td>");
								pw.print("<input type=text name='username' size=20>");
							pw.print("</td>");
							pw.print("</tr>");
                            pw.print("<tr>");
							 pw.print("<td algin='left'>");
								pw.print("Password :");
							pw.print("</td>");
                             pw.print("<td>");
								pw.print("<input type='password' name='password' size=20>");
							pw.print("</td>");
						pw.print("</tr>");
                        pw.print("<tr>");
                        pw.print("<td colspan='2' align='center'>");
                        pw.print("<input type='submit' value='Login'>");
                        pw.print("</td>");
                        pw.print("</tr>");

					pw.print("</table>");
                pw.print("</center>");
                
        pw.print("</form>");
        pw.print("</body>");
        pw.print("</html>");
    }
}