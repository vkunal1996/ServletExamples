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
        String user="";
        String pass="";
        String rpass="";
        String mname="";
        String fname="";
        String sex="";
        /*user=req.getParameter("username");
        pass=req.getParameter("password");
        rpass=req.getParameter("rpassword");
        mname=req.getParameter("mname");
        fname=req.getParameter("fname");
        sex=req.getParameter("Sex"); */
        
           
          
        
        
        if(user==null)
        {
            user="";
        }
        if(pass==null)
        {
            pass="";
        }
        if(rpass==null)
        {
            rpass="";
        }
        if(mname==null)
        {
            mname="";
        }
        if(fname==null)
        {
            fname="";
        }
        if(sex==null)
        {
            sex="";
        }
        pw.print("<p align='center'>");
            pw.print("<center>"+
                "<h1 id='heading'>User Information</h1>"+
                "User : "+user+""+
                    "<table border='0' cellspacing='12'>"+
                        "<tr>"+
                            "<td colspan=2 align=center>User Information"+
                            "</td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Username :</td>"+
                            "<td><input type=text name='username' size=25 value='"+user+"'></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Password :</td>"+
                            "<td><input type=password name='password' size=25 value='"+pass+"'></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Retype Password :</td>"+
                            "<td><input type=password name='rpassword' size=25  value='"+rpass+"'></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>MotherName :</td>"+
                            "<td><input type=text name='mname' size=25 value='"+mname+"'></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>FatherName :</td>"+
                            "<td><input type=text name='fname' size=25 value='"+fname+"'></td>"+
                        "</tr>"+
                        "<tr>"+
                                "<td colspan='2'>"+
                                    "<fieldset>"+
                                        "<legend>Sex</legend>"+
                                        "<input type='radio' name='Sex' value='"+sex+"'>Male"+
                                        "<input type='radio' name='Sex' value='"+sex+"'>Female"+
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
                    String uname=user;
                    HttpSession session2=req.getSession(true);
        session2.setAttribute("username",uname);
                    pw.print("</form>");
        pw.print("</body>");
        pw.print("</html>");

    }
}