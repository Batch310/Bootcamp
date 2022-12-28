package day9.pagi;

public class ProgramUtama {

	public static void main(String[] args) {
		Animal kucing = new Animal(); // Buat Objek baru dari nama class Animal

		// Memanggil atribut dari class Animal
		kucing.name = "Kucing Oren";
		kucing.speed = 20;
		kucing.sound = "Meongg";

		System.out.println("Nama Kucing 	: " + kucing.name);
		System.out.println("Kecepatan  	: " + kucing.speed + " km/h");
		System.out.println("Suaranya ... 	: " + kucing.sound);
		System.out.println();  

		// Memanggil fungsi run()
		kucing.run();

		// Memanggil fungsi jump() dan menyimpan di variabl lompat
		String lompat = kucing.jump();
		System.out.println(lompat);

		// Memanggil fungsi hitungVolumeBalok()
		int hitungVolume = kucing.hitungVolumeBalok(10, 2, 5);
		System.out.println("Volumenya : " + hitungVolume);

		hitungVolume = kucing.hitungVolumeBalok(5, 4, 20);
		System.out.println("Volumenya : " + hitungVolume);
		System.out.println();
		Animal tupai = new Animal("sandy");
		tupai.getInfo();
		System.out.println();
		Animal bintangLaut = new Animal("Patrick", 20, "Hai Spongebob");
		bintangLaut.getInfo();
		
		// Memanggil atribut static
		System.out.println();
		System.out.println(Animal.jenisGerak);
		
		Animal.jenisGerak = "Berjalan";
		System.out.println(Animal.jenisGerak);
		
		// Memanggil Fungsi Statis
		System.out.println();
		Animal.hitungPerkalian(6, 8);
		tupai.hitungPerkalian(4, 5);
	}

}
