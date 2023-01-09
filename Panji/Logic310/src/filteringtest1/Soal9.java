package filteringtest1;

import java.util.Scanner;

public class Soal9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Nama Buah : ");
		String namaBuah = input.nextLine().toLowerCase();

		String[] arrayNamaBuah = namaBuah.split("");

		String vocal = "aiueo";

		int vocalBuah = 0;

		for (int i = 0; i < arrayNamaBuah.length; i++) {
			if (vocal.contains(arrayNamaBuah[i])) {
				vocalBuah++;
			}
		}
		int hargaBuah = vocalBuah * 10;

		System.out.println(namaBuah + " seharga " + hargaBuah + " ribu per kg");
	}

}
