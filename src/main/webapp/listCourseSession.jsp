<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>
</head>
<body>
	<h1>Liste des courses dans les differentes sessions</h1>
    
    <br/><br/>
    <input id="myInput" type="text" placeholder="Search..">
    <form name="dropDownCities" action="" method="post">
    <select name="cityName" id="cityName" onchange="document.dropDownCities.submit()" >
    	<option></option>
    	<c:forEach  items="${listville}" var ="ville">
		  <option value="${ville.city}">${ville.city}</option>
		</c:forEach>
		<option value="%">all</option>
	</select>
	
	</form>
	<form name="choseDate" action="" method="post">
    <input name="dateCs"  onchange="document.choseDate.submit()" type="date">
	
	</form>
    <div>
      <table border="1">
      <thead>
        <tr>
          <th>ID</th>
          <th>StartDate</th>
          <th>End Date</th>
          <th>Max</th>
          <th>Course</th>
          <th>Location</th>
        </tr>
       </thead>
       <tbody id="myTable">
        <c:forEach  items="${coursesessions}" var ="csess">
        <tr>
          <td>${csess.id}</td>
          <td>${csess.startDate}</td>
          <td>${csess.endDate}</td>
          <td>${csess.max}</td>
          <td>${csess.course.title}</td>
          <td>${csess.location.city}</td>
        </tr>
        </c:forEach>
        </tbody>
      </table>
    </div>
</body>
</html>