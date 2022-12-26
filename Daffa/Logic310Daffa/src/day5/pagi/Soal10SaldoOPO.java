package day5.pagi;

import java.util.Scanner;

public class Soal10SaldoOPO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Masukkan saldo OPO : ");
		int saldoOPO = input.nextInt();
		input.close();
		int hargaKopi = 18000;
		int diskon = 50;
		int hargaDiskon = 0;
		int totalDiskon = 0;

//		int minOrder = 40000;
		int maxDiskon = 100000;

		int cashback = 10;
		int totalCashback = 0;
		int maxCashback = 30000;

		int sisaSaldo = 0;

//		int minBeliKopi = minOrder / hargaKopi;
		int jumlahKopiDibeli = saldoOPO / hargaKopi;

		int totalHarga = 0;

		hargaDiskon = hargaKopi * diskon / 100;
		hargaKopi -= hargaDiskon;
		jumlahKopiDibeli = saldoOPO/hargaKopi;
		totalDiskon = hargaKopi * jumlahKopiDibeli;

		if (jumlahKopiDibeli >= 3) {
			if (totalDiskon <= maxDiskon) {
				totalHarga = ((hargaKopi + hargaDiskon) * jumlahKopiDibeli) - totalDiskon;
			} else {
				for (int jumlahKopiDibei = 1; totalHarga < saldoOPO; jumlahKopiDibei++) {
					totalDiskon = hargaKopi * jumlahKopiDibei;
					if (totalDiskon > maxDiskon) {
						totalDiskon = maxDiskon;
						totalHarga = ((hargaKopi + hargaDiskon) * jumlahKopiDibeli) - totalDiskon;
					}
				}
				jumlahKopiDibeli--;
			}
			totalCashback = totalHarga * cashback / 100;
			if (totalCashback > maxCashback) {
				totalCashback = maxCashback;
			}
			sisaSaldo = saldoOPO - totalHarga + totalCashback;
			System.out.println("Jumlah cup = " + jumlahKopiDibeli);
			System.out.println("Saldo akhir = " + sisaSaldo);
		} else {
			System.out.println("Anda tidak mendapat promo");
		}
	}

}
