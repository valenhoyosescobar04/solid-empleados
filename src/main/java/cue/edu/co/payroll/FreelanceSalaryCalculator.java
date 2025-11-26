package cue.edu.co.payroll;

/**
 * Calcula pago de freelance por proyecto.
 */
public class FreelanceSalaryCalculator implements SalaryCalculator {

    private final double ratePerProject;
    private final int completedProjects;

    public FreelanceSalaryCalculator(double ratePerProject, int completedProjects) {
        this.ratePerProject = ratePerProject;
        this.completedProjects = completedProjects;
    }

    @Override
    public double calculateSalary() {
        return ratePerProject * completedProjects;
    }
}
