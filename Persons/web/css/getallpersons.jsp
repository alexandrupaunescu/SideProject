 <%-- 
    Document   : getallpersons
    Created on : Jun 8, 2020, 8:19:00 PM
    Author     : Dinamo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display all perosns</title>
        
    </head>
    <body>
        <h1>List of persons</h1>
        <astiro:connectdb dbconnection =" snapshot"
                          dbdriver ="org.apache.derby.jdbc.ClientDriver "
                          dburl ="jdbc:derby://localhost:1527/persoane;create=true "
                          dbusername ="test "
                          dbpassword ="1234"
    </body>
</html>
