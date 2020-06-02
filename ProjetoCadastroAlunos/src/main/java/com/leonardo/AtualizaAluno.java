package com.leonardo;

import javax.persistence.*;

public class AtualizaAluno {
	
	public void atualizaAluno(int matricula, String nome) {
		//Abre conexão
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Alunos-PU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();		
		Aluno aluno = em.find(Aluno.class, matricula);
		aluno.setNome(nome);
		em.merge(aluno);
		em.getTransaction().commit();
		
		//Fecha Conexão
		emf.close();
		em.close();
	}
}
