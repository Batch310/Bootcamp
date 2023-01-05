package day8.latihanExam;

import java.util.Scanner;

public class KonversiVolume {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input a : ");
		String[] a = input.nextLine().split(" ");
		int jumlah = Integer.parseInt(a[0]);
		System.out.print("Input b : ");
		String b = input.nextLine();
		double gelas = 1, botol = 1, teko = 1, cangkir = 1, konversi = 0;
		if (a[1].equals("botol") & b.equals("gelas")) {
			konversi = jumlah * 2;
		} else if (a[1].equals("gelas") & b.equals("botol")) {
			konversi = jumlah / 2;
		} else if (a[1].equals("teko") & b.equals("cangkir")) {
			konversi = jumlah * 25;
		} else if (a[1].equals("cangkir") & b.equals("teko")) {
			konversi = jumlah / 25;
		} else if (a[1].equals("gelas") & b.equals("cangkir")) {
			konversi = jumlah * 2.5;
		} else if (a[1].equals("cangkir") & b.equals("gelas")) {
			konversi = jumlah / 2.5;
		} else if (a[1].equals("botol") & b.equals("cangkir")) {
			konversi = jumlah * (2 * 2.5);
		} else if (a[1].equals("cangkir") & b.equals("botol")) {
			konversi = jumlah / (2 * 2.5);
		} else if (a[1].equals("teko") & b.equals("gelas")) {
			konversi = jumlah * (25 / 2.5);
		} else if (a[1].equals("gelas") & b.equals("teko")) {
			konversi = jumlah / (25 / 2.5);
		} else if (a[1].equals("teko") & b.equals("botol")) {
			konversi = jumlah * (25 / (2.5 * 2));
		} else if (a[1].equals("botol") & b.equals("teko")) {
			konversi = jumlah / (25 / (2.5 * 2));
		}
		System.out.println(a[0] + " " + a[1] + " = " + konversi + " " + b);

	}

}
