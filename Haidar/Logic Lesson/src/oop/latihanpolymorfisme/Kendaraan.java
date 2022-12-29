package oop.latihanpolymorfisme;

class Kendaraan {
	private String model;
	private int jumlahRoda;
	private long harga;
	
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
