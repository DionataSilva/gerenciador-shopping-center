public class Cosmetico extends Loja {
    private int taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    public void setTaxaComercializacao(int taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public int getTaxaComercializacao() {
        return this.taxaComercializacao;
    }
}
