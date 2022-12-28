package oop.latihanabstraksi;



//Sub Class
public class Motor extends Kendaraan {

	public void standarGanda() {
	   System.out.println("Motor sudah berstandar Ganda");
	}
	
	
	//overridding => fungsi induk dan anak sama, tapi isi beda
	public void gasPoll() {
	
	System.out.println("Gass poll pake motor!!!");
	}
	
	
	
}
