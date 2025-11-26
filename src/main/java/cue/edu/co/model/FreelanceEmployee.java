package cue.edu.co.model;


import cue.edu.co.payroll.FreelanceSalaryCalculator;

/**
 * Empleado freelance.
 * No implementa roles adicionales → no se le obliga a métodos que no necesita (ISP).
 */
public class FreelanceEmployee extends Employee {

    public FreelanceEmployee(String id, String name, double ratePerProject, int completedProjects) {
        super(id, name, new FreelanceSalaryCalculator(ratePerProject, completedProjects));
    }
}
