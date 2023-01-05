package day8.latihanFT;

import java.util.Scanner;

public class Soal1PoinPulsa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Beli pulsa Rp. ");
		int pulsa = input.nextInt();

		int poin1 = 0;
		int poin2 = 0;
		int poin3 = 0;
		int pointotal = 0;

		if (pulsa <= 10000) {
			pointotal = poin1;
			System.out.print(poin1 +  "=" + pointotal);
		} else if (pulsa > 10000 && pulsa <= 30000) {
			pulsa = pulsa - 10000;
			poin2 = pulsa / 1000;
			pointotal = poin1 + poin2;
			System.out.print(poin1 + " + " + poin2 + " = " + pointotal);
		} else {
			poin2 = 20000 / 1000;
			pulsa = pulsa - 30000;
			poin3 = (pulsa / 1000) * 2;
			pointotal = poin1 + poin2 + poin3;
			System.out.print(poin1 + " + " + poin2 + " + " + poin3 + " = " + pointotal);
		}
	}
}