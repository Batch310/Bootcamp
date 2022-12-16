package day1.latihan;

import java.util.Scanner;

public class Day1Latihan4 {

	public static void main(String[] args) {
		Scanner inputan= new Scanner(System.in);
		
		System.out.print("Harga Beli : ");
		int beli = inputan.nextInt();
		System.out.print("Harga Jual : ");
		int jual = inputan.nextInt();
		
		System.out.println();
		double untung = jual - beli;
		double persen = (untung/beli)*100;
		
		System.out.println("Keuntungan Pedagang adalah "+ persen +"persen");

	}

}
