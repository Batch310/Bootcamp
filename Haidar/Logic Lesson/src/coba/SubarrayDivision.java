package coba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubarrayDivision {
	public static void main(String[] args) {

		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan panjang array: ");
			Integer n = masukan.nextInt();

			List<Integer> s = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				System.out.print("Masukkan Choco Bar Integer: ");
				s.add(masukan.nextInt());
			}

			System.out.print("Masukkan nilai d: ");
			Integer d = masukan.nextInt();

			System.out.print("Masukkan nilai m: ");
			Integer m = masukan.nextInt();

			// ==========================================================

			Integer count = 0;		// Penampung total data dari hasil penjumlahan yang sama dengan d 
			Integer temp = 0;		// Penampung hasil penjumlahan
			Integer indexAwal = 0;		// Penampung index awal per perulangan
			
			System.out.println(s);
			
			if (s.size() == 1) {
				temp = s.get(0);
				if (temp == d) {
					count++;
				}
			} else if (s.size() > 1) {
				int m2 = m;		// Variabel batas akhir per perulangan
				for (int i = 0; i < s.size(); i++) {
					temp += s.get(i);		// Penjumlahan seluruh bilangan pada setiap perulangan
//					System.out.println(temp);
//					System.out.println();
					if (i == (m2 - 1)) {		// Pengecekan apakah index perulangan sama dengan batas akhir - 1
						if (temp == d) {		// Pengecekan apakah hasil penjumlahan sama dengan nilai d
							count++;		// Penambahan total data dari hasil pengecekan
						}
						System.out.println("Ini indexAwal: " + indexAwal);
						System.out.println("Ini m (indexAkhir): " + m2);
						System.out.println("Ini temp: " + temp);
						System.out.println();
						temp = 0;		// Mengatur ulang nilai penampung hasil penjumlahan menjadi 0
						indexAwal++;		// Menambahkan nilai indexAwal dengan 1
						i = indexAwal - 1;		// Mengatur nilai index perulangan menjadi nilai indexAwal
						m2++;		// Menambahkan nilai batas akhir perulangan dengan 1
					}
				}				
			}

			System.out.println(count);
		}

	}
}
