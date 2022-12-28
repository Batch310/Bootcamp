package oop.latihandasar;

public class KendaraanDasarMain {

	public static void main(String[] args) {
		Kendaraan mobil = new Kendaraan();

		mobil.model = "Evolution Mistubishi";
		mobil.jumlahRoda = 4;
		mobil.harga=450000000;
		
		System.out.println("Model : "+mobil.model);
		System.out.println("Jumlah Roda : "+mobil.jumlahRoda);
		System.out.println("Harga : "+mobil.harga);
		
		mobil.getInfo();
		
		long tawar = mobil.tawarHarga(20000000);
		System.out.println(tawar);
//		mobil.tawarHarga(10000000)
		System.out.println(mobil.tawarHarga(10000000));
		
		mobil.getInfo();
	}

}
