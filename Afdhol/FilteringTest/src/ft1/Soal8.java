package ft1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal8 {

	// mary = x
	// susan = y
	// 8 maret
	
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("x: ");
		int inputX = scan.nextInt();

		System.out.print("y: ");
		int inputY = scan.nextInt();

	
		System.out.println("z: ");
		scan.nextLine();
		String inputZ = scan.nextLine();
		
		
		int ketemuan = 0;

		if (inputX < inputY) {
			ketemuan = inputX;
		} else {
			ketemuan = inputY;
		}

		while (ketemuan % inputX != 0 || ketemuan % inputY != 0) {
			ketemuan++;
		}
		

		Locale locale = new Locale("id", "ID");

		String pola = "dd MMMM yyyy";

		SimpleDateFormat sdf = new SimpleDateFormat(pola, locale);

		Date tglDate = sdf.parse(inputZ);
		long millis = tglDate.getTime();

		long detik = 1000;
		long menit = 60 * 1000;
		long jam = 60 * 60 * 1000;
		long hari = 24 * 60 * 60 * 1000;
		long minggu = 24 * 60 * 60 * 1000*5;
		long tambahHari =24 * 60 * 60 * 1000*5;

		millis = millis + (ketemuan * hari)+tambahHari;
		tglDate.setTime(millis);

		String tanggalConvert = sdf.format(tglDate);
		
		System.out.println(tanggalConvert);

		
		
	}

}
