package day4.pagi;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSumCara2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arrNilai = new int[5];
		
		//Input
		for (int i = 0; i < arrNilai.length; i++) {
			System.out.print("input data ke-" + (i+1) + " : ");
			arrNilai[i] = scanner.nextInt();
		}
		
		
		System.out.println();
		System.out.println();
		
		//Cetak
		for (int i = 0; i < arrNilai.length; i++) {
			System.out.print(arrNilai[i] + " ");
		}
		
		//Cara 2
		
		//Cara Sorting Ascending
		Arrays.sort(arrNilai);
		
		int min = arrNilai[0] + arrNilai[1] + arrNilai[2] + arrNilai[3];
		int max = arrNilai[1] + arrNilai[2] +arrNilai[3] +arrNilai[4];
		
		System.out.println();
		System.out.println(min);
		System.out.println(max);
	}
}
