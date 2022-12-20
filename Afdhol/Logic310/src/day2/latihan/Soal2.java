package day2.latihan;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan input: ");
		int angka = input.nextInt();
		
		
		int awal = 2;
		
		
		for(int i=0; i<angka; i++) {
			System.out.print(awal+" ");
			
			awal = awal+2;
		}
	}

}
