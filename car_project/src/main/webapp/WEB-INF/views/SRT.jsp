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
            <img src="https://c4.wallpaperflare.com/wallpaper/315/470/400/dodge-challenger-srt-black-muscle-car-rain-wallpaper-preview.jpg" alt="Car 1">
            <h2>Challenger SRT Hellcat  Fastback 6.2L V8 enging</h2>
            <form action="./addcars" method="post" method="get">
            <p>Name: <input value="SRT" name="name" readonly></p>
            <p>Price: <input value="1.30 Cr" name="price" readonly> </p>
            <p>Year: <input value="2015" name="year" readonly></p>
            <p>Color: <input value="Black" name="color" readonly></p>
            <p>Mileage: <input value="6.2km/p" name="mileage" readonly></p>
            <p>Description: The SRT twins have standard leather finery, unique badging and gauge colors, and heated and ventilated front seats. Despite its roomy cabin, the plastics still look cheap, and visibility to the rear is poor. The Dodge held six carry-ons in its trunk and an impressive 15 total with the rear seat stowed.</p>
        	<input type="submit" value="Add"><% if(msg != null ){ %><h3> <%=msg %><%=ms %></h3> <%} %>
        	 </form>
        	
        </section>
    </main>
    

    <footer>
        <!-- Same footer content as homepage -->
    </footer>
</body>
</html>