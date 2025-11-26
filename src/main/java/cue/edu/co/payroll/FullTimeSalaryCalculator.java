package cue.edu.co.payroll;

/**
 * Calcula salario de empleado de tiempo completo.
 */
public class FullTimeSalaryCalculator implements SalaryCalculator {

    private final double monthlyBaseSalary;
    private final double bonus;

    public FullTimeSalaryCalculator(double monthlyBaseSalary, double bonus) {
        this.monthlyBaseSalary = monthlyBaseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return monthlyBaseSalary + bonus;
    }
}
