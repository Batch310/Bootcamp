package day13.pagi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MateriDate {
	public static void main(String[] args) throws ParseException {
		//Tujuan
		//1. Convert String ke Date
		//2. Tambah 3 hari
		//3. Convert Date ke String
		//4. Cetak Stringnya
		
//		Locale locale = new Locale("en","EN"); //Locale English
		Locale locale = new Locale("id","ID"); //Locale Indonesia
		
//		String tanggal = "31-12-2022 13:30:30"; //pattern: dd-MM-yyyy HH:mm:ss
//		String tanggal = "31 January 2022"; //pattern: dd MMMM yyyy
		String tanggal = "31 Januari 2022"; //pattern: dd MMMM yyyy
		
		//Maret
		//MM -> 03
		//MMM -> Mar (Tergantung Bahasa)
		//MMMM -> March (Tergantung Bahasa)
		//h -> format 12 Jam AM/PM
		//H -> format 24 jam
		
//		String pattern = "dd-MM-yyyy HH:mm:ss";
		String pattern = "dd MMMM yyyy";
		
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern); //objek untuk ngeconvert
		SimpleDateFormat sdf = new SimpleDateFormat(pattern,locale); //objek untuk ngeconvert
		System.out.println(tanggal);
		
		//1. Convert String ke Date
		Date tanggalDate = sdf.parse(tanggal); //parse(): convert string to date
		long milis = tanggalDate.getTime();//milis = seribu kali detik // 1000 milis  = 1 detik
		System.out.println(milis);
		
		//2. Tambah 3 hari
		long detik = 1000;
		long menit = 60 * 1000;
		long jam = 60 * 60 * 1000;
		long hari = 24 * 60 * 60 * 1000;
		
		milis = milis + (3*hari);
		System.out.println(milis);
		tanggalDate.setTime(milis); //update date dengan milis terbaru
		
		//3. Convert Date ke String
		String tanggalConvert = sdf.format(tanggalDate);//format() : convert date to String
		
		//4. Cetak
		System.out.println(tanggalConvert);
		
		
		
		
		
		
		
		
		
		
	}
}
