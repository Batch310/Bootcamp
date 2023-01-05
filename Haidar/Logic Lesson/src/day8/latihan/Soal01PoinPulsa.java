package day8.latihan;

import java.util.Scanner;

public class Soal01PoinPulsa {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Beli Pulsa Rp.");
		int pulsa = masukan.nextInt();
		
		int poin = 0;
		int poin1 = 0;
		int poin2 = 0;
		int totalPoin = poin + poin1 + poin2;
		
		if (pulsa <= 10000) {
			poin = 0;
			totalPoin = poin;
			System.out.println(poin + " point");
		} else if (pulsa > 10000 && pulsa <= 30000) { //Pulsa diantara 10001 - 30000
			pulsa -= 10000; //Dikurangi 10000 karena 10000 pertama poinnya 0
			poin1 = (pulsa/1000); // sisa poin dibagi 1000
			totalPoin = poin1;
			System.out.println(poin + " + " + poin1 + " = " + totalPoin + " point");
		} else { //30001 keatas
			poin1 = (20000)/1000; //maks poin dari 30k pulsa pertama atau 30000-10000
			pulsa -= 30000; //pulsanya dikurang 30000 pertama
			poin2 = ((pulsa/1000)*2); 
			totalPoin = poin1 + poin2;
			System.out.println(poin + " + " + poin1 + " + " + poin2 + " = " + totalPoin + " point");
		}
		masukan.close();
		
	}
}
