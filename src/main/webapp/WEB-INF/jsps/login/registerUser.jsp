<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register User</title>
</head>
<body>
    <form action="registerUser" method="post">
        <pre>
            <h2>User Registration:</h2>
            First Name: <input type="text" name="firstName"/>
            Last Name: <input type="text" name="lastName"/>
            Email: <input type="text" name="email"/>
            Password: <input type="password" name="password"/>
            Confirm Password: <input type="password" name="confirmPassword"/>
            <input type="submit" value="register"/>
        </pre>
    </form>
</body>
</html>
