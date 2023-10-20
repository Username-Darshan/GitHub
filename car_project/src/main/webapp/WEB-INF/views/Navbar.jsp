<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	
/* Reset some default styles */


/* Global styles */
body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    color: #333;
}



nav ul {
    list-style-type: none;
    padding: 0;
}

nav ul li {
    display: inline;
    margin: 0 20px;
}

nav ul li a {
    text-decoration: none;
    color: #fff;
}






.nav_a {
    text-decoration: none;
    background-color: #333;
    color: #fff;
    padding: 10px 20px;
    border-radius: 5px;
    transition: background-color 0.3s ease;
}

.nav_a:hover {
    background-color: #FF5733;
}



/* .car-details:hover img {
    transform: scale(1.1);
} */

	

</style>
</head>
<body>
		 <nav>
            <ul>
                <li><a class="nav_a" href="./Home">Home</a></li>
                <li><a class="nav_a" href="./carlist">Car Listings</a></li>
                
                <li><a class="nav_a" href="./reg">Register</a></li>
                <li><a class="nav_a" href="./logout">Logout</a></li>
            </ul>
        </nav>
</body>
</html>