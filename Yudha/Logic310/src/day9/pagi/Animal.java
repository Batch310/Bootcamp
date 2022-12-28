package day9.pagi;

public class Animal {
	String name = "Default";
	int speed;
	String sound;
	
	static String jenisGerak = "merayap"; // atribut bersama : jika salah satu diubah, semuanya berubah
	
	// constractor default
	public Animal() {
		
	}
	// constructor custom
	public Animal(String name) {
		this.name = name; // this untuk menunjuk atribut pada class
	}
	
	public Animal(String name, int speed, String sound) {
		this.name = name;
		this.speed = speed;
		this.sound = sound;
	}
	
	public void getInfo() {
		System.out.println("Nama Hewan : " + name);
		System.out.println("Kecepatan  : " + speed);
		System.out.println("Suara      : " + sound);
	}
	
	
	public void run() {
		System.out.println(name + " Berlari sekencang " + speed + "km/jam");
	}
	
	public String jump() {
		return name + " lompat";
	}
	
	public int hitungVolumeBalok(int panjang, int lebar, int tinggi) {
		return (panjang*lebar*tinggi);
	}
	public static void hitungPerklaian(int a, int b) {
		int c = a*b;
		System.out.println("Hasil perkalian "+ a + " x " + b + " = "+c);
	}
}
