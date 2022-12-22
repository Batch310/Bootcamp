package day3.Warmupp;

import java.util.Scanner;

public class TimeConversionLain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("input: ");
		String jam = scan.nextLine();
		
		//Syarat Validasi:
		//Jam 1-12;
		//menit 0-59;
		//detik 0-59;
		//AM/PM
		
		
		//konversi dari string ke integer
		String hour = jam.substring(0,2);
		int intHour = Integer.parseInt(hour);
		
		String minute = jam.substring(3,5);
		int intMinute = Integer.parseInt(minute);
		
		String second = jam.substring(6,8);
		int intSecond = Integer.parseInt(second);
		
		String ampm = jam.substring(8,10);
		
		//validasi dimulai
		
		if (!(intHour>=1 && intHour<=12)) { // membalikkan keadaan true 
			System.out.println("Format jam salah");
		}
		
		if (!(intMinute>=0 && intMinute<=59)) {
			System.out.println("Format menit salah");
		}
		
		if (!(intSecond>=0 && intMinute<=59)) {
			System.out.println("Format detik salah");
		}
		
		if (!(ampm.equals("PM") || ampm.equals("AM"))) {
			System.out.println("AM/PM salah");
		}
		
		
		char ap = jam.charAt(8); // mengambil apakah AM atau PM
		
		if (ap=='A') {
			
			if (jam.substring(0,2).equals("12")) {
				System.out.println("00"+jam.substring(2,8)); //jika jam 12 AM menjadi 00.00.00
			}else {
				System.out.println(jam.substring(0,8)); //menampilkan kembali jam tanpa keterangan am/pm
			}
			
		}else if (ap=='P') {
			if (jam.substring(0,2).equals("12")) {
				System.out.println(jam.substring(0,8)); //menampilkan kembali jam tanpa keterangan am/pm
			}else {
				//Convert/parsing dari String ke Integer
				int intJam = Integer.parseInt(jam.substring(0,2));//karena hanya menerima angka, maka ambil char pada 0,2 yaitu jam
				intJam =+12;
				System.out.println(intJam+jam.substring(2,8));
			}
			
		}
	}

}
