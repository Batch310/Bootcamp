package oop.latihanenkapsulasi;

class Kendaraan {

	private String modelParam;
	private int jumlahRodaParam;
	private long hargaParam;

	public Kendaraan() {
		// TODO Auto-generated constructor stub
	}
	
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
	
	public void gaspol() {
		System.out.println("Gas Puolll!!!");
	}

	
	//membuat Getter dan Setter
	//shortcutnya klik kanan - source - generate getter setter
	
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
