package simulasi.ft1;

import java.util.Scanner;

public class Soal4Coklat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//pembelia 1 coklat dapat 1 stempel gratis
		//setiap 5 pembelian dapat 1 coklat gratis
		//harga 1 coklat 1000
		
		//berapa jumlah coklat dengan uang sejumlah n
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("input: ");
		int input = scan.nextInt();
	
		int coklatGratis = 5;
		int hargaCoklat = 1000;
		
		
		int hitungCoklat = input/hargaCoklat;
		
		int hitungStempel = hitungCoklat/coklatGratis;
		
		int hitungTotalCoklat = hitungCoklat+hitungStempel;
		
		System.out.println("Nanda mendapatkan "+hitungTotalCoklat+" coklat dilan");
		
	}

}
