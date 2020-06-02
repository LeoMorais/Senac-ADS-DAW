package com.leonardo;
import javax.persistence.*;

public class CadastraAluno {

		public void cadastraAluno(int matricula, String nome) {
			//Abre conexão
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Alunos-PU");
			EntityManager em = emf.createEntityManager();
			
			Aluno aluno = new Aluno();
			aluno.setMatricula(matricula);
			aluno.setNome(nome);
			em.getTransaction().begin();
			em.persist(aluno);
			em.getTransaction().commit();
			
			//Fecha Conexão
			emf.close();
			em.close();
		}
		
	
}
