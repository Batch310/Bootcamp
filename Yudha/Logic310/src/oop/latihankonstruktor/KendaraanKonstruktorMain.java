package oop.latihankonstruktor;

import oop.latihankonstruktor.Kendaraan;

public class KendaraanKonstruktorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kendaraan mobil = new Kendaraan("Toyota", 4, 100000000);
		
		System.out.println("Model       : " + mobil.model);
		System.out.println("Jumlah Roda : " + mobil.jumlahRoda);
		System.out.println("Harga       : " + mobil.harga);
		
		System.out.println();
		mobil.getInfo();
		System.out.println();
		
		long hasilTawar = mobil.tawarHarga(10000000);
		System.out.println("Tawaran diterima, harga sekarang " + hasilTawar);
		
		System.out.println();
		mobil.getInfo();
	}

}
