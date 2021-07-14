
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions java";
		int count = 0;
		String[] splitted = text.split(" ");
		for (int i = 0; i < splitted.length; i++) {
//			System.out.println(splitted[i]);
			for (int j = i+1; j < splitted.length; j++) {
//				System.out.println(splitted[j]);
				if (splitted[i].equals(splitted[j]) ) {
					count++;
//					System.out.println(count);
					if (count>1) {
						String output = text.replace(splitted[i], "not");
						System.out.println(output);
						
					}
				}
				
			}
		}
	}

}
