package day9.pagi;

public class Vehicle {
	String nama;
	
	
	 public Vehicle() { //buat konstruktor kosong apabila diextends di class lain
		 				//gunakan saat membuat kontruktor custom
	}
	
	public Vehicle(String nama) {
		
		this.nama = nama;
	}

	public void belokKiri() {
		System.out.println(nama + " belok kiri");
	}
	
	public void belokKanan() {
		System.out.println(nama+" belok kanan");
	}

}
