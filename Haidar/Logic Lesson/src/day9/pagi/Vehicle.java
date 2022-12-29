package day9.pagi;

public class Vehicle { //Induk (Parent) 
	//Induk tidak bisa mengakses atribut dan method anak
	String nama;
	
	public Vehicle() {
	}
	
	public Vehicle(String nama) {
//		super(); //Tidak perlu karena Vehicle merupakan Parent atau SuperClass
		this.nama = nama;
	}

	public void belokKiri() {
		System.out.println(nama + " belok kiri");
	}
	
	public void belokKanan() {
		System.out.println(nama + " belok kanan");
	}
}
