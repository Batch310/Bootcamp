package simulasi.ft1;

import java.util.Scanner;

public class Soal8 {

	//deret dengna penjumlahan kelipatan 3 dikurang 1
	//deret dengan bilangan kelipatan 4 dibagi 2
	//soal = indeks ganjil ditambah ganjil, index genap ditambah genap
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("n: ");
//		int input = scan.nextInt();
		
		int n =5;
		int jumlah =0;
		int bilPertama =0;
		
		int[] arrSatu = new int[n];
		
		for (int i = 0; i < arrSatu.length; i++) {
			jumlah = i+(bilPertama+3)-1;
			System.out.print(jumlah+" ");
		}
	}

}
