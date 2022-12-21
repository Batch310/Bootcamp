package day3.warmup;

import java.util.Scanner;

public class WarmUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert AM/PM : ");
		String waqtu = scan.next();

		String tArr[] = waqtu.split(":");
		String AmPm = tArr[2].substring(2, 4);
		int jam, menit, detiq;

		jam = Integer.parseInt(tArr[0]);
		menit = Integer.parseInt(tArr[1]);
		detiq = Integer.parseInt(tArr[2].substring(0, 2));

		if (!(jam >= 1 && jam <= 12)) {
			System.out.println("Format jam salah");
			System.exit(0);
		}
		if (!(menit >= 0 && menit <= 59)) {
			System.out.println("Format menit salah");
			System.exit(0);
		}
		if (!(detiq >= 0 && detiq <= 59)) {
			System.out.println("Format detik salah");
			System.exit(0);
		}
		if (!(AmPm.equals("AM") || (AmPm.equals("PM")))) {
			System.out.println("Format AM/PM salah");
			System.exit(0);
		}

		String cekPM = "PM", cekAM = "AM";

		if (AmPm.equals(cekAM)) {
			jam += 0;
		} else if (AmPm.equals(cekPM)) {
			jam += 12;
		}
		System.out.printf("%02d:%02d:%02d", jam, menit, detiq);
	}

}
