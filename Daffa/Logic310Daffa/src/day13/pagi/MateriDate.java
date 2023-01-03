package day13.pagi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MateriDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// TUJUAN
		// 1. Convert dari String ke Date
		// 2. Tambah 3 hari
		// 3.Convert Date ke String
		// 4. Cetak String

		Locale locale = new Locale("id", "ID"); // objek locale untuk mengubah format tanggal berdasarkan negara

		// Pertama perlu diketahui dahulu pattern nya
		// String tanggal = "31-12-2022 13:30:30"; //pattern = dd-MM-yyyy HH:mm:ss
		// String tanggal = "31 January 20222"; // pattern = dd MMMM yyyy
		String tanggal = "31 Januari 2022"; // pattern = dd MMMM yyyy

		// h adalah format 12 jam AM/PM
		// H adalah format 24 jam

		// String pattern = "dd-MM-yyyy HH:mm:ss";
		String pattern = "dd MMMM yyyy";

		SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale); // objek untuk convert, tambah locale apabila
																		// mengubah format date
		System.out.println(tanggal);

		// 1. Ubah String ke Date
		Date tanggalDate = sdf.parse(tanggal); // akan ada merah, pilih throws
		long millis = tanggalDate.getTime();// mengambil millis yang bisa convert ke tanggal
		System.out.println(millis);

		// 2 Tambah 3 hari
		long detik = 1000; // 1 detik adalah 1000 millis
		long menit = 60 * 1000;
		long jam = 60 * 60 * 1000;
		long hari = 24 * 60 * 60 * 1000;

		millis = millis + (3 * hari);
		System.out.println(millis);
		tanggalDate.setTime(millis); // update ke millis terbaru agar millis sebelumnya berubah

		// 3. convert Date ke String
		String tanggalConvert = sdf.format(tanggalDate);// melakukan format dari tanggal ke String

		// 4.Cetak
		System.out.println(tanggalConvert);
	}

}
