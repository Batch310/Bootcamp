package day1.latihan;

import java.util.Scanner;

public class coba {

	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		//		String rek = "0123456789";
//		
//		System.out.println(rek.length());
		System.out.print("Masukkan rekening tujuan : ");
		int rek1 = 10;
		String rekening1 = inputan.next();
		rekening1.length();
		
		if (rekening1.length() == rek1) {
			System.out.println("Lanjut");
		}else if(rekening1.length() > rek1){
			System.out.println("No Rekeneing kelebihan");
		}else {
			System.out.println("No Rekening kurang");
		}
	}

}
