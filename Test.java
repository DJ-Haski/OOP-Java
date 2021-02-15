package Problem2;

import java.io.File;

import Problem2.Any.Hobbies;

public class Test {
	public static void main (String args[]){
		
		System.out.println(Hobbies.Sleep.hashCode());
		
		// try = new Any();
	 
	    Any.staticMethod();
	    //Any.unstaticMethod();
	    
	    	File file = new File("D:/java.txt");
	      System.out.println(file.setReadOnly());
	      System.out.println(file.canWrite());
	    
	 }

	
}
