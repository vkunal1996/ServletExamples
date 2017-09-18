import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Security extends HttpServlet
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
         String user="";
        String pass="";
        String fname="";
        String mname="";
        String sex="";
        String rpass="";
        String permanent="";
        String correspondence="";
       /* String permanent=req.getParameter("per");
        String correspondence=req.getParameter("corr");
        String user=req.getParameter("username");
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
                            "<td><select name='hintquestion'><option>choose..</option><option value='What is your Favorite Food?'>What is your Favorite Food?</option><option value='Who is Your Favorite Teacher?'>Who is Your Favorite Teacher?</option><option value='What is Your Phone Number?'>What is Your Phone Number?</option><optionvalue='Which is your Favorite Animal ?'>Which is your Favorite Animal ?</option ></select></td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Hint Answer :</td>"+
                            "<td><input type=text name='HintAnswer' size=25</td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Email :</td>"+
                            "<td><input type=text name='Email' size=25</td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td>Alternate Email :</td>"+
                            "<td><input type=text name='AltEmail' size=25</td>"+
                        "</tr>"+
                        "<tr>"+
                            "<td align='right'><input type='submit' value='"+Buttons[0]+"'></td>"+
                            "<input type=hidden value='"+permanent+"' name='per'>"+
                             "<input type=hidden value='"+correspondence+"' name='corr'>"+
                             "<input type=hidden value='"+user+"' name='username'>"+
                            "<input type=hidden value='"+pass+"' name='password'>"+
                            "<input type=hidden value='"+rpass+"' name='rpassword'>"+
                            "<input type=hidden value='"+mname+"' name='mname'>"+
                            "<input type=hidden value='"+fname+"' name='fname'>"+
                            "<input type=hidden value='"+sex+"' name='Sex'>"+
                            "</form>"+
                            "<form action='./Correspondence' method=post>"+
                            "<input type=hidden value='"+permanent+"' name='per'>"+
                             "<input type=hidden value='"+correspondence+"' name='corr'>"+
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