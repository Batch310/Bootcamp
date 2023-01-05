package coba.coba;

import java.util.Arrays;
import java.util.Scanner;

public class CloneVokalKonsonan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.print("input: ");
		String n = scan.nextLine();
		
		String[] arrInput = n.split("");
		Arrays.sort(arrInput);
		
		String vokal = "aeiou";
		String konsonan = "bcdfghjklmnpqrstvwxyz";
		
		for (int i = 0; i < arrInput.length; i++) {
			if (vokal.contains(arrInput[i])) {
				System.out.print(arrInput[i]);
			}else if (konsonan.contains(arrInput[i])) {
				System.out.print(arrInput[i]);
			}
		}
		
		
	}

}
