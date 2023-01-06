package materiku.fungsi;

import java.util.Arrays;
import java.util.Scanner;

public class Materi_ArraySort_PengurutanString {

	public static void main(String[] args) {

		// Harus di split dulu baru di arrays.sort

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan kata : ");
		String kata = scanner.nextLine();

		String[] arrKata = kata.split("");
		Arrays.sort(arrKata);

		for (String string : arrKata) {
			System.out.print(string + " ");
		}

	}

}
