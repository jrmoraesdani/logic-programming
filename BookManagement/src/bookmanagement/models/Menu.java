package bookmanagement.models;

import static bookmanagement.models.AddLivro.addNovoLivro;
import static bookmanagement.models.AddUsuario.addNovoUsuario;
import java.util.Scanner;

public class Menu {

    public static void menuOption(Scanner scan) throws Exception {
        Biblioteca biblioteca = new Biblioteca();
        int opcao = 0;
        do {
            try {
                System.out.println("----------------Bem vindo a Biblioteca Virtual!----------------");
                System.out.println("Escolha uma opção: " + "\n"
                        + "1 - Para fazer cadastro" + "\n"
                        + "2 - Para cadastrar um livro na biblioteca" + "\n"
                        + "3 - Alugar um livro" + "\n"
                        + "4 - Listar livros alugados" + "\n"
                        + "5 - Para sair " + "\n");
                opcao = scan.nextInt();
                switch (opcao) {
                    case 1:
                        addNovoUsuario(scan, biblioteca);
                        break;
                    case 2:
                        addNovoLivro(scan, biblioteca);
                        break;
                    case 3:
                        System.out.println("Digite o codigo do usuario: ");
                        int codigoUsuario = scan.nextInt();
                        System.out.println("Digite o nome do livro para alugar: ");
                        scan.nextLine();
                        String nomeLivro = scan.nextLine();
                        biblioteca.alugarUmLivro(codigoUsuario, nomeLivro);
                        break;
                    case 4:
                        biblioteca.listarLivrosAlugadosPorUsuario();
                        break;
                    case 5:
                        System.out.println("Programa finalizado...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (Exception ex) {
                System.out.println("ERRO! " + ex.getMessage());
                scan.nextLine();
            }
        } while (opcao != 5);
    }
}
