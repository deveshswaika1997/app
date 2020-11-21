package com.pack.springbootapp2.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pack.springbootapp2.model.Booking;
import com.pack.springbootapp2.model.Customer;
import com.pack.springbootapp2.service.BookingService;

@Controller
public class HomeController {

	@Autowired
	BookingService bookingService;
	
	@RequestMapping(path="/ticketbook" , method=RequestMethod.GET)
	public String getTicketBooking() {
		return "ticketbooking";
	}
	
/*	@RequestMapping(path="/ticketbook" , method=RequestMethod.POST)
	public String postTicketBooking(@ModelAttribute Booking booking, Model model) {
		boolean flag = bookingService.makeBooking(booking);
		if(flag) {
			model.addAttribute("cost", booking.getCosts());
			return "report";
		}
		else {
		return "ticketbooking";
		}
	}*/
	
	@RequestMapping(path="/ticketbook" , method=RequestMethod.POST)
	public ModelAndView postTicketBooking(@ModelAttribute Booking booking) {
		boolean flag = bookingService.makeBooking(booking);
		if(flag) {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("report");
			mav.addObject("booking",booking);
			return mav;
		}
		else {
		return new ModelAndView("ticketbooking");
		}
	}
	
	List<String> locationlist = Arrays.asList(new String[]{"Kolkata","Mumbai","Others"});

	
	@RequestMapping(path="/register" , method=RequestMethod.GET)
	public String getRegister(Model model) {
		model.addAttribute("customer", new Customer());
		model.addAttribute("locationlist",locationlist);
		return "register";
	}
	
	
	@RequestMapping(path="/custregister" , method=RequestMethod.POST)
	public String postRegister(@ModelAttribute Customer customer , Model model) {
		if(customer.getPassword().length()>4)  
			return "success";
		else
		{   model.addAttribute("customer", new Customer());
		model.addAttribute("locationlist",locationlist);
			return "register";
		}
	}
	
	
}
