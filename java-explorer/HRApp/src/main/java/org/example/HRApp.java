package org.example;

public class HRApp {
    public static void main(String[] args) {

        Employee e1 = new Employee(12, "Luna1", 90000);
        Employee e2 = new Employee(32, "Luna2", 16000);
        Employee e3 = new Employee(453, "Luna3", 34000);
        Employee e4 = new Employee(14, "Luna4", 78000);
        Employee e5 = new Employee(75, "Luna5", 39000);

        System.out.println(e1.toString());

        Department d1 = new Department("IT");

        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d1.addEmployee(e3);
        d1.addEmployee(e4);
        d1.addEmployee(e5);

        Employee[] employees = d1.getEmployees();
        for (Employee employee: employees) {
            System.out.println("Empleados: " + employee.getName());
        }
        System.out.println("El salario total es de: " + d1.getTotalEmployeesSalary());
        System.out.println("El promedio del salario es de: " + d1.employeesAverageSalary());
    }
}