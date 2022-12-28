package oop.latihanenkapsulasi;

public class KendaraanEnkapsulasiMain {

	public static void main(String[] args) {
		Kendaraan car = new Kendaraan();
		
		car.setModelParam("Honda Brio");
		car.setJumlahRodaParam(4);
		car.setHargaParam(5000);
		
		
		System.out.println(car.getModelParam());
		System.out.println(car.getJumlahRodaParam());
		System.out.println(car.getHargaParam()); 

	}

}
