package day3.warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// 12:00:00PM -> 12:00:00
		// 06:00:00PM -> 18:00:00

		Scanner input = new Scanner(System.in);
		System.out.println("Masukan Jam : ");
		String jam = input.nextLine();

		char ap = jam.charAt(8); // untuk memecah index ke 8 yaitu A atau P

		if (ap == 'A') {
			if (jam.substring(0, 2).equals("12")) {
				System.out.println("00" + jam.substring(2, 8));
			} else {
				System.out.println(jam.substring(0, 8));
			}
		} else if (ap == 'P') {
			if(jam.substring(0,2).equals("12")) {
				System.out.println(jam.substring(0,8));
			}else {
				// Convert/Parsing string to integer
				int intJam = Integer.parseInt(jam.substring(0,2));
				intJam = intJam + 12;
				System.out.println(intJam+jam.substring(2,8));
			}
		}

	}

}
