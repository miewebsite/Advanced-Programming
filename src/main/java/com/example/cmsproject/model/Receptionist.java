package com.example.cmsproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Receptionist")
@NoArgsConstructor
public class Receptionist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int receptionistId;
    private String name;
    private String qualification;
    private float salary;

    public Receptionist(String name, String qualification, float salary) {
        super();
        this.name = name;
        this.qualification = qualification;
        this.salary = salary;
    }
    @OneToMany(mappedBy = "receptionist", cascade = 
CascadeType.PERSIST)
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator
.class,property="@id", scope = Patient.class)
}
