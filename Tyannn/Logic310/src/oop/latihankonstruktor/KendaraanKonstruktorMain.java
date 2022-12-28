package oop.latihankonstruktor;

public class KendaraanKonstruktorMain {

	public static void main(String[] args) {
		Kendaraan mobil= new Kendaraan("Ford Turbo",4,5000);
		
		System.out.println("Model : "+mobil.model);
		System.out.println("Jumlah Roda : "+mobil.jumlahRoda);
		System.out.println("Harga : "+mobil.harga);
		System.out.println();
		
		mobil.getInfo();
		
		long hasilTawar = mobil.tawarHarga(2300);
		System.out.println("Tawaran diterima, harga sekarang "+hasilTawar);
		mobil.getInfo();
		
	}

}
