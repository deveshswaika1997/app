<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<form action="ticketbook" method="post">

<h2 align="center">Movie Ticket Booking</h2>
<table><tr><td>Movie Name</td>
<td><input type="text" name="movieName" id="movieName"></td></tr>
<tr><td>Choose Circle:</td>
<td><select name="circle" id="circle">
<option value="King">King</option>
<option value="Queen">Queen</option>
</select></td></tr>

<tr><td> Number of Tickets:</td>
<td><input type="text" name="noOfTickets" id="noOfTickets"></td></tr>

<tr><td><input type="submit" value="Calculate Cost"></td>
</tr>
</table>
</form>

</body>
</html>
</body>
</html>