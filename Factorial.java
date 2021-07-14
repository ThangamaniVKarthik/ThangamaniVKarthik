
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5, factorial = 1;
		for (int i = number; i >= 1; i--) {
      //for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial is : " + factorial);
	}
}
