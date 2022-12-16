package day1.latihan;

import java.util.Scanner;

public class Latihan4 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		int hrg_jual, hrg_beli;
		double keuntungan,hasil;
		
		System.out.println("Masukkan harga beli : ");
		hrg_beli = input.nextInt();
		
		System.out.println("Masukkan harga jual : ");
		hrg_jual = input.nextInt();
		
		hasil = hrg_jual-hrg_beli;
		
		keuntungan = hasil/hrg_jual*100;
		
		System.out.println("Total keuntungan pedagang : "+keuntungan+"persen");
		
	}

}
