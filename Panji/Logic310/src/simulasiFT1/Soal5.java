package simulasiFT1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		System.out.print("x : ");
		int x = input.nextInt();
		System.out.print("y : ");
		int y = input.nextInt();
		System.out.print("z : ");
		String z = input.next();
		
		//String b = Integer.toString(z);
		Locale locale = new Locale("id", "ID");
		String tanggal = z;
		String pattern = "dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale);
		System.out.println(tanggal);
		
		Date tanggalDate = sdf.parse(tanggal);
		long milis = tanggalDate.getTime();
		System.out.println(milis);
		
		//hari
		long hari = 24 * 60 * 60 * 1000;
		
		long imam = milis + (x * hari);
		long yudha = milis + (y * hari);
		
	}

}
