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
	   if( !shared.set(new Random().nextInt(1000))) //tenta produzir
	    break; // termina o thread se retornar false
	  } 
	  System.out.println(Thread.currentThread().getName()+"Producer DONE.");
	 } 

}