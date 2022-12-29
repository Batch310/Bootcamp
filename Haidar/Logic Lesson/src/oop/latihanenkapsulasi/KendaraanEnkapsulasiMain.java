package oop.latihanenkapsulasi;

public class KendaraanEnkapsulasiMain {
	public static void main(String[] args) {
		Kendaraan kendaraan = new Kendaraan();
		
		kendaraan.setModel("Vespa PTS 100 Tahun 1986");
		kendaraan.setJumlahRoda(2);
		kendaraan.setHarga(50000000);
		
		System.out.println("Model: " + kendaraan.getModel());
		System.out.println("Jumlah Roda: " + kendaraan.getJumlahRoda());
		System.out.println("Harga: " + kendaraan.getHarga());
	}
}
