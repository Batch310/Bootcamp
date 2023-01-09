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
		String vocalBuahBaru = "";
		int vocalBuahNew = 0;

		for (int i = 0; i < arrayNamaBuah.length; i++) {
			if (vocal.contains(arrayNamaBuah[i])) {
				vocalBuah++;
				vocalBuahBaru += arrayNamaBuah[i];
				if(!vocalBuahBaru.contains(arrayNamaBuah[i])) {
					vocalBuahNew = vocalBuah;
				}else {
					vocalBuahNew = vocalBuah-1;
				}
			}
		}
		int hargaBuah = vocalBuahNew * 10;

		System.out.println(namaBuah + " seharga " + hargaBuah + " ribu per kg");
	}

}

//setiap huruf vocal yang sama dihitung 1