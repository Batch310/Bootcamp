package day2.latihan;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		for(int i=3;n>0;n--) {
			System.out.print(i + " ");
			i=i*3;
		}

	}

}
