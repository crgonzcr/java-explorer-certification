package org.example;

import java.util.ArrayList;

public class CalculatorResult extends CalculatorOperation implements java.io.Serializable{
    private boolean multiReady = false;
    private boolean divReady = false;

    public boolean isMultiReady() {
        return multiReady;
    }

    public void setMultiReady(boolean multiReady) {
        this.multiReady = multiReady;
    }

    public boolean isDivReady() {
        return divReady;
    }

    public void setDivReady(boolean divReady) {
        this.divReady = divReady;
    }

    public void executeOperation(int i ) {
        setOperandOne(getValores().get(i));
        setOperandTwo(getValores().get(i+1));
        setOperation(getOperaciones().get(i));
        performOperation();
        super.getResult();
        setValores(deleteElementValore(getValores(), i, i + 1, super.getResult()));
        setOperaciones(deleteElementOperaciones(getOperaciones(), i));
    }

    public ArrayList<Double> deleteElementValore(ArrayList<Double> originalArray, int index1, int index2, double newValue) {
        ArrayList<Double> valores = new ArrayList<>();
        for (int i = 0; i < originalArray.size(); i++) {
            if (i != index1 && i != index2) {
                valores.add(originalArray.get(i));
            } else if (i == index1) {
                valores.add(newValue);
            }
        }
        return valores;
    }

    public ArrayList<String> deleteElementOperaciones(ArrayList<String> originalArray, int index1) {
        ArrayList<String> operaciones = new ArrayList<>();
        for (int i = 0; i < originalArray.size(); i++) {
            if (i != index1) {
                operaciones.add(originalArray.get(i));
            }
        }
        return operaciones;
    }

    @Override
    public double getResult(){
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < getOperaciones().size(); i++) {
                System.out.println("La operacion es" + getOperaciones().get(i));
                if (getOperaciones().get(i).equals("*") || getOperaciones().get(i).equals("/")) {
                    if (!isMultiReady() && !isDivReady()) {
                        executeOperation(i);
                        i--;
                    }
                } else if (getOperaciones().get(i).equals("+") || getOperaciones().get(i).equals("-")) {
                    if (isMultiReady() && isDivReady()) {
                        executeOperation(i);
                        i--;
                    }
                }
            }
            setMultiReady(true);
            setDivReady(true);
        }
        return super.getResult();
    }
}
