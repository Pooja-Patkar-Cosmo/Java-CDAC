package com.employee;

import java.io.Serializable;

public abstract class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int id;
    private double salary;
    private String designation;

    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }
    public String getDesignation() { return designation; }

    @Override
    public String toString() {
        return String.format("ID: %-5d | Name: %-15s | Role: %-12s | Salary: $%.2f",
                id, name, designation, salary);
    }
}