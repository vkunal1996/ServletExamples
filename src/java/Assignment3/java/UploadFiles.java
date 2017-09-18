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
public class UploadFiles extends HttpServlet
{
    Connection cn;
    PreparedStatement st;
    ResultSet rs;
    String sql;
    List <FileItem> items=null;
    String Song[]=new String[20];
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
        
         PrintWriter pw;
        res.setContentType("text/html");
        pw=res.getWriter();
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>Welcome to Servlet Example</title>");
        pw.print("<style>body {background: yellow;color:navy;}#heading{background:pink;color:white;border-style: inset;font-family: sans-serif;font-size: 50px;}</style></head>");
        
        pw.print("<body bgcolor='yellow' text='navy'>");

       
        try
        {

            try
            {
                items=new ServletFileUpload(new DiskFileItemFactory()).parseRequest(req);
            }catch(FileUploadException ee){throw new ServletException("cannot parse multipart");}
            int i=0;
            for(FileItem item:items)
            {
                if(item.isFormField())
                {
                    String fieldName=item.getString();
                    Song[i]=fieldName;
                    ++i;
                }
                else
                {
                    String fileName=FilenameUtils.getName(item.getName());
                    String nm=req.getContextPath();
                    File f=new File("/tomcat/webapps");
                    //pw.print(f.getAbsolutePath());
                    String newPath=f.getAbsolutePath()+nm;
                    //String nm=req.getPathTranslated();
                    File file=new File(newPath,fileName);
                        try
                        {
                            item.write(file);
                            MyConnection();
                            sql="insert into SongPath values(?,?,?)";
                    st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                            st.setString(1,Song[0]);
                            st.setString(3,Song[1]);
                            st.setString(2,fileName);
                            
                            st.executeUpdate();
                            pw.println("<h1>Song Uploaded SuccesFully</h1>");
                            cn.close();
                        }catch(Exception er){pw.print(er);}
                }
            }
        
        
            
                
            
                pw.print("</body>");
                pw.print("</html>");
        }catch(Exception e){pw.print(e.getMessage());}
		
		
    }
}