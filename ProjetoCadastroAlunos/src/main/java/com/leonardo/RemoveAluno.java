package com.leonardo;

import javax.persistence.*;

public class RemoveAluno {
	public void removeAluno(int matricula) {
		//Abre conexão
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Alunos-PU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();		
		Aluno aluno = em.find(Aluno.class, matricula);
		em.remove(aluno);
		em.getTransaction().commit();
		
		//Fecha Conexão
		emf.close();
		em.close();
	}
}
