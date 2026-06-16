package com.pragma.employeemanagement.model;

public class Employee {
    private String name;
    private String position;
    private double salary;
    private String department;

    public Employee(String name, String position, double salary, String department) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayEmployeeInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Cargo: " + position);
        System.out.println("Salario: " + salary);
        System.out.println("Departamento: " + department);
    }
}