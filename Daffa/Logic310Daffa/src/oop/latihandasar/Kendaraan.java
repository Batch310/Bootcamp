package oop.latihandasar;

class Kendaraan {
	String model;
	int jumlahRoda;
	long harga;

	public void getInfo() {
		System.out.println(
				"Kendaraan model " + model + " memiliki jumlah roda " + jumlahRoda + " dengan harga USD " + harga);
	}

	public long tawarHarga(long tawaran) {
		harga -= tawaran;
		return harga;
	}
}