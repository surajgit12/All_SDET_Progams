package ProgramsSDET;

public class PalindromeString {

	public static void main(String[] args) {


		String str = "suraj";
		
		 int len=  str.length();
		 
		 String rev = "";
		 
		 String org_Str = str;
		 
		 for(int i= len-1 ; i>=0;i--) {
			 
			 rev = rev+str.charAt(i);
			 
		 }
		
		 if(org_Str.equals(rev)) {
			 
			 System.out.println("String is Palindrome");
		 }
		 else {
			 
			 System.out.println("String is not Palindrome");
		 }
		
	}

}
