package day1.latihan;

import java.util.Scanner;

public class Latihan4 {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		
		//input beli
		System.out.print("Harga Beli : ");
		int b = inputan.nextInt();
		
		//input jual
		System.out.print("Harga Jual : ");
		int j = inputan.nextInt();
		
		//output
		double u = j-b;
		double p = (u/b)*100;
		System.out.print("Keuntungan Pedagan adalah " +p+ " Persen");
 
	}

}
