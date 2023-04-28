package br.ucsal.threads;

public class Pilha {

	
	private int topo;
	
	private char[] pilha;
	

	public Pilha(int tamanho) {
		// construção da pilha
		this.pilha = new char[6];
		this.topo = -1;

	}


	public void push(char novo) {
		if (this.topo < this.pilha.length -1)
		this.pilha[++topo] = novo;

	}

	public char pop(){

		if (this.topo == -1)
		return ' ';
		
		return pilha[topo --];
				

	}
}
