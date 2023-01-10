package day6;

import java.util.Scanner;

public class MiniMaxSumCara1 {
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
		
		//1 2 3 4 5 (i)
		//1 2 3 4 5 (j)
		
		//Cara 1
		int temp = 0;
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < arrNilai.length; i++) {
			temp = 0;
			for (int j = 0; j < arrNilai.length; j++) {
				if(i != j) {
					temp = temp + arrNilai[j];
				}
			}
			if(min == 0) {
				min = temp;
			}
			if(temp < min) {
				min = temp;
			}
			if(temp > max){
				max = temp;
			}
		}
		
		System.out.println();
		System.out.println(min);
		System.out.println(max);
	}
}
