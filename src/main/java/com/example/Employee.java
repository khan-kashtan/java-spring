package com.example;

public class Employee {
    Long id = 0L;
    Employee(Long id) {
        this.id = id;
    }

    public Employee() {
    };

    public Long get() {
        return id;
    }

    public void set(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empl" + this.id;
    }
}
