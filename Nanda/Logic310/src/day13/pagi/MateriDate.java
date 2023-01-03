package day13.pagi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MateriDate {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		//Tujuan
		//1. Convert String to date
		//2. Tambah 3 hari
		//3. Convert date to String
		//4. Cetak Stringnya
		
		Locale locale2 = new Locale("en", "EN");
		Locale locale = new Locale("id", "ID"); //Locale Indonesia
		
		//String tanggal = "31-12-2022 13:30:30"; //pattern: dd-MM-yyyy HH:mm:ss
		//String tanggal = "31 January 2022";
		System.out.println("tanggal = ");
		String tanggal = input.nextLine();
		//h untuk format 12 jam
		//H untuk format 24 jam
		//MM : 03
		// MMM : MAR
		// MMMM : MARCH
		
		String pattern = "dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale); //Objek untuk konversi
		System.out.println(tanggal);
		
		//1. Convert String ke Date
		Date tanggalDate = sdf.parse(tanggal); //parse() : konversi String to date
		long milis = tanggalDate.getTime(); //milis = seribu * detik
		System.out.println(milis);
		
		//2. Tambah 3 hari
		long detik = 1000;
		long menit = 60 * 1000;
		long jam = 60 * 60 * 1000;
		long hari = 24 * 60 * 60 *1000;
		
		milis = milis + (3*hari);
		System.out.println(milis);
		tanggalDate.setTime(milis); //update date dengan milis terbaru
		
		//3. Convert Date to String
		String tanggalConvert = sdf.format(tanggalDate); //format() : convert date to string
		
		//4. cetak
		System.out.println(tanggalConvert);
	}

}
