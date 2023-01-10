package materiku.fungsi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MateriDate {

	public static void main(String[] args) throws ParseException {
	
//Tujuan
	//1. Convert string ke Date
	//2. Tambah 3 hari
	//3. Convert Date ke string
	//4. Cetak Stringnya
		
	//String tanggal = "31-12-2022 13:30:30"; //Pattern = dd-MM-yyyy HH:mm:ss
	//String tanggal = "31 January 2022"; //pattern = dd MMMM yyyy
	String tanggal = "31 Januari 2022"; //pattern = dd MMMM yyyy
	
//pattern = dd MMMM yyyy
	//Maret
	//MM -> 03
	//MMM -> Mar (Tergantung bahasa)
	//MMMM -> March (Tergantung bahasa)
	
//pattern jam = HH:mm:ss
	//hh -> Format 12 jam AM/PM
	//HH -> Format 24 jam
	
	//String pattern = "dd-MM-yyyy HH:mm:ss";
	String pattern = "dd MMMM yyyy";
	
	//Locale locale = new Locale("en", "EN"); //Locale English	
	Locale locale = new Locale("id", "ID"); //Locale Indonesia	
			
	//Object utk Convert
	SimpleDateFormat sdf = new SimpleDateFormat(pattern,locale);
	System.out.println(tanggal);
	
	//1.Convert String ke Date
	Date tanggalDate = sdf.parse(tanggal);
	long milis = tanggalDate.getTime();
	System.out.println(milis);
	
	//2.Tambah 3 hari
	long detik = 1000;
	long menit = 60 * 1000;
	long jam = 60 * 60 *1000;
	long hari = 24 * 60 * 60 * 1000;
	
	milis = milis + (3 * hari);
	System.out.println(milis);
	tanggalDate.setTime(milis);
	
	// Convert Date ke String
	String tanggalConvert = sdf.format(tanggalDate);
	
	//4. Cetak
	System.out.println(tanggalConvert);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
	}
}
