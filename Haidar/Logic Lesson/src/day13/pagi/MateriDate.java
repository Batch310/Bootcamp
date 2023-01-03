package day13.pagi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class MateriDate {
	public static void main(String[] args) throws ParseException {
		//Tujuan
		//1. Convert String ke Date
		//2. Tambah 3 hari
		//3. Convert Date ke String
		//4. Cetak Stringnya
		
		Locale localeEN = new Locale("en", "EN"); //Locale English
		Locale localeID = new Locale("id", "ID"); //Locale Indonesia
		
//		String tanggal = "31-12-2022 13:30:30"; //Date pattern: dd-MM-yyyy HH:mm:ss
//		String tanggal = "31 January 2022"; //Date pattern: dd-MMMM-yyyy
		String tanggal = "31 January 2022"; //Date pattern: dd-MMMM-yyyy
		//hh -> Format 12 jam AM/PM; HH -> Format 24 jam
//		String pattern = "dd-MM-yyyy HH:mm:ss";
		String pattern = "dd MMMM yyyy";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern); //Membuat pattern atau pola dari variabel String tanggal
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeEN); //Membuat pattern atau pola dari variabel String tanggal
		System.out.println("Date then         : " + tanggal);
//		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern, localeID);
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(dtf.format(now));
		
		//1. Convert String ke Date
		Date tanggalDate = sdf.parse(tanggal);
		long millis = tanggalDate.getTime(); //Mengambil milliseconds dari variabel tanggalDate
		System.out.println("Milliseconds then : " + millis);
		System.out.println();
		
		long second = 1000;
		long minute = 60 * 1000;
		long hour = 60 * 60 * 1000;
		long day = 24 * 60 * 60 * 1000;
		
		//2. Tambah 3 hari
		millis += (3*day);
		System.out.println("Milliseconds now  : " + millis);
		
		//Mengatur millis yang sudah ditambah dengan 3 hari sebagai tanggalDate yang baru
		tanggalDate.setTime(millis);
		
		//3. Convert Date ke String
		String tanggalConv = sdf.format(tanggalDate);
		
		//4. Cetak Stringnya
		System.out.println("Date now          : " + tanggalConv);
		
		
		
		
		
	}
	
}
