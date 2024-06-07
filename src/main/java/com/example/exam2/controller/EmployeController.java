package com.example.exam2.controller;


import com.example.exam2.entity.Employe;
import com.example.exam2.entity.Project;
import com.example.exam2.repository.EmployeRepository;
import com.example.exam2.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employes")
public class EmployeController {

    @Autowired
    private EmployeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public List<Employe> getAllEmployes() {
        return employeeRepository.findAll();
    }

    @GetMapping
    public String getAllEmployees(Model model) {
        List<Employe> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "employee-list";
    }

    @PostMapping
    public Employe createEmployee(@RequestBody Employe employee) {
        return employeeRepository.save(employee);
    }

    @PostMapping("/affecter")
    public String affecterEmploye(String employeeId, String projectId, Model model) {
        // Récupérer l'employé et le projet correspondant aux IDs fournis
        Employe employee = employeeRepository.findById(Long.parseLong(employeeId)).orElse(null);
        Project project = projectRepository.findById(Long.parseLong(projectId)).orElse(null);

        // Vérifier si les employé et projet existent
        if (employee != null && project != null) {
            // Ajouter le projet à l'employé
            employee.getProjects().add(project);
            employeeRepository.save(employee);
            model.addAttribute("message", "Employé affecté au projet avec succès !");
        } else {
            model.addAttribute("error", "Employé ou projet introuvable !");
        }
        return "affectation";
    }
    /*
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        employeeRepository.deleteEmployeById(id);
        return "redirect:/employes";
    }*/
}

