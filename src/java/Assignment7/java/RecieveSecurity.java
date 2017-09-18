import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class RecieveSecurity extends HttpServlet
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
        
        String action[]={"./Summary","./Correspondence"};
        String Buttons[]={"Submit","Previous"};
        String execute;
        pw.print("<body bgcolor='azure' text='navy'>");
        pw.print("<form action='./Summary' method='post'");
        String hintq=req.getParameter("hintquestion");
		String hinta=req.getParameter("HintAnswer");
		String em=req.getParameter("Email");
		String alt=req.getParameter("AltEmail");
		HttpSession session=req.getSession(true);
		session.setAttribute("hintquestion",hintq);
		session.setAttribute("HintAnswer",hinta);
		session.setAttribute("Email",em);
		session.setAttribute("AltEmail",alt);
         pw.print("<p align='center'>");
            pw.print("<center>"+
                "<h1 id='heading'>User Information</h1>"+
                    "<table border='0' cellspacing='12'>"+
                        "<tr>"+
                            "<td colspan=2 align=center>Security Questions"+
                            "</td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Hint Questions :</td>"+
                            "<td><input type=text name='HintAnswer' size=25 value='"+hintq+"'></td></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Hint Answer :</td>"+
                            "<td><input type=text name='HintAnswer' size=25 value='"+hinta+"'></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Email :</td>"+
                            "<td><input type=text name='Email' size=25 value='"+em+"'></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Alternate Email :</td>"+
                            "<td><input type=text name='AltEmail' size=25 value='"+alt+"'></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td align='right'><input type='submit' value='Proceed'></td>"+
								
                            "</form>"+
                            
                        "</tr>"+
                                            
                    "</table>"+
                    "</center>"    );
                     pw.print("</p>");
                    pw.print("</form>");
        pw.print("</body>");
        pw.print("</html>");

    }
}