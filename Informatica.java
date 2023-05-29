public class Informatica extends Loja{
    private int seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public void setSeguroEletronicos(int seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public int getSeguroEletronicos() {
        return this.seguroEletronicos;
    }
}
