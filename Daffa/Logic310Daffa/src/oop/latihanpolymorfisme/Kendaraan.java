package oop.latihanpolymorfisme;

public class Kendaraan {
	private String modelParam;
	private int jumlahRodaParam;
	private long hargaParam;

	public Kendaraan() {
		super();
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

	public String getModelParam() {
		return modelParam;
	}

	public void setModelParam(String modelParam) {
		this.modelParam = modelParam;
	}

	public int getJumlahRodaParam() {
		return jumlahRodaParam;
	}

	public void setJumlahRodaParam(int jumlahRodaParam) {
		this.jumlahRodaParam = jumlahRodaParam;
	}

	public long getHargaParam() {
		return hargaParam;
	}

	public void setHargaParam(long hargaParam) {
		this.hargaParam = hargaParam;
	}

}
