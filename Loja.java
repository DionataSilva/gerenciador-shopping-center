
public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    // Construtor que inicializa todos os atributos
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    // Construtor que inicializa apenas o nome, quantidade de funcionarios, endereço e data de fundação
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    // Construtor que inicializa apenas o nome, quantidade de funcionarios
    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    // Construtor que inicializa apenas o nome, quantidade de funcionarios e salário base
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String e7, int i, int i1, Endereco e1, Data d1, int i2) {
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public Data getDataFundacao() {
        return dataFundacao;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    @Override
    public String toString() {
       return String.format("""
               Loja {
                   nome: %s,
                   quantidadeFuncionarios: %s,
                   salarioBaseFuncionario: %s,
                   endereco: %s,
                   fundacao: %s,
                   gastosComSalario: %s
                   tamanhoDaLoja: %s
                   Endereco: %s
               }""", nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, gastosComSalario(), tamanhoDaLoja(), endereco);
    }

    // Método que calcula os gastos com salário
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        return salarioBaseFuncionario * quantidadeFuncionarios;
    }

    // Método que retorna o tamanho da loja
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public Object[] getEstoqueProdutos() {
    }

    public void imprimeProdutos() {
    }

    public boolean insereProduto(Produto pipoca_doce) {
    }

    public boolean removeProduto(String pipoca_salgada) {
    }
}
