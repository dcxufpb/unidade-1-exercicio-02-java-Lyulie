package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";

	public static void exercicio01() {

		String saida = NOME_LOJA + "\n";
		saida += String.format("%s, %d %s\n", LOGRADOURO, NUMERO, COMPLEMENTO);
		saida += String.format("%s - %s - %s\n", BAIRRO, MUNICIPIO, ESTADO);
		saida += String.format("CEP:%s Tel %s\n", CEP, TELEFONE);
		saida += OBSERVACAO + "\n";
		saida += String.format("CNPJ: %s\n", CNPJ);
		saida += String.format("IE: %s", INSCRICAO_ESTADUAL);
		saida = saida.replace("\n", "" + System.lineSeparator() + "");
		System.out.println(saida);

	}

	public void exercicio02_tudoVazio() {
		System.out.println(
			"\n" +
			", \n" +
			" -  - \n" +
			"CEP: Tel \n" +
			"\n" +
			"CNPJ: \n" +
			"IE: "
		);
	}

	public static void main(final String[] args) {
		exercicio01();
	}

}
