package pembahasan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("input n : ");
		String n = input.nextLine().toLowerCase();

		String alfabet = "abcdefghijklmnopqrstuvwxyz";

		// Split Program
		String[] arr_n = n.split("");

		// Sort Program
		Arrays.sort(arr_n);

		// Variabel bantu untuk hasil
		String hasil = "";

		// variabel bantu, menyimpan huuf sebelumnya
		String hururfSebelumnya = "";

		for (int i = 0; i < arr_n.length; i++) {
			String hurufSekarang = arr_n[i];
			if (alfabet.contains(hurufSekarang)) {
				if (!hurufSekarang.equals(hururfSebelumnya)) {
					if (!hururfSebelumnya.equals("")) {
						hasil = hasil + " | ";
					}
				}
				hasil = hasil + arr_n[i];
				hururfSebelumnya = hurufSekarang;
			}
		}
		System.out.print(hasil);
	}

}
