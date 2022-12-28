package day9.pagi;

class Animal {
	String name = "Default";
	int speed;
	String sound;
	
	static String jenisGerak = "merayap";

	//Konstruktor Default
	public Animal() {
	}
	
	//Konstruktor Custom 1
	public Animal(String name) {
		this.name = name;
	}
	
	//Konstruktor Custom 2
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

	// Fungsi tanpa return & tanpa parameter
	public void run() {
		System.out.println(name + " Berlari sekencang " + speed + " km/jam");
	}

	// Fungsi tanpa parameter dengan return value string
	public String jump() {
		return name + " lompat";
	}

	// Fungsi dengan parameter dengan return value int
	public int hitungVolumeBalok(int panjang, int lebar, int tinggi) {
		// int[] arr = new int[2];
		int volume = panjang * lebar * tinggi;
		int luasPermukaanBalok = (panjang + lebar + tinggi) * 2;
		// arr[0] = volume;
		// arr[1] = luasPermukaanBalok;
		return volume;
	}
	
	public static void hitungPerkalian(int a, int b) {
		int c = a * b;
		System.out.println("Hasil perkalian a x b = " + c);
	}
}
