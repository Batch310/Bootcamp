package day1.latihan;

import java.util.Scanner;

public class Latihan2 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		String nama,golongan,universitas;
		int umur;
		
		System.out.println("Nama: ");
		nama = input.nextLine();
		
		System.out.println("Umur: ");
		umur = input.nextInt();
		
		System.out.println("Golongan: ");
		golongan = input.next();
		
		
		input.nextLine();
		
		System.out.println("Universitas: ");
		universitas = input.nextLine();
		
		
		System.out.println();
		
		System.out.println("Nama \t\t: "+nama);
		System.out.println("Umur \t\t: "+umur);
		System.out.println("Golongan \t: "+golongan);
		System.out.println("Universitas \t: "+universitas);;
		
	}

}
