package day5.latihan;

import java.util.Scanner;

public class exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input : "); // Laki-laki = 2 orang; Perempuan = 3 orang;
		String[] inputan = input.nextLine().split("; "); // "Laki-laki = 2 orang", "Perempuan = 3 orang"
		int totalJumlahOrang = 0, jumlahPerempuan = 0, totalJumlahLA = 0;
		double porsiL = 0, totalJumlahPorsi = 0, porsiP = 0, porsiR = 0, porsiB = 0, porsiA = 0;
		for (int i = 0; i < inputan.length; i++) { // i = 2; length = 2
			String[] list = inputan[i].split(" = "); // "Perempuan", "3 orang"
			String orang = list[0]; // cari orang -> "Perempuan"
			String sjumlahOrang = list[1].replace(" orang", "");// 2 orang
			int jumlahOrang = Integer.parseInt(sjumlahOrang);// cari angka / jumlah orang -> 2
//			String sPorsiLA = "Nasi Goreng", sPorsiP = "Mie Goreng",sPorsiR = "Mie Ayam", sPorsiB = "Bubur";
//			String sjmlhOrang = list[1].substring(0, 1);
//			int jmlhOrang = Integer.parseInt(sjmlhOrang);
//			System.out.println(orang);
//			System.out.println(jumlahOrang);
			if (orang.equalsIgnoreCase("Laki-laki dewasa")) {
				porsiL = 2 * jumlahOrang; // porsi = 4
				totalJumlahLA += porsiL;
				totalJumlahOrang += jumlahOrang;
			} else if (orang.equalsIgnoreCase("Perempuan dewasa")) {
				porsiP = 1 * jumlahOrang;// porsi = 1 *3 = 3
				jumlahPerempuan += jumlahOrang;
				totalJumlahOrang += jumlahOrang;
			} else if (orang.equalsIgnoreCase("anak-anak")) {
				porsiA = 0.5 * jumlahOrang;
				totalJumlahLA += porsiA;
				totalJumlahOrang += jumlahOrang;
			} else if (orang.equalsIgnoreCase("Balita")) {
				porsiB = 1 * jumlahOrang;
				totalJumlahOrang += jumlahOrang;
			} else if (orang.equalsIgnoreCase("Remaja")) {
				porsiR = 1 * jumlahOrang;
				totalJumlahOrang += jumlahOrang; // 2 + 3 = 5
				// totalJumlahPorsi += porsi; // 4 + 3 = 7
			}

		}
		if (totalJumlahOrang % 2 != 0 & totalJumlahOrang > 5) {
			// totalJumlahPorsi += jumlahPerempuan;
			porsiP += jumlahPerempuan;
		}
//		System.out.println(totalJumlahPorsi);
		System.out.println("Nasi Goreng = " + totalJumlahLA);
		System.out.println("Mie Goreng = " + porsiP);
		System.out.println("Mie Ayam = " + porsiR);
		System.out.println("Bubur = " + porsiB);
	}

}
