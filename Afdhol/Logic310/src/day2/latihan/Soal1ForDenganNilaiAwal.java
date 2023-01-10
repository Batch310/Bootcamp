package day2.latihan;

import java.util.Scanner;

public class Soal1ForDenganNilaiAwal {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Masukkan input: ");
		int n = input.nextInt();

		
		//int n=7;
		int nilaiAwal =1;
		
		for (int i = 0; i <n; i++) {
			System.out.print(nilaiAwal+" ");
			
		nilaiAwal = nilaiAwal+2;
		}
	       
				
		}
	}


