package Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Aspect
public class LoggingAspect {
    public static final List<String> historico = new ArrayList<>();

    @Around("execution(* Controller.*.*(..)) || execution(* Operacoes.*.*(..))")
    public Object registrarOperacao(ProceedingJoinPoint joinPoint) throws Throwable {
        String metodo = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        StringBuilder log = new StringBuilder("Operação :"+metodo+" | Valores: ");
        for (Object arg : args) {
            log.append(arg).append(" ");
        }

        Object resultado = joinPoint.proceed();

        log.append("| Resultado: ").append(resultado);
        historico.add(log.toString());

        return resultado;
    }

    public static void exibirHistorico() {
        System.out.println("\n--- HISTÓRICO DE OPERAÇÕES ---");
        for(String registro : historico) {
            System.out.println(registro);
        }
        System.out.println("-------------------------------");
    }
}

