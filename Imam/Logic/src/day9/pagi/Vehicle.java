package day9.pagi;


// misal jadi bapak Class(Super Class)
class Vehicle {

	String nama;
	
	public Vehicle() {
		
	}
	
	
	public Vehicle(String nama) {
		super();
		this.nama = nama;
	}


	public void belokKiri() {
		System.out.println(nama + " belok kiri");
		
	}
	
	public void belokKanan() {
		System.out.println(nama + " belok kanan");
		
	}
	
	
}
