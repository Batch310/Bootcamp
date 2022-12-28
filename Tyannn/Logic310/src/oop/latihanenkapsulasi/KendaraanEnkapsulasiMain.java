package oop.latihanenkapsulasi;

public class KendaraanEnkapsulasiMain {

	public static void main(String[] args) {
		
		Kendaraan car = new Kendaraan();
		
		car.setModel("sedan");
		car.setJumlahRoda(4);
		car.setHarga(1000);


		System.out.println(car.getModel());
		System.out.println(car.getJumlahRoda());
		System.out.println(car.getHarga());
	}

}
