package day3.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal7MinMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		int[] deret= new int[n];
		int sum=0,x=0;
		System.out.println("Masukkan angka : ");
		for(int i=0; i<n;i++) {
			int angka = input.nextInt();
			deret[i] = angka;
			sum = sum + angka;
		}
		for(int i=0; i<n;i++) {
			System.out.print(deret[i]+" ");
		}
		Arrays.sort(deret);
		int max = sum - deret[0];
		int min = sum - deret[n-1];
		System.out.println();
		System.out.print(min + " " + max);
	}

}
