package simulasiFT01;

import java.util.Arrays;
import java.util.Scanner;

public class SimFT07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String vokal = "aeiou", konsonan = "bcdfghijklmnpqrstvwxyz";

		System.out.print("Masukkan kalimat : ");
		String kalimat = input.nextLine();
		kalimat = kalimat.toLowerCase();
		input.close();
		String[] splitKalimat = kalimat.split("");

		Arrays.sort(splitKalimat);

		String outputVokal = "";
		String outputKonsonan = "";

		for (int i = 0; i < splitKalimat.length; i++) {
			if (vokal.contains(splitKalimat[i])) {
				outputVokal += splitKalimat[i];

			}
			if (konsonan.contains(splitKalimat[i])) {
				outputKonsonan += splitKalimat[i];
			}
		}
		String gabungan = outputVokal + outputKonsonan;
		String[] arrGabungan = gabungan.split("");
		Arrays.sort(arrGabungan);
		for (int i = 1; i < arrGabungan.length; i++) {
			if (arrGabungan[i] == arrGabungan[i-1]) {
				System.out.println(arrGabungan[i]+"|");
			}
		}
		
		System.out.println(gabungan);
		System.out.println(outputVokal);
		System.out.println(outputKonsonan);
	}
}