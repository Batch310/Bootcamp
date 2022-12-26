package day5.latihan;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		//min order 40k >> diskon 50%(masx 100k)
		//beli dulu baru diskon
		//lalu cashback 10%(max 30k)
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Saldo OPO = Rp. ");
		int saldo=scanner.nextInt();
		
		int kopi = 18000;
		int cup=0;
		int saldoAkhir=0;
		double diskon = 0.5;
		double cashback=0.1;
		
		while(saldo>kopi) {
			if(saldo>kopi && cup>2) {
				kopi= kopi/2;
				saldo-=kopi;
				cup++;
			}
			
			saldo-=kopi;
			cup++;
			
		}	
			

	}

}
