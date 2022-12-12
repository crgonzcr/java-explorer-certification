package org.example;

public class Employee {
    private int idNumber;
    private String name;
    private  double salary;

    public Employee(int idNumber, String name, double salary) {
        this.idNumber = idNumber;
        this.name = name;
        this.salary = salary;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ("El id de " + name + " es " + idNumber + " y tiene un salario de " + salary);
    }
}
