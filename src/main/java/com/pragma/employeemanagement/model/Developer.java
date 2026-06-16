package com.pragma.employeemanagement.model;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String position, double salary, String department, String programmingLanguage) {
        super(name, position, salary, department);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Lenguaje de programación: " + programmingLanguage);
    }
}