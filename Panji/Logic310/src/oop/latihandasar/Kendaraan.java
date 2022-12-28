package oop.latihandasar;

class Kendaraan {
	String model;
	int jumlahRoda;
	long harga;

	public void getInfo() {
		System.out.println("Kendaraan " + model + " Memiliki jumlah roda " + jumlahRoda + " dengan harga Rp." + harga);
	}

	public long tawarHarga(long tawaran) {
		harga = harga - tawaran;
		return harga;
	}
	
}
