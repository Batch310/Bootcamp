package day5.test;

import java.util.Scanner;

public class Soal10EsKopi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan jumlah Saldo OPO : ");
		int saldo = scanner.nextInt();

		int hargaEsKopi = 18000;
		double diskon = 0.5;
		double cashback = 0.1;
		double saldoAkhir = 0;

		int cup = 1;
		int totalCup = 0;

		// untuk mencari jumlah cup
		while (hargaEsKopi * cup * diskon < saldo) {
			cup++;  
		}

		if (saldo % (hargaEsKopi * cup * diskon) == 0) {
			totalCup = cup;
			// output
			System.out.println("jumlah cup = " + totalCup + "; Saldo Akhir = Rp." + (int) saldoAkhir);
		} else {
			totalCup = cup - 1; //
			double hargaKopiDiskon = totalCup * hargaEsKopi * diskon; // harga kopi sebanyak cup dengan diskon
			double uangCasback = hargaKopiDiskon * cashback; // uang casback 10 %

			saldoAkhir = (saldo - hargaKopiDiskon) + uangCasback; // hitung saldo akhir

			// output
			System.out.println("jumlah cup = " + totalCup + "; Saldo Akhir = Rp." + (int) saldoAkhir);
		}

		// int hargaEsKopi = 18000; // Harga satuan es kopi susu
//		int diskon = hargaEsKopi / 2; // Persentase diskon
//		int jumlahCup = saldo / diskon; // Hitung jumlah cup
//		int kembalian = saldo % diskon; // Hitung kembalian
//		int hitungCashback = diskon * jumlahCup;
//		int cashback = hitungCashback / 10;
//		int jumlahSaldoAkhir = kembalian + cashback;

//		if ((hargaEsKopi * jumlahCup) / 2 > 100000) {
//			System.out.print("Mohon maaf transaksi tidak berhasil, karena maksimal diskon Rp. 100000");
//		} else if (hargaEsKopi * jumlahCup < 40000) {
//			if (saldo - (hargaEsKopi * jumlahCup) <= 0) {
//				System.out.print("Mohon maaf minimal transaksi Rp. 40000");
//			} else {
//				System.out.print("Saldo anda tida mencukupi, saldo anda " + (saldo - (hargaEsKopi * jumlahCup)));
//			}
//		} else {
//			System.out.println("Jumlah Cup = " + jumlahCup + "; Saldo Akhir = " + jumlahSaldoAkhir);
//		}
	}

}
