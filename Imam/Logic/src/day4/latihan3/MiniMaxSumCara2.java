package day4.latihan3;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSumCara2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan Data = ");
		int[] angka= new int[5];
		
		for (int i = 0; i < angka.length ; i++) {
		    
			angka[i]  =scanner.nextInt();
		}
		
		
		
		
		//1 2 3 4 5 (i)
		//1 2 3 4 5 (j)
		
		//cara 2
		
		//cetak
		
		// sorting Ascending
		Arrays.sort(angka);
		
		int min = angka[0] + angka[1] + angka[2] + angka[3];
		int max = angka[1] + angka[2] + angka[3] + angka[4];
		
		System.out.println();
		System.out.println(min);
		System.out.println(max);
		
		
	}

}
