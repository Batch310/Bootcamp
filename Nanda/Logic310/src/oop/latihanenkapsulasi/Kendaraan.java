package oop.latihanenkapsulasi;

class Kendaraan {
	String modelParam;
	int jumlahRodaParam;
	long hargaParam;

	// konstruktor
	
	public Kendaraan() {
		
	}
	
	//konstrutor custom
	public Kendaraan(String modelParam, int jumlahRodaParam, long hargaParam) {
		super();
		this.modelParam = modelParam;
		this.jumlahRodaParam = jumlahRodaParam;
		this.hargaParam = hargaParam;
	}
	
	//getter setter
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
	
	public void gasPol() {
		System.out.println("Gas Puooolll~~!!");
	}

	public void getInfo() {
		System.out.println(
				"Kendaraan " + modelParam + " memiliki jumlah roda " + jumlahRodaParam + " dengan harga " + hargaParam);
	}

	public long tawarHarga(long tawaran) {
		hargaParam = hargaParam - tawaran;
		return hargaParam;
	}	
	
}
