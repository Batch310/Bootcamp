package day1.latihan;

import java.util.Scanner;

public class Latihan4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.println("Harga Beli : ");
	double beli = input.nextInt();
	System.out.println("Harga Jual : ");
	double jual = input.nextInt();
	
	double keuntungan = (jual-beli)/beli*100;
	
	System.out.println("Keuntungan pedagang adalah " + keuntungan + " persen");
	
	}

}
