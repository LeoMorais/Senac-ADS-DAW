package com.leonardo;

import javax.persistence.*;

public class PesquisaAluno {
	public void pesquisaAluno(int matricula) {
		//Abre conex�o
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Alunos-PU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();		
		Aluno aluno = em.find(Aluno.class, matricula);
		System.out.println("Matricula="+matricula+"\nNome="+aluno.getNome());
		
		//Fecha Conex�o
		emf.close();
		em.close();
	}
}
