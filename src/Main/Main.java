package Main;

import ARunnableDemo.ARunnableDemo;

public class Main {
public static void main (String[] args) {
	ARunnableDemo p1 = new ARunnableDemo("Tolu");
	ARunnableDemo p2 = new ARunnableDemo("Tola");
	
	Thread t1= new Thread(p1);
	Thread t2= new Thread(p2);
	t1.start();
	t2.start();
	
	
  
}
}
