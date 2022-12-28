package day9.pagi;

class animal {

	String name = "default";
	int speed;
	String sound;

	static String jenisGerak = "merayap";

	// Konstruktor Default
	public animal() {

	}

	// Konstruktor Costum 1
	public animal(String name) {
		this.name = name;
	}

	// Konstrukstor Costum 2
	public animal(String name, int speed, String sound) {
		super();
		this.name = name;
		this.speed = speed;
		this.sound = sound;
	}

	// Konstruktor Costum
	public void getInfo() {
		System.out.println("Nama " + name);
		System.out.println("Speed " + speed);
		System.out.println("Sound " + sound);
	}

	// Fungsi tanpa return
	public void run() {
		System.out.println(name + " Berlari Sekencang " + speed + "km/jam");
	}

	// Fungsi tanpa parameter pakai return String
	public String jump() {
		return name + " lompat ";
	}

	// Fungsi pakai parameter dan pakai return int
	public int hitungVolumeBalok(int panjang, int lebar, int tinggi) {
		int volume = panjang * lebar * tinggi;

		return volume;
	}

	public static void hitungPerkalian(int a, int b) {
		int c = a * b;
		System.out.println("Hasil perkalian a x b = " + c);
	}

}
