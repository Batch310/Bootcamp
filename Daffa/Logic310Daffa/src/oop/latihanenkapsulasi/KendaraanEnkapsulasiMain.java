package oop.latihanenkapsulasi;

public class KendaraanEnkapsulasiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kendaraan kijang = new Mobil();
		
		kijang.setModelParam("Kijang");
		kijang.setJumlahRodaParam(4);
		kijang.setHargaParam(50000000);
		System.out.println(kijang.getModelParam());
		System.out.println(kijang.getJumlahRodaParam());
		System.out.println(kijang.getHargaParam());
		
		System.out.println();
		
		Kendaraan cbr = new Motor();
		
		cbr.setModelParam("CBR");
		cbr.setJumlahRodaParam(2);
		cbr.setHargaParam(40000000);
		System.out.println(cbr.getModelParam());
		System.out.println(cbr.getJumlahRodaParam());
		System.out.println(cbr.getHargaParam());
		
		
	}
	

}
