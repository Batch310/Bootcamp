package oop.latihandasar;

public class KendaraanDasarMain {
	public static void main(String[] args) {
		Kendaraan mobil = new Kendaraan();
		
		mobil.model = "Kijang Satu";
		mobil.jumlahRoda = 3;
		mobil.harga = 2000;
		
		System.out.println("Model : " + mobil.model);
		System.out.println("Jumlah Roda : " + mobil.jumlahRoda);
		System.out.println("Harga : " + mobil.harga);
		
		mobil.getInfo();
		
		long tawaran1 = mobil.tawarHarga(200);
		System.out.println(tawaran1);
		
		System.out.println(mobil.tawarHarga(300));
		
		mobil.getInfo();
	}
}
