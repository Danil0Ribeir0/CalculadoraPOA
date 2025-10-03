package Factory;

import Operacoes.*;

public class operationFactory {
    public Operacao criarOperacao(String op) {
        return switch (op) {
            case "+" -> new Adicao();
            case "-" -> new Subtracao();
            case "*" -> new Multiplicacao();
            case "/" -> new Divisao();
            default -> throw new IllegalArgumentException("Operador inválido: " + op);
        };
    }
}
