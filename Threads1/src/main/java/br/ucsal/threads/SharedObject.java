package br.ucsal.threads;

public class SharedObject { 
	 private volatile int value = -1; 
	 public boolean isSet() { return value != -1; } 
	 public synchronized boolean set(int v) { 
	  try { 
	   while(isSet()) // Condição: valor indefinido 
	     wait(); 
	   value = v;
	   System.out.println(Thread.currentThread().getName()+": PRODUCED: "+value); 
	   notifyAll(); // avisa a todos os produtores e consumidores  
	   return true; 
	  } catch (InterruptedException e) { return false; }
	 } 
	 public synchronized boolean reset() {
	  try { 
	   while (!isSet()) // Condição: valor definido 
	    wait(); 
	   System.out.println(Thread.currentThread().getName()+": CONSUMED: "+value);    
	   value = -1; 
	   notifyAll(); // avisa a todos os produtores e consumidores 
	   return true; 
	  } catch (InterruptedException e) { return false; } 
	 } 
	}

