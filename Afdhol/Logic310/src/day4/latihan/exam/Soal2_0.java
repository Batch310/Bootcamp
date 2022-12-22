package day4.latihan.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Kalimat: ");
//		String input = scan.nextLine();
		
		String input = "sample case";
		
		String vokal = "aeiou";
		String konsonan = "bcdfghjklmnpqrstvwxyz";
		
		input = input.toLowerCase();
	
		String[] arrKalimat = input.split("");
		Arrays.sort(arrKalimat);
		
		String hurufVokal = "";
		String hurufKonsonan = "";
		
		
		for (int i = 0; i < arrKalimat.length; i++) {
			if (vokal.contains(arrKalimat[i])) {

			hurufVokal += arrKalimat[i];				
			}
		}
		
		for (int i = 0; i < arrKalimat.length; i++) {
			if (konsonan.contains(arrKalimat[i])) {
				
				hurufKonsonan += arrKalimat[i];
				
			}
		}
		
		System.out.println(hurufVokal);
		System.out.println(hurufKonsonan);
			
		}
		
	}

