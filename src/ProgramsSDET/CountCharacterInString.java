package ProgramsSDET;

public class CountCharacterInString {

	public static void main(String[] args) {

		String s = "Java Programming Java OppsJ";

		int totalcount = s.length();

		int removecount = s.replace("J", "").length();

		System.out.println((totalcount - removecount));

	}

}
