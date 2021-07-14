
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Madam";
		String str2 = "";
		for (int i = str1.length()-1; i >= 0; i--) {
			char c = str1.charAt(i);
			str2 = str2 + c;
//			System.out.println(str2);
			if (str2.equalsIgnoreCase(str1)) {
				System.out.println("Palindrome");
			}

		}

	}

}
