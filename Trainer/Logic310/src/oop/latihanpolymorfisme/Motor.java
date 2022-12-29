package oop.latihanpolymorfisme;

import oop.latihanabstraksi.Navigasi;

public class Motor extends Kendaraan implements Navigasi {
	public void standarGanda() {
		System.out.println("Motor Sudah berstandar Ganda");
	}
	
	public void gasPol() {
		//super.gasPol();
		System.out.println("Gas Pol Pake Motor");
	}

	@Override
	public void maju() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void belokKiri() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void belokKanan() {
		// TODO Auto-generated method stub
		
	}
}
