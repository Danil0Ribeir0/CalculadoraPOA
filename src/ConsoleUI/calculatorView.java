package ConsoleUI;

import java.util.InputMismatchException;
import java.util.Scanner;
import Controller.calculatorController;

public class calculatorView {
    private final calculatorController controller;
    private final Scanner sc;

    public calculatorView(calculatorController controller) {
        this.controller = controller;
        this.sc = new Scanner(System.in);
    }

    public void start() {
        System.out.print("Digite o primeiro número: ");
        double num1 = lerNumero();
        controller.setNum1(num1);

        System.out.println("Para finalizar a execução digite [=]!");
        while (true) {
            System.out.println("Operadores [+],[-],[*],[/]");
            System.out.print("Digite o operador: ");
            String op = sc.next();

            if (op.equals("=")) {
                System.out.println("Resultado final: " + controller.getNum1());
                break;
            }

            System.out.print("Digite o próximo número: ");
            double num2 = lerNumero();

            try {
                double result = controller.executarCalculo(num2, op);
                System.out.println("Resultado parcial: " + result);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        sc.close();
    }

    private double lerNumero() {
        while (true) {
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                sc.next(); // Limpa o buffer
                System.out.print("Tente novamente: ");
            }
        }
    }
}
