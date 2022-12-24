package day5.latihan;

import java.util.Scanner;

public class Soal10 {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Saldo OPO = ");
		int saldo = masukan.nextInt();
		
		int hargaKopi = 18000;
		int diskon = 50;
		int hargaDiskon = 0;
		int totalDiskon = 0;
		
		int minOrder = 40000;
		int maxDiskon = 100000;
		
		int cashback = 10;
		int totalCashback = 0;
		int maxCashback = 30000;
		
		int saldoAkhir = 0;
		
		int minKopi = minOrder/hargaKopi;
		
		int jumlahKopi = saldo/hargaKopi;
		
//		int harga = 0;
		int totalHarga = 0;
		
//		if (jumlahKopi >  minKopi) {
			hargaDiskon = hargaKopi*diskon/100;
			hargaKopi -= hargaDiskon; //Harga kopi setelah diskon
			jumlahKopi = saldo/hargaKopi;			
			totalDiskon = hargaKopi*jumlahKopi; //Total diskon setelah kopi diskon

			if (totalDiskon <= maxDiskon) {
				totalHarga = ((hargaKopi+hargaDiskon)*jumlahKopi)-totalDiskon; 
			} else {
//				int sisaDiskon = 0;
//				jumlahKopi = 1; //saldo 200000
				for (jumlahKopi = 1; totalHarga < saldo; jumlahKopi++) { //i=1,2,3,4,5,6,7,8,9,10,11,12
					totalDiskon = hargaKopi*jumlahKopi; //9k*1 = 9k,18k,27k,36k,45k,54k,63k,72k,81k,90k,99k,108k
//					if (totalDiskon-maxDiskon < 0) {
//						sisaDiskon = maxDiskon-totalDiskon;
//					}
					if (totalDiskon > maxDiskon) { //<100k,<100k,<100k,<100k,<100k,<100k,<100k,<100k,<100k,<100k,<100k,<100k,>100k
//						hargaKopi = hargaKopi+hargaDiskon; //hargaKopi = 9000+9000;
						totalDiskon = maxDiskon;
						totalHarga = ((hargaKopi+hargaDiskon)*jumlahKopi)-totalDiskon;
					}
					//18k*1-9k=9k;36k-18k=18k;54k-27k=27k;72-36k=36k;90k-45k=45k;108k-54k=54k;126k-63k=63k;144k-72k=72k;162k-81k=81k;180k-90k=90k;198k-99k=99k
				}
				jumlahKopi--;
			}
			
			totalCashback = totalHarga*cashback/100;
			if (totalCashback > maxCashback) {
				totalCashback = maxCashback;
			}
			saldoAkhir = saldo-totalHarga+totalCashback;
//			System.out.println(hargaKopi);
//		} else {
//			totalHarga = jumlahKopi*hargaKopi;
//			saldoAkhir = saldo-totalHarga;
//		}
//		System.out.println(hargaDiskon);
//		System.out.println(hargaKopi);
//		System.out.println(minKopi);
		System.out.println(jumlahKopi);
		System.out.println(saldoAkhir);
	}
}
