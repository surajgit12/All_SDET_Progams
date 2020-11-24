package ProgramsSDET;

import java.util.HashMap;

public class A1B1C1 {

	public static void main(String[] args) {

		String str = "AAABC";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {

				if (ch[j] == ch[i]) {
					count++;
				}
			}
			map.put(ch[i], count);

		}
		System.out.println(map);
	}

}
