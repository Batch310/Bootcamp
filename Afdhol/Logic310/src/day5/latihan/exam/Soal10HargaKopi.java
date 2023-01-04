package day5.latihan.exam;

import java.util.Scanner;

public class Soal10HargaKopi {

	public static void main(String[] args) {

		// SOAL
		// diskon 50% sampai 100.000
		// cashback 10% sampai 30.000
		// 119.400

		Scanner scan = new Scanner(System.in);
		System.out.println("bayar: ");
		int setor = scan.nextInt();
		if (!(setor >= 40000 && setor <= 200000)) {
			System.out.println("tidak sesuai");
			System.exit(0);
		}

		if (!(setor >= 18000)) {
			System.out.println("saldo tidak cukup");
			System.exit(0);
		}

		int kopi = 18000;
		int hitung_cashback = 0;
		double cashback = 0.1;
		int saldo_akhir = 0;
		int hitung_sisa_saldo = 0;
		int dapat_kopi1 = 0;

		if (setor >= 40000) {
			double kopi_diskon = 18000 * 0.5;

			double hitung = setor / kopi_diskon;
			dapat_kopi1 = (int) hitung;

			hitung_sisa_saldo = (int) (setor - dapat_kopi1 * kopi_diskon);

			int total_beli = (int) (dapat_kopi1 * kopi_diskon);

			hitung_cashback = (int) (total_beli * cashback);

			saldo_akhir = hitung_sisa_saldo + hitung_cashback;

			if (saldo_akhir < 18000) {
				System.out.print("Jumlah cup: " + dapat_kopi1 + " ");
				System.out.print("Saldo akhir: " + saldo_akhir);

			}
		} else if (setor >= 18000 && setor < 40000) {
			int setornoDiskon = setor;

			int kopi_noDiskon = (setor /= kopi);
			System.out.print("Jumlah cup: " + kopi_noDiskon + " ");

			hitung_sisa_saldo = setornoDiskon - (kopi_noDiskon * kopi);

			System.out.print("Sisa saldo: " + hitung_sisa_saldo);
		}

	}

}
