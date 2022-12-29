package oop.latihanpewarisan;

class Kendaraan {
	String modelParam;
	int jumlahRodaParam;
	long hargaParam;
	
	public Kendaraan() {
		
	}
	
	public Kendaraan(String modelParam, int jumlahRodaParam, long hargaParam) {
		super();
		this.modelParam = modelParam;
		this.jumlahRodaParam = jumlahRodaParam;
		this.hargaParam = hargaParam;
	}

	public void gasPol() {
		System.out.println("Gas Puooolll~~!!");
	}
	
}
