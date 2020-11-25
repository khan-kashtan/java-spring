package com.example;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@Component
public class WebController {

    @GetMapping("/employees")
    public String all() {
        return "REST CONTrOLLER\n";
    }

    @GetMapping("/employees/{id}")
    public String one(@PathVariable Long id) {
        return new Employee(id).toString();

    }
}