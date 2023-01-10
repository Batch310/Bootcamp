package ft1;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5 stik es dapat 1 es gratis
		//harga es 1000
		//brp yg bisa didapatkan?
		
		//5000
		//9000
		//25000
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan Rp : ");
		int input = scan.nextInt();
		
		int hargaEs = 1000;
//		int esAwal =1;
		
		int esDidapat = input/hargaEs;
		
		//System.out.println("dapat es "+esDidapat);
		
		int totalEsGratis = esDidapat/5;
		
		//System.out.println("bonus:"+totalEsGratis);
		
		int totalEsDidapat = esDidapat + totalEsGratis;
		
		if (input>5000) {
			totalEsGratis +=1;
		}
				
		System.out.println("Total es didapat: "+totalEsDidapat);
		
		
	}

}
