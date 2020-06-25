<%-- 
    Document   : register
    Created on : Jun 20, 2020, 6:37:08 PM
    Author     : Dinamo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTER</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">
        <form action="./Register" method="POST">
            <div class="form-group">
                <h2>Registration</h2>
                <label>FirstName</label>
                <input type="text" id="fname" name="fname" class="form-contol" required>
            </div>
            <div>
                <label>LastName</label>
                <input type="text" id="fname" name="lname" class="form-contol" required>
            </div>
            <div>
                <label>Address</label>
                <input type="text" id="address" name="address" class="form-contol" required>
            </div>
            <div>
                <label>Phone Number</label>
                <input type="text" id="phone" name="phone" class="form-contol" required>
            </div>
            <div>
                <label>Account</label>
                <input type="account" required>
            </div>
            <div>
                <label>Password</label>
                <input type="password" required>
            </div>    
            <div>
                <label for="email">Email</label>
                <input type="email" name="email" id="email" required>
            </div>
            <div>
                <label for="age">Age</label>
                <input type="number" name="age" id="age" min="1" max="99" step="1">
            </div>
            <div>
                <label for="date">Birthdate</label>
                <input type="date" name="date" id="date" min="1900-01-01">
            </div>
            <div>
                <div>
                    Gender
                    <div>
                        <label for="male">Male</label>
                        <input type="radio" name="gender" id="male" value="male">
                        <label for="female">Female</label>
                        <input type="radio" name="gender" id="female" value="female">
                    </div>
                <button type="reset">Reset</button>
                <button type="submit" class="btn btn-success" >Register</button>
            </div>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </form>
</body>
</html>
