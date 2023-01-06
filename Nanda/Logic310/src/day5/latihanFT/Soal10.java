package day5.latihanFT;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Saldo OPO = ");
		int saldo = input.nextInt();

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

		int minKopi = minOrder / hargaKopi;

		int jumlahKopi = saldo / hargaKopi;

		int totalHarga = 0;

		hargaDiskon = hargaKopi * diskon / 100;
		hargaKopi -= hargaDiskon;
		jumlahKopi = saldo / hargaKopi;
		totalDiskon = hargaKopi * jumlahKopi;

		if (jumlahKopi >= 3) {
			if (totalDiskon <= maxDiskon) {
				totalHarga = ((hargaKopi + hargaDiskon) * jumlahKopi) - totalDiskon;
			} else {
				for (jumlahKopi = 1; totalHarga < saldo; jumlahKopi++) {
					totalDiskon = hargaKopi * jumlahKopi;
					if (totalDiskon > maxDiskon) {
						totalDiskon = maxDiskon;
						totalHarga = ((hargaKopi + hargaDiskon) * jumlahKopi) - totalDiskon;
					}
				}
				jumlahKopi--;
			}

			totalCashback = totalHarga * cashback / 100;
			if (totalCashback > maxCashback) {
				totalCashback = maxCashback;
			}
			saldoAkhir = saldo - totalHarga + totalCashback;
			System.out.println("Jumlah cup = " + jumlahKopi);
			System.out.println("Saldo akhir = " + saldoAkhir);

		} else {
			System.out.println("Anda tidak mendapat promo");
		}
	}
}