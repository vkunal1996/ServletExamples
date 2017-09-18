import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Sender extends HttpServlet
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
        pw.print("<form action ='./Reciever'method=post>");
                pw.print("<center>");
                pw.print("<h1><B>User Registration Form <B></h1><br>");
                    pw.print("<table border=0.0 cellspacing=2.0>");       
                         pw.print("<tr>");
                            pw.print("<th align=left>UserName :");
                            pw.print("</th>");
                            pw.print("<td><input type=text name='username' size=32 required>");
                            pw.print("</td>");
                        pw.print("</tr>");
                        
                        pw.print("<tr>");
                            pw.print("<th align=left>Password :");
                            pw.print("</th>");
                            pw.print("<td><input type=password name='userpass' size=32 required>");
                            pw.print("</td>");
                        pw.print("</tr>");
                        
                        pw.print("<tr>");
                            pw.print("<th align=left>Retype Password :");
                            pw.print("</th>");
                            pw.print("<td><input type=password name='userrepass' size=32 required >");
                            pw.print("</td>");
                        pw.print("</tr>");
                        pw.print("<tr>");
                        pw.print("<td colspan=2>");
                            pw.print("<fieldset>");
                                pw.print("<legend>Sex</legend>");
                                pw.print("<input type=radio name='sex' value='Male' required >Male");
                                pw.print("<input type=radio name='sex' value='Female'>Female");
                            pw.print("</fieldset>");
                        pw.print("</td>");
                        pw.print("</tr>");

                            pw.print("<tr>");
                        pw.print("<td colspan=2>");
                            pw.print("<fieldset>");
                                pw.print("<legend>Marital Status</legend>");
                                pw.print("<input type=radio name='status' value='Married' required >Married");
                                pw.print("<input type=radio name='status' value='Single'>Single");
                            pw.print("</fieldset>");
                        pw.print("</td>");
                        pw.print("</tr>");
                        
                        pw.print("<tr>");
                            pw.print("<th align=left>Father Name :");
                            pw.print("</th>");
                            pw.print("<td><input type=text name='fname' size=32 required pattern=[A-z]+>");
                            pw.print("</td>");
                        pw.print("</tr>");
                        
                        pw.print("<tr>");
                            pw.print("<th align=left>Mother Name :");
                            pw.print("</th>");
                            pw.print("<td><input type=text name='mname'size=32reqired pattern=[A-z]+>");
                            pw.print("</td>");
                        pw.print("</tr>");
                        
                        pw.print("<tr rowspan=5>");
                            pw.print("<th align=left>Address:");
                            pw.print("</th>");
                            pw.print("<td><textarea rows='5' cols='29' name='address' required></textarea>");
                            pw.print("</td>");
                        pw.print("</tr>");
                        
                        pw.print("<tr>");
                            pw.print("<th align=left>Contact Number :");
                            pw.print("</th>");
                            pw.print("<td><input type=text name='contact'size=32 required pattern=[0-9]+>");
                            pw.print("</td>");
                        pw.print("</tr>");
                        
                        pw.print("<tr><th align='left'>Hint Question</th> <td><select name='options'><option>Choose..</option><option value='Q1'>What is your Pet name?</option><option value='Q2'>What is your Mother's Birth Town?</option><option value='Q3'>What is your favorite childhood's food?</option><option value='Q4'>Who is your favorite Author?</option></select></td></tr>");
                        
                        
                        pw.print("<tr><th align='left'>Hint Answer</th><td><input type='password'name='hintpassword' size='32' required></td></tr>");
                        
                        pw.print("<tr><td colspan=2 align='center'><input type='submit' value='Submit'></td></tr>");

                    pw.print("</table>");
                pw.print("</center>");
                
        pw.print("</form>");
        pw.print("</body>");
        pw.print("</html>");
    }
}