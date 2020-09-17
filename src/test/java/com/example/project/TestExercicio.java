package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestExercicio {

	private String BREAK = System.lineSeparator();

	@Test
	public void exercicio01() {
		CupomFiscal.NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
		CupomFiscal.LOGRADOURO = "Av. Projetada Leste";
		CupomFiscal.NUMERO = 500;
		CupomFiscal.COMPLEMENTO = "EUC F32/33/34";
		CupomFiscal.BAIRRO = "Br. Sta Genebra";
		CupomFiscal.MUNICIPIO = "Campinas";
		CupomFiscal.ESTADO = "SP";
		CupomFiscal.CEP = "13080-395";
		CupomFiscal.TELEFONE = "(19) 3756-7408";
		CupomFiscal.OBSERVACAO = "Loja 1317 (PDP)";
		CupomFiscal.CNPJ = "42.591.651/0797-34";
		CupomFiscal.INSCRICAO_ESTADUAL = "244.898.500.113";

		rodarTestarOutput(
			"Arcos Dourados Com. de Alimentos LTDA" + BREAK + 
			"Av. Projetada Leste, 500 EUC F32/33/34" + BREAK + 
			"Br. Sta Genebra - Campinas - SP" + BREAK + 
			"CEP:13080-395 Tel (19) 3756-7408" + BREAK + 
			"Loja 1317 (PDP)" + BREAK + 
			"CNPJ: 42.591.651/0797-34" + BREAK + 
			"IE: 244.898.500.113" + BREAK
		);
	}
	
	@Test
	public void exercicio02_tudoVazio() {
		CupomFiscal.NOME_LOJA = "";
		CupomFiscal.LOGRADOURO = "";
		CupomFiscal.NUMERO = 0;
		CupomFiscal.COMPLEMENTO = "";
		CupomFiscal.BAIRRO = "";
		CupomFiscal.MUNICIPIO = "";
		CupomFiscal.ESTADO = "";
		CupomFiscal.CEP = "";
		CupomFiscal.TELEFONE = "";
		CupomFiscal.OBSERVACAO = "";
		CupomFiscal.CNPJ = "";
		CupomFiscal.INSCRICAO_ESTADUAL = "";
		
		rodarTestarOutput("" + BREAK + 
				", 0 " + BREAK + 
				" -  - " + BREAK + 
				"CEP: Tel " + BREAK + 
				"" + BREAK + 
				"CNPJ: " + BREAK + 
				"IE: " + BREAK);
	}

	@Test
	public void exercicio02_Customizado() {
		//Defina seus próprios valores para as variáveis a seguir 
		CupomFiscal.NOME_LOJA = "Brinquedos ltda";
		CupomFiscal.LOGRADOURO = "Rua da guia";
		CupomFiscal.NUMERO = 44;
		CupomFiscal.COMPLEMENTO = "ao lado do coqueiro";
		CupomFiscal.BAIRRO = "Mandacaru";
		CupomFiscal.MUNICIPIO = "João Pessoa";
		CupomFiscal.ESTADO = "PB";
		CupomFiscal.CEP = "58038-000";
		CupomFiscal.TELEFONE = "(83) 9444-7777";
		CupomFiscal.OBSERVACAO = "Loja 4";
		CupomFiscal.CNPJ = "42.591.651/0797-34";
		CupomFiscal.INSCRICAO_ESTADUAL = "244.898.500.113";
		
		//E atualize o texto esperado abaixo
		rodarTestarOutput(
			"Brinquedos ltda" + BREAK +
			"Rua da guia, 44 ao lado do coqueiro" + BREAK +
			"Mandacaru - João Pessoa - PB" + BREAK +
			"CEP:58038-000 Tel (83) 9444-7777" + BREAK +
			"Loja 4" + BREAK +
			"CNPJ: 42.591.651/0797-34" + BREAK +
			"IE: 244.898.500.113" + BREAK
		);
	}

	private void rodarTestarOutput(String expected) {
		PrintStream originalOut = System.out;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bos));

		// action
		CupomFiscal.main(null);

		// assertion
		assertEquals(expected, bos.toString());

		// undo the binding in System
		System.setOut(originalOut);
	}
}
