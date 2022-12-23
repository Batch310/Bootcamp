package day5.pagi;

import java.util.*;

public class Soal7Kartu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random acak = new Random();

		int kartuAnda = 0;
		int kartuKomputer = 0;
		int tawaran = 0;
		int kotakA = 0;
		int kotakB = 0;
		String pilihan1 = "A";
		String pilihan2 = "B";

		System.out.println("Masukkan jumlah kartu : ");
		kartuAnda = input.nextInt();
		kartuKomputer = input.nextInt();
		System.out.println("Masukkan jumlah tawaran : ");
		tawaran = input.nextInt();

		kotakA = acak.nextInt(10);
		kotakB = acak.nextInt(10);

		if (tawaran <= kartuAnda && tawaran <= kartuKomputer) {
			while (kartuAnda > 0 && kartuKomputer > 0) {
				System.out.println("Pilih kotak A atau B? ");
				String choose = input.next();
				if (choose.equalsIgnoreCase(pilihan1)) {
					if (kotakA < kotakB) {
						kartuAnda -= tawaran;
						kartuKomputer += tawaran;
						System.out.println("Tebakan salah, kartu berkurang sebanyak " + tawaran);
					} else if (kotakA > kotakB) {
						kartuAnda += tawaran;
						kartuKomputer -= tawaran;
						System.out.println(kotakA + " Tebakan anda benar");
					} else {
						kartuAnda += 0;
						kartuKomputer += 0;
					}
				} else if (choose.equalsIgnoreCase(pilihan2)) {
					if (kotakA > kotakB) {
						kartuAnda -= tawaran;
						kartuKomputer += tawaran;
						System.out.println("Tebakan salah, kartu berkurang sebanyak " + tawaran);
					} else if (kotakA < kotakB) {
						kartuAnda += tawaran;
						kartuKomputer -= tawaran;
						System.out.println(kotakB + " Tebakan anda benar");
					} else {
						kartuAnda += 0;
						kartuKomputer += 0;
					}
				} else {
					System.out.println("Pilihan tidak dikenal");
					System.exit(0);
				}

			}
			if (kartuAnda > 0) {
				System.out.println("You Win");
			} else if (kartuKomputer > 0) {
				System.out.println("You Lose");
			}
		} else {
			System.out.println("Tawaran tidak boleh lebih dari jumlah kartu!");
		}
		input.close();
	}

}
