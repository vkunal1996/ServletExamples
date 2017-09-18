/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author vkunal1996
 */
public class AdminLogin extends HttpServlet {

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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String username=request.getParameter("Username");
            String password=request.getParameter("Username");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            try
            {
            MyConnection();
            sql="Select * from AdminLogin where Username=? and Password=?";
            st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            st.setString(1,username);
            st.setString(2,password);
            rs=st.executeQuery();
            rs.last();
                if(rs.getRow()==0)
                {
                   out.println("Wrong Password");
                }
                    else
                    {
                        out.print("Success");
                    }
            }catch(Exception er){out.println(er.getMessage());}
            //out.println("<h1>Servlet AdminLogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
