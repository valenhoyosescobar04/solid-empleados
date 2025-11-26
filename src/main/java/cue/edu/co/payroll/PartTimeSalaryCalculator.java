package cue.edu.co.payroll;

/**
 * Calcula salario de empleado de medio tiempo.
 */
public class PartTimeSalaryCalculator implements SalaryCalculator {

    private final double hourlyRate;
    private final int workedHours;

    public PartTimeSalaryCalculator(double hourlyRate, int workedHours) {
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workedHours;
    }
}
