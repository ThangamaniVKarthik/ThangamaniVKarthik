package week1.day2;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 7, 6, 8, 10};
		Arrays.sort(arr);
		for (int i = 1 ; i <= arr.length; i++) {

			if (i != arr[i - 1]) {
				System.out.println("The missing element is " + i);
				break;
			}
		}

	}

}
