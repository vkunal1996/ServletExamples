import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class Secondpage extends HttpServlet
{
		String sql;
		Connection cn;
		PreparedStatement st;
		ResultSet rs;
	public void MyConnection()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url="jdbc:sqlserver://localhost:1433;databaseName=Assignment3;user=vkunal1996;password=12345";
            cn=DriverManager.getConnection(url);
			/*Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment3?autoReconnect=true&useSSL=true","scarlet","Lmno1996&&");
			*/
        }catch(Exception e)
        {
            System.exit(0);
        }
    }
    public void Close()throws Exception
    {
        cn.close();
    }
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
		MyConnection();
       
		PrintWriter pw;
        res.setContentType("text/html");
        pw=res.getWriter();
		
		
		String prev=req.getParameter("options");

        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>Welcome to Servlet Example</title></head>");
        pw.print("<body bgcolor='yellow' text='navy'>");
        pw.print("<form method=post action='./ThirdPage'>");
                pw.print("<center>");
					pw.print("<table>");
						
						pw.print("<tr>");
							pw.print("<td>");
								pw.print("Choose");
							pw.print("</td>");
						
							pw.print("<td>");
							
							
							try
							{
								if(prev.equals("O1"))
								{
									
									sql="SELECT * FROM Singers WHERE Id=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"OldHindi");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
									}
									else
									{
										int a=1;
									  sql="SELECT * FROM Singers WHERE Id=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"OldHindi");
									  rs=st.executeQuery();
									
									pw.print("<select name='options'>");
									pw.print("<option>Choose..</option>");
										while(rs.next())
										{
											pw.print("<option value='oldhindi"+a+"'>"+rs.getString("Name")+"</option>");
											a++;
										}
									pw.print("</select>");
									}
								}
									else if(prev.equals("O2"))
									{
									sql="select * from Singers where Id=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"NewHindi");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
									}
									else
									{
										int a=1;
									  sql="select * from Singers where Id=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"NewHindi");
									  rs=st.executeQuery();
									
									pw.print("<select name='options'>");
									pw.print("<option>Choose..</option>");
										while(rs.next())
										{
											pw.print("<option value='newhindi"+a+"'>"+rs.getString("Name")+"</option>");
											a++;
										}
									pw.print("</select>");
									}
									}
									
									else if(prev.equals("O3"))
									{
										
									sql="select * from Singers where Id=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"OldPunjabi");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
									}
									else
									{
										int a=1;
									  sql="select * from Singers where Id=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"OldPunjabi");
									  rs=st.executeQuery();
									
									pw.print("<select name='options'>");
									pw.print("<option>Choose..</option>");
										while(rs.next())
										{
											pw.print("<option value='oldpunjabi"+a+"'>"+rs.getString("Name")+"</option>");
											a++;
										}
									pw.print("</select>");
									}
									}
								    
									else if(prev.equals("O4"))
									{
									
									sql="select * from Singers where Id=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"NewPunjabi");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
									}
									else
									{
										int a=1;
									  sql="select * from Singers where Id=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"NewPunjabi");
									  rs=st.executeQuery();
									
									pw.print("<select name='options'>");
									pw.print("<option>Choose..</option>");
										while(rs.next())
										{
											pw.print("<option value='newpunjabi"+a+"'>"+rs.getString("Name")+"</option>");
											a++;
										}
									pw.print("</select>");
									}
									}
									
										
							}catch(Exception e){}
							pw.print("</td>");
							
							pw.print("<td>");
								pw.print("<input type='submit' value='Submit'>");
							pw.print("</td>");
						pw.print("</tr>");

					pw.print("</table>");
                pw.print("</center>");
                
        pw.print("</form>");
        pw.print("</body>");
        pw.print("</html>");
    }
}