package SimulasiFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal07KelompokHurufYangSama {
	public static void main(String[] args) {
		// Input = Gabungan dari beberapa kata atau sebuah kalimat
		// Batasan :
		// 1. Urut dan pisahkan huruf/karakter tersebut dengan tanda "|"
		// 2. Kelompokkan huruf yang sama
		// 3. Diproses sebagai huruf kecil (spasi diabaikan)
		// Output = huruf yang sama dikelompokkan menjadi satu dan dipisah dengan tanda
		// "|"
		// Cth input : Sample Case; output : aa | c | ee | l | m | p | ss

		Scanner masukan = new Scanner(System.in);

		System.out.print("Masukkan kata atau kalimat : ");
		String[] input = masukan.nextLine().toLowerCase().split("");

		Arrays.sort(input);

		for (int i = 1; i < input.length; i++) {
			if (input[i - 1].equals(" ")) {
				System.out.print(input[i]);
			} else if (input[i].equals(input[i - 1])) {
				System.out.print(input[i]);
			} else {
				System.out.print(" | " + input[i]);
			}
		}
		masukan.close();
	}
}
