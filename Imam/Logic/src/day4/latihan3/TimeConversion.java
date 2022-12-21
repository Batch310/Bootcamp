package day4.latihan3;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {

		// 12:00:00AM >>00:00:00
		// 06:00:00AM >>06:00:00
		// 12:00:00PM >>12:00:00
		// 06:00:99PM >>18:00:00

		Scanner inputan = new Scanner(System.in);
		System.out.print("Masukkan jam = ");
		String jam = inputan.nextLine();

		// Contoh Validasi
		// jam 1 - 12
		// Menit 0 - 59
		// Detik 0 - 59
		// AM/PM nya

		String hour = jam.substring(0, 2);
		int intHour = Integer.parseInt(hour);

		String minute = jam.substring(3, 5);
		int intMinute = Integer.parseInt(minute);

		String second = jam.substring(6, 8);
		int intSecond = Integer.parseInt(second);

		String ampm = jam.substring(8, 10);

		if (!(intHour >= 1 && intHour <= 12)) {
			System.out.println("Format jam salah");
		}

		if (!(intMinute >= 0 && intMinute <= 59)) {
			System.out.println("Format menit salah");
		}

		if (!(intSecond >= 0 && intSecond <= 59)) {
			System.out.println("Format detik salah");
		}

		if (!(ampm.equals("AM") || ampm.equals("PM"))) {
			System.out.println("Format AM/PM salah");
			System.exit(0);
		}

		// Program Utamanya
		char ap = jam.charAt(8);

		if (ap == 'A') {
			if (jam.substring(0, 2).equals("12")) {
				System.out.println("00" + jam.substring(2, 8));
			} else {
				System.out.println(jam.substring(0, 8));
			}

		} else if (ap == 'p') {
			if (jam.substring(0, 2).equals("12")) {
				System.out.println(jam.substring(0, 8));

			} else {

				// Convert/parsing String to integer

				int intJam = Integer.parseInt(jam.substring(0, 2));
				intJam = intJam = 12;
				System.out.println(intJam + jam.substring(2, 8));

			}

		}

	}

}
