package bookmanagement.models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddUsuario {

    public static void addNovoUsuario(Scanner scan, Biblioteca biblioteca) throws Exception {
        try {
            System.out.println("Digite os dados de usuario :");
            System.out.println("Nome: ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.println("Email: ");
            String email = scan.nextLine();
            System.out.println("Codigo: ");
            int codigo = scan.nextInt();
            
            for(Usuario usuario : biblioteca.usuarios){
                if(usuario.getCodigoUsuario() == codigo){
                    throw new Exception("Codigo de usuário já existente");
                }
            }

            Usuario usuario = new Usuario(nome, email, codigo);

            biblioteca.usuarios.add(usuario);
            System.out.println(usuario);

        } catch (InputMismatchException ex) {
            throw new Exception("Dado invalido. Tente novamente!");
        }
    }
}
