package ProgramsSDET;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegularExpressionfindthFirst {
	
	
	public static void main(String[] args) {
		
	
	
	String str = "Suraj Umbarkar";
	
	Pattern p = Pattern.compile("\\b[a-zA-Z]"); 
	Matcher m1 = p.matcher(str); 
	
     System.out.println("find first match word " + str + "\" :");
     
     while (m1.find()) {
         System.out.print(m1.group());
     }
	}

}
