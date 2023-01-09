package FT1AdhietyanPS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal08 {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);

		Locale locale = new Locale("id", "ID");
		System.out.println("x : ");
		int x = input.nextInt();

		System.out.println("y : ");
		int y = input.nextInt();
		input.nextLine();

		System.out.println("z : ");
		String z = input.nextLine();

		// Kapan bertemu lagi
		int nextDay;
		if (x < y) {
			nextDay = x;
		} else {
			nextDay = y;
		}

		while (nextDay % x != 0 || nextDay % y != 0) {
			nextDay++;
		}

		String pattern = "dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale);

		Date zDate = sdf.parse(z);

		long milis = zDate.getTime();

//		long detik = 1000;
//		long menit = 60 * 1000;
//		long jam = 60 * 60 * 1000;
		long hari = 24 * 60 * 60*  1000 ;

		milis = milis + (hari*  nextDay);

		zDate.setTime(milis);

		String newZ = sdf.format(zDate);

		System.out.println(newZ);
	}
}
