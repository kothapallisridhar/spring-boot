<html>
<head>
    <title>User SignIn</title>
</head>
<body>
<form action=account/signin method=POST>
    <div class="container">
        <h1>Sign In</h1>
        <p>Please fill in this form to create an account.</p>
        <hr>
        <label for="email"><b>Email</b></label>
        <input type="text" placeholder="Enter Email" name="email" id="email" required>
        <br>
        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" id="psw" required>
        <hr>

        <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
        <button type="submit" value="Sign In">Sign In</button>
    </div>
</form>
</body>
</html>