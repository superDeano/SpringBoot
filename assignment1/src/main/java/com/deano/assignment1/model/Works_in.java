package com.deano.assignment1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToMany;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@IdClass(Works_in.class)
public class Works_in implements Serializable {

    @Id
    private int did;
    @Id
    private int cid;
    private float hours_per_week;

}
