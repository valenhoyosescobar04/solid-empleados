package cue.edu.co.model;


import cue.edu.co.payroll.SalaryCalculator;

/**
 * SRP: Employee solo representa datos básicos y delega el cálculo de salario.
 * DIP: Depende de SalaryCalculator (interfaz), no de una clase concreta.
 */
public abstract class Employee {

    private final String id;
    private final String name;
    private final SalaryCalculator salaryCalculator;

    protected Employee(String id, String name, SalaryCalculator salaryCalculator) {
        this.id = id;
        this.name = name;
        this.salaryCalculator = salaryCalculator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * El cálculo del salario se delega a la estrategia SalaryCalculator.
     */
    public double calculateSalary() {
        return salaryCalculator.calculateSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
