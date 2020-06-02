package com.leonardo;

public class Principal {
	public static void main(String[] args) {
		CadastraAluno cadastro = new CadastraAluno();
		//cadastro.cadastraAluno(3, "Claudio");
		
		PesquisaAluno pesquisa = new PesquisaAluno();
		//pesquisa.pesquisaAluno(3);
		
		RemoveAluno remove = new RemoveAluno();
		//remove.removeAluno(3);
		
		AtualizaAluno atualiza = new AtualizaAluno();
		atualiza.atualizaAluno(2,"Luis");
	}
}
