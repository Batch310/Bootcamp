package day2.latihan;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("input: ");
		int angka=input.nextInt();
		
		int awal= 3;
		
		for(int i=0; i<angka; i++) {
		System.out.print(awal+" ");
		
		awal= awal*3;
	}
		
	}

}
