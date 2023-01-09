package filteringtest1;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		//output 8 maret 2020
		System.out.print("X : ");
		int x = input.nextInt();

		System.out.print("Y : ");
		int y = input.nextInt();

		input.nextLine();
		System.out.print("Z : ");
		String z = input.nextLine();

		
		int hariLibur;
		if (x < y) {
			hariLibur = x;
		} else {
			hariLibur = y;
		}

		while (hariLibur % x != 0 || hariLibur % y != 0) {
			hariLibur++;
		}
		
		Locale locale = new Locale("id","ID");
		String pattern = "dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale);
		
		Date zDate = sdf.parse(z);
		
		long milis = zDate.getTime();
		
		long hari = 24 * 60 * 60 * 1000;
		
		milis = milis + (hari * hariLibur);
		
		zDate.setTime(milis);
		
		String newZ = sdf.format(zDate);
		
		System.out.println(newZ);
		
	}

}
