package simulasift1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal05RumahNenek {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);

		// imam kerumah nenek setaip x hari, sedangkan yudha pergi ke nenek setiap
		// y hari, jika mereka berkunjung pada hari sama tnggal z, kapan mreka bertemu
		// lagi
		// input : x=5 x=3
		// y= 2 y=2
		// z= 2 Januari 2023 z=8 Januari 2023

		Locale locale = new Locale("id", "ID"); // Locale Indonesia
		
		System.out.print("Masukan x = ");
		int x = input.nextInt();
		System.out.print("Masukan y = ");
		int y = input.nextInt();
		
		String tanggalI = "2 Januari 2022"; // pattern: dd MMMM yyyy


		String pattern = "dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale); // objek untuk ngconvert

		// 1. Convert String ke date
		Date tanggalDate = sdf.parse(tanggalI);
		long milis = tanggalDate.getTime();

		// 2. tambah 3 hari
		long detik = 1000;
		long menit = 60 * 1000;
		long jam = 60 * 60 * 1000;
		long hari = 24 * 60 * 60 * 1000;

		milis = milis + ((x * y) *  hari);
		tanggalDate.setTime(milis); // Update date dengan milis terbaru

		// 3. convert date ke string
		String tanggalConvert = sdf.format(tanggalDate);// Format(): convert date to string

		System.out.println(tanggalConvert);
	}

}
