package com.example.exam2.controller;

import com.example.exam2.entity.Role;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @GetMapping
    public Role[] getAllRoles() {
        return Role.values();
    }
}

