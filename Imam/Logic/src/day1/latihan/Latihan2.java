package day1.latihan;

import java.util.Scanner;

public class Latihan2 {
	
	public static void main(String[] args) {
		
		Scanner inputan = new Scanner(System.in);
		
		System.out.print("Nama :");
		String nama = inputan.nextLine();
		
		System.out.print("Umur :");
		int umur = inputan.nextInt();
				
		System.out.print("Golongan :");
		String gol = inputan.next();
		
		inputan.nextLine();
		System.out.print("Universitas :");
		String univ = inputan.nextLine();
		
		System.out.println("Nama        :" +nama);
		System.out.println("Umur        :" + umur);
		System.out.println("Golongan    :" +  gol);
		System.out.println("Universitas :" + univ);
		
//		System.out.print("Umur :");
//		int umur = inputan.nextInt();
//		System.out.println("Umur : "+umur);
//		
//		System.out.print("Golongan :");
//		String gol = inputan.next();
//		System.out.println("Golongan : " + gol);
//		
//		inputan.nextLine();
//		
//		System.out.print("Universitas :");
//		String univ = inputan.nextLine();
//		System.out.println("Universitas : "+univ);
//		
//		
	}

}
