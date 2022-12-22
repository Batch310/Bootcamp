package day4.latihan.exam;

import java.util.Scanner;

public class Soal10Coba {

	public static void main(String[] args) {


//		Scanner scan = new Scanner(System.in);
//		System.out.println("harga: ");
//		
		double bayar = 60000;
		
		double kopi=18000;
		
		double diskon = 0.5;
		double cashback = 0.1;
		
		double sisa_saldo_diskon=0;
		if (bayar>=40000) {
			bayar = bayar* diskon+bayar*cashback;
			
			sisa_saldo_diskon +=bayar;
			System.out.println(sisa_saldo_diskon);
			
		if (sisa_saldo_diskon>=18000) {
			sisa_saldo_diskon /= kopi;
			System.out.println(sisa_saldo_diskon);
		}
		}
		
	}

}
