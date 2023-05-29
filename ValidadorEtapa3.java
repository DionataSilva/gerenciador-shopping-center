public class ValidadorEtapa3 {

	public static void main(String[] args){
		System.out.println("[Laboratório I]\n Desafio: Validador - Etapa 03\n");
		
		//// Verificação da classe Cosmetico
		//Criação da instância
		Endereco e1 = new Endereco("Rua dos Bobos", "Piraporinha", "SC", "Uruguai", "99000-100", "0", "Fundos");
		Data d1 = new Data(10, 3, 2023);

		Cosmetico lojaCosmetico = new Cosmetico("Loja Cosmético", 10, 2100, e1, d1, 20);
		System.out.println("\n[OK] Classe Cosmetico identificada");
		
		//public void setTaxaComercializacao(double taxaComercializacao)
		lojaCosmetico.setTaxaComercializacao(50);
		System.out.println("[OK] Método Cosmetico.setTaxaComercializacao()");
		
		//public double getTaxaComercializacao()
		System.out.println(lojaCosmetico.getTaxaComercializacao() == 50 ? "[OK] Método Cosmetico.getTaxaComercializacao()" : "[NOK] Método Cosmetico.getTaxaComercializacao()");
		
		//public String toString()
		lojaCosmetico.toString();
		System.out.println("[OK] Método Cosmetico.toString()");	
		
		
		//// Verificação da classe Vestuario
		//Criação da instância
		Vestuario lojaVestuario = new Vestuario("Loja Vestuário", 10, 2100, e1, d1, false);
		System.out.println("\n[OK] Classe Vestuario identificada");
		
		//public void setProdutosImportados(boolean produtosImportados)
		lojaVestuario.setProdutosImportados(true);
		System.out.println("[OK] Método Vestuario.setProdutosImportados()");
		
		//public boolean getProdutosImportados()
		System.out.println(lojaVestuario.getProdutosImportados() ? "[OK] Método Vestuario.getProdutosImportados()" : "[NOK] Método Vestuario.getProdutosImportados()");
		
		//public String toString()
		lojaVestuario.toString();
		System.out.println("[OK] Método Vestuario.toString()");	
		
		
		//// Verificação da classe Bijuteria
		//Criação da instância
		Bijuteria lojaBijuteria = new Bijuteria("Loja Bijuteria", 10, 2100, e1, d1, 5000);
		System.out.println("\n[OK] Classe Bijuteria identificada");
		
		//public void setMetaVendas(double metaVendas)
		lojaBijuteria.setMetaVendas(4000);
		System.out.println("[OK] Método Bijuteria.setMetaVendas()");
		
		//public double getMetaVendas()
		System.out.println(lojaBijuteria.getMetaVendas() == 4000 ? "[OK] Método Bijuteria.getMetaVendas()" : "[NOK] Método Bijuteria.getMetaVendas()");
		
		//public String toString()
		lojaBijuteria.toString();
		System.out.println("[OK] Método Bijuteria.toString()");	
		
		
		//// Verificação da classe Alimentacao
		//Criação da instância
		Alimentacao lojaAlimentacao = new Alimentacao("Loja Alimentação", 10, 2100, e1, d1, d1);
		System.out.println("\n[OK] Classe Alimentacao identificada");

		//public void setDataAlvara(Data dataAlvara)
		lojaAlimentacao.setDataAlvara(new Data(20, 4, 2023));
		System.out.println("[OK] Método Alimentacao.setDataAlvara()");
		
		//public Data getDataAlvara()
		System.out.println(lojaAlimentacao.getDataAlvara() != null ? "[OK] Método Alimentacao.getDataAlvara()" : "[NOK] Método Alimentacao.getDataAlvara()");
		
		//public String toString()
		lojaAlimentacao.toString();
		System.out.println("[OK] Método Alimentacao.toString()");	

		
		//// Verificação da classe Informatica
		//Criação da instância
		Informatica lojaInformatica = new Informatica("Loja Informática", 10, 2100, e1, d1, 300);
		System.out.println("\n[OK] Classe Informatica identificada");
		
		//public void setSeguroEletronicos(double seguroEletronicos)
		lojaInformatica.setSeguroEletronicos(500);
		System.out.println("[OK] Método Informatica.setSeguroEletronicos()");
		
		//public double getSeguroEletronicos()
		System.out.println(lojaInformatica.getSeguroEletronicos() == 500 ? "[OK] Método Informatica.getSeguroEletronicos()" : "[NOK] Método Informatica.getSeguroEletronicos()");

		//public String toString()
		lojaInformatica.toString();
		System.out.println("[OK] Método Informatica.toString()");	
		
	}
}
