import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class ThirdPage extends HttpServlet
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
        pw.print("<form method=post>");
                pw.print("<center>");
					pw.print("<table>");
						
					
							
							
							try
							{
								if(prev.equals("oldhindi1"))
								{
									pw.print("Lata Mangeshkar");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Lata Mangeshkar");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Lata Mangeshkar");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
								
									else if(prev.equals("oldhindi2"))
								{
									pw.print("Asha Bhosley");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Asha Bhosley");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Asha Bhosley");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
										else if(prev.equals("oldhindi3"))
								{
									pw.print("Kishore Kumar");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Kishore Kumar");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Kishore Kumar");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
								
										else if(prev.equals("oldhindi4"))
								{
									pw.print("Mohammad Raffi");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Mohammad Raffi");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Mohammad Raffi");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
								
								
								else if(prev.equals("newhindi1"))
								{
									pw.print("Neha Kakkar");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Neha Kakkar");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Neha Kakkar");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
								
									else if(prev.equals("newhindi2"))
								{
									pw.print("Arijit Singh");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Arijit Singh");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Arijit Singh");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
								
									else if(prev.equals("newhindi3"))
								{
									pw.print("Atif Aslam");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Atif Aslam");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Atif Aslam");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
									else if(prev.equals("newhindi4"))
								{
									pw.print("Sonu Nigam");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Sonu Nigam");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Sonu Nigam");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
								
										else if(prev.equals("oldpunjabi1"))
								{
									pw.print("Kuldeep Manak");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Kuldeep Manak");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Kuldeep Manak");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
								
								else if(prev.equals("oldpunjabi2"))
								{
									pw.print("Gurdass Maan");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Gurdass Maan");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Gurdass Maan");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
								
									else if(prev.equals("oldpunjabi3"))
								{
									pw.print("Harbhajan Maan Maan");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Harbhajan Maan");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Harbhajan Maan");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
								
										else if(prev.equals("oldpunjabi4"))
								{
									pw.print("Hans Raj Hans");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Hans Raj Hans");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Hans Raj Hans");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
									else if(prev.equals("newpunjabi1"))
								{
									pw.print("Diljit Dosanjh");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Diljit Dosanjh");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Diljit Dosanjh");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
									else if(prev.equals("newpunjabi2"))
								{
									pw.print("Amrinder Gill");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Amrinder Gill");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Amrinder Gill");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
								
									else if(prev.equals("newpunjabi4"))
								{
									pw.print("Garry Sandhu");
									int a=1;
									sql="SELECT * FROM SongPath WHERE ID=?";
									st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
									st.setString(1,"Garry Sandhu");
									rs=st.executeQuery();
									rs.last();
									if(rs.getRow()==0)
									{
										pw.print("<alert type='success'>NoRecord</alert>");
										pw.print("No Record");
									}
									else
									{
									  sql="SELECT * FROM SongPath WHERE ID=?";
									  st=cn.prepareStatement(sql);
									  st.setString(1,"Garry Sandhu");
									  rs=st.executeQuery();
									
									
									
										while(rs.next())
										{
											pw.print("<tr>");
												pw.print("<th>");
													pw.print(""+rs.getString("SongName"));
												pw.print("</th>");
												pw.print("<td>");
													
													String urlSong=rs.getString("Path");
													pw.print("<audio controls>");
													pw.print("<source src='"+urlSong+"' type='audio/mpeg'>");
													pw.print("</audio>");
													
												pw.print("</td>");
											pw.print("</tr>");
										}
									pw.print("</select>");
									}
								}
										
							}catch(Exception e){}
							

					pw.print("</table>");
                pw.print("</center>");
                
        pw.print("</form>");
        pw.print("</body>");
        pw.print("</html>");
    }
}