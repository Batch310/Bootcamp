package day3.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal8BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		int[] deret= new int[n];
		int max=0,count=0;
		System.out.println("Masukkan angka : ");
		for(int i=0; i<n;i++) {
			int angka = input.nextInt();
			deret[i] = angka;
			if(deret[i]>max) {
				max = deret[i];
				count = 1;
			}
			else if(deret[i]==max) {
				count++;
			}
		}
//		for(int i=0; i<n;i++) {
//			System.out.print(deret[i]+" ");
//			if(deret[i]==max) {
//				count++;
//			}
//		}
		System.out.println("\n"+count);
	}

}
