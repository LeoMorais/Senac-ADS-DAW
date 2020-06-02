package com.leonardo;
import javax.persistence.*;

@Entity
@Table(name="aluno")
public class Aluno {
	
	@Id //@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="matricula")
	private int matricula;
	@Column(name="nome")
	String nome;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
