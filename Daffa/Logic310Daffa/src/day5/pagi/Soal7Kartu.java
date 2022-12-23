package day5.pagi;

import java.util.*;

public class Soal7Kartu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random acak = new Random();

		int kartu = 0;
		int tawaran = 0;
		int kotakA = 0;
		int kotakB = 0;
		String pilihan1 = "A";
		String pilihan2 = "B";

		System.out.println("Masukkan jumlah kartu : ");
		kartu = input.nextInt();
		System.out.println("Masukkan jumlah tawaran : ");
		tawaran = input.nextInt();

		kotakA = acak.nextInt(10);
		kotakB = acak.nextInt(10);

		if (tawaran <= kartu) {
			while (kartu > 0) {
				System.out.println("Pilih kotak A atau B? ");
				String choose = input.next();
				if (choose.equalsIgnoreCase(pilihan1)) {
					if (kotakA < kotakB) {
						kartu -= tawaran;
					} else if (kotakA > kotakB) {
						kartu += tawaran;
						System.out.println(kotakA + " You Win");
						System.exit(0);
					} else {
						kartu += 0;
					}
				} else if (choose.equalsIgnoreCase(pilihan2)) {
					if (kotakA > kotakB) {
						kartu -= tawaran;
					} else if (kotakA < kotakB) {
						kartu += tawaran;
						System.out.println(kotakB + " You Win");
						System.exit(0);
					} else {
						kartu += 0;
					}
				} else {
					System.out.println("Pilihan tidak dikenal");
					System.exit(0);
				}

			}
			System.out.println("You Lose!");
		} else {
			System.out.println("Tawaran tidak boleh lebih dari jumlah kartu!");
		}
		input.close();
	}

}
