package oop.latihankonstruktor;

public class KendaraanKonstruktorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kendaraan motor = new Kendaraan("Matic", 2, 12000);// mengisi parameter berdasarkan konstruktor yang telah dibuat sebanyak 3
		
		System.out.println("Model: "+motor.modelParam);
		System.out.println("Roda: "+motor.jumlahRodaParam);
		System.out.println("Harga: "+motor.hargaParam); 
		
		motor.getInfo();
		
		long hasilTawar = motor.tawarHarga(2000);
		
		System.out.println("Tawaran diterima, harga sekarang "+hasilTawar);
 		
	}

}
