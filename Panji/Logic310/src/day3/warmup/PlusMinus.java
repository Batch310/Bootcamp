package day3.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double pos = 0, neg = 0, zero = 0;
		System.out.print("n :");
		int n = input.nextInt();

		int[] my_array = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print(" = ");
			my_array[i] = input.nextInt();
		}
		for (int i = 0; i < my_array.length; i++) {
			if(my_array[i] > 0) {
				pos++;
			}else if(my_array[i]<0) {
				neg++;
			}else {
				zero++;
			}
				
			
		}
		System.out.println();
		System.out.println(pos/n);
		System.out.println(neg/n);
		System.out.println(zero/n);

	}

}
