package day1.latihan;

import java.util.Scanner;

public class Day1Latihan2 {
	
public static void main(String[] args) {
	Scanner inputan = new Scanner(System.in);
	
	System.out.print("Nama 		: ");
	String nama = inputan.next();
	System.out.print("Umur 		: ");
	int umur = inputan.nextInt();
	System.out.print("Golongan 	: ");
	inputan.nextLine();
	String golongan = inputan.nextLine();
	System.out.print("Universitas 	: ");
	String univ = inputan.nextLine();
	
	System.out.println();
	System.out.println("Nama 		: "+ nama);
	System.out.println("Umur		: "+ umur);
	System.out.println("Golongan	: "+ golongan);
	System.out.println("Universitas 	: "+ univ);
	
	}
}
