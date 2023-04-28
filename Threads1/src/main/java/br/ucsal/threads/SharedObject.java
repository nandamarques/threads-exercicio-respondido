package br.ucsal.threads;

public class SharedObject { 
	 private volatile char value = ' '; 
	 
	public SharedObject(Pilha pilha) {	
	}
	
	public boolean isSet() { return value != ' '; } 
	 
	
	public synchronized boolean set(char letras) { 
	  try { 
	   while(isSet())
	     wait(); 
	   value = letras;
	   System.out.println(Thread.currentThread().getName()+": PRODUCED: "+value); 
	   notifyAll(); // avisa a todos os produtores e consumidores  
	   return true; 
	  } catch (InterruptedException e) { return false; }
	 } 
	 
	
	public synchronized boolean reset() {
	  try { 
	   while (!isSet()) 
	    wait(); 
	   System.out.println(Thread.currentThread().getName()+": CONSUMED: "+value);    
	   value = ' '; 
	   notifyAll(); // avisa a todos os produtores e consumidores 
	   return true; 
	  } catch (InterruptedException e) { return false; } 
	 } 
	}

