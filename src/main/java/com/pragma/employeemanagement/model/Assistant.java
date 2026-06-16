package com.pragma.employeemanagement.model;

public class Assistant extends Employee {
    private String supervisor;

    public Assistant(String name, String position, double salary, String department, String supervisor) {
        super(name, position, salary, department);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Supervisor: " + supervisor);
    }
}