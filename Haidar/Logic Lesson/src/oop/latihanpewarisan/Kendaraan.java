package oop.latihanpewarisan;

class Kendaraan {
	String model;
	int jumlahRoda;
	long harga;
	
	public Kendaraan() {
		
	}
	
	public Kendaraan(String modelParam, int jumlahRodaParam, long hargaParam) {
		super();
		model = modelParam;
		jumlahRoda = jumlahRodaParam;
		harga = hargaParam;
	}

	public void getInfo() {
		System.out.println("Kendaraan " + model + " memiliki jumlah roda " + jumlahRoda + " dengan harga " + harga);
	}
	
	public long tawarHarga(long tawaran) {
		harga -= tawaran; 
		return harga;
	}
	
	public void gasPol() {
		System.out.println("Gas Puooolll~~!!");
	}
}
