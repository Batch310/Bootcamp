package oop.latihandasar;

public class KendaraanDasarMain {
	public static void main(String[] args) {
		
		Kendaraan mobil = new Kendaraan();
		
		mobil.model = "Toyota Alphard";
		mobil.jumlahRoda = 4;
		mobil.harga = 1190000000;
		
		Kendaraan vespa = new Kendaraan();
		
		vespa.model = "Vespa PTS 100 Tahun 1986";
		vespa.jumlahRoda = 2;
		vespa.harga = 50000000;
		
		System.out.println("Model: " + mobil.model);
		System.out.println("Jumlah Roda: " + mobil.jumlahRoda);
		System.out.println("Harga: " + mobil.harga);
		
		System.out.println("Model: " + vespa.model);
		System.out.println("Jumlah Roda: " + vespa.jumlahRoda);
		System.out.println("Harga: " + vespa.harga);
		
		
		mobil.getInfo();
		vespa.getInfo();

		System.out.println();
		long hasilTawarMobil = mobil.tawarHarga(190000000);
		long hasilTawarVespa = vespa.tawarHarga(5000000);

		System.out.println("Tawaran diterima, harga mobil sekarang " + hasilTawarMobil);
		System.out.println("Tawaran diterima, harga vespa sekarang " + hasilTawarVespa);
		

//		System.out.println();
//		hasilTawarMobil = mobil.tawarHarga(100000000);
//		hasilTawarVespa = vespa.tawarHarga(5000000);
//
//		System.out.println("Tawaran diterima, harga mobil sekarang " + hasilTawarMobil);
//		System.out.println("Tawaran diterima, harga vespa sekarang " + hasilTawarVespa);
	}
}
