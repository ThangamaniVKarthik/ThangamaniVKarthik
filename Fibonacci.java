package week1day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int fn=0;
		int sn=1;
		int sum ;
		System.out.println(fn);
    	System.out.println(sn);
		for (int i = 0; i <= 8; i++) {
			sum=fn+sn;
			System.out.println(sum);
			fn = sn;
			sn = sum;
			
			
		}
		
	}

}
