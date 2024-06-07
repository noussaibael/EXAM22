package com.example.exam2.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.apache.bcel.generic.Tag;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double budget;

    @ManyToMany(mappedBy = "projects")
    private Set<Employe> employees = new HashSet<>();

    public Project() {
    }

    public Project(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }


}
