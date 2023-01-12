package ujian.FT1;

import java.util.Scanner;

public class No_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan jumlah angka genap = ");
		int n = scanner.nextInt();

		int[] arrHasil = new int[n];

		int found = 0;
		int nilaiAwal = 3;

		while (found < n) {

			
			if (nilaiAwal % 4 != 0 ) {
				
				arrHasil[found] = nilaiAwal;
				found++;
			}
			nilaiAwal += 3;
		}

		for (int i : arrHasil) {
			System.out.print(i + " ");
		}

	}

}
