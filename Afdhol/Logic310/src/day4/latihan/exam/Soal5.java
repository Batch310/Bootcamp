package day4.latihan.exam;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int porsiDewasaL = 2;
		int porsiDewasaP = 1;
		int porsiRemaja = 1;
		double porsiAnak = 0.5;
		int porsiBalita = 1;

		int dewasaL = 0;
		int dewasaP = 0;
		int remaja = 0;
		int anak = 0;
		int balita = 0;

		double totalPorsi = 0;
		int totalOrang = 0;
		int tambahPorsi=0;
		
		System.out.println("input: ");
		String input = scan.nextLine();

		String laki ="";
		String perempuan="";
		
		String[] newArray = input.split(" orang;");
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = scan.nextLine();
			System.out.println(newArray[i]);

		}
		//laki =
		
		
		
		
		System.exit(0);
//		System.out.print("Jumlah Dewasa Laki: ");
//		dewasaL = scan.nextInt();
//		System.out.print("Jumlah Dewasa Perempuan: ");
//		dewasaP = scan.nextInt();
//		System.out.print("Jumlah Remaja: ");
//		remaja = scan.nextInt();
//		System.out.print("Jumlah anak: ");
//		anak = scan.nextInt();
//		System.out.print("Jumlah balita: ");
//		balita = scan.nextInt();

		totalOrang = dewasaL + dewasaP + remaja + anak + balita;

		if (totalOrang % 2 == 1 && totalOrang > 5) {
			tambahPorsi++;
		}

		totalPorsi = (dewasaL * porsiDewasaL) + (dewasaP * porsiDewasaP) + (remaja * porsiRemaja)
				+ (anak * porsiAnak) + (balita * porsiBalita)+tambahPorsi;

	//	System.out.println("jml orang "+totalOrang);

		System.out.println(totalPorsi);

	}

}
