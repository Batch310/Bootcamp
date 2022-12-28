package oop.latihankonstruktor;

public class KendaraanKonstruktorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kendaraan boeing = new Kendaraan("Boeing", 14, 442200000);
		
		System.out.println("Model : " + boeing.modelParam);
		System.out.println("Jumlah roda : " + boeing.jumlahRodaParam);
		System.out.println("Harga : USD " + boeing.hargaParam);
		System.out.println();

		boeing.getInfo();
		System.out.println();

		long hasilTawar = boeing.tawarHarga(19474000);
		System.out.println("Tawaran diterima, harga sekarang USD " + hasilTawar);
	}

}
