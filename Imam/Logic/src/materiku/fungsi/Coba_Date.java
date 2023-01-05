package materiku.fungsi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Coba_Date {

	public static void main(String[] args) throws ParseException {

		String tanggalSekarang = "2 mei 2023";

		String pattern = "dd MMMM yyyy";
		Locale locale = new Locale("id", "ID");
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale);
		System.out.println(tanggalSekarang);

		// convert ke string
		Date tanggalDate = sdf.parse(tanggalSekarang);
		long milis = tanggalDate.getTime();
		System.out.print(milis);

		System.out.println();

		// tambah hari
		long detik = 1000;
		long menit = 60 * 1000;
		long jam = 60 * 60 * 1000;
		long hari = 24 * 60 * 60 * 1000;

		milis = milis + (5 * hari);
		tanggalDate.setTime(milis);

		// convert kembali ke string
		String tanggalSelanjutnya = sdf.format(tanggalDate);

		// cetak
		System.out.println(tanggalSelanjutnya);

	}

}
