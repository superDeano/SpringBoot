package com.deano.assignment1.dao;

import com.deano.assignment1.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDao extends JpaRepository<Patient, Long> {
}
