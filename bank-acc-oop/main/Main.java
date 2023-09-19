package main;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int option = 1;
        while(option != 0){
            System.out.println("Bem vindo ao cadastro de cliente Conta Poupança. Digite os seguintes dados para prosseguir: ");
            System.out.println("Numero conta: ");
            int numeroConta = scan.nextInt();
            System.out.println("Numero do cliente");
            int numeroCliente = scan.nextInt();
            System.out.println("Nome do cliente: ");
            scan.nextLine();
            String nomeCliente = scan.nextLine();

            ContaPoupanca cpCadastroCliente = new ContaPoupanca(nomeCliente, numeroConta, numeroCliente);

            System.out.println("Seu saldo atual é: " + cpCadastroCliente.saldo);
            System.out.println("Deseja adicionar algum valor?. 0 para sair  e 1 para adicionar");
            double valorDigitadoCliente = scan.nextInt();
            if(valorDigitadoCliente == 1){
                System.out.println("Digite o valor para depositar: ");
                double valorDoCliente = scan.nextDouble();
                cpCadastroCliente.depositoConta(valorDoCliente);
                System.out.println("Valor digitado: " + valorDoCliente + " Novo valor: " + cpCadastroCliente.saldo);
                System.out.println("Obrigado por cadastrar. Dados da sua conta: ");
                System.out.println("Nome: "+cpCadastroCliente.nomeCliente);
                System.out.println("Saldo: "+cpCadastroCliente.saldo);
                System.out.println("Numero da conta: "+cpCadastroCliente.numeroConta);
                System.out.println("Numero Cliente: "+ cpCadastroCliente.numeroCliente);
                System.out.println("Data de abertura: " + cpCadastroCliente.dataAbertura);
            }
            else if(valorDigitadoCliente == 0){
                System.out.println("Obrigado por cadastrar. Dados da sua conta: ");
                System.out.println("Nome: "+cpCadastroCliente.nomeCliente);
                System.out.println("Saldo: "+cpCadastroCliente.saldo);
                System.out.println("Numero da conta: "+cpCadastroCliente.numeroConta);
                System.out.println("Numero Cliente: "+ cpCadastroCliente.numeroCliente);
                System.out.println("Data de abertura: " + cpCadastroCliente.dataAbertura);
            }
            System.out.println("Deseja fazer alguma outra operação 0 Não 1 Sim");
            option = scan.nextInt();
        }
    }
}
