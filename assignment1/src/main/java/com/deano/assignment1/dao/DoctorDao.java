package com.deano.assignment1.dao;

import com.deano.assignment1.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDao extends JpaRepository<Doctor, Long> {
}
