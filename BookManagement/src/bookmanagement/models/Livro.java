package bookmanagement.models;

/**
 *
 * @author Daniel
 */
public class Livro {

    private String titulo, autor, ano;
    private boolean disponivel;
    private String codigo;

    public Livro() {
    }

    public Livro(String titulo, String autor, String ano, boolean disponivel, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
        this.codigo = codigo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the disponivel
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * @param disponivel the disponivel to set
     */
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String obterInformacoesDoLivro() {
        return "Livro: " + this.getTitulo()
                + "\nAutor: " + this.getAutor()
                + "\nAno: " + this.getAno()
                + "\nDisponível: " + (this.isDisponivel() ? "Sim" : "Não")
                + "\nCódigo: " + this.getCodigo();
    }
}
