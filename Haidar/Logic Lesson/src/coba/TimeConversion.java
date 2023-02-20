package coba;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan waktu saat ini (12hr): ");
		String input = masukan.nextLine().toLowerCase();
		
		masukan.close();
		
		String output = input.substring(0, 8);
		
		String hh = input.substring(0, 2);
		
		if (input.contains("pm")) {
			Integer hhInt = (Integer.parseInt(hh) + 12);
			if (hhInt == 24) {
				hhInt = 0;
			}
			hh = Integer.toString(hhInt);
			output = output.replace(output.substring(0, 2), hh);
			System.out.println(output);
		}  else if (input.contains("am")) {
			System.out.println(output);
		}
		
	}
}
