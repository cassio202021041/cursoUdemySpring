package com.curso;

public class Curso {
	
	public String mostraDados() {
		
		Aluno alunoA = new Aluno();		
		System.out.println(alunoA.getNotaDoAluno(10, 1));
		
		Aluno alunoB = new Aluno();		
		System.out.println(alunoB.getNotaDoAluno(10, 0));
		
		String valor = "Olá";
		
		return valor;
	}

}
