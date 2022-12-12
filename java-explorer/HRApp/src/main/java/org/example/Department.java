package org.example;

public class Department {
    private  String name;
    private Employee[] employees = new Employee[10];
    private int index = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department name: " + name;
    }

    public void addEmployee(Employee employee) {
        if (index < employees.length) {
            index++;
            employees[index] = employee;
        }
    }

    public Employee[] getEmployees() {
        Employee[] currectEmployees = new Employee[index + 1];
        for (int i = 0; i < currectEmployees.length; i++) {
            currectEmployees[i] = employees[i];
        }
        return currectEmployees;
    }

    public int totalEmployees() {
        return index + 1;
    }

    public Employee getEmployee(int idNumber) {
        for (Employee employee: employees) {
            if (employee.getIdNumber() == idNumber) {
                return employee;
            }
        }
        return null;
    }

    public double getTotalEmployeesSalary() {
        double totalSalary = 0;
        if (index < 0) {return 0;};
        for (int i = 0; i <= index; i++){
            totalSalary += employees[i].getSalary();
        }
//        for (Employee employee: employees) {
//            System.out.println(employee);
//            totalSalary += employee.getSalary();
//        }
        return totalSalary;
    }

    public double employeesAverageSalary() {
        double averageSalary = getTotalEmployeesSalary();

        if (index < 0) {return 0.0;};
        averageSalary = averageSalary / (index + 1);
        return averageSalary;
    }
}
