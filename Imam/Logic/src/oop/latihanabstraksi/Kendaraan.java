package oop.latihanabstraksi;

abstract class Kendaraan {

	// Atribut
	String model;
	int jumlahRoda;
	long harga;

	// method
	public void getInfo() {
		System.out.println("Kendaraan " + model + " memiliki jumlah roda" + jumlahRoda + " dengan harga" + harga);
	}

	// method dengan return value
	public long tawarHarga(long tawaran) {
		harga = harga - tawaran;
		return harga;
	}

	public void Abstract() {
		System.out.println("Gas Puollll...!");
	}

}