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
        <link rel="stylesheet" type="text/css" href=".\\css\\mystyle.css"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    </head>
    <body>
        <form action="./Login" method="POST">
            <table class="tablecenterdwithborder">
                <tr>
                    <td>User name:</td><td><input name="personas_login_username" type="text" ></td>
                </tr>
                <tr>
                    <td>Password</td><td><input name="personas_login_password" type="password" ></td>
                </tr>
                <tr>
                    <td></td><td><input name="personas_login_login" type="submit" value="Login"></td><td><a href="register.jsp">Registration</a></td>
                </tr>
            </table>
        </form>
    </body>
</html>
