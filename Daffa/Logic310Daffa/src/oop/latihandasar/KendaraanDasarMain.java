package oop.latihandasar;

public class KendaraanDasarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kendaraan boeing = new Kendaraan();

		boeing.model = "Boeing 777-9";
		boeing.jumlahRoda = 14;
		boeing.harga = 442200000;

		boeing.getInfo();
		long hasilTawar = boeing.tawarHarga(23560000);
		System.out.println("\nTawaran diterima, harga sekarang USD " + hasilTawar);
		

	}

}
