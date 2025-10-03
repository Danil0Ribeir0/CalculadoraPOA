package Controller;

import Factory.operationFactory;
import Operacoes.*;


public class calculatorController {
    private double num1;
    private final operationFactory factory;

    public calculatorController(operationFactory factory) {
        this.factory = factory;
    }

    public void setNum1(double num1) {this.num1 = num1;}
    public double getNum1() {return num1;}

    public double executarCalculo(double num2,String op) {
        Operacao operacao = factory.criarOperacao(op);

        num1 = operacao.calcular(num1, num2);

        return num1;
    }
}
