package day9.pagi;

class Animal {

	//class Animal dengana atribut name, speed, sound 
	
	String name;
	int speed;
	String sound;
	
	//STATIC ATTRIBUT
	//static menempel di Class, jadi milik bersama//
	//langsung dipanggil tanpa membuat objek baru
	static String jenisGerak = "merayap";
	
	//KONSTRUKTOR
	//dibedakan tipe datanya
	//Konstruktor default
	public Animal() {
		
	}
	
	//Membuat Konstruktor custom
	public Animal(String name) {
		this.name = name; //memakai this karena name sama dengan attribut, agar menuju yang dimaksud 
	}
	
	//dpat menggunakan shortcut dengan Klik Kanan-> Source -> generate constructor using fields
	
	
	
	public void getInfo() {
		System.out.println("Nama "+name);
		System.out.println("Speed "+speed);
		System.out.println("Sound "+sound);
	}
	
	public Animal(String name, int speed, String sound) {
		super();
		this.name = name;
		this.speed = speed;
		this.sound = sound;
	}

	//Method 
	//vpid sebenarnya adlaah kembalian 
	public void run() {
		System.out.println(name+"Berlari sekencang "+speed+" km/h");
	}
	
	
	//setiap moethod selalu membutuhkan return value
	public String jump() {
		return name+"lompat";
	}
	
	//membuat Method static
	public static void hitungPerkalian(int a, int b) {
		int c = a*b;
		System.out.println("Hasil perkalian axb: "+c);
	}
	//Method dengan parameter
	//tulis return=0 terlebih dahulu agar tidak merah, baru diisi 
	//Method usahakan mewakili satu fungsi saja, misal menghitung volume balok saja
	public int hitungVolumeBalok(int panjang, int lebar, int tinggi) {
		
		int volume = panjang * lebar * tinggi;
		int luasPermukaan = (panjang+lebar+tinggi)*2; // karena tidak direturn maka tidak diapa-apain
		
		return volume; //kembalikan nilai yang diinginkan saja, tidak boleh lebih dari satu
		
	
	} 
	
}
