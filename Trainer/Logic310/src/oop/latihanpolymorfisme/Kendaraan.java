package oop.latihanpolymorfisme;

class Kendaraan {
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
	
	public void gasPol() {
		System.out.println("Gas Puoollll~~!!");
	}

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
