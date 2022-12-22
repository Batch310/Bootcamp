package day4.latihan.exam;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
		String str = "sample case";
//		
//		String vokal = "aiueo";
//		
//		if (input.contentEquals(vokal)) {
//			System.out.println(input.split(vokal));
//		}

		// String str = new String("Hi Welcome to my world!");
		System.out.print("Huruf vokal: ");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')
				 {
					System.out.print(str.charAt(i));
				}

		}
		System.out.println();
		System.out.print("Huruf konsonan: ");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'q' || str.charAt(i) == 'w' || str.charAt(i) == 'r' || str.charAt(i) == 't'
					|| str.charAt(i) == 'y'||str.charAt(i) == 'p' || str.charAt(i) == 's' || str.charAt(i) == 'd' || str.charAt(i) == 'f'
					|| str.charAt(i) == 'g'||str.charAt(i) == 'h' || str.charAt(i) == 'j' || str.charAt(i) == 'k' || str.charAt(i) == 'l'
					|| str.charAt(i) == 'z'||str.charAt(i) == 'x' || str.charAt(i) == 'c' || str.charAt(i) == 'v' || str.charAt(i) == 'b'
					|| str.charAt(i) == 'n'|| str.charAt(i) == 'm')
			{
				System.out.print(str.charAt(i)+" ");
			}
		}
		
	}

}
