# CalculadoraPOA

CalculadoraPOA é um projeto de calculadora de console desenvolvido em Java que demonstra a aplicação de importantes padrões de projeto e conceitos de engenharia de software, como o **Factory Method** e a **Programação Orientada a Aspectos (POA)** com AspectJ.

O objetivo principal deste projeto não é apenas criar uma calculadora funcional, mas também servir como um exemplo prático de como estruturar uma aplicação de forma limpa, desacoplada e extensível.

## ✨ Principais Conceitos Demonstrados

  * **Factory Method:** A criação de objetos de operação (soma, subtração, etc.) é centralizada em uma `operationFactory`. Isso desacopla o controlador principal das implementações concretas das operações, facilitando a adição de novas funcionalidades sem modificar o código existente.
  * **Programação Orientada a Aspectos (POA):** O projeto utiliza AspectJ para separar responsabilidades transversais, como o *logging*. Um aspecto (`LoggingAspect`) intercepta as chamadas de método para registrar um histórico detalhado de todas as operações realizadas, sem que a lógica de logging seja misturada com a lógica de negócio dos cálculos.
  * **Separação de Responsabilidades:** O código é organizado em pacotes distintos (`Controller`, `Factory`, `Operacoes`, `Aspects`), cada um com uma responsabilidade única, tornando o projeto mais fácil de entender e manter.
  * **Código Limpo e Coeso:** A aplicação segue princípios de código limpo, com classes pequenas e focadas, e uma clara definição de interfaces para garantir a coesão e o baixo acoplamento.

## 📂 Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

  * **`br.com.danil0r.poa`** (raiz do projeto)
      * `Main.java`: Ponto de entrada da aplicação. Responsável por interagir com o usuário, capturar as entradas e orquestrar o fluxo da calculadora.
  * **`br.com.danil0r.poa.controller`**
      * `calculatorController.java`: Atua como o controlador, gerenciando o estado da calculadora e coordenando a execução dos cálculos.
  * **`br.com.danil0r.poa.factory`**
      * `operationFactory.java`: Implementa o padrão Factory Method para criar e retornar a instância da operação matemática solicitada.
  * **`br.com.danil0r.poa.operacoes`**
      * `Operacao.java`: Interface que define o contrato para todas as operações matemáticas.
      * `Adicao.java`, `Subtracao.java`, `Multiplicacao.java`, `Divisao.java`: Implementações concretas para cada uma das operações.
  * **`br.com.danil0r.poa.aspects`**
      * `LoggingAspect.java`: Um aspecto AspectJ que intercepta a execução dos métodos de cálculo para criar um log detalhado de cada operação.

## 🚀 Como Executar

Para executar o projeto, siga os passos abaixo:

1.  **Pré-requisitos:**

      * Java JDK (versão 24 ou superior).
      * As bibliotecas do AspectJ (`aspectjrt.jar`, `aspectjtools.jar`, etc.) configuradas no classpath do seu projeto.

2.  **Compilação e Execução:**

      * Compile o projeto utilizando um compilador AspectJ (ajc).
      * Execute a classe `Main` a partir da sua IDE ou via linha de comando:
        ```bash
        java Main
        ```

3.  **Interação:**

      * O console solicitará que você digite o primeiro número.
      * Em seguida, você poderá inserir um operador (`+`, `-`, `*`, `/`) e o próximo número.
      * O cálculo continuará até que você digite `=` para finalizar e ver o resultado final.
      * Ao final da execução, um histórico completo de todas as operações será exibido.

## 🛠️ Dependências

  * **Java**: JDK 24
  * **AspectJ**: Versão 1.9.24 ou compatível

## 👨‍💻 Autor

  * **Danilo Ribeiro** - [Danil0Ribeir0](https://www.google.com/search?q=https://github.com/Danil0Ribeir0)

-----
