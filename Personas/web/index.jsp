<%-- 
    Document   : index
    Created on : Jun 7, 2020, 5:55:06 PM
    Author     : Dinamo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PERSONS LOGIN</title>
        <link rel="stylesheet" type="text/css" href="./css/mystyle.css">
    </head>
    <body>
        <form action="./Login" method="POST">
            <table class="tablecenterdwithborder">
                <tr>
                    <td>Username:</td><td><input name="personas_login_username" type="text" ></td>
                </tr>
                <tr>
                    <td>Password:</td><td><input name="personas_login_password" type="password" ></td>
                </tr>
                <tr>
                    <td></td><td><input name="personas_login_login" type="submit" value="Login"></td>
                </tr>
                <tr>
                   <td></td><td><a href="register.jsp" class="btn btn-success">Registration</a></td>
                   <%--<td></td>Registration<td><input href="register.jsp" name="register.jsp" type="submit" value="Registration"></td>--%>
                   
                </tr>
            </table>
        </form>
    </body>
</html>
