package cue.edu.co.model;


import cue.edu.co.payroll.FullTimeSalaryCalculator;
import cue.edu.co.roles.ProjectManagerRole;

/**
 * Empleado de tiempo completo.
 * También puede tener el rol de Project Manager.
 */
public class FullTimeEmployee extends Employee implements ProjectManagerRole {

    public FullTimeEmployee(String id, String name, double monthlyBaseSalary, double bonus) {
        super(id, name, new FullTimeSalaryCalculator(monthlyBaseSalary, bonus));
    }

    @Override
    public void assignProject(String projectName) {
        System.out.println("El empleado " + getName() + " ha sido asignado al proyecto: " + projectName);
    }
}
