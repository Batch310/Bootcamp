package day4.latihan3;

import java.util.Scanner;

public class PenjumlahanIsiArray {

	public static void main(String[] args) {

		Scanner inputan = new Scanner(System.in);
		System.out.print("Panjang array = ");
		int a = inputan.nextInt();
		int[] b = new int[a];



		System.out.println("--------------");

		System.out.print("isi data array = ");

		int jumlah = 0;

		for (int i = 0; i < b.length; i++) {
		
			if(i<b.length) {
				b[i] = inputan.nextInt();
			}else {
				System.out.print(b[i] + " ");
			}	
		}
	
		for (int i = 0; i < b.length ; i++) {
			jumlah = jumlah + b[i];
		}

		System.out.print(jumlah);



	}

}
