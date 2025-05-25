package com.cancikrikci.app.hr.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "trainings")
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "training_id")
    public int id;

    @Column(name = "training_name", length = 150)
    public String trainingName;

    @Column(name = "training_date")
    public LocalDate trainingDate;

    @Column(name = "trainer", length = 100)
    public String trainer;

    @Column(name = "description")
    public String description;
} 