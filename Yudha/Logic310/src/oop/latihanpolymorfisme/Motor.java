package oop.latihanpolymorfisme;

public class Motor extends Kendaraan{

//	public Motor() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	public void standarGanda() {
		System.out.println("Motor Sudah berstandar Ganda");
	}
	//overriding
	public void gasPol() {
		super.gasPol();
		System.out.println("Gas Pol Pake Motor !!!");
	}

}
