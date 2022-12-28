package oop.latihanenkapsulasi;

public class KendaraanEnkapsulasiMain {
	public static void main(String[] args) {
		
		Kendaraan mobil = new Kendaraan();
		
		mobil.setModel("Pajero");
		mobil.setJumlahRoda(45);
		mobil.setHarga(2000000);
		
		System.out.println(mobil.getModel());
		System.out.println(mobil.getJumlahRoda());
		System.out.println(mobil.getHarga());
		
	}
}
