package day1.latihan;

import java.util.Scanner;

public class LatihanDelapan {

	public static void main(String[] args) {
		
		int hjas = 750000;
		int hcelang = 250000;
		int hkemeja = 100000;
		int hkaos = 50000;
		
		Scanner masukan = new Scanner(System.in); //Inisiasi tipe data Scanner variabel masukan sebagai input dari console
		
		System.out.print("Uang: ");
		int uang = masukan.nextInt(); //Input uang
		
		if (uang >= 750000) { //Kondisi uang lebih dari 750000
			System.out.println("Beli Jas!");
		} else if (uang >= hcelang) { //Kondisi uang lebih dari 250000
			System.out.println("Beli Celana Panjang!");
		} else if (uang >= hkemeja) { //Kondisi uang lebih dari 100000
			System.out.println("Beli Kemeja!");
		} else if (uang >= hkaos) { //Kondisi uang lebih dari 50000
			System.out.println("Beli Kaos!");
		} else { //Kondisi uang kurang dari 50000
			System.out.println("Tidak bisa beli apa - apa!");
		}

	}

}

//6m30s