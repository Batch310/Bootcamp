package coba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSum {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		List<Integer> arr = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Masukkan angka: ");	
			arr.add(masukan.nextInt());
		}
		
		masukan.close();
		
		Long minSum = 0l;
		Long maxSum = 0l;
		
		for (int i = 0; i < arr.size(); i++) {
			Long temp = 0l;
			for (int j = 0; j < arr.size(); j++) {
				temp += arr.get(j);
			}
			
			temp -= arr.get(i);

			if (i == 0) {
				maxSum = temp;
				minSum = temp; 
			}
			
			if (temp < minSum) {
				minSum = temp;
			}
			
			if (temp > maxSum) {
				maxSum = temp;
			}
		}
		
		System.out.println(minSum + " " + maxSum);
//		System.out.println("Max Sum: " + maxSum);
//		System.out.println("Min Sum: " + minSum);
		
	}
}
