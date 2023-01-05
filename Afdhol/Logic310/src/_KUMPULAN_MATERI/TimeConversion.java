package _KUMPULAN_MATERI;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int jam_input = 1, menit_input = 12, detik_input = 12, new_jam_input = 0;
		String waktu = "am";

//		
		System.out.println("Waktu: ");
		System.out.print("Jam :");
		jam_input = input.nextInt();


		System.out.println("Menit: ");
		menit_input = input.nextInt();

		if (menit_input >= 1 && menit_input <= 60) {
			// System.out.println(menit_input);

		} else {
			System.out.println("masukkan 1-60");
			System.exit(0);
		}

		System.out.print("Detik: ");
		detik_input = input.nextInt();
		if (detik_input >= 1 && detik_input <= 60) {
			// System.out.println(menit_input);

		} else {
			System.out.println("masukkan 1-60");
			System.exit(0);
		}

		System.out.println("AM/PM: ");
		waktu = input.next();

		if (waktu.equalsIgnoreCase("AM")) {
			// System.out.println("pagi");

			if (jam_input >= 1 && jam_input <= 12) {
				// new_jam_input = jam_input+12;
				System.out.println(jam_input + ":" + menit_input + ":" + detik_input);

			}
		}

		else if (jam_input >= 1 && jam_input <= 12) {
			new_jam_input = jam_input + 12;
			System.out.println(new_jam_input + ":" + menit_input + ":" + detik_input);

		} else {
			System.out.println("Input Jam antara 1-12");
		}

	}

}
