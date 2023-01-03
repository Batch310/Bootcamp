package simulasift1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale locale = new Locale("id","ID");
		Scanner input = new Scanner(System.in);
		System.out.print("x = ");
		int x = input.nextInt();//5,3
		System.out.print("y = ");
		int y = input.nextInt();//2,2
		System.out.print("z = ");//2 januari 2023
		input.nextLine();
		String z= input.nextLine();//12 januari 2023, 8
		int a = 0;
		for (int i = 0; i < y;i++) {
			a = a + x;
			if(a%y==0) {
				break;
			}
		}
		String patern = "dd MMMM yyyy";
		SimpleDateFormat sdfid = new SimpleDateFormat(patern,locale);
		Date tanggalDate2 =  sdfid.parse(z);
		long milis2 = tanggalDate2.getTime();
		long hari = 24 * 60 * 60 * 1000;
		milis2 = milis2 + (a*hari);
		tanggalDate2.setTime(milis2);
		String tanggalConvert2 = sdfid.format(tanggalDate2);// format () : convert date to string
		System.out.println(tanggalConvert2);
	}

}
