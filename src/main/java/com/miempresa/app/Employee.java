package com.miempresa.app;
/**
 * Clase que representa un empleado.
 * Contiene su nombre y los años que lleva en la empresa.
 * Refactorizada para el ejercicio 3 de Entornos de Desarrollo.
 * 
 * @author Antonio
 * @version 1.0
 */
public class Employee {
	
	private String name;
    private int years;

    /**
     * Constructor de la clase Employee.
     * 
     * @param name  Nombre del empleado
     * @param years Años en la empresa
     */
    public Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }

    /**
     * Devuelve el nombre del empleado.
     * 
     * @return nombre del empleado
     */
    public String getName() {
        return name;
    }

    /**
     * Devuelve los años que lleva en la empresa.
     * 
     * @return años en la empresa
     */
    public int getYears() {
        return years;
    }

	
	

}
