package day5.latihan;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String makanan = input.nextLine();

		String[] arrMakan = makanan.split(";");

		String jmlOrang = null;
		int jmlOrang1 = 0;

		for (int i = 0; i < arrMakan.length; i++) {
//			System.out.println(arrMakan[i]);
			String[] arrMakan1 = arrMakan[i].split(" = ");
			for (int j = 1; j < arrMakan1.length; j++) {
//				System.out.println(arrMakan1[0]);
				if (arrMakan1[j].contains(" orang")) {
					jmlOrang = arrMakan1[j].replace(" orang", "");
					jmlOrang1 = Integer.parseInt(jmlOrang);
//					System.out.println(jmlOrang1);
				}
			}
		}

		
//		System.out.println();
		double lakiPorsi = 2;
		double perempuanPorsi = 1;
		double remajaPorsi = 1;
		double anakPorsi = 0.5;
		double balitaPorsi = 1;

		int lakiLaki = 4;
		int perempuan = 2;
		int remaja = 1;
		int anak = 1;
		int balita = 1;

		double tampung1 = 0;
		tampung1 = jmlOrang1 * lakiPorsi;
//		tampung1 = tampung1 + perempuan * perempuanPorsi;
//		tampung1 = tampung1 + balita * balitaPorsi;
//		tampung1 = tampung1 + remaja * remajaPorsi;
//		tampung1 = tampung1 + anak * anakPorsi;

		double orang = 0;
		orang = lakiLaki + perempuan + remaja + anak + balita;

//		if (orang % 2 == 1) {
//			tampung1 = tampung1 + perempuan;
//		}

		System.out.print(tampung1);

	}

}
