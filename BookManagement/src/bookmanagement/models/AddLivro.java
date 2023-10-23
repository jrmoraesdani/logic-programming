package bookmanagement.models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddLivro {

    public static void addNovoLivro(Scanner scan, Biblioteca biblioteca) throws Exception {
        try {
            System.out.println("Digite os dados do livro :");
            System.out.println("Titulo: ");
            scan.nextLine();
            String titulo = scan.nextLine();
            System.out.println("Autor: ");
            String autor = scan.nextLine();
            System.out.println("Ano: ");
            String ano = scan.nextLine();
            System.out.println("Está disponivel?");
            boolean disponivel = scan.nextBoolean();
            System.out.println("Codigo do livro: ");
            scan.nextLine();
            String codigoLivro = scan.nextLine();
            System.out.println("Formato eBook ou Fisico?");
            String EbookOuFisico = scan.nextLine();

            for (LivrosCadastrados livro : biblioteca.livrosCadastrados) {
                if (livro.getCodigo() == codigoLivro) {
                    throw new Exception("Codigo do livro já existente!");
                }
            }

            LivrosCadastrados livro = new LivrosCadastrados(titulo, autor, ano, disponivel, codigoLivro, EbookOuFisico);

            biblioteca.livrosCadastrados.add(livro);
            System.out.println(livro.obterInformacoesDoLivro());

        } catch (InputMismatchException ex) {
            throw new Exception("Dado do livro fornecido é invalido. Tente novamente!");
        }
    }
}
