package day8.latihanExam;

import java.util.Random;
import java.util.Scanner;

public class Keranjang {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random r = new Random();
		System.out.print("m : ");
		int m = input.nextInt();
		System.out.print("n : ");
		int n = input.nextInt();
		int[] keranjang = new int[3];
		int a = r.nextInt(3);
		int b = r.nextInt(3);
		while (a == b) {
			b = r.nextInt(3);
		}
		keranjang[a] = m;
		keranjang[b] = n;
		for (int i = 0; i < keranjang.length; i++) {
			if (keranjang[i] == 0) {
				System.out.println("Keranjang " + (i + 1) + " = kosong");
			} else {
				System.out.println("Keranjang " + (i + 1) + " = " + keranjang[i]);
			}
		}
		System.out.println();
		a = r.nextInt(3);
		System.out.println("Keranjang " + (a+1) + " dibawa kepasar");
		int jumlah = 0;
		if (a == 0) {
			jumlah = keranjang[1] + keranjang[2];
			System.out.println("Jumlah buah -> " + keranjang[1] + " + " + keranjang[2] + " = " + jumlah);
		} else if (a == 1) {
			jumlah = keranjang[0] + keranjang[2];
			System.out.println("Jumlah buah -> " + keranjang[0] + " + " + keranjang[2] + " = " + jumlah);
		} else {
			jumlah = keranjang[0] + keranjang[1];
			System.out.println("Jumlah buah -> " + keranjang[0] + " + " + keranjang[1] + " = " + jumlah);
		}

	}

}
