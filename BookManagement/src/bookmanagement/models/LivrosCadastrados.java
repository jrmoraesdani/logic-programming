package bookmanagement.models;

/**
 *
 * @author Daniel
 */
public class LivrosCadastrados extends Livro {

    private String ebookOuFisico;

    public LivrosCadastrados() {
    }

    public LivrosCadastrados(String titulo, String autor, String ano, boolean disponivel, String codigo, String ebookOuFisico) {
        super(titulo, autor, ano, disponivel, codigo);
        this.ebookOuFisico = ebookOuFisico;
    }

    public String isEbookOuFisico() {
        return ebookOuFisico;
    }

    public void setEbookOuFisico(String ebookOuFisico) {
        this.ebookOuFisico = ebookOuFisico;
    }
    
    @Override
    public String obterInformacoesDoLivro(){
        return "Livro " + this.getTitulo() + " cadastrado com sucesso no formato " + this.ebookOuFisico;
    }
}
