package day7.pagi;

import java.util.Random;
import java.util.Scanner;

public class Jambrong07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random acak = new Random();

		int kartuAnda = 0;
		int kartuKomputer = 0;
		int tawaran = 0;
		int kotakA = 0;
		int kotakB = 0;
		int winner = 0;
		String pilihan1 = "A";
		String pilihan2 = "B";
		String pilihan3 = "Menyerah";
		System.out.println("Masukkan jumlah kartu : ");
		kartuAnda = input.nextInt();
		kartuKomputer = kartuAnda;
		System.out.println("Kartu Anda : " + kartuAnda);
		System.out.println("Kartu Komputer : " + kartuKomputer);
		while (kartuAnda > 0 && kartuKomputer > 0) {
			kotakA = acak.nextInt(10);
			kotakB = acak.nextInt(10);
//			System.out.println(kotakA);
//			System.out.println(kotakB);
			System.out.println("Masukkan jumlah tawaran : ");
			tawaran = input.nextInt();
			System.out.println("Kartu Anda : " + kartuAnda);
			System.out.println("Kartu Komputer : " + kartuKomputer);
			if (tawaran <= kartuAnda && tawaran <= kartuKomputer) {
				System.out.println("Pilih kotak A atau B atau Menyerah? ");
				String choose = input.next();
				if (choose.equalsIgnoreCase(pilihan1)) {
					if (kotakA < kotakB) {
						kartuAnda -= tawaran;
						kartuKomputer += tawaran;
						System.out.println("Tebakan salah, kartu berkurang sebanyak " + tawaran);
						System.out.println("Kotak A : " + kotakA);
						System.out.println("Kotak B : " + kotakB);
					} else if (kotakA > kotakB) {
						kartuAnda += tawaran;
						kartuKomputer -= tawaran;
						System.out.println(kotakA + " Tebakan anda benar");
						System.out.println("Kotak A : " + kotakA);
						System.out.println("Kotak B : " + kotakB);
					} else {
						winner = acak.nextInt(2);
						if (winner == 1) {
							System.out.println("Anda Hoki");
							kartuAnda += tawaran;
							kartuKomputer -= tawaran;
							System.out.println("Kotak A : " + kotakA);
							System.out.println("Kotak B : " + kotakB);
						} else {
							System.out.println("Anda nggak hoki");
							kartuAnda -= tawaran;
							kartuKomputer += tawaran;
							System.out.println("Kotak A : " + kotakA);
							System.out.println("Kotak B : " + kotakB);
						}
					}
				} else if (choose.equalsIgnoreCase(pilihan2)) {
					if (kotakA > kotakB) {
						kartuAnda -= tawaran;
						kartuKomputer += tawaran;
						System.out.println("Tebakan salah, kartu berkurang sebanyak " + tawaran);
						System.out.println("Kotak A : " + kotakA);
						System.out.println("Kotak B : " + kotakB);
					} else if (kotakA < kotakB) {
						kartuAnda += tawaran;
						kartuKomputer -= tawaran;
						System.out.println(kotakB + " Tebakan anda benar");
						System.out.println("Kotak A : " + kotakA);
						System.out.println("Kotak B : " + kotakB);
					} else {
						winner = acak.nextInt(2);
						if (winner == 1) {
							System.out.println("Anda Hoki");
							kartuAnda += tawaran;
							kartuKomputer -= tawaran;
							System.out.println("Kotak A : " + kotakA);
							System.out.println("Kotak B : " + kotakB);
						} else {
							System.out.println("Anda nggak hoki");
							kartuAnda -= tawaran;
							kartuKomputer += tawaran;
							System.out.println("Kotak A : " + kotakA);
							System.out.println("Kotak B : " + kotakB);
						}
					}
				} else if (choose.equalsIgnoreCase(pilihan3)) {
					System.out.println("You Surrendered, You Lose");
					System.exit(0);
				} else {
					System.out.println("Pilihan tidak dikenal");
					System.exit(0);
				}
			} else if (tawaran >= kartuAnda || tawaran >= kartuKomputer) {
				System.out.println("Tawaran tidak boleh lebih dari jumlah kartu!");
			}

		}
			if (kartuAnda > 0) {
			System.out.println("You Win");
			System.out.println("Kotak A : " + kotakA);
			System.out.println("Kotak B : " + kotakB);
		} else if (kartuKomputer > 0) {
			System.out.println("You Lose");
			System.out.println("Kotak A : " + kotakA);
			System.out.println("Kotak B : " + kotakB);
		}
	}

}