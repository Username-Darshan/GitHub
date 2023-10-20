<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% String msg=(String) request.getAttribute("msg"); %>
    <% Integer ms=(Integer) request.getAttribute("cid"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">

		
/* Reset some default styles */
body, h1, h2, h3, p {
    margin: 0;
    padding: 0;
}

/* Global styles */
body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    color: #333;
}

header {
    background-color: #333;
    color: #fff;
    text-align: center;
    padding: 20px 0;
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

main {
    max-width: 1200px;
    margin: 0 auto;
    padding: 20px;
}

footer {
    background-color: #333;
    color: #fff;
    text-align: center;
    padding: 10px 0;
}

/* Car columns */


p {
    font-size: 16px;
    margin-bottom: 10px;
}

a {
    text-decoration: none;
    background-color: #333;
    color: #fff;
    padding: 10px 20px;
    border-radius: 5px;
    transition: background-color 0.3s ease;
}

a:hover {
    background-color: #FF5733;
}

/* Add animations to car-details.html */
.car-details {
    background-color: #fff;
    padding: 20px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    transition: transform 0.3s ease, box-shadow 0.3s ease;
    animation: fadeIn 1s ease;
}

@keyframes fadeIn {
    from {
        opacity: 0;
    }
    to {
        opacity: 1;
    }
}

.car-details img {
    max-width: 100%;
    margin-bottom: 10px;
    transition: transform 0.3s ease;
}

.car-details:hover {
    transform: scale(1.02);
    box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
}

/* .car-details:hover img {
    transform: scale(1.1);
} */
input{
	border-style: none;
}
		
</style>
<body>
		<header>
        <!-- Same header content as homepage -->
    </header>

    <main>
        <section class="car-details">
            <img src="https://r4.wallpaperflare.com/wallpaper/235/965/151/bently-wallpaper-f9d0184d413a4dcb16b768bf50a1c63d.jpg?timestamp=1695559590673" alt="Car 1">
            <h2>Bently Continental Gt twin-turbocharged petrol engines: a 4.0 litre V8 engine</h2>
            <form action="./addcars" method="post" method="get">
            <p>Name: <input value="Bently" name="name" readonly></p>
            <p>Price: <input value="7.30 Cr" name="price" readonly> </p>
            <p>Year: <input value="2011" name="year" readonly></p>
            <p>Color: <input value="Black" name="color" readonly></p>
            <p>Mileage: <input value="7.2kmpl" name="mileage" readonly></p>
            <p>Description: The Bentley Continental GT is an all-wheel drive and features a powerful and dynamic 12-cylinder engine that generates ample amounts of power and a respectable amount of torque, making it a perfect drive in any weather or road condition.</p>
        	<input type="submit" value="Add"><% if(msg != null ){ %><h3> <%=msg %><%=ms %></h3> <%} %>
        	 </form>
        	
        </section>
    </main>
    

    <footer>
        <!-- Same footer content as homepage -->
    </footer>
</body>
</html>