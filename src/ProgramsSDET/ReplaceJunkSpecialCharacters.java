package ProgramsSDET;

public class ReplaceJunkSpecialCharacters {

	public static void main(String[] args) {


		String str = "suraj565654064$#$#$++";
		
		str =str.replaceAll("[^a-zA-Z0-9]", "");  // ^char operator other than this replace with by space
		System.out.println(str);

	}

}
