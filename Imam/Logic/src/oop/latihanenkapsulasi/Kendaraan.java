package oop.latihanenkapsulasi;

class Kendaraan {

	//Atribut
		private String model;
		private int jumlahRoda;
		private long harga;

		
		//method
		public void getInfo() {
			System.out.println("Kendaraan " + model + " memiliki jumlah roda" + jumlahRoda + " dengan harga" + harga);
		}

		//method dengan return value
		public long tawarHarga(long tawaran) {
			harga = harga -tawaran;
	        return harga;
		}

		public void gasPoll() {
		System.out.println("Gas Puollll...!");
		}

		public String getModel() {  //ambil
			return model;
		}

		public void setModel(String model) {    //ngisi data
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
