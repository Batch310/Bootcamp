package FT1;

import java.util.Scanner;

public class Soal9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//tiap huruf vokal yg sama dihitung 1
		
		System.out.print("input (nama buah) : ");
		String namaBuah = scanner.nextLine().toLowerCase();
		
		String[] arrBuah = namaBuah.split("");
		String vocal = "aiueo";
		int hurufVocal = 0;
		
		for (int i = 1; i < arrBuah.length; i++) {
			if (vocal.contains(arrBuah[i-1]) == vocal.contains(arrBuah[i])) {
				hurufVocal++;
			}
		}
		System.out.print(namaBuah+ " seharga " +hurufVocal*10+ " ribu per kg" );
		
	}

}
