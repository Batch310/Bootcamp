package day5.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal07_randomTebakAngka {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan jumlah kartu = ");
		int jmlKartu = scanner.nextInt();
		int kCom = jmlKartu;
		int kUser = jmlKartu;

		Random randomGen = new Random();

		while (true) {
			System.out.print("Masukkan tawaran anda = ");
			int tawaran = scanner.nextInt();

			if (kCom >= tawaran && kUser >= tawaran) {

				int[] kotakAngka = new int[2];
				for (int i = 0; i < 1; i++) {
					kotakAngka[0] = randomGen.nextInt(10); // (10) length angka random(0-9)
					kotakAngka[1] = randomGen.nextInt(10);
				}

				System.out.print("Pilih kotak, A atau B ? ");
				String pilih = scanner.next();
				if (pilih.equalsIgnoreCase("A")) {
					if (tawaran > kotakAngka[0]) {
						kCom -= tawaran;
						kUser += tawaran;
						System.out.print(
								"Kotak A = " + kotakAngka[0] + " " + "Kotak B = " + kotakAngka[1] + " You Win! ");

					} else if (tawaran < kotakAngka[0]) {
						kUser -= tawaran;
						kCom += tawaran;
						System.out.print(
								"Kotak A = " + kotakAngka[0] + " " + "Kotak B = " + kotakAngka[1] + " You Lose!");
					} else if (tawaran == kotakAngka[0]) {
						System.out.print("Kotak A = " + kotakAngka[0] + " " + "Kotak B = " + kotakAngka[1] + " Draw!");
					}

				} else if (pilih.equalsIgnoreCase("B")) {
					if (tawaran > kotakAngka[1]) {
						kCom -= tawaran;
						kUser += tawaran;
						System.out.print(
								"Kotak A = " + kotakAngka[0] + " " + "Kotak B = " + kotakAngka[1] + " You Win! ");

					} else if (tawaran < kotakAngka[1]) {
						kUser -= tawaran;
						kCom += tawaran;
						System.out.print(
								"Kotak A = " + kotakAngka[0] + " " + "Kotak B = " + kotakAngka[1] + " You Lose!");
					} else if (tawaran == kotakAngka[1]) {
						System.out.print("Kotak A = " + kotakAngka[0] + " " + "Kotak B = " + kotakAngka[1] + " Draw!");
					}

				} else {
					System.out.print("Pilihan tidak ada!");
				}

			} else {

				System.out.println("Kartu tidak cukup");
				System.out.println("Sisa Kartu Anda : " + kUser);
				System.out.println("Sisa Kartu Computer : " + kCom);
			}

			System.out.println();

			System.out.println("Ketik 1 menyerah/keluar permainan!");
			String exit = scanner.next();
			if (exit.equals("1")) {
				break;
			}

		}
	}
}
