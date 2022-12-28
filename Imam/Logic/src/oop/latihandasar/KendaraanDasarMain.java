package oop.latihandasar;

public class KendaraanDasarMain {

	public static void main(String[] args) {

		// Bikin object
		Kendaraan mobil = new Kendaraan();

		mobil.model = "HR-V";
		mobil.jumlahRoda = 4;
		mobil.harga = 300000000;

		System.out.println("nama mpbil : " + mobil.model);
		System.out.println("Jumlah roda : " + mobil.jumlahRoda);
		System.out.println("harga : " + mobil.harga);

		System.out.println();

		mobil.getInfo();

		System.out.println();

		// tawaran 1
		long hasilTawar = mobil.tawarHarga(170000000);
		System.out.println("Tawaran diterima, tawaran sekarang " + hasilTawar);

		// tawaran 2
		hasilTawar = mobil.tawarHarga(20000000);
		System.out.println("Tawaran diterima, tawaran sekarang " + hasilTawar);

		System.out.println();

		mobil.getInfo();
	}

}
