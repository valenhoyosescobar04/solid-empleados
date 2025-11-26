package cue.edu.co.services;


import cue.edu.co.model.Employee;

import java.util.List;

/**
 * SRP: Este servicio solo se encarga de cálculos de nómina.
 * Trabaja con la abstracción Employee.
 */
public class PayrollService {

    public double calculateTotalMonthlyPayroll(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::calculateSalary)
                .sum();
    }

    public void printPayrollReport(List<Employee> employees) {
        System.out.println("=== Reporte de Nómina ===");
        for (Employee employee : employees) {
            System.out.println(
                    employee.getName() + " (" + employee.getClass().getSimpleName() + ")" +
                            " - Salario: " + employee.calculateSalary()
            );
        }
        System.out.println("==========================");
    }
}
