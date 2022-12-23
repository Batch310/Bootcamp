package day5.latihan;

import java.util.Scanner;

public class Soal5 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan jumlah orang:");
		String orang = masukan.nextLine();
		
		//Program yang diinginkan:
		//1. Tiap 1 org dewasa laki - laki 2 piring
		//2. Tiap 1 oran dewasa perempuan 1 piring
		//3. Tiap 2 orang remaja 2 mangkok/porsi
		//4. Tiap 1 orang anak - anak 1/2 piring
		//5. Tiap 1 orang balita 1 mangkok
		//6. Jika jumlah orang yang makan ganjil dan lebih dari 5, tiap orang dewasa perempuan tambah 1 piring
		//7. Input berupa => Laki-laki dewasa = 3 orang; Perempuan dewasa = 1 orang; Balita = 1 orang; Laki-laki dewasa = 1 orang
		//8. Mencari berapa total porsi yang dimakan
		
		String[] arrOrang = orang.split("; ");
		double jumlahPorsi = 0;
		int jumlahOrang = 0;
		
		for (int i = 0; i < arrOrang.length; i++) {
//			System.out.println(arrOrang[i]);
				String[] tiapOrang = arrOrang[i].split(" = "); //Dapet array dengan isi Laki-laki dewasa dan 3 orang
				for (int j = 0; j < tiapOrang.length; j++) {
					if (tiapOrang[j].contains("orang")) {
						String orangStr = tiapOrang[j].replace(" orang", "");
//						System.out.println(orangStr);
						int orangInt = Integer.parseInt(orangStr);
						jumlahOrang += orangInt;
//						if (tiapOrang[0].equals("Laki-laki dewasa")) {
//							jumlahPorsi += (orangInt*2);
//						}
//						System.out.println(jumlahOrang);
					}
				}
				
//				System.out.println(jumlahOrang);
		}
		
		if ((jumlahOrang >= 5) && (jumlahOrang%2 != 0)) {
			for (int i = 0; i < arrOrang.length; i++) {
				String[] tiapOrang = arrOrang[i].split(" = ");
				for (int j = 0; j < tiapOrang.length; j++) {
					if (tiapOrang[j].contains("orang")) {
						String orangStr = tiapOrang[j].replace(" orang", "");
						int orangInt = Integer.parseInt(orangStr);
						if (tiapOrang[0].equals("Laki-laki dewasa")) {
							jumlahPorsi += (double) (orangInt*2);
						} else if (tiapOrang[0].equals("Perempuan dewasa")) {
							System.out.println(orangInt);
							jumlahPorsi += (double) (orangInt*2);
						} else if (tiapOrang[0].equals("Remaja")) {
							jumlahPorsi += (double) (orangInt*1);
						} else if (tiapOrang[0].equals("Anak-anak")) {
							jumlahPorsi += (double) (orangInt*0.5);
						} else if (tiapOrang[0].equals("Balita")) {
							jumlahPorsi += (double) (orangInt*1);
						}
					}
				}
			}
		} else {
			for (int i = 0; i < arrOrang.length; i++) {
				String[] tiapOrang = arrOrang[i].split(" = ");
				for (int j = 0; j < tiapOrang.length; j++) {
					if (tiapOrang[j].contains("orang")) {
						String orangStr = tiapOrang[j].replace(" orang", "");
						int orangInt = Integer.parseInt(orangStr);
						if (tiapOrang[0].equals("Laki-laki dewasa")) {
							jumlahPorsi += (double) (orangInt*2);
						} else if (tiapOrang[0].equals("Perempuan dewasa")) {
							jumlahPorsi += (double) (orangInt*1);
						} else if (tiapOrang[0].equals("Remaja")) {
							jumlahPorsi += (double) (orangInt*1);
						} else if (tiapOrang[0].equals("Anak-anak")) {
							jumlahPorsi += (double) (orangInt*0.5);
						} else if (tiapOrang[0].equals("Balita")) {
							jumlahPorsi += (double) (orangInt*1);
						}
					}
				}
			}
		}
		
		System.out.println(jumlahOrang);
		System.out.println(jumlahPorsi + " Porsi");
	}
}
