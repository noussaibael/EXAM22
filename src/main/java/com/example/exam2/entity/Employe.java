package com.example.exam2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "employe")
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    @ElementCollection
    @CollectionTable(name = "employe_skill", joinColumns = @JoinColumn(name = "employe_id"))
    @Column(name = "skill")
    private List<String> skills;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToMany
    @JoinTable(
            name = "employe_project",
            joinColumns = @JoinColumn(name = "employe_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Set<Project> projects = new HashSet<>();

    public Employe() {
    }

    public Employe(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
