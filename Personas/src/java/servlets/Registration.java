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
import static javax.ws.rs.core.Response.status;
import static javax.ws.rs.core.Response.status;


/**
 *
 * @author Dinamo
 */
public class Registration extends HttpServlet {
 
        private String fname = "";

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
        private String lname = "";
        private String address = "";
        private String phone = "";
        private String account ="";
        private String password = "";
        private String email = "";
        private String age = "";
        private String date = "";
        private String gender = "";
         protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
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
                statement = connection.prepareStatement("INSERT INTO REGISTRATION(FNAME,LNAME,ADDRESS,PHONE,ACCOUNT,PASSWORD,EMAIL,AGE,DATE,GENDER)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                statement.setString(1, getFname()); // converts id from String to Smallint not int
                statement.setString(2, getLname());
                statement.setString(3, getAddress());
                statement.setString(4, getPhone());
                statement.setString(5, getAccount());
                statement.setString(6, getPassword());
                statement.setString(7, getEmail());
                statement.setString(8, getAge());
                statement.setString(9, getDate());
                statement.setString(10, getGender());
                statement.execute();
                int status = PreparedStatement.executeUpdate;
                if(!(status==0)){
                }
            } catch(ClassNotFoundException ex){
                
            }
         }
}