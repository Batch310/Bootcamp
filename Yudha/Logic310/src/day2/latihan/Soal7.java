package day2.latihan;

import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		for(int i=2;n>0;n--) {
			System.out.print(i + " ");
			i=i*2;
		}

	}

}
