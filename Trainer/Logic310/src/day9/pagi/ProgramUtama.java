package day9.pagi;

public class ProgramUtama {
	
	public static void main(String[] args) {		
		Animal kocheng = new Animal();
		
		System.out.println("Nama Hewan : " + kocheng.name);
		System.out.println("Kecepatan : " + kocheng.speed + " m/s");
		System.out.println("Suaranyaaaa.... " + kocheng.sound);
		System.out.println();
		
		kocheng.name = "Kocheng Oren";
		kocheng.speed = 20;
		kocheng.sound = "Meong";
		
		System.out.println("Nama Hewan : " + kocheng.name);
		System.out.println("Kecepatan : " + kocheng.speed + " m/s");
		System.out.println("Suaranyaaaa.... " + kocheng.sound);
		System.out.println();
		
		//Memanggil fungsi void
		kocheng.run();
		
		//memanggil fungsi, lalu simpan ke var lompat
		String lompat = kocheng.jump();
		System.out.println(lompat);
		
		//Memanggil fungsi hitung volume
		int volume1 = kocheng.hitungVolumeBalok(10, 2, 5);
		System.out.println("Volumenya " + volume1);
		
		volume1 = kocheng.hitungVolumeBalok(5, 4, 20);
		System.out.println("Volumenya " + volume1);
		
		
		//Buat Object melalui konstruktor Custom
		Animal tupai = new Animal("Sandy");
		tupai.getInfo();
		
		Animal bintangLaut = new Animal("Petrik",20,"Hai Spongbob");
		bintangLaut.getInfo();
		
		//Panggil si atribut static
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
