package com.pragma.employeemanagement.model;

public class Manager extends Employee {
    private String team;

    public Manager(String name, String position, double salary, String department, String team) {
        super(name, position, salary, department);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Equipo: " + team);
    }
}