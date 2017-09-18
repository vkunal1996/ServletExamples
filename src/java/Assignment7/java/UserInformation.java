import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class UserInformation extends HttpServlet
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
        pw.print("<form action='./Correspondence' method='post'");
        
		
        pw.print("<p align='center'>");
            pw.print("<center>"+
                "<h1 id='heading'>User Information</h1>"+
                    "<table border='0' cellspacing='12'>"+
                        "<tr>"+
                            "<td colspan=2 align=center>User Information"+
                            "</td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Username :</td>"+
                            "<td><input type=text name='username' size=25></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Password :</td>"+
                            "<td><input type=password name='password' size=25></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Retype Password :</td>"+
                            "<td><input type=password name='rpassword' size=25></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>MotherName :</td>"+
                            "<td><input type=text name='mname' size=25></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>FatherName :</td>"+
                            "<td><input type=text name='fname' size=25></td>"+
                        "</tr>"+
                        "<tr>"+
                                "<td colspan='2'>"+
                                    "<fieldset>"+
                                        "<legend>Sex</legend>"+
                                        "<input type='radio' name='Sex' value='Male'>Male"+
                                        "<input type='radio' name='Sex' value='Female'>Female"+
                                    "</fieldset>"+
                                "</td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td colspan='2' align=right>"+
                            "<input type='submit' value='Submit'>"+
                            "</td>"+
                        "</tr>"+
                    "</table>"+
                    "</center>"    );
                    pw.print("</p>");
                   
                    pw.print("</form>");
        pw.print("</body>");
        pw.print("</html>");
		

    }
}