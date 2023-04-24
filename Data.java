
public class Data {

    private int dia;
    private int mes;
    private int ano;

    // Construtor que inicializa todos os atributos
    public Data(int dia, int mes, int ano) {
        if (!verificaData(dia, mes, ano)) {
            System.out.println("Data inválida. Será utilizada a data padrão: 01/01/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    // Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // Setters
    public void setDia(int dia) {
        if (verificaData(dia, mes, ano)) {
            this.dia = dia;
        } else {
            System.out.println("Data inválida. Não foi possível alterar o dia.");
        }
    }

    public void setMes(int mes) {
        if (verificaData(dia, mes, ano)) {
            this.mes = mes;
        } else {
            System.out.println("Data inválida. Não foi possível alterar o mês.");
        }
    }

    public void setAno(int ano) {
        if (verificaData(dia, mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Não foi possível alterar o ano.");
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    // Métodos que verifica se é ano bissexto
    public boolean verificaAnoBissexto() {
        if (ano % 400 == 0) {
            return true;
        } else if (ano % 100 == 0) {
            return false;
        } else return ano % 4 == 0;
    }

    // Métodos que verifica se a data é válida
    private boolean verificaData(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0 || mes > 12 || ano < 0) {
            return false;
        }
        switch (mes) {
            case 2:
                if (verificaAnoBissexto() && dia <= 29) {
                    return true;
                } else return dia <= 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return dia <= 30;
            default:
                return dia <= 31;
        }
    }
}
