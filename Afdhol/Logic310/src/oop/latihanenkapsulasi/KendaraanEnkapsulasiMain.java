package oop.latihanenkapsulasi;

public class KendaraanEnkapsulasiMain {

	public static void main(String[] args) {


		Kendaraan kendaraan = new Kendaraan();
		
		kendaraan.setModelParam("Mobil");
		kendaraan.setJumlahRodaParam(4);
		kendaraan.setHargaParam(10000);
		
		System.out.println(kendaraan.getModelParam());
		System.out.println(kendaraan.getJumlahRodaParam());
		System.out.println(kendaraan.getHargaParam());
		
	}

}
