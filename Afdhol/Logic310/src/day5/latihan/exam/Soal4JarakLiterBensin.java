package day5.latihan.exam;

import java.util.Scanner;

public class Soal4JarakLiterBensin {

	public static void main(String[] args) {

		// diket:
		// toko ke tempat 1 = 2 km
		// tempat1 ke tempat2 = 0,5km
		// tempat2 ke tempat3 = 1,5km
		// tempat3 ke tempat4 = 2,5km

		// soal= toko-tempat 1-tempat 2-toko
		// output 2liter

		Scanner input = new Scanner(System.in);
		System.out.println("Rute : ");
		String[] rute = input.nextLine().split(" - ");
		double r1 = 2000, r2 = 500, r3 = 1500, r4 = 2500, bensin = 2500, jarak = 0, sumJarak = 0;
		double sumBensin = 0;
		for (int i = 0; i < rute.length - 1; i++) {
			if ((rute[i].equalsIgnoreCase("toko") & rute[i + 1].equalsIgnoreCase("tempat 1"))
					| (rute[i].equalsIgnoreCase("tempat 1") & rute[i + 1].equalsIgnoreCase("toko"))) {
				jarak = r1;
				//System.out.println(jarak);
			} else if ((rute[i].equalsIgnoreCase("tempat 1") & rute[i + 1].equalsIgnoreCase("tempat 2"))
					| (rute[i].equalsIgnoreCase("tempat 2") & rute[i + 1].equalsIgnoreCase("tempat 1"))) {
				jarak = r2;
				//System.out.println(jarak);
			} else if ((rute[i].equalsIgnoreCase("tempat 2") & rute[i + 1].equalsIgnoreCase("tempat 3"))
					| (rute[i].equalsIgnoreCase("tempat 3") & rute[i + 1].equalsIgnoreCase("tempat 2"))) {
				jarak = r3;
			} else if ((rute[i].equalsIgnoreCase("tempat 3") & rute[i + 1].equalsIgnoreCase("tempat 4"))
					| (rute[i].equalsIgnoreCase("tempat 4") & rute[i + 1].equalsIgnoreCase("tempat 3"))) {
				jarak = r4;
			} else if ((rute[i].equalsIgnoreCase("toko") & rute[i + 1].equalsIgnoreCase("tempat 2"))
					| (rute[i].equalsIgnoreCase("tempat 2") & rute[i + 1].equalsIgnoreCase("toko"))) {
				jarak = r1 + r2;
			} else if ((rute[i].equalsIgnoreCase("toko") & rute[i + 1].equalsIgnoreCase("tempat 3"))
					| (rute[i].equalsIgnoreCase("tempat 3") & rute[i + 1].equalsIgnoreCase("toko"))) {
				jarak = r1 + r2 + r3;
			} else if ((rute[i].equalsIgnoreCase("toko") & rute[i + 1].equalsIgnoreCase("tempat 4"))
					| (rute[i].equalsIgnoreCase("tempat 4") & rute[i + 1].equalsIgnoreCase("toko"))) {
				jarak = r1 + r2 + r3 + r4;
			} else if ((rute[i].equalsIgnoreCase("tempat 1") & rute[i + 1].equalsIgnoreCase("tempat 3"))
					| (rute[i].equalsIgnoreCase("tempat 3") & rute[i + 1].equalsIgnoreCase("tempat 1"))) {
				jarak = r2 + r3;
			} else if ((rute[i].equalsIgnoreCase("tempat 1") & rute[i + 1].equalsIgnoreCase("tempat 4"))
					| (rute[i].equalsIgnoreCase("tempat 4") & rute[i + 1].equalsIgnoreCase("tempat 1"))) {
				jarak = r2 + r3 + r4;
			} else if ((rute[i].equalsIgnoreCase("tempat 2") & rute[i + 1].equalsIgnoreCase("tempat 4"))
					| (rute[i].equalsIgnoreCase("tempat 4") & rute[i + 1].equalsIgnoreCase("tempat 2"))) {
				jarak = r3 + r4;
			} else {

			}
			sumJarak = sumJarak + jarak;
		}
		sumBensin = sumJarak / bensin;
		System.out.println(sumBensin + " liter");
	}

}
