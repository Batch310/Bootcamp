package day3.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int data, total= 0;
		
		System.out.print("Jumlah data : ");
		data = input.nextInt();
		
		int[] my_array = new int[data];
		
		for (int i = 0; i < my_array.length; i++) {
			System.out.print(" ");
			my_array[i] = input.nextInt();
			total = total + my_array[i];
		}
		System.out.print(total);
		
	}

}
