package day6;

import java.util.Scanner;

public class Haidar04 {
	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in); 

		System.out.print("Masukkan Rute: ");
		String rute = masukan.nextLine(); 

		// Program yang diinginkan:
		// 1. Ada pengantar makanan dari toko, dengan jalan lurus/linier
		// 2. Jarak Toko - Tempat 1 = 2km
		// 3. Jarak Tempat 1 - Tempat 2 = 500m
		// 4. Jarak Tempat 2 - Tempat 3 = 1.5km
		// 5. Jarak Tempat 3 - Tempat 4 = 2.5km
		// 6. Dan rute terakhir akan kembali ke Toko
		// 7. 1 Liter bensin dapat digunakan untuk 2.5km
		//Toko - Tempat 1 - Tempat 2 - Toko

		String[] arrRute = rute.split(" - "); //"Toko", "Tempat 1", "Tempat 2", "Toko"

		double totalJarak = 0; //5
		int urutanRute = 1;

		for (int i = urutanRute; i < arrRute.length;) { //i = 1; arrRute.length = 2
			if (arrRute[i].equals("Toko")) { //Toko
				totalJarak += 0;
				if (arrRute[i - 1].equals("Tempat 1")) { //arrRute[2] = Tempat 2
					totalJarak += 2;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 2")) {
					totalJarak += 2.5;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 3")) {
					totalJarak += 4;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 4")) {
					totalJarak += 6.5;
					i++;
				}
			} else if (arrRute[i].equals("Tempat 1")) { //
				if (arrRute[i - 1].equals("Toko")) { //i = 1, arrRute[0]
					totalJarak += 2;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 2")) {
					totalJarak += 0.5;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 3")) {
					totalJarak += 2;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 4")) {
					totalJarak += 4.5;
					i++;
				}
			} else if (arrRute[i].equals("Tempat 2")) { 
				if (arrRute[i - 1].equals("Toko")) { //i=2, arrRute[1] = Tempat 1
					totalJarak += 2.5;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 1")) {
					totalJarak += 0.5;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 3")) {
					totalJarak += 1.5;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 4")) {
					totalJarak += 4;
					i++;
				}
			} else if (arrRute[i].equals("Tempat 3")) {
				if (arrRute[i - 1].equals("Toko")) {
					totalJarak += 4;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 1")) {
					totalJarak += 2;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 2")) {
					totalJarak += 1.5;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 4")) {
					totalJarak += 2.5;
					i++;
				}
			} else if (arrRute[i].equals("Tempat 4")) {
				if (arrRute[i - 1].equals("Toko")) {
					totalJarak += 6.5;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 1")) {
					totalJarak += 4.5;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 2")) {
					totalJarak += 4;
					i++;
				} else if (arrRute[i - 1].equals("Tempat 3")) {
					totalJarak += 2.5;
					i++;
				}
			} else {
				System.out.println("Rute tidak valid!");
				System.exit(0);
			}

//			System.out.println(arrRute[i]);
		}
		
		double liter = (totalJarak / 2.5); //5/2.5 = 2 liter
		if (totalJarak % 2.5 == 0) { //5habis dibagi 2.5
			System.out.println((int) (liter) + " liter"); //Cetak => 2 liter
		} else { //5.5
			System.out.println(((int) (liter) + 1) + " liter");
		}
//		System.out.println(totalJarak);
//		System.out.println(liter);

	}
}
