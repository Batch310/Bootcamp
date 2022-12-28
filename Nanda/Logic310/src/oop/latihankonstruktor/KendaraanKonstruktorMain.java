package oop.latihankonstruktor;

public class KendaraanKonstruktorMain {

	public static void main(String[] args) {
		Kendaraan motor = new Kendaraan("KLX", 2, 40000000);
		
		System.out.println("Model : " + motor.modelParam);
		System.out.println("jumlah roda : " + motor.jumlahRodaParam);
		System.out.println("harga : " + motor.hargaParam);
		
		motor.getInfo();
		
		System.out.println("harga akhir : " + motor.tawarHarga(10000000));
		
		motor.getInfo();

	}

}
