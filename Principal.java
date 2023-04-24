import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcao;
        Loja loja = null;
        Produto produto = null;
        String menu = """
                =========================================
                Informe qual ação deseja fazer
                    (1) Criar uma loja
                    (2) Criar um produto
                    (3) Sair
                """;
        
        do {
            System.out.print(menu);
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            System.out.println("=========================================");

            switch (opcao) {
                case 1 -> loja = criaLoja(sc);
                case 2 -> produto = criaProduto(sc);
                case 3 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida");
            }
            
            if (opcao == 2) {

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDateTime now = LocalDateTime.now();

                if (produto.estaVencido(formataData(dtf.format(now)))) {
                    System.out.println("** PRODUTO VENCIDO **");
                } else {
                    System.out.println("** PRODUTO NÃO VENCIDO **");
                }
                System.out.println(produto);
            }
            
            if (opcao == 1) {
                System.out.println("Loja criada:");
                System.out.println(loja);
            }
            
        } while (opcao != 3);
        
        sc.close();
    }

    private static Loja criaLoja(Scanner sc) {
        Loja loja;
        System.out.println("Informe os dados da loja:");
        sc.nextLine();

        String nomeLoja = inputUsuario(" - Nome: ", sc);
        String pais = inputUsuario(" - País: ", sc);
        String estado = inputUsuario(" - Estado: ", sc);
        String cidade = inputUsuario(" - Cidade: ", sc);
        String cep = inputUsuario(" - Cep: ", sc);
        String rua = inputUsuario(" - Rua: ", sc);
        String numero = inputUsuario(" - Número: ", sc);
        String complemento = inputUsuario(" - Complemento: ", sc);
        Data dataFundacao = formataData(inputUsuario(" - Data de fundação (dd/mm/aaaa): ", sc));
        int quantidadeFuncionarios = Integer.parseInt(inputUsuario(" - Quantidade de funcionários: ", sc));
        double salarioBaseFuncionario = Double.parseDouble(inputUsuario(" - Salário base dos funcionários: ", sc));

        Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
        loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        System.out.println("");

        return loja;
    }

    private static Produto criaProduto(Scanner sc) {
        Produto produto;
        System.out.println("Informe os dados do produto:");
        sc.nextLine();

        String nomeProduto = inputUsuario(" - Nome: ", sc);
        double preco = Double.parseDouble(inputUsuario(" - Preço: ", sc));
        Data dataValidade = formataData(inputUsuario(" - Data de validade (dd/mm/aaaa): ", sc));
        produto = new Produto(nomeProduto, preco, dataValidade);
        System.out.println("");

        return produto;
    }

    private static String inputUsuario(String lable, Scanner sc) {
        System.out.print(lable);
        return sc.nextLine();
    }

    private static Data formataData(String dataStr) {
        String[] partesData = dataStr.split("/");
        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);
        return new Data(dia, mes, ano);
    }

}
