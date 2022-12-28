package oop.latihanpewarisan;

public class Kendaraan {
	String modelParam;
	int jumlahRodaParam;
	long hargaParam;
	
	

	public Kendaraan() {
		super();
	}

	public Kendaraan(String model, int jumlahRoda, long harga) {
		super();
		this.modelParam = model;
		this.jumlahRodaParam = jumlahRoda;
		this.hargaParam = harga;
	}

	public void getInfo() {
		System.out.println("Kendaraan model " + modelParam + " memiliki jumlah roda " + jumlahRodaParam
				+ " dengan harga " + hargaParam);
	}

	public long tawarHarga(long tawaran) {
		hargaParam -= tawaran;
		return hargaParam;
	}
	
	public void gasPol() {
		System.out.println("Gas PUooolll~~!!");
	}
}
