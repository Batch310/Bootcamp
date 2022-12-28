package oop.latihanabstraksi;

 public class Motor extends Kendaraan implements Navigasi {

	public Motor() {

	}

	public Motor(String modelParam, int jumlahRodaParam, long hargaParam) {
		super(modelParam, jumlahRodaParam, hargaParam);
	}

	public void standarGanda() {
		System.out.println("Motor Sudah berstandar Ganda");
	}

//	abstract public void gasPol();

	@Override
	public void maju() {
		// TODO Auto-generated method stub
		System.out.println("Maju dengan menggunakan Mobil/Motor");

	}

	@Override
	public void belokKiri() {
		// TODO Auto-generated method stub
		System.out.println("Belok Kiri dengan menggunakan Mobil/Motor");

	}

	@Override
	public void belokKanan() {
		// TODO Auto-generated method stub
		System.out.println("Belok Kanan dengan menggunakan Mobil/Motor");

	}
}
