import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
public class AdminLogin extends HttpServlet
{
    Connection cn;
    PreparedStatement st;
    ResultSet rs;
    String sql;
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
		String pr=req.getParameter("options1");
	   pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>Welcome to Servlet Example</title>");
        pw.print("<style>body {background: yellow;color:navy;}#heading{background:pink;color:white;border-style: inset;font-family: sans-serif;font-size: 50px;}</style></head>");
        
        pw.print("<body bgcolor='yellow' text='navy'>");
        

       
	   
       
        try
        {
			
        
        
                    pw.print("<center>");
					if(pr.equals("songs"))
					{
					pw.print("<form method=post action='./UploadFiles' enctype='multipart/form-data'>");
                    pw.print("<h1 id='heading'>Upload Song Files</h1>");
                    pw.print("<table border='1' celspacing=12>");
						
						    
                            
                            
                            pw.print("<tr>");
                            pw.print("<td align='left'>");
				            pw.print("Song Name :");
							pw.print("</td>");
						
							pw.print("<td>");
				            pw.print("<input type=text name='SongName'size=20>");
							pw.print("</td>");
                            pw.print("</tr>");
                            
                            pw.print("<tr>");
                            pw.print("<td align='left'>");
                            pw.print("Artist Name :");
							pw.print("</td>");
						
							pw.print("<td>");
				            pw.print("<input type=text name='Artist' size=20>");
							pw.print("</td>");
                            pw.print("</tr>");
 
                            
                            pw.print("<tr>");
							pw.print("<td align='left'>");
				            pw.print("Upload File :");
							pw.print("</td>");
						
							pw.print("<td>");
				            pw.print("<input type=file name='SongFile'>");
							pw.print("</td>");
					        pw.print("</tr>");
                            
                                                       
                            
                       pw.print("<tr>");
                       pw.print("<td colspan=2 align='center'>");
                       pw.print("<input type='submit' value='Submit'>");
                       pw.print("</td>");
                       pw.print("</tr>");
					}
					else if(pr.equals("artist"))
					{
						pw.print("<form method=post action='./UploadArtist'>");
						pw.print("<h1 id='heading'>Upload Artist</h1>");
                    pw.print("<table border='1' celspacing=12>");
						
						    
                            
                            
                            pw.print("<tr>");
                            pw.print("<td align='left'>");
				            pw.print("Artist Name :");
							pw.print("</td>");
						
							pw.print("<td>");
				            pw.print("<input type=text name='ArtistName'size=20>");
							pw.print("</td>");
                            pw.print("</tr>");
                            
                            pw.print("<tr>");
                            pw.print("<td align='left'>");
                            pw.print("Category:");
							pw.print("</td>");
						
							pw.print("<td>");
				            pw.print("<input type=text name='Category' size=20>");
							pw.print("</td>");
                            pw.print("</tr>");
 
                            
                            
                            
                                                       
                            
                       pw.print("<tr>");
                       pw.print("<td colspan=2 align='center'>");
                       pw.print("<input type='submit' value='Submit'>");
                       pw.print("</td>");
                       pw.print("</tr>");
					}
                    pw.print("</table>");
                    
                    pw.print("</center>");
               
                
                pw.print("</form>");
                pw.print("</body>");
                pw.print("</html>");
        }catch(Exception e){pw.print(e.getMessage());}
    }
}