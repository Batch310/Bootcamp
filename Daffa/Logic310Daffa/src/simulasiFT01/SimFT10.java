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

		String[] arrAlphabet = alphabet.split("");
		String[] arrAngka = angka.split(",");

		if (arrAlphabet.length == arrAngka.length) {

		} else {
			System.out.println("Panjang deret harus sama");
		}
	}

}
