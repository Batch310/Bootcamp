package day5.pagi;

import java.util.Scanner;

public class Soal3SiAngka1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan n : ");
		int n = input.nextInt();
		input.close();

		int angkaAwal = 100, ketemu = 0, i = 0, convAngka = 0, prosesPangkat = 0, hasilPangkat = 0;

		if (n >= 1 && n <= 100) {
			while (ketemu < n) {
				String siAngka = Integer.toString(angkaAwal);
				String[] arrSiAngka = siAngka.split("");
				convAngka = Integer.parseInt(arrSiAngka[i]);
				prosesPangkat = (int) Math.pow(convAngka, 2);
				hasilPangkat += prosesPangkat;
				i++;
			}
//			for (int i = 0; i < n; i++) {
//				String siAngka = Integer.toString(angkaAwal);
//				String[] arrSiAngka = siAngka.split("");
//				for (int j = 0; j < arrSiAngka.length; j++) {
//					int convAngka = Integer.parseInt(arrSiAngka[j]);
//					int hasilPangkat = (int) Math.pow(convAngka, 2);
//					simpanan += hasilPangkat;
//					System.out.println(simpanan);
//					if (simpanan > 9) {
//						while (simpanan > 9) {
//							String convSimpanan = Integer.toString(simpanan);
//							String[] arrSimpanan = convSimpanan.split("");
//							int convBaru = Integer.parseInt(arrSimpanan[i]);
//							int hasilPangkatBaru = (int) Math.pow(convBaru, 2);
//							simpananBaru += hasilPangkatBaru;
//							System.out.println(simpananBaru);
//						}
//					}
//					
//				}
//			}
		} else {
			System.out.println("n lebih dari 100");
		}

	}
}