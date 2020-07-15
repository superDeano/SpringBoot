package com.deano.assignment1.dao;

import com.deano.assignment1.model.Consults;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultsDao extends JpaRepository<Consults, Long> {
}
