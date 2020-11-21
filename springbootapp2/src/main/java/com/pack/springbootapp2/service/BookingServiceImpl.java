package com.pack.springbootapp2.service;

import org.springframework.stereotype.Service;

import com.pack.springbootapp2.model.Booking;

@Service
public class BookingServiceImpl implements BookingService {

	@Override
	public boolean makeBooking(Booking booking) {
		try {
		int totalCost =0;
		
		if(booking.getCircle().equals("King")) {
			totalCost = Integer.parseInt(booking.getNoOfTickets())*150;
			
		}
		if(booking.getCircle().equals("Queen")) {
			totalCost = Integer.parseInt(booking.getNoOfTickets())*250;
			
		}
		booking.setCosts(totalCost);
		return true;
		}
		catch(Exception e) { return false; }
		
	}

}
