package day4.Strings;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan kata : ");
		String kata = input.nextLine();

		System.out.print("Masukkan banyak geser : ");
		int geser = input.nextInt();

		String kecil = "abcdefghijklmnopqrstuvwxyz";
		String besar = kecil.toUpperCase();

		String[] arrKecil = kecil.split("");
		String[] arrBesar = besar.split("");
		String[] arrKata = kata.split("");

	}
}
