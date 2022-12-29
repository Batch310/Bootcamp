package oop.latihankonstruktor;

class Kendaraan { // Buat Class

	// Atribut
	String model;
	int jumlahRoda;
	long harga;
	
	public Kendaraan(String modelParam, int jumlahRodaParam, long hargaParam) {
		super();
		this.model = modelParam;
		this.jumlahRoda = jumlahRodaParam;
		this.harga = hargaParam;
	}
	
	
	// method
	public void getInfo() {
		System.out.println("Kendaraan " + model + " memiliki jumlah roda" + jumlahRoda + " dengan harga " + harga);
	}

	// method dengan return value
	public long tawarHarga(long tawaran) {
		harga = harga - tawaran;
		return harga;
	}


}