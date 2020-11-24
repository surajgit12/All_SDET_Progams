package ProgramsSDET;

public class DuplicateElementArrays {

	public static void main(String[] args) {

		String[] str = { "java", "cpp", "sap", "java" };

		boolean flag = false;
		for (int i = 0; i <= str.length; i++) 
		{

			for (int j = i + 1; j < str.length; j++) 
			{

				if (str[i].equals(str[j]))
				{

					System.out.println("duplicate array element---->" + str[i]);

					flag = true;

				}

			}

		}

		if(flag==false) {
			System.out.println("Duplicate elememts not found");
		}
	}

}
