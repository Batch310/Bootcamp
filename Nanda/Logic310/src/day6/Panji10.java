package day6;

import java.util.Scanner;

public class Panji10 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan jumlah Saldo OPO : ");
		int saldo = scanner.nextInt(); //

		int hargaEsKopi = 18000;
		double diskon = 0.5;
		double cashback = 0.1;
		double saldoAkhir = 0;
		double hargaKopiDiskon = 0, uangCashback = 0;
		int ongkir = 10000;

		int cup = 1; // 2, 3, 4, 5, 6, 7 .. 10, 11, 12
		int totalCup = 0;

		// untuk mencari jumlah cup
		while ( ((hargaEsKopi * cup) + ongkir ) *diskon <= saldo &&  ((hargaEsKopi * cup) + ongkir) * diskon <= 100000) { // 18000 * 12 * 0.5 <																		// 2000000
			cup++;
		}

		if (saldo % ((hargaEsKopi * cup) + ongkir) * diskon == 0) { // 300000 % (18000 * 12 * 0.5)
			totalCup = cup;
			hargaKopiDiskon = ((hargaEsKopi * totalCup) + ongkir) * diskon;
			uangCashback = hargaKopiDiskon * cashback;
			saldoAkhir = (saldo - hargaKopiDiskon) + uangCashback;
			// output
			System.out.println("jumlah cup = " + totalCup + "; Saldo Akhir = Rp." + (int) saldoAkhir);
		} else {
			totalCup = cup - 1; // //12 - 1 = 11
			if ((hargaEsKopi * totalCup) < 40000) { // Buat cek jika minimal order kurang dari 40000
				System.out.println("saya beli nanti ya");
				System.exit(0);
			}
			hargaKopiDiskon = ((hargaEsKopi * totalCup) + ongkir) * diskon; // 6 * 18000 * 0.5 = 54000 // harga kopi sebanyak cup dengan diskon
			uangCashback = hargaKopiDiskon * cashback; // 54000 * 0.1 = 5400 // uang casback 10 %
			saldoAkhir = (saldo - hargaKopiDiskon) + uangCashback; // (60000 - 54000) + 5400 = 11400 // hitung saldo akhir
			

			// output
			System.out.println("jumlah cup = " + totalCup + "; Saldo Akhir = Rp." + (int) saldoAkhir);
			// jumlah cup = 6; Saldo Akhir = Rp11400
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
