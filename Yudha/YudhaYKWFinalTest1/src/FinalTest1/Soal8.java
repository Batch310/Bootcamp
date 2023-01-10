package FinalTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal8 {
	

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale locale = new Locale("id","ID");
		Scanner input = new Scanner(System.in);
		System.out.print("x = ");
		int x = input.nextInt();
		System.out.print("y = ");
		int y = input.nextInt();
		System.out.print("z = ");
		input.nextLine();
		String z= input.nextLine();
		int a = 0;
		for (int i = 0; i < y; i++) {
			a = a+x;
			if(a%y==0) {
				break;
			}
			
		}
		String patern = "dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(patern,locale);
		Date tanggalDate = sdf.parse(z);
		long milis = tanggalDate.getTime();
		long hari = 24 * 60 * 60 * 1000;
		milis = milis + hari *a;
		tanggalDate.setTime(milis);
		String covertTanggal = sdf.format(tanggalDate);
		System.out.println(covertTanggal);
	}

}
