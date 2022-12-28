package day9.pagi;

class Animal {
	String name;
	int speed;
	String sound;

	static String jenisGerak = "merayap";

	// konstruktor default
	public Animal() {

	}

	// konstruktor custom 1
	public Animal(String name) {
		this.name = name;
	}

	// konstruktor custom 2
	public Animal(String name, int speed, String sound) {
		super();
		this.name = name;
		this.speed = speed;
		this.sound = sound;
	}

	public void getInfo() {
		System.out.println("Nama " + name);
		System.out.println("Speed " + speed);
		System.out.println("Sound " + sound);
	}

	// fungsi tanpa return dan tanpa parameter
	public void run() {
		System.out.println(name + " Berlari sekencang " + speed + " km/jam");
	}

	// fungsi tanpa parameter dengan return value string
	public String jump() {
		return name + " lompat";
	}

	// fungsi dengan parameter dan return value int
	public int hitungVolumeBalok(int panjang, int lebar, int tinggi) {
		int volume = panjang * lebar * tinggi;
		return volume;
	}
	
	public static void hitungPerkalian(int a, int b) {
		int c = a * b;
		System.out.println("Hasil perkalian a x b = " + c);
	}
}
