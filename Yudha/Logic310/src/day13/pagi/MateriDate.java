package day13.pagi;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MateriDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// TUjuan
		// 1. Convert String ke Date
		// 2. Tampah 3 hari
		// 3. Convert Date ke String
		// 4. Cetak Stringnya
		
		Locale locale = new Locale("id","ID");
		//String tanggal = "31-12-2022 11:30:30"; //pattern : dd-MM-yyyy HH:mm:ss
		String tanggal1 = "31 January 2022"; //patern : dd MMMM yyyy
		String tanggal2 = "31 Januari 2022"; //patern : dd MMMM yyyy
		// h -> 12 jam AM/PM
		// H -> 24 jam
		//String patern = "dd-MM-yyyy HH:mm:ss";
		String patern = "dd MMMM yyyy";
		SimpleDateFormat sdfen = new SimpleDateFormat(patern);
		SimpleDateFormat sdfid = new SimpleDateFormat(patern,locale);
		// 1. convert String ke Date
		Date tanggalDate1 =  sdfen.parse(tanggal1);
		Date tanggalDate2 =  sdfid.parse(tanggal2);
		long milis1 = tanggalDate1.getTime();
		long milis2 = tanggalDate2.getTime();
		System.out.println(milis1);
		System.out.println(milis2);
		
		//2. tambah 3 hari
		long detik = 1000;
		long menit = 60 * 1000;
		long jam = 60 * 60 * 1000;
		long hari = 24 * 60 * 60 * 1000;
		
		milis1 = milis1 + (3*hari);
		System.out.println(milis1);
		milis2 = milis2 + (3*hari);
		System.out.println(milis2);
		tanggalDate1.setTime(milis1);
		tanggalDate2.setTime(milis2);
		
		// 3. conver date ke string
		String tanggalConvert1 = sdfen.format(tanggalDate1); // format () : convert date to string
		String tanggalConvert2 = sdfid.format(tanggalDate1); // format () : convert date to string
		
		// 4. Cetak
		System.out.println(tanggalConvert1);
		System.out.println(tanggalConvert2);
	}

}
