package oop.latihanpewarisan;

class Kendaraan {

	//Atribut
		String model;
		int jumlahRoda;
		long harga;

		
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
		
		
		
	
	
}
