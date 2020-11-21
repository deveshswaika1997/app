package com.pack.springbootapp2.model;

public class Booking {
private String movieName;
private String circle;
private String noOfTickets;
private int costs;
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getCircle() {
	return circle;
}
public void setCircle(String circle) {
	this.circle = circle;
}
public String getNoOfTickets() {
	return noOfTickets;
}
public void setNoOfTickets(String noOfTickets) {
	this.noOfTickets = noOfTickets;
}
public int getCosts() {
	return costs;
}
public void setCosts(int costs) {
	this.costs = costs;
}

}
