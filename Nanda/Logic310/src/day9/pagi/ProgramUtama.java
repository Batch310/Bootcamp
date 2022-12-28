package day9.pagi;

public class ProgramUtama {
	public static void main(String[] args) {
		Animal kucing = new Animal();
		
		kucing.name = "Garfield";
		kucing.speed = 20;
		kucing.sound = "Meongggg";
		
		System.out.println("Nama Hewan : " + kucing.name);
		System.out.println("Kecepatan : " + kucing.speed);
		System.out.println("Suaranya . . . . . " + kucing.sound);
		
		//memanggil fungsi void
		kucing.run();
		
		//memanggil fungsi, lalu simpan ke var lompat
		String lompat = kucing.jump();
		System.out.println(lompat);
		
		//memanggil fungsi hitung volume
		int volume1 = kucing.hitungVolumeBalok(10, 2, 5);
		System.out.println("Volumenya = " + volume1);
		
		volume1 = kucing.hitungVolumeBalok(5, 4, 20);
		System.out.println("Volumenya = " + volume1);
		
		//buat object melalui konstruktor custom
		Animal tupai = new Animal("Sandy");
		tupai.getInfo();
		
		Animal bintangLaut = new Animal("Petrik", 20, "Hai Spongebob");
		bintangLaut.getInfo();
		
		//Panggil atribut static
		System.out.println();
		System.out.println(Animal.jenisGerak);
		
		Animal.jenisGerak = "terbang";
		System.out.println(Animal.jenisGerak);
		
		System.out.println(bintangLaut.jenisGerak);
		System.out.println(tupai.jenisGerak);
		
		tupai.jenisGerak = "melompat";
		
		System.out.println(tupai.jenisGerak);
		System.out.println(bintangLaut.jenisGerak);
		
		//panggil fungsi static
		System.out.println();
		Animal.hitungPerkalian(3, 6);
		tupai.hitungPerkalian(5, 5);
	}
}
