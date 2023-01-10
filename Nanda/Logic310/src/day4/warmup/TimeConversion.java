package day4.warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		//12:00:00AM -> 00:00:00
		//06:00:00AM -> 06:00:00
		//12:00:00PM -> 12:00:00
		//06:00:00PM -> 18:00:00		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jam : "); //12:30:45AM
		String jam = input.nextLine();
		
		//Validasi
		//Jam 1-12
		//Menit 0-59
		//Detik 0-59
		//AM/PM
				
		String hour = jam.substring(0,2); //12
		int intHour = Integer.parseInt(hour); // ubah 12 ke integer
		String minute = jam.substring(3,5); //30
		int intMinute = Integer.parseInt(minute); //ubah 30 ke integer
		String second = jam.substring(6,8); // 45
		int intSecond = Integer.parseInt(second); //ubah 45 ke int
		String ampm = jam.substring(8,10); //AM
		
		if(!(intHour >=1 && intHour <=12)) {
			System.out.println("Format Jam Salah");
			System.exit(0);
		}
		
		if(!(intMinute >=0 && intMinute <=59)) {
			System.out.println("Format Menit Salah");
			System.exit(0);
		}
		
		if(!(intSecond >= 0 && intSecond <=59)) {
			System.out.println("Format Detik Salah");
			System.exit(0);
		}
		
		if(!(ampm.equals("AM") || (ampm.equals("PM")))) {
			System.out.println("Format AM / PM Salah");
			System.exit(0);
		}
		
		char ap = jam.charAt(8);
		
		if(ap == 'A') {
			if(jam.substring(0,2).equals("12")) {
				System.out.println("00"+jam.substring(2,8)); //00:30:45
			}else {
				System.out.println(jam.substring(0,8));
			}
		}else if(ap == 'P') {
			if(jam.substring(0,2).equals("12")) {
				System.out.println(jam.substring(0,8));
			}else {
				//convert/parsing String to Integer
				int intJam = Integer.parseInt(jam.substring(0, 2));
				intJam = intJam + 12;
				System.out.println(intJam+jam.substring(2,8));
			}
		}
	}
}