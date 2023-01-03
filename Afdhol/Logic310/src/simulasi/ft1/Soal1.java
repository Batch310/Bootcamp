package simulasi.ft1;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("x: ");
		int input = scan.nextInt();
		
		int jumlahKertas=0;
		int a5 = 2*input;
		int a4 = 2*a5;
		int a3 = 2*a4;
		int a2 = 2*a3;
		int a1 = 2*a2;
		
		//System.out.println(a5+" "+a4+" "+a3+" "+a2+" "+a1);
		
		
		if (input>0 && input<=6) {
			
		jumlahKertas = a5;
		System.out.println("Dibutuhkan "+jumlahKertas+" Kertas a6 untuk membuat selembar a5");
		jumlahKertas = a4;
		System.out.println("Dibutuhkan "+jumlahKertas+" Kertas a6 untuk membuat selembar a4");
		jumlahKertas = a3;
		System.out.println("Dibutuhkan "+jumlahKertas+" Kertas a6 untuk membuat selembar a3");
		jumlahKertas = a2;
		System.out.println("Dibutuhkan "+jumlahKertas+" Kertas a6 untuk membuat selembar a2");
		jumlahKertas = a1;
		System.out.println("Dibutuhkan "+jumlahKertas+" Kertas a6 untuk membuat selembar a1");
			
		}else {
			System.out.println("input salah!");
		}
		
	}

}
