package cue.edu.co;


import cue.edu.co.model.Employee;
import cue.edu.co.model.FreelanceEmployee;
import cue.edu.co.model.FullTimeEmployee;
import cue.edu.co.model.PartTimeEmployee;
import cue.edu.co.roles.ProjectManagerRole;
import cue.edu.co.roles.TrainerRole;
import cue.edu.co.services.PayrollService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creamos algunos empleados
        FullTimeEmployee fullTime = new FullTimeEmployee(
                "E001", "Ana TiempoCompleto", 3_000_000, 500_000
        );

        PartTimeEmployee partTime = new PartTimeEmployee(
                "E002", "Carlos MedioTiempo", 25_000, 80
        );

        FreelanceEmployee freelance = new FreelanceEmployee(
                "E003", "Luisa Freelance", 800_000, 3
        );

        // LSP: todos se manejan como Employee
        List<Employee> employees = new ArrayList<>();
        employees.add(fullTime);
        employees.add(partTime);
        employees.add(freelance);

        // Uso de roles específicos (ISP)
        ProjectManagerRole pm = fullTime; // FullTimeEmployee implementa ProjectManagerRole
        pm.assignProject("Sistema de Nómina 2025");

        TrainerRole trainer = partTime;   // PartTimeEmployee implementa TrainerRole
        trainer.train("Introducción a SOLID");

        // Servicio de nómina
        PayrollService payrollService = new PayrollService();
        payrollService.printPayrollReport(employees);

        double total = payrollService.calculateTotalMonthlyPayroll(employees);
        System.out.println("Total nómina mensual: " + total);
    }
}
