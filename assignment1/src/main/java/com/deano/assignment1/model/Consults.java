package com.deano.assignment1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@IdClass(Consults.class)
public class Consults implements Serializable {
    @Id
    private int pid;
    @Id
    private int did;
    @Id
    private int cid;
    private Date date;
    private String illness;
}
