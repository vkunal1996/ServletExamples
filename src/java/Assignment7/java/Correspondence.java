import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Correspondence extends HttpServlet
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
        
                
		String user=req.getParameter("username");
		String pass=req.getParameter("password");
		String mn=req.getParameter("mname");
		String fn=req.getParameter("fname");
		String S=req.getParameter("Sex");
		HttpSession session=req.getSession(true);
		session.setAttribute("username",user);
		session.setAttribute("password",pass);
		session.setAttribute("mname",mn);
		session.setAttribute("fname",fn);
		session.setAttribute("Sex",S);
        Cookie cuser=new Cookie("cusername",req.getParameter("username"));
		cuser.setMaxAge(1000);
		res.addCookie(cuser);
		Cookie cpass=new Cookie("cpassword",req.getParameter("password"));
		cpass.setMaxAge(1000);
		res.addCookie(cpass);
        
			
            pw.print("<center>"+
                "<h1 id='heading'>User Information</h1>"+
                    "<table border='0' cellspacing='12'>"+
                        "<tr>"+
                            "<td colspan=2 align=center>Correspondence Address"+
                            "</td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Permanent Address :</td>"+
                            "<td><textarea rows=5 cols=29 name='per'></textarea></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Correspondance Address :</td>"+
                            "<td><textarea rows=5 cols=29 name='corr'></textarea></td>"+
                            
                        "</tr>"+
                        
                        "<tr>"+
                        
                            "<td align='right'><input type='submit' value='"+Buttons[0]+"'></td>"+
                            

                            "</form>"+
                            "<form action='./UserInformation' method=post>"+
                            "<td align='right'><input type='submit' value='"+Buttons[1]+"'></td>"+
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