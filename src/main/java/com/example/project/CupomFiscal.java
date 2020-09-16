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

		/*System.out.println(
			NOME_LOJA + "\n" +
			LOGRADOURO + ", " + NUMERO + " " + COMPLEMENTO + "\n" +
			BAIRRO + " - " + MUNICIPIO + " - " + ESTADO + "\n" +
			"CEP:" + CEP + " Tel " + TELEFONE + "\n" +
			OBSERVACAO + "\n" +
			"CNPJ: " + CNPJ + "\n" +
			"IE: " + INSCRICAO_ESTADUAL
		);*/
		System.out.println(NOME_LOJA);
		System.out.println(LOGRADOURO + ", " + NUMERO + " " + COMPLEMENTO);
		System.out.println(BAIRRO + " - " + MUNICIPIO + " - " + ESTADO);
		System.out.println("CEP:" + CEP + " Tel " + TELEFONE);
		System.out.println(OBSERVACAO);
		System.out.println("CNPJ: " + CNPJ);
		System.out.println("IE: " + INSCRICAO_ESTADUAL);

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
