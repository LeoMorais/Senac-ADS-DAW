package com.leonardo;
import java.util.ArrayList;


public class Cadastro {
	
	public static ArrayList<Aluno> lista= new ArrayList<>();
	public static Aluno aluno = new Aluno();
	
	public static void cadastro(String nome, int matricula) {
		
		aluno.setNome(nome);
		aluno.setMatrciula(matricula);
		lista.add(aluno);
		aluno = new Aluno();
		
	}
	
	
}
