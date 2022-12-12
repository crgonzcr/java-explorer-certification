package org.example;

import java.util.ArrayList;

public class CalculatorOperation {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;
    private ArrayList<Double> valores = new ArrayList<>();
    private ArrayList<String> operaciones = new ArrayList<>();

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void performOperation() {
        double result = 0;
        switch (operation) {
            case "+":
                result = operandOne + operandTwo;
                setResult(result);
                break;
            case "-":
                result = operandOne - operandTwo;
                setResult(result);
                break;
            case "*":
                result = operandOne * operandTwo;
                setResult(result);
                break;
            case "/":
                result = operandOne / operandTwo;
                setResult(result);
                break;
        }
    }

    public void performOperation(Double  valor) {
        valores.add(valor);
    }

    public void performOperation(int  valor) {
        Double d = (double) valor;
        valores.add(d);
    }

    public void performOperation(String  operacion) {
        operaciones.add(operacion);
    }

    public ArrayList<Double> getValores() {
        return valores;
    }

    public ArrayList<String> getOperaciones() {
        return operaciones;
    }

    public void setValores(ArrayList<Double> valores) {
        this.valores = valores;
    }

    public void setOperaciones(ArrayList<String> operaciones) {
        this.operaciones = operaciones;
    }
}
