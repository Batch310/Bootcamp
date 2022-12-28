package oop.latihankonstruktor;

public class KendaraanKonstruktorMain {

	public static void main(String[] args) {
		
		//inisiasi konstruktor
		Kendaraan sepeda = new Kendaraan("Beat", 2, 15000000);
		
		//akses & cetak atribut
		System.out.println("nama sepeda : " + sepeda.model);
		System.out.println("Jumlah roda : " + sepeda.jumlahRoda);
		System.out.println("harga : " + sepeda.harga);		
		
		//panggil get info
		sepeda.getInfo();
		
		//panggil method tawar
		long hasilTawar = sepeda.tawarHarga(10000000);
		System.out.println("Tawaran diterima, tawaran sekarang " + hasilTawar);
		
		hasilTawar = sepeda.tawarHarga(3000000);
		System.out.println("Tawaran diterima, tawaran sekarang " + hasilTawar);
		
		//panggil get info lagi
		sepeda.getInfo();
	}

}
