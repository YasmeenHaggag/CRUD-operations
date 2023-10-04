package com.example.JDBC.controller;

import com.example.JDBC.Repo.EmployeeRepo;
import com.example.JDBC.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class empController {
    @Autowired
    EmployeeRepo imp;

    //Web service
    @GetMapping("/count")
    int count() {
        return imp.countEmplyess();
    }

    //Web service
    @GetMapping("/delete")
    int deleted() {
        return imp.delete(1);
    }

    //Web service
    @GetMapping("/search{id}")
    employee search(@PathVariable int id) {
        return imp.search(id);
    }
}