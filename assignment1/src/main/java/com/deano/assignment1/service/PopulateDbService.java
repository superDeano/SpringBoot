package com.deano.assignment1.service;

import com.deano.assignment1.dao.*;
import com.deano.assignment1.model.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Random;

@Service
public class PopulateDbService {

    @Autowired
    private ClinicDao clinicDb;
    @Autowired
    private ConsultsDao consultsDb;
    @Autowired
    private DoctorDao doctorDb;
    @Autowired
    private PatientDao patientDb;
    @Autowired
    private SpecializationDao specializationDb;
    @Autowired
    private WorksInDao worksInDb;

    private final Random randomNumberGenerator;
    private final int MAX_NUM = 10;

    public PopulateDbService() {
        this.randomNumberGenerator = new Random();
    }

    private final String[] cities = {"Montreal", "Laval", "Brossard", "Longueuil", "Quebec", "Toronto", "Gatineau", "Ottawa"};
    private final String[] illnesses = {"Measles", "cancer", "fever", "Stroke", "Syphilis", "Vomiting", "cough", "Zika"};
    private final String[] specializations = {"ANESTHESIOLOGY", "ANESTHESIOLOGY", "FAMILY MEDICINE", "NEUROLOGY", "OPHTHALMOLOGY"};

    private String getRandomCity() {
        int index = randomNumberGenerator.nextInt(cities.length);
        return cities[index];
    }

    private String getRandomIllness(){
        return illnesses[randomNumberGenerator.nextInt(illnesses.length)];
    }

    private String getRandomSpecialization(){
        return specializations[randomNumberGenerator.nextInt(specializations.length)];
    }

    private Date getRandomDate() {
        return new Date(Math.abs(System.currentTimeMillis() - randomNumberGenerator.nextLong()));
    }

    private String getRandomWord() {
        String randomStrings;
        char[] word = new char[randomNumberGenerator.nextInt(8) + 3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
        for (int j = 0; j < word.length; j++) {
            word[j] = (char) ('a' + randomNumberGenerator.nextInt(26));
        }
        randomStrings = new String(word);
        return randomStrings;
    }

    public void populateDbs() {
        for (int i = 0; i <= MAX_NUM; i++) {
            doctorDb.save(new Doctor(i, getRandomWord(), getRandomCity()));
            clinicDb.save(new Clinic(i, getRandomWord(), getRandomCity()));
            patientDb.save(new Patient(i, getRandomWord(), getRandomCity(), randomNumberGenerator.nextInt(100)));
            worksInDb.save(new Works_in(randomNumberGenerator.nextInt(MAX_NUM), randomNumberGenerator.nextInt(MAX_NUM), randomNumberGenerator.nextInt(40)));
            consultsDb.save(new Consults(randomNumberGenerator.nextInt(MAX_NUM), randomNumberGenerator.nextInt(MAX_NUM), randomNumberGenerator.nextInt(MAX_NUM), getRandomDate(), getRandomIllness()));
            specializationDb.save(new Specialization(i, getRandomSpecialization(), getRandomDate()));
        }
    }
}
