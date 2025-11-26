package cue.edu.co.model;


import cue.edu.co.payroll.PartTimeSalaryCalculator;
import cue.edu.co.roles.TrainerRole;

/**
 * Empleado de medio tiempo.
 * También puede tener el rol de Trainer.
 */
public class PartTimeEmployee extends Employee implements TrainerRole {

    public PartTimeEmployee(String id, String name, double hourlyRate, int workedHours) {
        super(id, name, new PartTimeSalaryCalculator(hourlyRate, workedHours));
    }

    @Override
    public void train(String topic) {
        System.out.println("El empleado " + getName() + " está entrenando en el tema: " + topic);
    }
}
