package com.ticket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ticket.entity.Booking;
import com.ticket.entity.Ticket;
import com.ticket.entity.TicketTb;
import com.ticket.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private TicketService  ticketService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/save")
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		TicketTb ticketObj= new TicketTb();
		int size = ticket.getBookingRef().getNoOfTickets();
		ticketObj.setNoOfSeats(size);
		ticketObj.setSeatName(ticket.getSeatName());
		ticketObj.setBookingId(ticket.getBookingRef().getBookingId());
		ticketObj.setTicketStatus(ticket.isTicketStatus());
		ticketObj.setScreenName(ticket.getScreenName());
		ticketObj = ticketService.saveTicket(ticketObj);
		ticket.setTicketId(ticketObj.getTicketId());
		ticket.setNoOfSeats(ticketObj.getNoOfSeats());
		return ticket;
	}
	
	@GetMapping("/get")
	public List<Ticket> showAllTicket() {
		
		List<TicketTb> ticketObj= ticketService.getAllTickets();
		List<Ticket> tickets= new ArrayList<Ticket>();
		for(TicketTb ticketTb:ticketObj){
		Ticket temp=new Ticket();
		temp.setSeatName(ticketTb.getSeatName());
		temp.setBookingRef(restTemplate.getForObject("http://localhost:5088/booking/show/"+ticketTb.getBookingId(),Booking.class));
		temp.setTicketStatus(ticketTb.isTicketStatus());
		temp.setScreenName(ticketTb.getScreenName());
		temp.setTicketId(ticketTb.getTicketId());
		temp.setNoOfSeats(ticketTb.getNoOfSeats());
		tickets.add(temp);
		}
		return tickets;
	}
	
	@GetMapping("/get/{id}")
	public Ticket showTicket(@PathVariable("id") Long id) {
		
		TicketTb ticketTb= ticketService.getTicket(id);
		Ticket ticket= new Ticket();
		ticket.setSeatName(ticketTb.getSeatName());
		ticket.setBookingRef(restTemplate.getForObject("http://localhost:5088/booking/show/"+ticketTb.getBookingId(),Booking.class));
		ticket.setTicketStatus(ticketTb.isTicketStatus());
		ticket.setScreenName(ticketTb.getScreenName());
		ticket.setTicketId(ticketTb.getTicketId());
		ticket.setNoOfSeats(ticketTb.getNoOfSeats());
		return ticket;
	}
	
	@PutMapping("/update/{id}")
	public Ticket updateTicket(@PathVariable("id") Long id,@RequestBody Ticket ticket) {
		TicketTb ticketObj= ticketService.getTicket(id);
		int size = ticket.getBookingRef().getNoOfTickets();
		ticketObj.setNoOfSeats(size);
		ticketObj.setSeatName(ticket.getSeatName());
		ticketObj.setBookingId(ticket.getBookingRef().getBookingId());
		ticketObj.setTicketStatus(ticket.isTicketStatus());
		ticketObj.setScreenName(ticket.getScreenName());
		ticketObj = ticketService.saveTicket(ticketObj);
		ticket.setTicketId(ticketObj.getTicketId());
		ticket.setNoOfSeats(ticketObj.getNoOfSeats());
		
		return ticket;
	}
	@DeleteMapping("/delete/{id}")
	public String deleteTicket(@PathVariable("id") Long id) {
		TicketTb ticketObj= ticketService.getTicket(id);
		return ticketService.deleteTicket(ticketObj);
	}
}
