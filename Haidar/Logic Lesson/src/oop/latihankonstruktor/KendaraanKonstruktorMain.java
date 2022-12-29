package oop.latihankonstruktor;

public class KendaraanKonstruktorMain {
	public static void main(String[] args) {
		
		Kendaraan mobil = new Kendaraan("Toyota Alphard", 4, 1190000000); //Menginisiasi object dengan Konstruktor Kustom Kendaraan.
		
		Kendaraan vespa = new Kendaraan("Vespa PTS 100 Tahun 1986", 2, 50000000); //Menginisiasi object dengan Konstruktor Kustom Kendaraan.
		
		//Akses dan cetak isi atribut
		System.out.println("Model: " + mobil.model);
		System.out.println("Jumlah Roda: " + mobil.jumlahRoda);
		System.out.println("Harga: " + mobil.harga);
		System.out.println();
		
		//Akses dan cetak isi atribut
		System.out.println("Model: " + vespa.model);
		System.out.println("JumlahRoda: " + vespa.jumlahRoda);
		System.out.println("Harga: " + vespa.harga);
		System.out.println();
		
		//Panggil method atau fungsi getInfo()
		mobil.getInfo();
//		System.out.println();
		vespa.getInfo();
		System.out.println();
		
		//Panggil method atau fungsi tawarHarga(), lalu simpan ke variabel
		long hasilTawarMobil = mobil.tawarHarga(190000000);
		long hasilTawarVespa = vespa.tawarHarga(5000000);
		
		System.out.println("Tawaran diterima, harga sekarang " + hasilTawarMobil);
		System.out.println("Tawaran diterima, harga sekarang " + hasilTawarVespa);
		
	}
}
