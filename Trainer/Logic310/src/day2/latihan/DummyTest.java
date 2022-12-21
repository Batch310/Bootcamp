package day2.latihan;

import java.util.Scanner;

public class DummyTest {
public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan tinggi dan lebar tangga: ");
		int anakTangga = masukan.nextInt();
		
		for (int i = 0; i < anakTangga; i++) {
			for (int j = 0; j < anakTangga; j++) {
				if (i + j < anakTangga-1) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}
