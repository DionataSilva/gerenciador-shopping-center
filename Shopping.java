public class Shopping {

    private String nome;
    private Endereco endereco;
    private int quantidadeMaximaDeLojas;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaDeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeMaximaDeLojas = quantidadeMaximaDeLojas;
        this.lojas = new Loja[quantidadeMaximaDeLojas];
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public Loja[] getLojas() {
        return this.lojas;
    }

    public boolean insereLoja(Loja loja) {
        return true;
    }

    public int quantidadeLojasPorTipo(String bijuteria) {
        return 1;
    }

    public boolean removeLoja(String loja_bijuteria) {
        return true;
    }

    public Loja lojaSeguroMaisCaro() {
        return null;
    }
}
