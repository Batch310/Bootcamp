package day9.pagi;

public class Animal { //Class
	String name; //Attribute or Property
	int speed; // Attribute or Property
	String sound; //Attribute or Property
	
	static String jenisGerak = "merayap";
	
	
	//Default Constructor (Tidak terlihat)
	public Animal() {
		
	}
	
	//Beda konstruktor bisa sama nama konstruktornya, tetapi harus membedakan tipe data dari parameternya
	//Shortcut membuat konstruktor tanpa mengetik = 
	//Klik kanan di salah satu baris -> Source -> Generates Constructor using Fields...
	
	//Custom Constructor (Nama konstruktor bisa sama asalkan berbeda parameter
	public Animal(String name) {
		//Jika nama atribut yang ingin diisi sama dengan parameter konstruktor
		//Maka beri nama atribut dengan this.
  //atribut class = parameter konstruktor
  //        ^^    =  ^^
		this.name = name;
	}
	
	//2nd Custom Constructor 
	public Animal(String name, int speed, String sound) {
		super();
		this.name = name;
		this.speed = speed;
		this.sound = sound;
	}

	//Method
	//Method static dibuat ketika akan digunakan secara umum
	//Method biasa dibuat ketika ada sangkut pautnya dengan atribut atau objek (ingin merubah nilai atribut)
	
	public void getInfo() {
		System.out.println("Nama " + name);
		System.out.println("Speed " + speed);
		System.out.println("Sound " + sound);
	}
	
	//Method atau fungsi tanpa return & tanpa parameter
	public void run() { //Tidak mengembalikan value
		System.out.println(name + " berlari dengan kecepatan " + speed + " km/jam sambil bersuara " + sound);
	}
	
	//Method atau fungsi tanpa parameter dengan return value String
	public String jump() { //Mengembalikan value berupa tipe data String
		return name + " lompat";
	}
	
	//Method atau fungsi dengan parameter dan return value int
	public int hitungVolumeBalok(int p, int l, int t) {
		int volume = p * l * t;
		return volume;
	}
	//Method atau fungsi static semua objek bisa memanggil method ini
	public static void hitungPerkalian(int a, int b) {
		int c = a * b;
		System.out.println("Hasil perkalian " + a + " x " + b + " = " + c);
	}
		
}
