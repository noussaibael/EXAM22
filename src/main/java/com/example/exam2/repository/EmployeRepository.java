package com.example.exam2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.exam2.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}

