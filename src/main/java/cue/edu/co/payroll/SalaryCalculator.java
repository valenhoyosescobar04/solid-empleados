package cue.edu.co.payroll;

/**
 * DIP: Employee depende de esta interfaz, no de una implementación concreta.
 * ISP: Solo tiene un método.
 */
public interface SalaryCalculator {

    double calculateSalary();
}
