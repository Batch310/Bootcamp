package coba;

import java.util.Scanner;

public class TambahMataUang {

	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan nominal: ");
		
		String[] arrNominal = masukan.nextLine().split("");
		
		masukan.close();
				
		String hasil1 = "";
		
		String hasil2 = "";
		
		for (int i = arrNominal.length - 1; i >= 0; i--) {
			hasil2 += arrNominal[i];
			if (hasil2.equals("000")) {
				hasil2 += ".";		
			}
		}
		hasil1 = hasil2;
		System.out.println(hasil1);
	}
	
}
