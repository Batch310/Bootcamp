package oop.latihankonstruktor;

public class KendaraanKonstruktorMain {

	public static void main(String[] args) {
		Kendaraan mobil = new Kendaraan("Mercedes", 4, 5000);
		
		System.out.println("Mobil 		: " + mobil.modelParam);
		System.out.println("Jumlah Roda 	: " + mobil.jumlahRodaParam);
		System.out.println("Harga mobil 	: " + mobil.hargaParam);
		System.out.println();
		
		mobil.getInfo();
		
		long hasilTawar = mobil.tawarHarga(3000);
		System.out.println("Tawaran pertama diterima Rp." + hasilTawar);
		
		mobil.getInfo();

	}

}
