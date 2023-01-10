package ft1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal08 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale locale = new Locale("id", "ID");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan x : ");
		int x = scanner.nextInt();
		System.out.println("Masukkan y : ");
		int y = scanner.nextInt();
		System.out.println("Masukkan z : ");
		scanner.nextLine();
		String z = scanner.nextLine();
		scanner.close();

		String pattern = "dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale);

		Date tanggal = sdf.parse(z);
		long millis = tanggal.getTime();

		long detik = 1000;
		long menit = 60 * detik;
		long jam = 60 * menit;
		long hari = 24 * jam;
		
		if (x % y == 0) {
			millis += x * hari;
		} else if (y % x == 0) {
			millis += y * hari;
		} else {
			millis += x * y * hari;
		}

		tanggal.setTime(millis);
		String tanggalConvert = sdf.format(tanggal);
		System.out.println(tanggalConvert);
	}

}
