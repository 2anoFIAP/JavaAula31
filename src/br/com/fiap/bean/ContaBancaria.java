package br.com.fiap.bean;

import br.com.fiap.exceptions.SaldoInsuficienteException;

public class ContaBancaria {
    // Atributos
    private double saldo;
    // Construtores
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
    // Metodos Getters/Setters
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // Metodos da classe
    public void sacar(double quantia) throws SaldoInsuficienteException {
        if (quantia > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque");
        }
        saldo -= quantia;
    }
}
