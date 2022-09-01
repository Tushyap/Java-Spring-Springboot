package org.globallogic.center.repository;

import org.globallogic.center.entity.DiagnosticResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticRepository extends JpaRepository<DiagnosticResponse,Long> {

}
