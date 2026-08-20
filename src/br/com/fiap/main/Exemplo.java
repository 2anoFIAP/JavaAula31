package br.com.fiap.main;

public class Exemplo {
    static void main() {
        try {
            int numero = 10 / 0;
        } catch (Exception e) {
            System.out.println("Erro generico: " + e.getMessage());
        }
    }
}
