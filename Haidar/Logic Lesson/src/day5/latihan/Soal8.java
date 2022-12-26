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
		
		String prima = "";
		String fibonacci = "";
//		int[] prima = new int[deret];
//		int[] fibonacci = new int[deret];
		
		int angka = 0;
		int found = 0;
		int fibo1 = 0;
		int fibo2 = 1;
		
		while (found < deret) {
			int pembagiHabis = 0;
			
			if (angka == 0 || angka == 1) {
				angka++;
			} else if (angka >=2) {
				if (angka == 2) {
					prima += angka + " ";
					angka++;
					found++;
				} else {
					for (int i = 2; i <= Math.sqrt(angka); i++) {
						if (angka%i == 0) {
							pembagiHabis++;
						}
					}
					if (pembagiHabis == 0) {
						prima += angka + " ";
						found++;
					}
					angka++;
				}		
			}			
		}
//		System.out.print(prima + " ");
		
//		System.out.println();
		
		found = 0;
		while (found < deret) {
			int nextFibo = 0;	
			fibonacci += fibo1 + " "; //0, 1, 1,
			nextFibo = fibo1 + fibo2; // 0+1=1, 1+1=2, 1+2=3,
			fibo1 = fibo2; //0->1, 1, 2
			fibo2 = nextFibo; // 1->1, 2, 3 
			found++;
		}
//		System.out.print(fibonacci + " ");
		
//		System.out.println();
		
		String[] arrPrima = prima.split(" ");
		String[] arrFibo = fibonacci.split(" ");
		
		for (int i = 0; i < deret; i++) {
			int jumlahPribo = Integer.parseInt(arrPrima[i]) + Integer.parseInt(arrFibo[i]);
			System.out.print(jumlahPribo + ", ");
		}
		
	}
}
