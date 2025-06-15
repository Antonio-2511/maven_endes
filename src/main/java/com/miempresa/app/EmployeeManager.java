package com.miempresa.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona una lista de empleados.
 * Permite añadir empleados y mostrarlos por consola.
 * Parte de la refactorización del ejercicio 3 del RA4.
 * 
 * @author Antonio
 * @version 1.0
 */
public class EmployeeManager {
	
	private List<Employee> employees;

    /**
     * Constructor. Inicializa la lista de empleados vacía.
     */
    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    /**
     * Añade un nuevo empleado a la lista.
     * 
     * @param name  Nombre del empleado
     * @param years Años que lleva en la empresa
     */
    public void addEmployee(String name, int years) {
        employees.add(new Employee(name, years));
        System.out.println(name + " añadido al sistema.");
    }

    /**
     * Imprime por consola la lista de empleados.
     * Muestra nombre y años en la empresa de cada uno.
     */
    public void printEmployees() {
        System.out.println("Lista de empleados:");
        for (Employee e : employees) {
            System.out.println(e.getName() + ", Años en la empresa: " + e.getYears());
        }
    }

}





