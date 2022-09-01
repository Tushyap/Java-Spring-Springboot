package com.ticket.service;

import java.util.List;

import com.ticket.entity.TicketTb;

public interface TicketService {

	public TicketTb saveTicket(TicketTb ticketTb);
	
	public List<TicketTb> getAllTickets();
	
	public TicketTb getTicket(Long ticketId);
	
	public TicketTb updateTicket(TicketTb ticketTb);
	
	public String deleteTicket(TicketTb ticketTb);
}
