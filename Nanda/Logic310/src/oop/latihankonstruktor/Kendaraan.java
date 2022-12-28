package oop.latihankonstruktor;

class Kendaraan {
	String modelParam;
	int jumlahRodaParam;
	long hargaParam;
	
	//konstruktor
	public Kendaraan(String modelParam, int jumlahRodaParam, long hargaParam) {
		super();
		this.modelParam = modelParam;
		this.jumlahRodaParam = jumlahRodaParam;
		this.hargaParam = hargaParam;
	}
	
	public void getInfo() {
		System.out.println("Kendaraan " + modelParam + " memiliki jumlah roda " + jumlahRodaParam + " dengan harga " + hargaParam);
	}
	
	public long tawarHarga(long tawaran) {
		hargaParam = hargaParam - tawaran;
		return hargaParam;
	}
}