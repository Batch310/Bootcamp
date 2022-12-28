package oop.latihandasar;

public class KendaraanDasarMain {

	public static void main(String[] args) {
		Kendaraan mobil = new Kendaraan();

		mobil.model = "Mazda RX7";
		mobil.jumlahRoda = 4;
		mobil.harga = 600000000;

		System.out.println("Mobil 		: " + mobil.model);
		System.out.println("Jumlah Roda 	: " + mobil.jumlahRoda);
		System.out.println("Harga mobil 	: " + mobil.harga);
		
		mobil.getInfo();
		System.out.println();

		long hasilTawar = mobil.tawarHarga(300000000);
		System.out.println("Tawaran pertama diterima Rp." + hasilTawar);

		hasilTawar = mobil.tawarHarga(200000000);
		System.out.println("Tawaran kedua diterima Rp." + hasilTawar);

		hasilTawar = mobil.tawarHarga(50000000);
		System.out.println("Tawaran ketiga diterima Rp." + hasilTawar);

		hasilTawar = mobil.tawarHarga(25000000);
		System.out.println("Tawaran keempat diterima Rp." + hasilTawar);

		hasilTawar = mobil.tawarHarga(10000000);
		System.out.println("Tawaran kelima diterima Rp." + hasilTawar);

		hasilTawar = mobil.tawarHarga(7500000);
		System.out.println("Tawaran keenam diterima Rp." + hasilTawar);

		hasilTawar = mobil.tawarHarga(2500000);
		System.out.println("Tawaran ketujuh diterima Rp." + hasilTawar);
		
		mobil.getInfo();
	}

}
