package oop.latihanabstraksi;

abstract class Kendaraan {

	private String model;
	private int jumlahRoda;
	private long harga; //1000

	public void getInfo() {
		System.out.println("Kendaraan " + model + " memiliki jumlah roda " + jumlahRoda + " dengan harga" + harga);
	}
	
	public long tawarHarga(long tawaran) {
		harga = harga - tawaran;
		return harga;
	}
	
	abstract void gasPol();

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getJumlahRoda() {
		return jumlahRoda;
	}

	public void setJumlahRoda(int jumlahRoda) {
		this.jumlahRoda = jumlahRoda;
	}

	public long getHarga() {
		return harga;
	}

	public void setHarga(long harga) {
		this.harga = harga;
	}
	
}
