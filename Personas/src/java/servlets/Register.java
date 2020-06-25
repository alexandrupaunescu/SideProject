/*
 * Admin users servlet process the Insert, Delete, Update or Cancel actions of user
 */
package servlets;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Dinamo
 */
public class Register extends HttpServlet {
 
        private String fname = "";
        private String lname = "";
        private String address = "";
        private String phone = "";
        private String account ="";
        private String password = "";
        private String email = "";
        private String age = "";
        private String date = "";
        private String gender = "";
       
        
        
        
        public void Fname(String fname){
        this.fname = fname;
        }
        public void Lname(String lname){
        this.lname = lname;
        }
        public void Address(String address){
        this.address = address;
        }
        public void Phone(String phone){
        this.phone = phone;
        }
        public void Account(String account){
        this.account = account;
        }
        public void Password(String password){
        this.password = password;
        }
        public void Email(String email){
        this.email = email;
        }
        public void Age(String age){
        this.age = age;
        }
        public void Date(String date){
        this.date = date;
        }
        public void Gender(String gender){
        this.gender = gender;
        }
         
        
        
         protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // we'll need a DB connection for our insert, delete or update actions. To avoid redefinition of these we'll define it here
        String user = "test";
        String password = "1234";
        String url = "jdbc:derby://localhost:1527/persoane;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        // identify pushed button
       // if(request.getParameter("admin_users_insert") != null){
            //declare DB working variables
            Connection connection = null;
            PreparedStatement statement = null; // we need it for insert or update
            ResultSet resultSet = null;
            try{
                Class driverClass = Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
                String insertQuerry = "INSERT INTO REGISTRATION  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; // parameters for id, username, password and role
                statement = connection.prepareStatement(insertQuerry);
                statement.setString(1, getfname); // converts id from String to Smallint not int
                statement.setString(2, lname);
                statement.setString(3, address);
                statement.setString(4, phone);
                statement.setString(5, account);
                statement.setString(6, this.password);
                statement.setString(7, email);
                statement.setString(8, age);
                statement.setString(9, date);
                statement.setString(10, gender);
                statement.execute();
            }
             catch (ClassNotFoundException | SQLException ex)
            {
                ex.getMessage();
            }
            finally
            {
                if (resultSet != null)
                {
                    try
                    {
                        resultSet.close();
                    }
                    catch (SQLException ex){
                        ex.getMessage();
                    }
                }
                if (statement != null)
                {
                    try
                    {
                        statement.close();
                    }
                    catch (SQLException ex){
                        ex.getMessage();
                    }
                }	
                if (connection != null)
                {
                    try
                    {
                        connection.close();
                    }
                    catch (SQLException ex){
                        ex.getMessage();
            }
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
        return "Admin users servlet";
    }// </editor-fold>
         }
         
}
