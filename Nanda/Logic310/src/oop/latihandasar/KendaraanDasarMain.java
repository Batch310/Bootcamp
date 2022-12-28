package oop.latihandasar;

public class KendaraanDasarMain {
	public static void main(String[] args) {
		Kendaraan mobil = new Kendaraan();
		
		mobil.model = "Jeep";
		mobil.jumlahRoda = 4;
		mobil.harga = 350000000;
		
		System.out.println("Model Mobil : " + mobil.model);
		System.out.println("jumlah roda mobil : " + mobil.jumlahRoda);
		System.out.println("harga mobil : " + mobil.harga);
		
		mobil.getInfo();
		
		//simpan divariabel tawar
		long tawar = mobil.tawarHarga(50000000);
		System.out.println("Harga akhir : " +tawar);
		
		//tanpa simpan
		System.out.println("Harga akhir : " + mobil.tawarHarga(50000000));
		
		mobil.getInfo();
	}
}
