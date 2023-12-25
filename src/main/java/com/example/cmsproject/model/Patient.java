package com.example.cmsproject.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;
    private String name;
    private String gender;
    private int age;
    private String email;

    public Patient(String name, String gender, int age, String email) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }
}
