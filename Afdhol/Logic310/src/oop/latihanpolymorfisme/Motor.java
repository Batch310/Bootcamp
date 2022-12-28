package oop.latihanpolymorfisme;

public class Motor extends Kendaraan {

	public Motor() {
		// TODO Auto-generated constructor stub
	}
	
	public void standarGanda() {
		System.out.println("Motor sudah standar ganda");
	}
	
	public void gasPol() {
	//	super.gaspol();//apabila ingin memanggil gaspol() dari kelas parent
		System.out.println("Gas Pol pake motor!!!"); 
	}
}
