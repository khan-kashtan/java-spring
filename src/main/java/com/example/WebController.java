package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class WebController {
    @GetMapping("/employees")
    public String shlyapaNaVhode() {
        return "REST CONTrOLLER\n";
    }


    @GetMapping("/employees/{id}")
    EmployeeNotFoundException one(@PathVariable Long id) {
// <(``)
        return new EmployeeNotFoundException(id);
    }
}