package oop.latihandasar;

public class KendaraanDasarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kendaraan motor = new Kendaraan();
		
		motor.model = "Honda Beat";
		motor.jumlahRoda = 2;
		motor.harga = 15000000;
		
		System.out.println("Model       : " + motor.model);
		System.out.println("Jumlah Roda : " + motor.jumlahRoda);
		System.out.println("Harga       : " + motor.harga);
		
		motor.getInfo();
		
		long hasilTawar = motor.tawarHarga(1000000);
		System.out.println("Tawaran diterima, harga sekarang " + hasilTawar);
		
		motor.getInfo();
	}

}
