package org.globallogic.appointment.repository;

import org.globallogic.appointment.entity.AppointmentResponseTB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentResponseTB, Long>{

}
