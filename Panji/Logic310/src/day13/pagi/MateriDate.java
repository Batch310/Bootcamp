package day13.pagi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MateriDate {

	public static void main(String[] args) throws ParseException {
		// Tujuan
		// 1. Convert String ke date
		// 2. Tambah 3 hari
		// 3. convert date ke string
		// 4. cetak string

		Locale locale = new Locale("id", "ID");

		// String tanggal = "31-12-2022 13:30:30"; // pattern : dd-MM-yyyy HH:mm:ss
		// String tanggal = "31 January 2022"; // pattern : dd MMMM yyyy
		String tanggal = "31 Januari 2022"; // pattern : dd MMMM yyyy
		// MM -> 03
		// MMM -> Mar (tergantung bahasa)
		// MMMM -> March (tergantung Bahasa)
		// h -> format 12 jam AM/PM
		// H -> format 24 jam

		// String pattern = "dd-MM-yyyy HH:mm:ss";
		String pattern = "dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale); // Object untuk convert

		System.out.println(tanggal);

		// 1. Convert string ke date
		Date tanggalDate = sdf.parse(tanggal);
		long milis = tanggalDate.getTime();
		System.out.println(milis);

		// 2. Tambah 3 hari
		long detik = 1000;
		long menit = 60 * 1000;
		long jam = 60 * 60 * 1000;
		long hari = 24 * 60 * 60 * 1000;

		milis = milis + (3 * hari);
		System.out.println(milis);
		tanggalDate.setTime(milis);

		// 3. Convert date ke string
		String tanggalConvert = sdf.format(tanggalDate);

		// 4. Cetak
		System.out.println(tanggalConvert);
	}

}
