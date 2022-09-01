package com.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.entity.TicketTb;

public interface TicketRepository extends JpaRepository<TicketTb , Long>{

}
