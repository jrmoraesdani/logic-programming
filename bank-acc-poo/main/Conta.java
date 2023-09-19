package main;

import java.util.Date;

public abstract class Conta {
    String nomeCliente;
    int numeroConta;
    int numeroCliente;
    double saldo;
    Date dataAbertura = new Date();

    void saqueConta(double valor){
        this.saldo = this.saldo - valor;
    }
    void depositoConta(double valor){
        this.saldo = this.saldo + valor;
    }
    Conta(String nomeCliente, int numeroConta, int numeroCliente){
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.numeroCliente = numeroCliente;
        this.saldo=100;
    }
}
