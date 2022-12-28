package oop.latihanenkapsulasi;

import java.util.Set;

public class KendaraanEnkapsulasiMain {

	public static void main(String[] args) {
		
		Kendaraan mobil = new Kendaraan();

		//Set buat isi
		mobil.setModel("HRV");    
		mobil.setJumlahRoda(5);
		mobil.setHarga(1000);
		
		//get buat nampilin
		System.out.println(mobil.getModel());
		System.out.println(mobil.getJumlahRoda());
		System.out.println(mobil.getHarga());
		

	}

}
