package org.example;

public class Main {
    public static void main(String[] args) {

        //Parte 1
        CalculatorOperation cal1 = new CalculatorOperation();

        cal1.setOperandOne(10.5);
        cal1.setOperandTwo(5.2);
        cal1.setOperation("+");

        cal1.performOperation();
        System.out.println("El resultado de la primera parte es: " + cal1.getResult());

        //Parte 2
        CalculatorResult cal2 = new CalculatorResult();
        cal2.performOperation(10.5);
        cal2.performOperation("+");
        cal2.performOperation(5.2);
        cal2.performOperation("*");
        cal2.performOperation(10);
        cal2.performOperation("*");
        cal2.performOperation(10);
        cal2.performOperation("/");
        cal2.performOperation(2);
        cal2.performOperation("-");
        cal2.performOperation(100);
        cal2.performOperation("=");

        System.out.println("El resultado de la segunda parte es: " + cal2.getResult());
    }
}