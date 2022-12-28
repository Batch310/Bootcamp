package oop.latihanenkapsulasi;

class Kendaraan {
	private String modelParam;
	private int jumlahRodaParam;
	private long hargaParam;
	
	public Kendaraan() {
		
	}
	
	public void gasPol() {
		System.out.println("Gas Puooolll~~!!");
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
