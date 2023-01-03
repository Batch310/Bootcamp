package simulasift1;

import java.util.Scanner;

public class soal10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("input String : ");
		String kata = input.nextLine().toLowerCase();
		System.out.print("input Array : ");
		String kata1 = input.nextLine().toLowerCase();

		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] angka = new int[25];

		String[] arrKata = kata.split("");

		String a = "";
		String b = "";

		for (int i = 0; i < arrKata.length; i++) {
			
		}

		System.out.println();
		System.out.print(a + b);
	}

}
