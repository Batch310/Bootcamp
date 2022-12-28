package oop.latihanpewarisan;

public class KendaraanPewarisanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobil pajero = new Mobil("Pajero", 4, 700000000);	
//		pajero.getInfo();
		pajero.bukaPintu();
		pajero.gasPol();

		System.out.println();

		Motor astrea = new Motor("Astrea", 2, 5000000);
//		astrea.getInfo();
		astrea.standarGanda();
		astrea.gasPol();
	}

}
