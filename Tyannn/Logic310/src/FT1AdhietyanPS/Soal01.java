package FT1AdhietyanPS;

import java.util.Scanner;

public class Soal01 {

	public static void main(String[] args) {
		// 5 stik ditukar 1 buah es loli gratis
		// harga es loli Rp.1000
		// berapa jumlah maksimal es loli yang didapatkan bambang dengan uang Rp xxx ?

		Scanner input = new Scanner(System.in);

		System.out.print("Rp. ");
		int n = input.nextInt(); // 20000

		int bonus = (n / 5) / 1000; // 4000/1000 = 4
		int esLoli = (n / 1000) + bonus; // 20000/10000 = 20 + 4 = 24
		
		if(esLoli > 9) {
			esLoli++;
			System.out.print("Jumlah yang dapat dibeli bambang adalah " + esLoli);
		}
		else {
			System.out.print("Jumlah yang dapat dibeli bambang adalah " + esLoli);
		}
		
		System.out.println();
		
		

	}

}
