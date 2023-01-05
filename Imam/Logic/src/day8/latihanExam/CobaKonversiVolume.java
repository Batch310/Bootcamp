package day8.latihanExam;

import java.util.Scanner;

public class CobaKonversiVolume {

	public static void main(String[] args) {

		// 1 botol = 2 gelas
		// 1 botol = 5 cangkir

		// 1 teko = 5 botol /5^1
		// 1 teko = 10 gelas /5^2
		// 1 teko = 25 cangkir /5^5

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan konversi = ");
		String input = scanner.nextLine();

		String[] arrInput = input.split("=");

		String b = "1 botol";
		String g = "1 gelas";
		String c = "1 cangkir";
		String t = "1 teko";

		double hasil = 0;
		if (arrInput[0].equalsIgnoreCase("1 botol ")) {
			if (arrInput[1].equalsIgnoreCase(" ...cangkir?")) {
				hasil = 5;
				System.out.println(b + " = " + hasil + " cangkir");
			}
			if (arrInput[1].equalsIgnoreCase(" ...gelas?")) {
				hasil = 2;
				System.out.println(b + " = " + hasil + " gelas");
			}
			if (arrInput[1].equalsIgnoreCase(" ...teko?")) {
				hasil = 1 / 5.0;
				System.out.println(b + " = " + hasil + " teko");
			}
		}

		if (arrInput[0].equalsIgnoreCase("1 teko ")) {
			if (arrInput[1].equalsIgnoreCase(" ...cangkir?")) {
				hasil = 25;
				System.out.println(t + " = " + hasil + " cangkir");
			}
			if (arrInput[1].equalsIgnoreCase(" ...gelas?")) {
				hasil = 10;
				System.out.println(t + " = " + hasil + " gelas");
			}
			if (arrInput[1].equalsIgnoreCase(" ...botol?")) {
				hasil = 5;
				System.out.println(t + " = " + hasil + " botol");
			}
		}

		if (arrInput[0].equalsIgnoreCase("1 gelas ")) {
			if (arrInput[1].equalsIgnoreCase(" ...cangkir?")) {
				hasil = 10;
				System.out.println(g + " = " + hasil + " cangkir");
			}
			if (arrInput[1].equalsIgnoreCase(" ...botol?")) {
				hasil = 1 / 0.2;
				System.out.println(g + " = " + hasil + " botol");
			}
			if (arrInput[1].equalsIgnoreCase(" ...teko?")) {
				hasil = 1 / 10.0;
				System.out.println(g + " = " + hasil + " teko");
			}
		}

		if (arrInput[0].equalsIgnoreCase("1 cangkir ")) {
			if (arrInput[1].equalsIgnoreCase(" ...gelas?")) {
				hasil = 1 / 10.0;
				System.out.println(c + " = " + hasil + " gelas");
			}
			if (arrInput[1].equalsIgnoreCase(" ...botol?")) {
				hasil = 1 / 0.5;
				System.out.println(c + " = " + hasil + " botol");
			}
			if (arrInput[1].equalsIgnoreCase(" ...teko?")) {
				hasil = 1 / 25.0;
				System.out.println(c + " = " + hasil + " teko");
			}
		}

	}

}
