package main;

public class ContaCorrente extends Conta{
    double limite;
    String gerente;
    double taxaMensal = 40;

    ContaCorrente(String nomeCliente, int numeroConta, int numeroCliente) {
        super(nomeCliente, numeroConta, numeroCliente);
        this.limite = 500;
        this.saldo = this.saldo - this.taxaMensal;
        this.gerente = "Clebervaldo";
    }
}
