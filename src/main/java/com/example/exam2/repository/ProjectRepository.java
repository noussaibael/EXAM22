package com.example.exam2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.exam2.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
