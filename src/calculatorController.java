import Operacoes.*;

public class calculatorController {
    private double num1, num2;

    public void setNum1(double num1) {this.num1 = num1;}
    public double getNum1() {return num1;}

    public double executarCalculo(double num2,String op) {
        Operacao operacao;

        switch (op) {
            case "+":
                operacao = new Adicao();
                break;
            case "-":
                operacao = new Subtracao();
                break;
            case "*":
                operacao = new Multiplicacao();
                break;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida");
                }
                operacao = new Divisao();
                break;
            default:
                throw new IllegalArgumentException("Operador inválido: "+op);
        }

        num1 = operacao.calcular(num1, num2);
        return num1;
    }
}
