package day3.latihan;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("n: ");
		int n= input.nextInt();
		
		System.out.println("n2: ");
		int n2= input.nextInt();
				
		int nilaiAwal=1;
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			
			
			if (i%3==1) {
				System.out.print(nilaiAwal+" -");
			}else {
				System.out.print(nilaiAwal+" ");
			}
			nilaiAwal *=n2;
		}
	}

}
