package bookmanagement.models;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Usuario {

    private String nome;
    private String email;
    private int codigoUsuario;
    private ArrayList<LivrosCadastrados> livrosAlugados;
    

    public Usuario(String nome, String email, int codigoUsuario) {
        this.nome = nome;
        this.email = email;
        this.codigoUsuario = codigoUsuario;
        this.livrosAlugados = new ArrayList<>();
    }

    public void adicionarLivroAlugado(LivrosCadastrados livro) {
        this.getLivrosAlugados().add(livro);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the codigoUsuario
     */
    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * @param codigoUsuario the codigoUsuario to set
     */
    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    /**
     * @return the livrosAlugados
     */
    public ArrayList<LivrosCadastrados> getLivrosAlugados() {
        return livrosAlugados;
    }

    /**
     * @param livrosAlugados the livrosAlugados to set
     */
    public void setLivrosAlugados(ArrayList<LivrosCadastrados> livrosAlugados) {
        this.livrosAlugados = livrosAlugados;
    }

    @Override
    public String toString() {
        return "Nome usuario: " + getNome()
                + "\nEmail: " + getEmail()
                + "\nid: : " + getCodigoUsuario();
    }
}
