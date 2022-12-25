package day5.pagi;

//import java.util.Iterator;
import java.util.Scanner;

public class Soal5PorsiMakan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int dLaki = 2;
		int dPerempuan = 1;
		int remaja = 1;
		double anak = 0.5;
		int balita = 1;

		int porsiLaki = 0;
		int porsiPerempuan = 0;
		int porsiRemaja = 0;
		double porsiAnak = 0;
		int porsiBalita = 0;

		double totalJumlahPorsi = 0;
		int totalOrang = 0;
//		double totalPorsi = 0;
		int intOrang = 0;
		String orang = null;

		System.out.println("Masukkan pelanggan : ");
		String pelanggan = input.nextLine();

		String[] arrPelanggan = pelanggan.split(";");
		for (int i = 0; i < arrPelanggan.length; i++) {
			String[] yangMakan = arrPelanggan[i].split(" = ");
			for (int j = 1; j >= 0; j--) {
				orang = yangMakan[0];
//				System.out.println(orang);
				if (yangMakan[j].contains(" orang")) {
					String jmlOrang = yangMakan[j].replace(" orang", "");
//					System.out.println(jmlOrang);
					intOrang = Integer.parseInt(jmlOrang);
					

				}
				
			}
			if (orang.equalsIgnoreCase("Laki-laki dewasa")) {
				porsiLaki += intOrang * dLaki;
			} else if (orang.equalsIgnoreCase("Perempuan dewasa")) {
				porsiPerempuan += intOrang * dPerempuan;
			} else if (orang.equalsIgnoreCase("Remaja")) {
				porsiRemaja += intOrang * remaja;
			} else if (orang.equalsIgnoreCase("Anak-anak")) {
				porsiAnak += intOrang * anak;
			} else if (orang.equalsIgnoreCase("Balita")) {
				porsiBalita += intOrang * balita;
			}
			totalOrang += intOrang;
			if (totalOrang % 2 == 1 && totalOrang > 5) {
				porsiPerempuan += porsiPerempuan;
				totalJumlahPorsi = porsiLaki + porsiPerempuan + porsiRemaja + porsiAnak + porsiBalita;
			} else {
				totalJumlahPorsi = porsiLaki + porsiPerempuan + porsiRemaja + porsiAnak + porsiBalita;
			}
			
//			String jmlOrang = yangMakan[1].substring(0, 1);

		}

		System.out.println(totalJumlahPorsi);
//		Laki-laki dewasa = 3 orang;Perempuan dewasa = 1 orang;Balita = 1 orang;Laki-laki dewasa = 1 orang;

//		System.out.print("Berapa laki-laki dewasa? ");
//		int LD = input.nextInt();
//		System.out.print("Berapa perempuan dewasa? ");
//		int PD = input.nextInt();
//		System.out.print("Berapa remaja? ");
//		int RE = input.nextInt();
//		System.out.print("Berapa anak? ");
//		int AN = input.nextInt();
//		System.out.print("Berapa balita? ");
//		int BA = input.nextInt();

		input.close();

//		if (LD > 0) {
//			porsiLaki = LD * dLaki;
//		}
//		if (PD > 0) {
//			porsiPerempuan = PD * dPerempuan;
//		}
//		if (RE > 0) {
//			porsiRemaja = RE * remaja;
//		}
//		if (AN > 0) {
//			porsiAnak = AN * anak;
//		}
//		if (BA > 0) {
//			porsiBalita = BA * balita;
//		}

//		totalOrang = LD + PD + RE + AN + BA;
//
//		if (totalOrang % 2 == 1 && totalOrang > 5) {
//			porsiPerempuan++;
//			totalPorsi = porsiLaki + porsiPerempuan + porsiRemaja + porsiAnak + porsiBalita;
//			System.out.println("Total porsi makan adalah " + (int) totalPorsi + " porsi");
//		} else {
//			totalPorsi = porsiLaki + porsiPerempuan + porsiRemaja + porsiAnak + porsiBalita;
//			System.out.println("Total porsi makan adalah " + (int) totalPorsi + " porsi");
//		}
	}

}
