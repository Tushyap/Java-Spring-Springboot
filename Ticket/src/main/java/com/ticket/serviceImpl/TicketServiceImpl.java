package com.ticket.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.exception.ResourceNotFoundException;
import com.ticket.entity.TicketTb;
import com.ticket.repository.TicketRepository;
import com.ticket.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public TicketTb saveTicket(TicketTb ticketTb) {
		return ticketRepository.save(ticketTb);
	}

	@Override
	public List<TicketTb> getAllTickets() {
		return ticketRepository.findAll();
	}

	@Override
	public TicketTb getTicket(Long ticketId) {
		return ticketRepository.findById(ticketId)
				.orElseThrow(() -> new ResourceNotFoundException("Ticket", "ticketId", ticketId));
	}

	@Override
	public TicketTb updateTicket(TicketTb ticketTb) {
		return ticketRepository.save(ticketTb);
	}

	@Override
	public String deleteTicket(TicketTb ticketTb) {
		Long id = ticketTb.getTicketId();
		ticketRepository.delete(ticketTb);
		return "Ticket " + id + " deleted...";
	}

}
