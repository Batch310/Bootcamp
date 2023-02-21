package coba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSets {
	public static void main(String[] args) {

		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan panjang array a: ");
			Integer nA = masukan.nextInt();

			System.out.print("Masukkan panjang array b: ");
			Integer nB = masukan.nextInt();

			List<Integer> a = new ArrayList<>();
			List<Integer> b = new ArrayList<>();

			for (int i = 0; i < nA; i++) {
				System.out.print("Masukkan nilai pada array a: ");
				a.add(masukan.nextInt());
			}

			for (int i = 0; i < nB; i++) {
				System.out.print("Masukkan nilai pada array b: ");
				b.add(masukan.nextInt());
			}

//		Collections.sort(a, Collections.reverseOrder());
//		Collections.sort(b, Collections.reverseOrder());
//		
			// ==========================================================

			Integer biggestFactor = 0; // Nampung faktor terbesar dari array a
			Integer lowestInteger = b.get(0); // Nampung nilai terkecil dari array b
			List<Integer> arrFactor = new ArrayList<>();
			int count = 0; // Nampung banyaknya faktor

			// Perulangan untuk mencari faktor terbesar dari array a
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i) > biggestFactor) {
					biggestFactor = a.get(i);
				}
			}

			// Perulangan untuk mencari nilai terkecil dari array b
			for (int i = 0; i < b.size(); i++) {
				if (b.get(i) < lowestInteger) {
					lowestInteger = b.get(i);
				}
			}
//			System.out.println(biggestFactor);

			int factorNow = biggestFactor; // Menampung nilai kelipatan dari faktor terbesar

			// Perulangan untuk mencari kelipatan - kelipatan dari faktor terbesar yang
			// habis dibagi dengan faktor - faktor pada array a
			while (factorNow <= lowestInteger) {
				int temp = 0;
				for (int i = 0; i < a.size(); i++) {
					if (factorNow % a.get(i) == 0) {
						temp++;
					}
				}
				if (temp == a.size()) {
					arrFactor.add(factorNow);
				}
				factorNow += biggestFactor;
			}

			// Perulangan untuk mencari jumlah faktor dari array b, dengan membagi nilai -
			// nilai pada array b dengan faktor - faktor yang ada pada array penampung
			// arrFactor
			for (int i = 0; i < arrFactor.size(); i++) {
				int temp = 0;
				for (int j = 0; j < b.size(); j++) {
					if (b.get(j) % arrFactor.get(i) == 0) {
						temp++;
					}
				}
				if (temp == b.size()) {
					count++;
				}
			}

//			System.out.println(arrFactor);
//		System.out.print(arrBetween);
			System.out.println(count);
		}

	}
}
