package br.com.fiap.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {
    static void main() {
        Scanner scan = new Scanner(System.in);
        try  {
            System.out.println("Digite um numero inteiro: ");
            int num0 = scan.nextInt();
            if (num0 < 1 || num0 > 10) {
                throw new Exception("Valor informado fora da faixa permitida");
            }
            System.out.println("Digite um segundo numero inteiro: ");
            int num1 = scan.nextInt();
            int numero = num0 / num1;
        } catch (ArithmeticException e) {
            System.out.println("Erro aritmetico: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro de conversao: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro generico: " + e.getMessage());
        } finally {
            scan.close();
            System.out.println("fim de programa"); // comandos que sempre querem ser executados, associado a coisas mais delicadas, por exemplo em banco de dados
        }
    }
}
