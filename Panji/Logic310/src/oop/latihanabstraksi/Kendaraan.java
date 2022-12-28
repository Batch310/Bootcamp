package oop.latihanabstraksi;

abstract class Kendaraan {
	private String modelParam;
	private int jumlahRodaParam;
	private long hargaParam;
	
	public Kendaraan() {
		
	}
	
	abstract void gasPol() ;

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
