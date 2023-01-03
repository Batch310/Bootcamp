package simulasiFT01;

import java.util.Scanner;

public class SimFT10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan input alphabet : ");
		String alphabet = scanner.next();
		System.out.println("Masukkan input angka : ");
		String angka = scanner.next();
		scanner.close();
		String[] arrAlphabet = alphabet.split("");
		String[] arrAngka = angka.split(",");

		if (arrAlphabet.length == arrAngka.length) {
			for (int i = 0; i < arrAlphabet.length; i++) {
				for (int j = 0; j < arrAngka.length; j++) {
					if(true) {
						
					}
				}
			}
		} else {
			System.out.println("Panjang deret harus sama");
		}
	}

}
