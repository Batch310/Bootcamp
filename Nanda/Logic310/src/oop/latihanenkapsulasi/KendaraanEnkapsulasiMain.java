package oop.latihanenkapsulasi;

public class KendaraanEnkapsulasiMain extends Kendaraan {

	public static void main(String[] args) {
		
		Kendaraan mobil = new Kendaraan();
		
		mobil.setModelParam("Minibus");
		mobil.setJumlahRodaParam(6);
		mobil.setHargaParam(5000);
		
		System.out.println("Model Mobil : " + mobil.getModelParam());
		System.out.println("Jumlah Roda : " + mobil.getJumlahRodaParam());
		System.out.println("Harga : " + mobil.getHargaParam());

	}

}
