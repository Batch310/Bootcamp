package day3.warmup;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan jam dalam dengan format hh:mm:ss(AM/PM): ");
		String jam12 = masukan.nextLine();
		
		String jam24 = "";
		
		String jam = jam12.substring(0, 2);
		String menit = jam12.substring(3, 5);
		String detik = jam12.substring(6, 8);
		String waktu = jam12.substring(8, 10);
		
		int jamInt = Integer.parseInt(jam);
		
		if (jamInt >= 01 && jamInt <= 12) {
//			System.out.println(jamInt);
			if (waktu.equals("AM") && jamInt == 12) {
				jamInt = 0;
			} else if (waktu.equals("PM")) {
				jamInt += 12;
//				System.out.println(jamInt);
			}
		} else {
			System.out.println("Not valid!");
		}
		
		String jamStr = Integer.toString(jamInt);
		
		if (jamInt < 10) {
			jamStr = "0" + jamStr;
			jam24 = jamStr + ":" + menit + ":" + detik;
		} else {
			jam24 = jamStr + ":" + menit + ":" + detik;
		}
			System.out.print(jam24);
		
	}
}
