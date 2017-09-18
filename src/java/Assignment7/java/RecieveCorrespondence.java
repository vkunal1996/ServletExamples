import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class RecieveCorrespondence extends HttpServlet
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
        
        String action[]={"./Security","./UserInformation"};
        String Buttons[]={"Submit","Previous"};
        String execute;
        pw.print("<body bgcolor='azure' text='navy'>");
        pw.print("<form action='./Security' method='post'");
        
        
        
			
            pw.print("<center>"+
                "<h1 id='heading'>User Information</h1>"+
                    "<table border='0' cellspacing='12'>"+
                        "<tr>"+
                            "<td colspan=2 align=center>Correspondence Address"+
                            "</td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Permanent Address :</td>"+
                            "<td><textarea rows=5 cols=29 name='per' placeholder='"+permanent+"'></textarea></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Correspondance Address :</td>"+
                            "<td><textarea rows=5 cols=29 name='corr' placeholder='"+correspondence+"'></textarea></td>"+
                            
                        "</tr>"+
                        
                        "<tr>"+
                        
                            "<td align='right'><input type='submit' value='Proceed'></td>"+
                                    
                        "</tr>"+
                                            
                    "</table>"+
                    "</center>"    );
                    pw.print("</p>");
                    pw.print("</form>");
        pw.print("</body>");
        pw.print("</html>");

    }
}