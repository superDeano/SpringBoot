package com.deano.assignment1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(Specialization.class)
public class Specialization implements Serializable {

    @Id
    private int did;

    @Id
    private String specialization;

    private Date start_date_of_specialization;
}
