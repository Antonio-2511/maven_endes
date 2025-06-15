package com.miempresa.app;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
	
	private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(String name, int years) {
        employees.add(new Employee(name, years));
        System.out.println(name + " añadido al sistema.");
    }

    public void printEmployees() {
        System.out.println("Lista de empleados:");
        for (Employee e : employees) {
            System.out.println(e.getName() + ", Años en la empresa: " + e.getYears());
        }
    }
}





