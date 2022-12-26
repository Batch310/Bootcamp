package day5.latihan;

import java.util.Scanner;

public class Soal04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Rute : ");
		String[] rute = scanner.nextLine().split("-"); //pisahkah variable

//		for (String i : rute) {
//			System.err.print(i + " ");
//		}

		double j1 = 2000, j2 = 500, j3 = 1500, j4 = 2500;
		double bensin = 2500;
		double jarak = 0;
		double sumJarak = 0;
		double sumBensin = 0;
                             
		                     //panjang rute != panjang array
		for (int i = 0; i < rute.length - 1; i++) {

			if ((rute[i].equalsIgnoreCase("toko") && rute[i + 1].equalsIgnoreCase("tempat1"))
					| (rute[i].equalsIgnoreCase("tempat1") && rute[i + 1].equalsIgnoreCase("toko"))) {
				jarak += j1;
			} else if ((rute[i].equalsIgnoreCase("tempat1") && rute[i + 1].equalsIgnoreCase("tempat2"))
					| (rute[i].equalsIgnoreCase("tempat2") && rute[i + 1].equalsIgnoreCase("tempat1"))) {
				jarak += j2;
			} else if ((rute[i].equalsIgnoreCase("tempat2") && rute[i + 1].equalsIgnoreCase("tempat3"))
					| (rute[i].equalsIgnoreCase("tempat3") && rute[i + 1].equalsIgnoreCase("tempat2"))) {
				jarak += j3;
			} else if ((rute[i].equalsIgnoreCase("tempat3") && rute[i + 1].equalsIgnoreCase("tempat4"))
					| (rute[i].equalsIgnoreCase("tempat4") && rute[i + 1].equalsIgnoreCase("tempat3"))) {
				jarak += j4;
			} else if ((rute[i].equalsIgnoreCase("toko") && rute[i + 1].equalsIgnoreCase("tempat2"))
					| (rute[i].equalsIgnoreCase("tempat2") & rute[i + 1].equalsIgnoreCase("toko"))) {
				jarak += j1 + j2;
			} else if ((rute[i].equalsIgnoreCase("toko") && rute[i + 1].equalsIgnoreCase("tempat3"))
					| (rute[i].equalsIgnoreCase("tempat3") && rute[i + 1].equalsIgnoreCase("toko"))) {
				jarak += j1 + j2 + j3;
			} else if ((rute[i].equalsIgnoreCase("toko") && rute[i + 1].equalsIgnoreCase("tempat4"))
					| (rute[i].equalsIgnoreCase("toko4") && rute[i + 1].equalsIgnoreCase("toko"))) {
				jarak += j1 + j2 + j3 + j4;
			} else if ((rute[i].equalsIgnoreCase("tempat1") && rute[i + 1].equalsIgnoreCase("tempat3"))
					| (rute[i].equalsIgnoreCase("tempat3") && rute[i + 1].equalsIgnoreCase("tempat1"))) {
				jarak += j2 + j3;
			} else if ((rute[i].equalsIgnoreCase("tempat1") && rute[i + 1].equalsIgnoreCase("tempat4"))
					| (rute[i].equalsIgnoreCase("tempat4") && rute[i + 1].equalsIgnoreCase("tempat1"))) {
				jarak += j2 + j3 + j4;
			} else if ((rute[i].equalsIgnoreCase("tempat2") && rute[i + 1].equalsIgnoreCase("tempat4"))
					| (rute[i].equalsIgnoreCase("tempat4") && rute[i + 1].equalsIgnoreCase("tempat2"))) {
				jarak += j3 + j4;
			} else {
				sumJarak += jarak;
			}
		}

		sumBensin = jarak / bensin;
		System.out.print(sumBensin + " Liter");

	}

}
