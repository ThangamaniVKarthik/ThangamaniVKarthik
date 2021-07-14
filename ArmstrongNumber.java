package week1day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 153; 
		int rem ;
		int sum = 0;
		int quo = a;
		while (quo >0) {
			rem = quo % 10;
			quo = quo / 10;
			sum = sum + rem*rem*rem;
						
		}
		if (a == sum) {
					
		System.out.println("Armstrong no");
	}
		else {
			System.out.println("Not an armstrong no");
		}
	}
}
