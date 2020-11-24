package ProgramsSDET;

import java.util.HashSet;

public class DuplicateArrayThroughHashSet {

	public static void main(String[] args) {
		
		boolean flag = false;
		
		String[] str = { "java", "cpp", "sap", "java1" };
		
		HashSet<String> hs = new HashSet<String>();
		
	      for(String ss :str) {
	    	  
	    	  if(hs.add(ss)== false) {
	    		  
	    		  System.out.println(ss);
	    		  flag= true;
	    	  }
	     }
		if(flag== false) {
			System.out.println("no duplicates");
		}
	}

}
