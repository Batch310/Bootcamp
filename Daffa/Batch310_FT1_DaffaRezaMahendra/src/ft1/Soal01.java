package ft1;

import java.util.Scanner;

public class Soal01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input uang : ");
		int uang = scanner.nextInt();
		
		int hargaEs = 1000;
//		int bonus = uang / hargaEs;
		int es = uang / hargaEs;
		int bonus = 0;
		
		for (int i = 0; i < es; i++) {
			if (es >= 5) {
				bonus++;	
			}
		}
		es+=bonus;
		System.out.println(es);
//		if (uang > 1000) {
//			int bonus = (uang / 5) / 1000;
//			int totalEsLoli = (uang / 1000) + bonus;
//
//			System.out.println("Bambang mendapatkan " + totalEsLoli + " es loli");
//		} else {
//			System.out.println("Uang tidak cukup");
//		}
		
		scanner.close();
	}

}
