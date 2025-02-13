package com.rapifuzz.assignment.repositories;

import com.rapifuzz.assignment.entity.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IncidentRepository extends JpaRepository<Incident,String> {
    List<Incident> findByCreatedBy(Long createdBy);
    Incident findByIncidentNumberAndCreatedBy(String incidentNumber, Long userId);
}
