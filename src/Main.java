import Controller.calculatorController;
import Factory.operationFactory;
import Aspects.LoggingAspect;
import ConsoleUI.calculatorView;

public class Main {
    public static void main(String[] args) {
        operationFactory factory = new operationFactory();
        calculatorController controller = new calculatorController(factory);
        calculatorView view = new calculatorView(controller);

        view.start();

        LoggingAspect.exibirHistorico();
    }
}