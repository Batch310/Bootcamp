package day9.pagi;

class Animal {
	String name;
	int speed;
	String sound;

	// Atribut milik bersama
	static String typeOfMove = "Merayap";

	// Default Constructor
	public Animal() {

	}

	// Custom Constructor 1
	public Animal(String name) {
		this.name = name;
	}

	// Custom Constructor 2
	public Animal(String name, int speed, String sound) {
		super();
		this.name = name;
		this.speed = speed;
		this.sound = sound;
	}

	public void getInfo() {
		System.out.println("Nama : " + name);
		System.out.println("Speed : " + speed);
		System.out.println("Sound : " + sound);
	}

	public void run() {
		System.out.println(name + " is running at " + speed + "kmph");
	}

	// Method without return and parameter
	public void makeSound() {
		System.out.println(name + " is making " + sound + " sound");
	}

	public String jump() {
		return name + " lompat";
	}

	public int hitungVolumeBalok(int panjang, int lebar, int tinggi) {
		int volume = panjang * lebar * tinggi;
		return volume;
	}

	public static void hitungPerkalian(int a, int b) {
		int c = a * b;
		System.out.println("Hasil perkalian a x b = " + c);
	}
}
