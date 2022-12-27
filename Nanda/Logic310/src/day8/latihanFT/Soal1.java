package day8.latihanFT;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Beli pulsa Rp. ");
		int pulsa = input.nextInt();

		int poin1 = 0;
		int poin2 = 0;
		int poin3 = 0;
		
		if (pulsa <= 10000) {
			poin1 = 0;
			pulsa -= 10000;
		} else if (pulsa > 10001 && pulsa <= 30000) {
			pulsa = pulsa - 20000;
			poin2 = pulsa / 1000;
		} else {
			pulsa = pulsa - 20000;
			poin3 = (pulsa / 1000) * 2;
		}
			System.out.println();
			// total
			int pointotal = poin1 + poin2 + poin3;
			System.out.print(poin1 + " + " + poin2 + " + " + poin3 + " = " + pointotal + " poin");
		}
	}