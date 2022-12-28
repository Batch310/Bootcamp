package oop.latihandasar;

public class KendaraanDasarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kendaraan mobil = new Kendaraan();
		
		mobil.model = "Sedan";
		mobil.jumlahRoda = 4;
		mobil.harga = 100000;
		
		System.out.println("Model: "+mobil.model);
		System.out.println("Jumlah Roda "+mobil.jumlahRoda);
		System.out.println("harganya: "+mobil.harga);
		
		
		mobil.getInfo();
		
		
		long tawarHarga = mobil.tawarHarga(10000);
		
		System.out.println("sedan setelah tawar pertama :");
		
		
		mobil.tawarHarga(10000);
		
		
		System.out.println("sedan setelah tawar kedua : ");

		mobil.getInfo();
		
//		Kendaraan bis = new Kendaraan();
//		
//		bis.model = "Bis";
//		bis.jumlahRoda = 10;
//		bis.harga = 900000000;
//		
//		bis.getInfo();
//		
//		bis.tawarHarga(900000000);
	}

}
