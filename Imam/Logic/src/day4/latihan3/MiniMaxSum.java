package day4.latihan3;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[] angka= new int[5];
		
		for (int i = 0; i < angka.length ; i++) {
		    
			angka[i]  =scanner.nextInt();
		}
		
		
		
		
		//1 2 3 4 5 (i)
		//1 2 3 4 5 (j)
		
		//cara 1
		int temp = 0;
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < angka.length; i++) {
			temp = 0;
			for (int j = 0; j < angka.length; j++) {
				if(i != j) {
					temp = temp + angka[j];
				}
			}
			
			if(min == 0) {
				min = temp;
			}
			if(temp < min) {
				min = temp;
			}
			if(temp > max) {
				max = temp;
			}

			
		}
		
		System.out.println();
		System.out.println(min);
		System.out.println(max);
		
		
	}

}
