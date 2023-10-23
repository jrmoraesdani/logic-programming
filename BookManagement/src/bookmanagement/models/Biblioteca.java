package bookmanagement.models;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    ArrayList<LivrosCadastrados> livrosCadastrados;
    ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livrosCadastrados = new ArrayList();
        this.usuarios = new ArrayList();
    }

    public void listarLivros() {
        livrosCadastrados.listIterator();
    }

    /*public void alugarUmLivro(int usuarioCodigo) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getCodigoUsuario() == usuarioCodigo) {
                System.out.println(usuario);
            }
        }
    }
     */
    public void alugarUmLivro(int usuarioCodigo, String nomeLivro) {
        Usuario usuarioEncontrado = null;
        LivrosCadastrados livroEncontrado = null;

        for (Usuario usuario : this.usuarios) {
            if (usuario.getCodigoUsuario() == usuarioCodigo) {
                usuarioEncontrado = usuario;
                break;
            }
        }
        for (LivrosCadastrados livro : this.livrosCadastrados) {
            if (livro.getTitulo().equalsIgnoreCase(nomeLivro) && livro.isDisponivel()) {
                livroEncontrado = livro;
                break;
            }
        }
        if (usuarioEncontrado != null && livroEncontrado != null) {
            usuarioEncontrado.adicionarLivroAlugado(livroEncontrado);
            System.out.println("Livro " + livroEncontrado.getTitulo() + " alugado para " + usuarioEncontrado.getNome());
        } else {
            System.out.println("Usuario ou livro não encontrado!");
        }
    }

    public void listarLivrosAlugadosPorUsuario() {
        if (this.usuarios.isEmpty() && this.livrosCadastrados.isEmpty()) {
            System.out.println("Nenhum usuario cadastrado ou livro cadastrado");
        } else {
            for (Usuario usuario : this.usuarios) {
                System.out.println("Livros alugados por " + usuario.getNome() + ": ");
                ArrayList<LivrosCadastrados> livrosAlugados = usuario.getLivrosAlugados();
                if (livrosAlugados.isEmpty()) {
                    System.out.println("Nenhum livro alugado por " + usuario.getNome());
                } else {
                    for (LivrosCadastrados livro : livrosAlugados) {
                        System.out.println(livro.getTitulo());
                    }
                }
            }
        }
    }
}
