package day9.pagi;

public class Animal {
	String name;
	int speed;
	String sound;
	
	// Atribut Statis
	static String jenisGerak = "";

	// Konstruktor Default
	public Animal() {

	}

	// Konstruktor Custom 1
	public Animal(String name) {
		this.name = name;
	}

	// Konstruktor Custom 2
	public Animal(String name, int speed, String sound) {
		super();
		this.name = name;
		this.speed = speed;
		this.sound = sound;
	}

	// Fungsi tanpa return
	public void run() {
		System.out.println(name + " Berlari sekencang " + speed + " km/h");
	}

	public void getInfo() {
		System.out.println("Nama : " + name);
		System.out.println("Kecepatan : " + speed);
		System.out.println("Suara : " + sound);
	}

	// Fungsi tanpa parameter dengan return value string
	public String jump() {
		return name + " lompat";
	}

	// Fungi dengan parameter dan return value integer
	public int hitungVolumeBalok(int panjang, int lebar, int tinggi) {
		int volume = panjang * lebar * tinggi;
		return volume;
	}
	
	// Method Static
	public static void hitungPerkalian(int a, int b) {
		int c = a * b;
		System.out.println("Hasil Perkalian a x b = " + c);
	}
}
