package br.ucsal.threads;

import java.util.Random;

public class Producer implements Runnable { 
	 private SharedObject shared; 
	 private static final int TENTATIVAS = 3; 
	 Producer(SharedObject shared) { 
	  this.shared = shared; 
	 }
	 @Override 
	 public void run() { 
		 for (int i = 0; i < TENTATIVAS; i++) {

			 Random random = new Random();
			 char letra = (char) ('a' + random.nextInt(26));

			 if (!shared.set(letra)) // tenta produzir
		            break; // termina o thread se retornar false
		    }
		    System.out.println(Thread.currentThread().getName() + " Producer DONE.");
	 } 
}
