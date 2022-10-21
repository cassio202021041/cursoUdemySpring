package com.curso;

public class Aluno {
	
	public int getNotaDoAluno(int a, int b) {
		if (b==0) {
			b=1;			
		}
		
		int nota = a / b;
		
				
		return nota;
		
	}

}
