 <%-- 
    Document   : getallpersons
    Created on : Jun 8, 2020, 8:19:00 PM
    Author     : Dinamo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display all perosns</title>
        <link ref=\"stylesheet" type=\"text/css\" href=\"./css/mystyle.css\">
        
    </head>
    <body>
        <h1>List of persons</h1>
    <sql:setDataSource
                          var="snapshot"
                          driver="org.apache.derby.jdbc.ClientDriver"
                          url="jdbc:derby://localhost:1527/persoane;create=true"
                          user="test"
                          password="1234"/>
                          <sql:query dataSource="${snapshot}" var="result"> 
                              SELECT PERSOANE.CNP AS CNP,PERSOANE.NAME AS NAME,PERSOANE.SURNAME AS SURNAME,LOCALITATI.DENUMIRE AS LOCALITATE, JUDETE.DENUMIRE AS JUDET 
                              FROM PERSOANE, LOCALITATI, JUDETE 
                              WHERE PERSOANE.COD_LOCALITATE=LOCALITATI.COD AND LOCALITATI.COD_JUDET=JUDETE.COD_JUDETE
                          </sql:query>
                              <table class="mytableheader">
                              </tr>
                                  <c:forEach var="row" varStatus="loop" items="${result.rows}">
                                      <tr>
                                          <td><input type="checkbox" name="admin_users_checkbox" value="${row.isbn}"></td>
                                          <td><c:out value="${row.cnp}"/></td>
                                          <td><c:out value="${row.name}"/></td>
                                          <td><c:out value="${row.surname}"/></td>
                                          <td><c:out value="${row.localitate}"/></td>
                                          <td><c:out value="${row.judet}"/></td>
                                      </tr>
                                  </c:forEach>
                              </table>                      
    </body>
</html>
