package day9.pagi;

public class ProgramUtama {

	public static void main(String[] args) {
		animal cat = new animal();

		System.out.println("Nama Hewan : " + cat.name);
		System.out.println("Kecepatan Lari : " + cat.speed+" m/s");
		System.out.println("Suaranya .... " + cat.sound);
		System.out.println();
		
		cat.name = "Si Oren";
		cat.speed = 10;
		cat.sound= "Miawwww";
		
		System.out.println("Nama Hewan : " + cat.name);
		System.out.println("Kecepatan Lari : " + cat.speed+" m/s");
		System.out.println("Suaranya .... " + cat.sound);
		System.out.println();
		
		// Memanggil fungsi void
		cat.run();
		
		// Memanggil fugnsi, lalu simpan ke var lompat
		String lompat = cat.jump();
		System.out.println(lompat);

		// Memanggil fungsi hitung volume
		int volume1 = cat.hitungVolumeBalok(10, 2, 5);
		System.out.println("Volumenya "+ volume1);

		volume1 = cat.hitungVolumeBalok(5, 4, 20);
		System.out.println("Volumenya "+ volume1);
		System.out.println();
		
		//Buat object melalui konstruktor Costum
		animal tupai = new animal("Sendy");
		tupai.getInfo();
		
		animal bintanglaut = new animal("Petrick", 20,"Hai, Sponge");
		bintanglaut.getInfo();
		
		System.out.println();
		System.out.println(animal.jenisGerak);
		
		animal.jenisGerak = "Terbang";
		System.out.println(animal.jenisGerak);
		System.out.println(tupai.jenisGerak);
		System.out.println();
		
		animal.hitungPerkalian(5, 5);
		tupai.hitungPerkalian(4, 7);
	}

}
