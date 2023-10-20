<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="Navbar.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
.car-columns {
    display: flex;
    justify-content: space-between;
    flex-wrap: wrap;
   
    
}

.car-column {
    flex-basis: calc(33.33% - 20px);
    background-color: #fff;
    padding: 20px;
    margin: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    height: 100%;
    overflow: scroll;
   
    
}

h2 {
    font-size: 24px;
    margin-bottom: 10px;
}

.car-listing {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin-bottom: 20px;
}

.car-listing img {
    max-width: 100%;
    margin-bottom: 10px;
}

h3 {
    font-size: 20px;
    margin-bottom: 5px;
}

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
} 


		

</style>
</head>
<body>
    <header>
        <!-- Same header content as homepage -->
    </header>

    <main>
        <section class="car-columns">
            <div class="car-column">
                <h2>Muscle Cars</h2>
                <div class="car-listing">
                    <img src="https://r4.wallpaperflare.com/wallpaper/582/521/223/ford-mustang-car-muscle-cars-wallpaper-9be67c4d83d19fd905c4fbb95d4c2cc0.jpg?timestamp=1694970489834" alt="Muscle Car 1">
                    <h3>Ford Mustang GT Fastback 5.0L V8 enging</h3>
                    <p>Price: 74.61 lakh</p>
                    <a href="./Mustang">View Details</a>
                </div>

                <div class="car-listing">
                    <img src="https://r4.wallpaperflare.com/wallpaper/315/470/400/dodge-challenger-srt-black-muscle-car-rain-wallpaper-1251d2d06d767eeb9a58b2f58028f982.jpg?timestamp=1695324397861" alt="Muscle Car 2">
                    <h3>Challenger SRT Hellcat  Fastback 6.2L V8 enging</h3>
                    <p>Price: 1.30 Cr</p>
                    <a href="./SRT">View Details</a>
                </div>

                <!-- Add more muscle car listings as needed -->
            </div>

            <div class="car-column">
                <h2>Luxury Cars</h2>
                <div class="car-listing">
                    <img src="https://r4.wallpaperflare.com/wallpaper/796/705/245/rolls-royce-rolls-royce-cullinan-hd-wallpaper-6adc5fedefdbe77b2b072a5468658516.jpg?timestamp=1695559514456" alt="Luxury Car 1">
                    <h3>Rolls Royce Phantom</h3>
                    <p>Price: 10.2 Cr</p>
                    <a href="./Rolls-Royce">View Details</a>
                </div>

                <div class="car-listing">
                    <img src="https://r4.wallpaperflare.com/wallpaper/235/965/151/bently-wallpaper-f9d0184d413a4dcb16b768bf50a1c63d.jpg?timestamp=1695559590673" alt="Luxury Car 2">
                    <h3>Bently Continental Gt</h3>
                    <p>Price: 7.6 Cr</p>
                    <a href="./Bently">View Details</a>
                </div>
                

                <!-- Add more luxury car listings as needed -->
            </div>

            <div class="car-column">
                <h2>Sports Cars</h2>
                <div class="car-listing">
                    <img src="https://r4.wallpaperflare.com/wallpaper/788/784/913/bugatti-chiron-dream-car-black-wallpaper-99e018bde19a9ddb66b7086ff06126ed.jpg?timestamp=1695559671979" alt="Sports Car 1">
                    <h3>Bugatti-Chiron</h3>
                    <p>Price: 19.00 Cr</p>
                    <a href="./Bugati">View Details</a>
                </div>

                <div class="car-listing">
                    <img src="https://r4.wallpaperflare.com/wallpaper/825/184/17/car-vehicle-super-car-supercars-wallpaper-81ef861dd618a52b267c13ff241e812a.jpg?timestamp=1695559741948" alt="Sports Car 2">
                    <h3>Lamborgini</h3>
                    <p>Price: 4 Cr</p>
                    <a href="./Lamborgini">View Details</a>
                </div>

                <!-- Add more sports car listings as needed -->
            </div>
            <div class="car-column">
                <h2>Family Cars</h2>
                <div class="car-listing">
                    <img src="https://r4.wallpaperflare.com/wallpaper/377/708/910/hyundai-hyundai-i30-n-project-c-car-family-car-hatchback-hd-wallpaper-78568d68e0f07c48306c31be1812640a.jpg?timestamp=1695559803824" alt="Luxury Car 2">
                    <h3>Car Model Y</h3>
                    <p>Price: $75,000</p>
                    <a href="car-details.html">View Details</a>
                </div>
                <div class="car-listing">
                    <img src="https://r4.wallpaperflare.com/wallpaper/148/562/435/skoda-%C5%A0koda-superb-car-family-car-large-sized-car-hd-wallpaper-d96058ddb16afdab06b7487fa071067d.jpg?timestamp=1695559857356" alt="Luxury Car 2">
                    <h3>Car Model Y</h3>
                    <p>Price: $75,000</p>
                    <a href="car-details.html">View Details</a>
                </div>
                <!-- Family car listings go here -->
            </div>

            <div class="car-column">
                <h2>SUV Cars</h2>
                <div class="car-listing">
                    <img src="https://r4.wallpaperflare.com/wallpaper/634/597/281/luxury-suv-range-rover-velar-2017-4k-wallpaper-2f17f1e7c00138985cabec149f33f2cd.jpg?timestamp=1695559932978" alt="Luxury Car 2">
                    <h3>Car Model Y</h3>
                    <p>Price: $75,000</p>
                    <a href="car-details.html">View Details</a>
                </div>
                <div class="car-listing">
                    <img src="https://r4.wallpaperflare.com/wallpaper/725/227/663/mercedes-benz-container-g-class-tires-wallpaper-28e6cd8880401c38708c71fe58c2f49a.jpg?timestamp=1695560012888" alt="Luxury Car 2">
                    <h3>Car Model Y</h3>
                    <p>Price: $75,000</p>
                    <a href="car-details.html">View Details</a>
                </div>
                <!-- SUV car listings go here -->
            </div>
        </section>
    </main>

    <footer>
        <!-- Same footer content as homepage -->
    </footer>
</body>
</html>