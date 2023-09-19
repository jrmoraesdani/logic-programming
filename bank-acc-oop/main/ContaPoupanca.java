package main;

public class ContaPoupanca extends Conta{
    String dataAniversario;

    ContaPoupanca(String nomeCliente, int numeroConta, int numeroCliente) {
        super(nomeCliente, numeroConta, numeroCliente);
    }

    void saqueConta(double valor){
        if((this.saldo - valor) < 0){
            System.out.println("Não é possível efetual este saque. Saldo insuficiente" + this.saldo);
        }
        else{
            this.saldo = this.saldo - valor;
        }
    }
}
