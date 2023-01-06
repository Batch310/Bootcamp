package day3.latihan;

import java.util.Scanner;

public class Soal5DeretDenganPanjangInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("n: ");
		int n= input.nextInt();
	
		
		int awalbaris2=7;
		int awalbaris3=14;
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(awalbaris2+" ");
			awalbaris2 +=1;
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(awalbaris3+" ");
			awalbaris3+=1;
		}
		

	
	}

}
