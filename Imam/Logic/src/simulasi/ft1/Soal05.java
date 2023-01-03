package simulasi.ft1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal05 {

	public static void main(String[] args) throws ParseException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("x = ");
		int x =scanner.nextInt();
		
		System.out.print("y = ");
		int y =scanner.nextInt();
		
		System.out.print("z = ");	
		String z =scanner.nextLine(); //pattern = dd MMMM yyyy
		
		Locale locale = new Locale("id", "ID"); 
		
		String pattern = "dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern,locale); 
		System.out.println(z);
		
		Date tanggalDate = sdf.parse(z);
		long milis = tanggalDate.getTime();
		System.out.println(milis);
		
		long hari = 24 * 60 * 60 * 1000;
		
		milis = milis + (2 * x * hari);
		System.out.println(milis);
		tanggalDate.setTime(milis);
		
		// Convert Date ke String
		String tanggalConvert = sdf.format(tanggalDate);
		
		//4. Cetak
		System.out.println(tanggalConvert);
		
		
		
		
		
		
		
		
		

	}

}
