package oop.latihanabstraksi;

abstract class Kendaraan {
	String model;
	int jumlahRoda;
	long harga;
	
	public Kendaraan() {
		
	}
	public Kendaraan(String model, int jumlahRoda, long harga) {
		this.model = model;
		this.jumlahRoda = jumlahRoda;
		this.harga = harga;
	}

	public void getInfo() {
		System.out.println("Kendaraan " + model + " memiliki jumlah roda " + jumlahRoda + " dengan harga " + harga);
	}
	
	public long tawarHarga(long tawaran) {
		harga = harga - tawaran;
		return harga;
	}
	abstract void gasPol();
}
