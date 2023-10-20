<%@page import="com.jspiders.car_project.POJO.car_projectPOJO"%>
<%@page import="com.jspiders.car_project.POJO.PersonregPOJO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <jsp:include page="Navbar.jsp"></jsp:include>
   
    <%List<PersonregPOJO> persons=(List<PersonregPOJO>) request.getAttribute("persons"); %>
    <%car_projectPOJO car=(car_projectPOJO) request.getAttribute("car"); %>
    <%String msg=(String)request.getAttribute("msg"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <style>

.container {
  position: relative;
  max-width: 500px;
  width: 100%;
  background: #FCEDDA;
  padding: 25px;
  border-radius: 8px;
  box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
}

.container header {
  font-size: 1.2rem;
  color: #000;
  font-weight: 600;
  text-align: center;
}

.container .form {
  margin-top: 15px;
}

.form .input-box {
  width: 100%;
  margin-top: 10px;
}

.input-box label {
  color: #000;
}

.form :where(.input-box input, .select-box) {
  position: relative;
  height: 35px;
  width: 100%;
  outline: none;
  font-size: 1rem;
  color: #808080;
  margin-top: 5px;
  border: 1px solid #EE4E34;
  border-radius: 6px;
  padding: 0 5px;
  background: #FCEDDA;
}

.input-box input:focus {
  box-shadow: 0 1px 0 rgba(0, 0, 0, 0.1);
}

.form .column {
  display: flex;
  column-gap: 15px;
}

.form .gender-box {
  margin-top: 10px;
}

.form :where(.gender-option, .gender) {
  display: flex;
  align-items: center;
  column-gap: 50px;
  flex-wrap: wrap;
}

.form .gender {
  column-gap: 5px;
}

.gender input {
  accent-color: #EE4E34;
}

.form :where(.gender input, .gender label) {
  cursor: pointer;
}

.gender label {
  color: #000;
}

.address :where(input, .select-box) {
  margin-top: 10px;
}

.select-box select {
  height: 100%;
  width: 100%;
  outline: none;
  border: none;
  color: #808080;
  font-size: 1rem;
  background: #FCEDDA;
}

.form button {
  height: 40px;
  width: 100%;
  color: #000;
  font-size: 1rem;
  font-weight: 400;
  margin-top: 15px;
  border: none;
  border-radius: 6px;
  cursor: pointer;
  transition: all 0.2s ease;
  background: #EE4E34;
}

.form button:hover {
  background: #EE3E34;
}
#a{
	text-decoration: none;
	color: black;
}
#button{
 height: 40px;
  width: 100%;
  color: #000;
  font-size: 1rem;
  font-weight: 400;
  margin-top: 15px;
  border: none;
  border-radius: 6px;
  cursor: pointer;
  transition: all 0.2s ease;
  background: #EE4E34;
}
#button:hover {
	background: #EE3E34;
}
#del{
	background-color: blue;
	color: white;
	
}
#head {
    background-color: #333;
    color: #fff;
    text-align: center;
    padding: 20px 0;
}
footer {
    background-color: #333;
    color: #fff;
    text-align: center;
    padding: 10px 0;
}
#con{
	margin: 18px 0px 275px 0px;
}
body{
	background-color: #f2f2f2;
}

</style>
</head>
<body>
<section id="head">
        <!-- Same header content as homepage -->
    </section>
	<div align="center" >
		<section class="container" id="con">
        <header >Registration Form</header>
        <form class="form" action="./Reg" method="post">
            <div class="input-box">
                <label>Full Name</label>
                <input required placeholder="Enter full name" type="text" name="name" no>
            </div>
            <div class="input-box">
                <label>Email address</label>
                <input required="" placeholder="Enter Email address" type="email" name="email">
            </div>
            <div class="column">
                <div class="input-box">
                  <label>Phone Number</label>
                  <input required="" placeholder="Enter phone number" type="tel" name="contact" pattern="[0-9]{10}" maxlength="10">
                </div>
                <div class="input-box">
                  <label>Birth Date</label>
                  <input required="" placeholder="Enter birth date" type="date" name="date">
                </div>
            </div>
            <div class="gender-box">
              <label>Gender</label>
              <div class="gender-option">
                <div class="gender">
                  <input checked="" name="gender" id="check-male" type="radio" value="Male" >
                  <label for="check-male">Male</label>
                </div>
                <div class="gender">
                  <input name="gender" id="check-female" type="radio" value="Female" >
                  <label for="check-female">Female</label>
                </div>
                <div class="gender">
                  <input name="gender" id="check-other" type="radio" value="other">
                  <label for="check-other">Prefer not to say</label>
                </div>
              </div>
            </div>
            <div class="input-box address">
              <label>Address</label>
              <input required="" placeholder="Enter street address" type="text" name="address">
              <div class="column">
                <div class="select-box">
                  <select>
                    <option hidden="">Country</option>
                    <option>INDIA</option>
                    <option>USA</option>
                    <option>UK</option>
                    <option>Germany</option>
                    <option>Japan</option>
                  </select>
                </div>
              <input required="" placeholder="Enter your city" type="text" name="city">
              <input type="tel" name="cid" maxlength="3" placeholder="Enter your CarId">
              </div>
            </div>
            <input id="button" type="submit" value="REGISTER">
            <button><a  id="a"href="./showdata" method="get">Show Data</button>
        </form>
      </section>
      <script type="text/javascript">
		<% if(msg != null){ %>
		alert("<%=msg %> "); 
		<%} %>
		</script>
		<% if(persons != null){ %>
			<table id="tb" class="table table-striped">
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>EMAIL</th>
					<th>CONTACT</th>
					<th>ADDRESS</th>
					<th>Date</th>
					<th>Gender</th>
					<th>City</th>
					<th>CAR ID</th>
				
				</tr>
				<%for(PersonregPOJO person : persons) {%>
				
					<tr>
						<td><%=person.getId() %></td>
						<td><%=person.getName() %></td>
						<td><%=person.getEmail() %></td>
						<td><%=person.getContact() %></td>
						<td><%=person.getAddress() %></td>
						<td><%=person.getDate() %></td>
						<td><%=person.getGender() %></td>
						<td><%=person.getCity() %></td>
						
  <td>
  <form action="./srcar" method="post">
    <button type="submit" name="cid" value="<%=person.getCid() %>"><%=person.getCid() %></button>
    </form>
  </td>
  <td>
  <form action="./findreg" method="post">
    <button id="del" type="submit" name="id" value="<%=person.getId() %>">UPDATE</button>
    </form>
  </td>
  
  <td>
  <form action="./removereg" method="post">
    <button id="del" type="submit" name="id" value="<%=person.getId() %>">DELETE</button>
    </form>
  </td>
  


					</tr>
				
				<%} %>
			</table>
		
		<%} %>
		
		<% if(car != null) { %>
		<h2 align="center">CAR DETAIL</h2>
		<table class="table table-striped">
				<tr>
					<th>CID</th>
					<th>NAME</th>
					<th>PRICE</th>
					<th>YEAR</th>
					<th>COLOR</th>
					<th>MILEAGE</th>
				</tr>
				<tr>
					<td><%=car.getId() %></td>
					<td><%=car.getName() %></td>
					<td><%=car.getPrice() %></td>
					<td><%=car.getYear() %></td>
					<td><%=car.getColor() %></td>
					<td><%=car.getMileage() %></td>
				</tr>
				</table>
				
				<% } %>
			</div>
			<footer>
        <!-- Same footer content as homepage -->
    </footer>
</body>
</html>