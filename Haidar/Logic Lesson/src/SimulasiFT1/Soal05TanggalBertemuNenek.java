package SimulasiFT1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Soal05TanggalBertemuNenek {
	public static void main(String[] args) throws ParseException {
		//Imam pergi ke rumah nenek setiap x hari
		//Yudha pergi ke rumah nenek setiap y hari
		//Hari yang sama z
		//Kapan bareng ke rumah nenek lagi?
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan nilai x : ");
		long x = masukan.nextLong();
		
		System.out.print("Masukkan nilai y : ");
		long y = masukan.nextLong();
		
		System.out.print("Masukkan tanggal z : ");
		masukan.nextLine();
		String z = masukan.nextLine();
		
		
		Locale localeID = new Locale("id", "ID");
		
		String pattern = "dd MMMM yyyy";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeID);
		
		//Convert String ke Date
		Date zDate = sdf.parse(z);
		long millis = zDate.getTime();
		
		//Tambah hari yang sama
		long day = 24 * 60 * 60 * 1000;
		if (x%y == 0 ) {
			millis += (x*day);
		} else if (y%x == 0) {
			millis += (y*day);
		} else {
			millis += (x*y*day);
		}
		
		//millis atau tanggal yang baru
		zDate.setTime(millis);
		
		//Convert Date ke String
		String zStr = sdf.format(zDate);
		
		System.out.println(zStr);
//		if (zStr.substring(0, 1).equals("0")) {
//			System.out.println(zStr.substring(1));
//		} else {
//			System.out.println(zStr);
//		}
		masukan.close();
		
	}
}
