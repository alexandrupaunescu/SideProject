/*
 * List of persons
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Formatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * List of persons
 *
 * @author Dinamo
 */
public class ListOfPersons extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListOfPersons</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListOfPersons at " + request.getContextPath() + "</h1>");
            String user = "test";
            String password = "1234";
            String url = "jdbc:derby://localhost:1527/persoane;create=true";
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            out.println("<table class=\"mytableheader\">");
            try {
                Class driverClass = Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
                statement = connection.createStatement();
                String query = "SELECT PERSOANE.CNP,PEROSANE.NAME,PERSOANE.SURNAME,PERSOANE.ADDRESS,PERSOANE.AGE,LOCALITATI.DESCRIPTION, LOCALITATI.DENUMIRE AS LOCALITATE,"
                        + "FROM PERSOANE, LOCALTATI, JUDETE\n"
                        + "WHERE PERSOANE.COD_LOCALITATE=LOCALITATI.COD AND LOCALITATI.COD.JUDET=JUDETE.COD_JUDET";
                resultSet = statement.executeQuery(query);
                if (resultSet != null) {
                    // format reprt header
                    //StringBuilder sb = new StringBuilder();
                    //Formatter formatter = new Formatter(sb, Locale.US);
                    //formatter.format("%1$-13s %2$-25s %3$-25s %4$-6s %5$-15s %6$-15s", "CNP", "NUME", "PRENUME", "VARSTA", "DENUMIRE LOCALITATE", "DENUMIRE JUDET");
                    // System.out.println(currentCNP +currentPersaoneNume + currentPersaonePrenume +currentpersaoneVarsta +current);
                    out.println("<tr><td>CNP</td><td>NUME</td><td>PRENUME</td><td>ADRESA</td><td>LOCALITATEA</td>");
                    //out.println("=========" + "==================" + "=====================" + "==============" + "=============");
                    //out.println("<br>");
                    //display the content of table row by row
                    while (resultSet.next()) {
                        String currentCNP = resultSet.getString(1);
                        String currentPersoaneNume = resultSet.getString(2);
                        String currentPersoanePrenume = resultSet.getString(3);
                        String currentPersoaneAddress = resultSet.getString(4);
                        String currentLocalitatiDenumire = resultSet.getString(5);
                        String currentJudeteDenumire = resultSet.getString(6);
                        out.println("<tr><td>" + currentCNP + "</td><td>" + currentPersoaneNume + "</td><td>" + currentPersoanePrenume + "</td><td>" + currentPersoaneAddress + "</td><td>" + currentLocalitatiDenumire + "</td><td>" + currentJudeteDenumire + "</td></tr>");
                        //sb = new StringBuilder();
                        //formatter = new Formatter(sb, Locale.US);
                        //formatter.format("%1$-13s %2$-25s %3$-25s %4$-6s %5$-15s %6$-15s", currentCNP, currentPersoaneNume, currentPersoanePrenume, currentPersoaneVarsata, currentLocalitatiDenumire, currentJudeteDenumire);
                        //System.out.println(sb.toString());
                        //out.println(sb.toString());
                        //out.println("<br>");
                    }
                    out.println("</table>");
                } else {
                    System.out.println("No rows found in ResultSet");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                ex.getMessage();
            } finally {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException ex) {
                        //   System.out.println("SQL exception:" + ex.getMessage());
                        ex.getMessage();
                    }
                }
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException ex) {
                        ex.getMessage();
                        // System.out.println("SQL exception:" + ex.getMessage());
                    }
                }
                if (connection != null) {
                    try {

                        connection.close();
                    } catch (SQLException ex) {
                        ex.getMessage();
                        // System.out.println("SQL exception:" + ex.getMessage());
                    }
                }
            }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListOfPersons.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Servlet display the list of persons from persons DB.";
    }// </editor-fold>

}
