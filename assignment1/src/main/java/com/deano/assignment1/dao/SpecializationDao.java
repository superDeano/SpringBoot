package com.deano.assignment1.dao;

import com.deano.assignment1.model.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecializationDao extends JpaRepository<Specialization, Long> {
}
