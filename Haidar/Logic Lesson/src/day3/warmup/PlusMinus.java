package day3.warmup;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan banyaknya angka: ");
		int deret = masukan.nextInt();
		
		double[] arrayAngka = new double[deret];
		double negatif = 0;
		double nol = 0;
		double positif = 0;
		
		for (int i = 0; i < arrayAngka.length; i++) {
			System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
			arrayAngka[i] = masukan.nextInt();
			if (arrayAngka[i] < 0) {
				negatif++;
			} else if (arrayAngka[i] == 0) {
				nol++;
			} else {
				positif++;
			}
		}
		
		double negatifProportion = negatif/deret;
		double nolProportion = nol/deret;
		double positifProportion = positif/deret;
		
		System.out.println(positifProportion);
		System.out.println(negatifProportion);
		System.out.println(nolProportion);
		
	}
}
