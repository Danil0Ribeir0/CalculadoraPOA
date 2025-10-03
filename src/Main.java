import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculatorController controller = new calculatorController();

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        controller.setNum1(num1);

        System.out.println("Para finalizar a execução digite [=]!");
        while (true) {
            System.out.println("Operadores [+],[-],[*],[/]");
            System.out.print("Digite o operador: ");
            String op = sc.next();

            if (op.equals("=")) {
                System.out.println("Resultado final: "+controller.getNum1());
                break;
            }

            System.out.print("Digite o próximo número: ");
            double num2 = sc.nextDouble();

            try {
                double result = controller.executarCalculo(num2, op);
                System.out.println("Resultado parcial: "+result);
            } catch (Exception e) {
                System.out.println("Erro: "+ e.getMessage());
            }
        }

        sc.close();
    }
}