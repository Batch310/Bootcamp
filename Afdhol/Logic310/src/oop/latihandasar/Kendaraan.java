package oop.latihandasar;

class Kendaraan {

	String model;
	int jumlahRoda;
	long harga;
	
	

	
	public void getInfo() {
		
		System.out.println("Model kendaraan "+model+ " jumlah roda "+ jumlahRoda+"harga " +harga);
		
	}
	
	public long tawarHarga(long tawaran) {
		
		harga-=tawaran;
//		System.out.println(tawarharga);
		return harga;
	}
}
