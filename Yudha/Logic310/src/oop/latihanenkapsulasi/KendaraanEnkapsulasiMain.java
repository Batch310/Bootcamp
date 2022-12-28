package oop.latihanenkapsulasi;

public class KendaraanEnkapsulasiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kendaraan pesawat = new Kendaraan();
		pesawat.setModel("Jet");
		pesawat.setJumlahRoda(2);
		pesawat.setHarga(1000000000);
		
		System.out.println(pesawat.getModel());
		System.out.println(pesawat.getJumlahRoda());
		System.out.println(pesawat.getHarga());
	}

}
