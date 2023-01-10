package simulasiFT01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class SimFT05 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale locale = new Locale("id", "ID");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Berapa hari sekali Imam berkunjung? ");
		int hariImam = scanner.nextInt();
		System.out.println("Berapa kali sehari Yudha berkunjung? ");
		int hariYudha = scanner.nextInt();
		System.out.println("Tanggal berapa terakhir kali berkunjung? ");
		scanner.nextLine();
		String tanggalTerakhir = scanner.nextLine();
		scanner.close();

		String pattern = "dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale);

		Date tanggalDate = sdf.parse(tanggalTerakhir);
		long millis = tanggalDate.getTime();

		long detik = 1000;
		long menit = 60 * detik;
		long jam = 60 * menit;
		long hari = 24 * jam;

		if (hariImam % hariYudha == 0) {
			millis += hariImam * hari;
		} else if (hariYudha % hariImam == 0) {
			millis += hariYudha * hari;
		} else {
			millis += hariImam * hariYudha * hari;
		}

		tanggalDate.setTime(millis);

		String tanggalConvert = sdf.format(tanggalDate);
		System.out.println(tanggalConvert);
	}

}
