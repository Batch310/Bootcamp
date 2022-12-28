package day9.pagi;

class Animal {

	String name = "Default";
	int speed;
	String sound;

	// atribut static =>tipe data untuk semua di class(milik class, untuk semua
	// object)
	static String jenisGerak = "merayap";

	// Konstruktor utk akses atribut
	// Konstruktor default
	public Animal() {

	}

	// Konstruktor Custom 1
	public Animal(String name) {
		this.name = name; // this. => utk akses atribut
	}

	// Kontruktor custom 2
	public Animal(String name, int speed, String sound) {
		super();
		this.name = name;
		this.speed = speed;
		this.sound = sound;
	}

	// void => tidak ada return value
	public void run() {
		System.out.println(name + " Berlari sekencang " + speed + " km/jam");
	}

	// tipe data bebas sbg return value
	public String jump() {
		return name + "lompat";
	}

	public void getInfo() {
		System.out.println("namanya : " + name + " kecepatanya " + speed + " suaranya " + sound);
	}

	// fungsi/methot dengan parameter(lebih dari 1 parameter)
	// return hanya 1 proses
	public int hitungVolume(int panjang, int lebar, int tinggi) {
		int volume = panjang * lebar * tinggi;
		return volume;
	}

	public static void hitungPerkalian(int a, int b) {
		int c = a * b;
		System.out.println("Hasil perkalian a x b ="+c);
	}

}
