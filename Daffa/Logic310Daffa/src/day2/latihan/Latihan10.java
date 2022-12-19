package day2.latihan;

import java.util.Scanner;

public class Latihan10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int nilaiAwal = 3;

		for (int i = 0; i < n; i++) {
			if (i == n/2) {
				System.out.print("XXX ");
			} else {
				System.out.print(nilaiAwal + " ");
			}
			nilaiAwal *= 3;
		}
	}
}