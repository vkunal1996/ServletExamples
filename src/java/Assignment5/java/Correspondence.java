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
        
        String user="";
        String pass="";
        String fname="";
        String mname="";
        String sex="";
        String rpass="";
        
        /*String user=req.getParameter("username");
        String pass=req.getParameter("password");
        String rpass=req.getParameter("rpassword");
        String mname=req.getParameter("mname");
        String fname=req.getParameter("fname");
        String sex=req.getParameter("Sex");*/
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
        
        String permanent="";
        String correspondence="";
        permanent=req.getParameter("per");
        correspondence=req.getParameter("corr");
            if(permanent==null)
            {
                permanent="";
            }
                if(correspondence==null)
                {
                correspondence="";
                }
            
        
         pw.print("<p align='center'>");
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
                        
                            "<td align='right'><input type='submit' value='"+Buttons[0]+"'></td>"+
                            "<input type=hidden value='"+user+"' name='username'>"+
                            "<input type=hidden value='"+pass+"' name='password'>"+
                            "<input type=hidden value='"+rpass+"' name='rpassword'>"+
                            "<input type=hidden value='"+mname+"' name='mname'>"+
                            "<input type=hidden value='"+fname+"' name='fname'>"+
                            "<input type=hidden value='"+sex+"' name='Sex'>"+

                            "</form>"+
                            "<form action='./UserInformation' method=post>"+
                            "<input type=hidden value='"+user+"' name='username'>"+
                            "<input type=hidden value='"+pass+"' name='password'>"+
                            "<input type=hidden value='"+rpass+"' name='rpassword'>"+
                            "<input type=hidden value='"+mname+"' name='mname'>"+
                            "<input type=hidden value='"+fname+"' name='fname'>"+
                            "<input type=hidden value='"+sex+"' name='Sex'>"+
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