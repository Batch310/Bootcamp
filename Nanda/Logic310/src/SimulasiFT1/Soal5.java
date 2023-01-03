package SimulasiFT1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal5 {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		Locale locale = new Locale("id", "ID"); //Locale Indonesia

		System.out.print("x = ");
		int x = input.nextInt();

		
		System.out.print("y = ");
		int y = input.nextInt();
		
		System.out.print("z = ");
		input.nextLine();
		String z = input.nextLine();

		
		String pattern = "dd MMMM yyyy";	
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale); //Objek untuk konversi
		System.out.println(z);

		
		Date tanggalDate = sdf.parse(z); //parse() : konversi String to date
		long milis = tanggalDate.getTime(); //milis = seribu * detik
		System.out.print(milis);
		
		long n = x*y;
		long detik = 1000;
		long menit = 60 * 1000;
		long jam = 60 * 60 * 1000;
		long hari = 24 * 60 * 60 *1000;
		
		
		milis = milis + (n*hari);
		System.out.println(milis);
		tanggalDate.setTime(milis); 
		
		String tanggalConvert = sdf.format(tanggalDate);
		
		System.out.println(tanggalConvert);
		
	}

}
