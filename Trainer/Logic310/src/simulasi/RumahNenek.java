package simulasi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class RumahNenek {
	public static void main(String[] args) throws ParseException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = scanner.nextInt();
		
		System.out.print("y : ");
		int y = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("z : ");
		String z = scanner.nextLine();
		
		//Kapan bertemu lagi
		int nextDay;
		if(x < y) {
			nextDay = x;
		} else {
			nextDay = y;
		}
		
		while(nextDay % x != 0 || nextDay % y != 0) {
			nextDay++;
		}
		
		Locale locale = new Locale("id","ID");
		String pattern = "dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern,locale);
		
		Date zDate = sdf.parse(z);
		
		long milis = zDate.getTime();
		
		long detik = 1000;
		long menit = 60 * 1000;
		long jam = 60 * 60 * 1000;
		long hari = 24 * 60 * 60 * 1000;
		
		milis = milis + (hari * nextDay);
		
		zDate.setTime(milis);
		
		String newZ = sdf.format(zDate);
		
		System.out.println(newZ);
		
		
		
	}
}
