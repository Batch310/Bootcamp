package SimulasiFT1;

import java.util.Scanner;

public class Soal03DeretXDanY {
	public static void main(String[] args) {
		//X kelipatan 5 -> 5,10,15,20, dst
		//Y kelipatan 8 -> 8, 16, 24, 31, dst
		//Deret sepanjang n yangmana bilangannya ada di X dan Y
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan panjang deret : ");
		int deret = masukan.nextInt();
		
		int found = 0;
		
		for (int i = 8; found < deret; i = i + 8) {
			int bilX = 5; 
			bilX *=i;
			for (int j = 5; j < j*i; j = j + 5) {
				int bilY = 8;
				bilY *=j;
				if (bilX == bilY) {
					found++;
				}
			}
		System.out.print(bilX + " ");
		}
		masukan.close();
	}
}
