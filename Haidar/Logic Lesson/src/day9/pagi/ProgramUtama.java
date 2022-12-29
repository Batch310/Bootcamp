package day9.pagi;

public class ProgramUtama {
	public static void main(String[] args) {
		
		Animal kocheng = new Animal(); //Object

		System.out.println("Nama Hewan: " + kocheng.name);
		System.out.println("Kecepatan: " + kocheng.speed + " m/s");
		System.out.println("Suaranyaaaa.... " + kocheng.sound);
		System.out.println();
		
		kocheng.name = "Kocheng Oren";
		kocheng.speed = 20;
		kocheng.sound = "Meong";
		
		System.out.println("Nama Hewan: " + kocheng.name);
		System.out.println("Kecepatan: " + kocheng.speed + " m/s");
		System.out.println("Suaranyaaaa.... " + kocheng.sound);
		System.out.println();
		
		
		//Memanggil method atau fungsi void
		kocheng.run();
		
		//Memanggil method atau fungsi, lalu simpan ke variabel lompat dengan tipe data
		//sesuai return value dari method atau fungsi yaitu String
		String lompat = kocheng.jump();
		System.out.println(lompat);
		
		//Memanggil method atau fungsi hitung volume,
		int hewanPintar = kocheng.hitungVolumeBalok(6, 8, 10);
		System.out.println("Si " + kocheng.name + " menghitung balok dan mendapatkan volume sebesar " + hewanPintar);
		hewanPintar = kocheng.hitungVolumeBalok(5, 12, 13);
		System.out.println("Si " + kocheng.name + " menghitung balok lagi dan sekarang mendapatkan volume sebesar " + hewanPintar);
		System.out.println();
		
		//Buat Object melalui konstruktor Custom
		Animal tupai = new Animal("Sandy");
		tupai.getInfo();
		System.out.println();
		
		Animal bintangLaut = new Animal("Patrick", 20, "Hai Spongebob");
		bintangLaut.name = "Petrik";
		bintangLaut.getInfo();
		System.out.println();
		
		System.out.println(Animal.jenisGerak);
		
		Animal.jenisGerak = "terbang";
		System.out.println(Animal.jenisGerak);
		
		System.out.println(bintangLaut.jenisGerak);
		System.out.println(tupai.jenisGerak);
		
		tupai.jenisGerak = "melompat";
		System.out.println(bintangLaut.jenisGerak);
		System.out.println();
		
		//Panggil method atau fungsi static
		Animal.hitungPerkalian(3, 6);
		tupai.hitungPerkalian(5, 5);
		
	}
}
