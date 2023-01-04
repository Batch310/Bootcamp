package simulasiFT01;

import java.util.Arrays;
import java.util.Scanner;

public class SimFT07Kunci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input n : ");
		String n = scanner.nextLine();
		scanner.close();

		// variable bantu kumpulan karakter
		String kumpulanKarakter = "abcdefghijklmnopqrstuvwxyz";

		// split String
		String[] arrN = n.toLowerCase().split("");

		// sorting Array
		Arrays.sort(arrN);

		// variable bantu hasil
		String hasil = "";

		// variable bantu menyimpan huruf sebelumnya
		String hurufSebelumnya = "";

		for (int i = 0; i < arrN.length; i++) {
			String hurufSekarang = arrN[i];
			if (kumpulanKarakter.contains(hurufSekarang)) {
				if (!hurufSekarang.equals(hurufSebelumnya)) {
					if (!hurufSebelumnya.equals("")) {
						hasil += " | ";
					}
				}
				hasil += arrN[i];
				hurufSebelumnya = hurufSekarang;
			}

		}
		System.out.println(hasil);
	}

}
