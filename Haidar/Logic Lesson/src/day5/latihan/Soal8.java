package day5.latihan;

import java.util.Scanner;

public class Soal8 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		//Program yang diinginkan
		//1. Input merupakan panjang deret
		//2. Membuat deret bilangan prima dan bilangan fibonacci
		//3. Angka pada index ganjil dari deret bil. prima dijumlah dengan angka pada index ganjil dari deret bil. fibonacci
		//4. Angka pada index genap dari deret bil. prima dijumlah dengan angka pada index genap dari deret bil. fibonacci
		//Contoh deret
		//Deret bil. prima = 2, 3, 5, 7, 11
		//Deret bil. fibonacci = 0, 1, 1, 2, 3
		//Contoh output
		//2, 4, 6, 9, 14
		
		System.out.print("Masukkan panjang deret: ");
		int deret = masukan.nextInt();
		
		int[] prima = new int[deret];
		int[] fibonacci = new int[deret];
		
		int angka = 0;
		int angkaPrima = 0;
		int indexPrima = 0;
		int indexFibonacci = 0;
		
		while (indexPrima < deret) {
			if (angkaPrima <= 1) {
				angkaPrima++;
			}
			
			for (int i = 2; i <= Math.sqrt(angkaPrima); i++) {
				if (angkaPrima%i == 0) {	
				}
			}
			angkaPrima++;
		}
		prima[indexPrima] = angkaPrima;
		indexPrima++;
		System.out.print(prima[indexPrima]);
		
	}
}
