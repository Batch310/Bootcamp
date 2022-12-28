package day9.pagi;

public class ProgramUtama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal kocheng = new Animal(); // memanggil class Animal dengan nama objek baru yaitu kocheng

		// mengisi dengan nilai
		kocheng.name = "Kocheng Oren";
		kocheng.speed = 20;
		kocheng.sound = "Meong";

		// menampilkan
		System.out.println("Nama Hewan : " + kocheng.name);
		System.out.println("Kecepatan: " + kocheng.speed + "m/s");
		System.out.println("Suara : " + kocheng.sound);

		kocheng.run(); // memanggil fungsi run dari Class Animal tanpa return

		// memanggil fungsi lalu simpan ke variabel lompat

		String lompat = kocheng.jump(); // harus tampung terlebih dahulu pada String karena pada fungsi jump()
										// tidak terdapat perintah untuk menampilkan
		System.out.println(lompat);

		// panggil fungsi dengan parameter fungsi hitung volume

		int volume1 = kocheng.hitungVolumeBalok(10, 2, 5); // tampung dulu ke tipe data yaitu int karena pada fungsi
															// hitungVolumeBalok
															// tidak terdpaat perintah menampilkan
		System.out.println("Volumenya: " + volume1);

		volume1 = kocheng.hitungVolumeBalok(10, 10, 10); // method dapat dipanggil kembali seperti dapat didaur ulang

		System.out.println("volume kedua: " + volume1);

		
		System.out.println();
		System.out.println("Panggil konstruktor Custom");
		System.out.println();
		
		//buat Objek melalui konstructor kustom
		Animal tupai = new Animal("Sandy");// isi parameter sesuai konstruktor yang telah dibuat
		tupai.getInfo();
		
		Animal wedus = new Animal("Jeki", 20, "Mbeek");
		wedus.getInfo();
		
		System.out.println();
		System.out.println("Memanggil atribut static");
		System.out.println();
		
		System.out.println(Animal.jenisGerak); // merayap
		
		Animal.jenisGerak = "terbang"; // mengubah static dari merayap menjadi terbang
		System.out.println(Animal.jenisGerak);// terbang
		
		//maka setelah diubahakan menjadi sama yaitu terbang
		System.out.println(wedus.jenisGerak);
		System.out.println(tupai.jenisGerak);
		
		tupai.jenisGerak = "melompat";
		
		System.out.println();
		System.out.println("memanggil method static");
		System.out.println();
		
		Animal.hitungPerkalian(2, 5); // memanggil melalui class
		tupai.hitungPerkalian(2, 5); // memanggil melalui objek
	}

}
