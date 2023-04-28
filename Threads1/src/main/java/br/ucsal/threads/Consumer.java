package br.ucsal.threads;

public class Consumer implements Runnable { 
	 private SharedObject shared; 
	 private static final int TENTATIVAS = 3; 
	 Consumer(SharedObject shared) { this.shared = shared; } 
	 @Override 
	 public void run() { 
	  for (int i = 0; i < TENTATIVAS; i++) { 
		  
	   if(!shared.reset()) // tenta consumir 
	    break; // termina thread se retornar false (foi interrompido) 
	  } 
	  System.out.println(Thread.currentThread().getName() + ": Consumer DONE."); 
	 } 
	}



