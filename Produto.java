
public class Produto {

    private String nome;
    private double preco;
    private Data dataValidade;

    // Construtor que inicializa todos os atributos
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // Construtor que inicializa com nome e preço
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return String.format("""
               Produto {
                   nome: %s,
                   preco: %s
                   dataDeValidade: %s
               }""", nome, preco, dataValidade);
    }


    // Métodos que verifica se está vencido
    public boolean estaVencido(Data data) {
    if (data.getAno() > this.dataValidade.getAno()) {
        return true;
    } else if (data.getAno() == this.dataValidade.getAno() && data.getMes() > this.dataValidade.getMes()) {
        return true;
    } else if (data.getAno() == this.dataValidade.getAno() && data.getMes() == this.dataValidade.getMes() && data.getDia() > this.dataValidade.getDia()) {
        return true;
    } else {
        return false;
    }
}

}
