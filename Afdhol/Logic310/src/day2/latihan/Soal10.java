package day2.latihan;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Masukkan input: ");
//		int angka = input.nextInt();
	
		int angka=7;
		
		int awal = 3;
		
		for(int i=0; i<angka; i++) {
			//System.out.print(awal+" ");
			
		
			
			//awal *=3;
			
			if (angka%2==0) {
				System.out.print("xxx ");
				
				
			}else {
				System.out.print(awal+" ");
				awal = awal*3;
			}
			
		}
	}

}
