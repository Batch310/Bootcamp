package oop.latihanpolymorfisme;

class Kendaraan {
	String model;
	int jumlahRoda;
	long harga;

	public Kendaraan() {

	}

	public Kendaraan(String modelParam, int jumlahRodaParam, long hargaParam) {
		this.model = modelParam;
		this.jumlahRoda = jumlahRodaParam;
		this.harga = hargaParam;
	}

	public void getInfo() {
		System.out.println("Kendaraan " + model + " memiliki jumlah roda " + jumlahRoda + " dengan harga " + harga);
	}

	public long tawarHarga(long tawaran) {

		harga = harga - tawaran;
		return harga;
	}
	
	public void gasPol() {
		System.out.println(" Gas Puolll~~!!");
	}
}
