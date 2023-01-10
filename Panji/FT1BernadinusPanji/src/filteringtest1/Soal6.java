package filteringtest1;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Inputan : ");
		String perjalanan = input.nextLine();

		String[] arrPerjalanan = perjalanan.split(" ");

		int mdpl = 0;
		int gunung = 0;
		int lembah = 0;
		int puncak = 0;
		int bawah = 0;

		for (int i = 0; i < arrPerjalanan.length; i++) {
			String rute = arrPerjalanan[i];
			if (rute.equals("N")) {
				mdpl++;
				if (puncak < mdpl) {
					puncak = mdpl;
				}
				if (mdpl == 0) {
					lembah++;
				}
			} else {
				mdpl--;
				if (bawah > mdpl) {
					bawah = mdpl;
				}
				if (mdpl == 0) {
					gunung++;
				}
			}
		}
		System.out.println("Jumlah Gunung yang dilewati Chester " + gunung);
		System.out.println("Jumlah lembah yag dilewati Chester " + lembah);
		System.out.println();
		System.out.println("Titik tertinggi chester " + puncak);
		System.out.println("Titik terendah chester " + bawah);
	}

}
