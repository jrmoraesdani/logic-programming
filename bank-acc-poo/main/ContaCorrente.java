package main;

public class ContaCorrente extends Conta{
    double limite;
    int gerente;
    double taxaMensal;

    ContaCorrente(String nomeCliente, int numeroConta, int numeroCliente) {
        super(nomeCliente, numeroConta, numeroCliente);
    }
}
