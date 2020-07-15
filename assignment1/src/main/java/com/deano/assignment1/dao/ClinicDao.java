package com.deano.assignment1.dao;

import com.deano.assignment1.model.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicDao extends JpaRepository<Clinic, Long> {
}
