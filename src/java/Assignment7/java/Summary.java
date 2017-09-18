import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.text.*;
public class Summary extends HttpServlet
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
         pw.println("Good");
        pw.print("<h1 id='heading'>Welcome</h1>");
		String hintq=req.getParameter("hintquestion");
		String hinta=req.getParameter("HintAnswer");
		String em=req.getParameter("Email");
		String alt=req.getParameter("AltEmail");
        HttpSession session=req.getSession(true);
		session.setAttribute("Email",em);
		session.setAttribute("AltEmail",alt);
        pw.println("Name        : "+session.getAttribute("username")+"<br>");
		pw.println("Password    : "+session.getAttribute("password")+"<br>");
		pw.println("Mother Name : "+session.getAttribute("mname")+"<br>");
		pw.println("Father Name : "+session.getAttribute("fname")+"<br>");
		pw.println("Sex         : "+session.getAttribute("Sex")+"<br>");
		pw.println("Address Per : "+session.getAttribute("per")+"<br>");
		pw.println("Altenative  : "+session.getAttribute("corr")+"<br>");
		pw.println("Hint Quest  : "+session.getAttribute("hintquestion")+"<br>");
		pw.println("Hint Answer :"+session.getAttribute("HintAnswer")+"<br>");
		pw.println("Email       : "+session.getAttribute("Email")+"<br>");
		pw.println("Alternative : "+session.getAttribute("AltEmail")+"<br>");
		
		Date creationTime = new Date(session.getCreationTime() );
            Date lastAccessed = new Date(session.getLastAccessedTime());
            Date now = new Date();
            DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        
            /*out.println(session.getId()+"<br>");
            out.println(session.getCreationTime()+"<br>");
            out.println(session.getLastAccessedTime()+"<br>");*/
            pw.println("<h2>Session Creation and Last-Accessed Time</h2>");
            pw.println("The time and date now is: " + formatter.format(now) + "<br><br>");
            pw.println("The session creation time:  " + formatter.format(creationTime) + "<br><br>");
            pw.println("The last time the session was accessed:  " + formatter.format(lastAccessed) );
        pw.print("</body>");
        pw.print("</html>");

    }
}