package oop.latihanpewarisan;

class Kendaraan {
	String model;
	int jumlahRoda;
	long harga; //1000

	public void getInfo() {
		System.out.println("Kendaraan " + model + " memiliki jumlah roda " + jumlahRoda + " dengan harga" + harga);
	}
	
	public long tawarHarga(long tawaran) {
		harga = harga - tawaran;
		return harga;
	}
	
	public void gasPol() {
		System.out.println("Gas Puoollll~~!!");
	}
	
	
}
