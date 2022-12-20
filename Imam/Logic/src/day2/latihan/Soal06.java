package day2.latihan;

import java.util.Scanner;

public class Soal06 {

	public static void main(String[] args) {
	
		Scanner inputan = new Scanner(System.in);
		System.out.print("n = ");
		int a = inputan.nextInt();
		
		int nilaiAwal = 1;
		
		for (int i = 0; i < a; i++) {
			
			if(i % 3 ==2) {
				
				System.out.print("* ");
			}else {
				System.out.print(nilaiAwal + " ");
			}
			nilaiAwal += 4;
		}

	}

}
