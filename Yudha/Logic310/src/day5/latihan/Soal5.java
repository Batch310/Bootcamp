package day5.latihan;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input : ");
		String [] inputan = input.nextLine().split("; ");
		int totalJumlahOrang=0,jumlahPerempuan=0;
		double porsi = 0,totalJumlahPorsi = 0;
		for (int i = 0; i < inputan.length; i++) {
			String [] list = inputan[i].split(" = ");
			String orang = list[0]; // cari orang 
			int jumlahOrang = Integer.parseInt(list[1].substring(0,1));// cari angka / jumlah orang
			String sjmlhOrang = list[1].substring(0,1);
			int jmlhOrang = Integer.parseInt(sjmlhOrang);
			System.out.println(orang);
			System.out.println(jumlahOrang);
			if(orang.equalsIgnoreCase("Laki-laki dewasa")|orang.equalsIgnoreCase("Remaja")) {
				porsi = 2*jumlahOrang;
			}
			else if(orang.equalsIgnoreCase("Perempuan dewasa")) {
				porsi = 1*jumlahOrang;
				jumlahPerempuan += jumlahOrang;
			}
			else if(orang.equalsIgnoreCase("anak-anak")) {
				porsi = 0.5*jumlahOrang;
			}
			else if(orang.equalsIgnoreCase("Balita")) {
				porsi = 1*jumlahOrang;
			}
			totalJumlahOrang += jumlahOrang;
			totalJumlahPorsi += porsi;
		}
		if(totalJumlahOrang%2!=0 & totalJumlahOrang>5) {
			totalJumlahPorsi += jumlahPerempuan;
		}
		System.out.println(totalJumlahPorsi);
	}

}
