package ft1;

import java.util.Scanner;

public class Soal9 {

	// semangka = 30kg
	// pir = 10kg
	// buah lain?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("input: ");
		String input = scan.nextLine();

		String[] arrInput = input.split("");

		String vokal = "aiueo";

		String hurufSebelum ="";
		int tampungHasil = 0;
		
		int tampung = 0;

		for (int i = 0; i < arrInput.length; i++) {
			if (vokal.contains(arrInput[i])) {
				System.out.print(arrInput[i]);
				String hurufSama = arrInput[i];
				
				tampungHasil++;
				if (vokal=) {
					
				}
//				//tampung++;
			
			}
		}
		System.out.println();
		int hitungHarga = tampung * 10000;
		System.out.println("harga buah " + input + " " + hitungHarga + " per kg");

	}

}
