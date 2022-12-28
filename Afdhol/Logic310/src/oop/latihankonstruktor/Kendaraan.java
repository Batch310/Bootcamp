package oop.latihankonstruktor;

class Kendaraan {

	String modelParam;
	int jumlahRodaParam;
	long hargaParam;

	public Kendaraan(String modelParam, int jumlahRodaParam, long hargaParam) {
		super();
		this.modelParam = modelParam;
		this.jumlahRodaParam = jumlahRodaParam;
		this.hargaParam = hargaParam;
	}

	public void getInfo() {

		System.out.println("Model kendaraan " + modelParam + " jumlah roda " + jumlahRodaParam + " harga " + hargaParam);

	}

	public long tawarHarga(long tawaran) {

		hargaParam -= tawaran;
		return hargaParam;
	}
}
