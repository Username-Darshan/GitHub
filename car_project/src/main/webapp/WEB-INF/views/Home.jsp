<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style type="text/css">
 @charset "ISO-8859-1";

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
    max-width: 100%;
    margin: 0 ;
    padding: 0;
   
}

footer {
    background-color: #333;
    color: #fff;
    text-align: center;
    padding: 10px 0;
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
img{
	width: 100%;
}


.slider-container {
    position: relative;
    width: 100%;
    overflow: hidden;
}

.slider {
    display: flex;
    width: 300%; /* Adjust based on the number of slides */
    animation: slide-animation 9s infinite; /* Adjust duration as needed */
}

.slides {
    display: flex;
    flex-direction: row;
}

.slide {
    flex: 1;
}

img {
    width: 100vw;
    height: 100vh;
}

.slider-nav {
    position: absolute;
    bottom: 10px;
    left: 50%;
    transform: translateX(-50%);
    display: flex;
}

.slider-nav label {
    width: 15px;
    height: 15px;
    border-radius: 50%;
    background-color: #555;
    margin: 0 5px;
    cursor: pointer;
}

.slider-nav label:hover {
    background-color: #999;
}

input[type="radio"] {
    display: none;
}

@keyframes slide-animation {
    0% {
        transform: translateX(0%);
    }
    33.33% {
        transform: translateX(-33.33%);
    }
    66.67% {
        transform: translateX(-66.67%);
    }
    100% {
        transform: translateX(0%);
    }
}

input[type="radio"]:checked ~ .slider .slides {
    animation-play-state: paused;
}

input[type="radio"]:checked ~ .slider-nav label {
    background-color: #999;
}



 
 
 </style>
 
</head>
<body>
		<header>
        <h1>Welcome to CarDekho</h1>
        <nav>
            <ul>
                <li><a href="./Home">Home</a></li>
                <li><a href="./carlist">Car Listings</a></li>
               	<li><a href="./reg">Register</a></li>
                <li><a href="./logout">Logout</a></li>
            </ul>
        </nav>
    </header>
    
    <main>
         <div class="slider-container">
        <input type="radio" name="slider" id="slide1" checked>
        <input type="radio" name="slider" id="slide2">
        <input type="radio" name="slider" id="slide3">
        <!-- Add more inputs as needed for additional images -->
        
        <div class="slider">
            <div class="slides">
                <div class="slide" id="slide1">
                    <img src="https://c4.wallpaperflare.com/wallpaper/990/547/605/digital-art-futuristic-city-car-artwork-wallpaper-preview.jpg" alt="Car 1">
                </div>
                <div class="slide" id="slide2">
                    <img src="https://c4.wallpaperflare.com/wallpaper/632/790/513/digital-digital-art-artwork-city-lights-hd-wallpaper-preview.jpg" alt="Car 2">
                </div>
                <div class="slide" id="slide3">
                    <img src="https://c4.wallpaperflare.com/wallpaper/786/670/384/night-artwork-futuristic-city-science-fiction-wallpaper-preview.jpg" alt="Car 3">
                </div>
               
                <!-- Add more slides as needed -->
            </div>
        </div>

        <div class="slider-nav">
            <label for="slide1"></label>
            <label for="slide2"></label>
            <label for="slide3"></label>
            <!-- Add more labels as needed for additional images -->
        </div>
    </div>
    </main>

    <footer>
        <p>&copy; 2023 CarDekho</p>
    </footer>
</body>
</html>