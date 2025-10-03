package Operacoes;

public class Divisao implements Operacao {
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return a / b;
    }
}
