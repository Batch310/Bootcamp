package simulasi.ft1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal5Ketemuan {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		//imam pergi setiap x hari
		//yudha pergi setiap y hari
		// jika mengunjungi pada tanggal z
		//kapan tanggal terdekat?
		//input x=5,y=2,z=2
		//output 12 januari 2023
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("x= ");
		int inputX = scan.nextInt();
		System.out.print("y= ");
		int inputY = scan.nextInt();
		scan.nextLine();
		System.out.print("z= ");
		String inputZ = scan.nextLine();
		
	
		int ketemu = 0; //menampung berapa hari mereka akan bertemu
		
		if ( inputX<inputY) {
			ketemu = inputX;
		}else {
			ketemu = inputY;
		}
		
		while (ketemu % inputX != 0 || ketemu % inputY !=0) {
			ketemu++;
		}
		
		
		Locale locale = new Locale("id", "ID");
		
		String pattern = "dd MMMM yyyy";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern,locale); 
		
		Date tanggalDate = sdf.parse(inputZ); // akan ada error, pilih throws
		long millis = tanggalDate.getTime();// mengambil millis yang bisa convert ke tanggal
		
		
		long detik = 1000; // 1 detik adalah 1000 millis
		long menit = 60 * 1000;
		long jam = 60 * 60 * 1000;
		long hari = 24 * 60 * 60 *1000;
		
		
		millis = millis + (ketemu*hari);
		tanggalDate.setTime(millis); //update ke millis terbaru agar millis sebelumnya berubah
		
		String tanggalConvert = sdf.format(tanggalDate);// melakukan format dari tanggal ke String
		
		System.out.println(tanggalConvert);
		

	}

}
