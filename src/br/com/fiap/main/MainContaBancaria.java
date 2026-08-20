package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.exceptions.SaldoInsuficienteException;

public class MainContaBancaria {
    static void main() {
        ContaBancaria conta = new ContaBancaria(1000);

        try {
            conta.sacar(700);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
