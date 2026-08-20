package br.com.fiap.main;

import br.com.fiap.bean.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsaCalculadora {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String opcao = "";
        do {
            try {
                System.out.println("Digite um numero: ");
                float num1 = scan.nextFloat();
                System.out.println("Digite um segundo numero: ");
                float num2 = scan.nextFloat();

                Calculadora calc = new Calculadora();
                calc.setNumero1((num1));
                calc.setNumero2((num2));

                System.out.println("Escolha a operação:");
                System.out.println("1 - Adição");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                int opcaoMenu = scan.nextInt();

                switch (opcaoMenu) {
                    case 1:
                        System.out.println("O resultado da soma: " + calc.adicao());
                        break;
                    case 2:
                        System.out.println("O resultado da subtracao: " + calc.subtracao());
                        break;
                    case 3:
                        System.out.println("O resultado da multiplicacao: " + calc.multiplicacao());
                        break;
                    case 4:
                        try {
                            System.out.println("Resultado da divisao: " + calc.divisao());
                        } catch (ArithmeticException e) {
                            System.out.println("erro: " + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Opcao de menu invalida!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Voce digitou um caractere invalido. Digite apenas numeros!");
                scan.nextLine();
            }
            System.out.println("Deseja Continuar? (S/N)");
            opcao = scan.next();

        } while (opcao.equalsIgnoreCase("S"));
        System.out.println("Ate logo!");
        scan.close();
    }
}
