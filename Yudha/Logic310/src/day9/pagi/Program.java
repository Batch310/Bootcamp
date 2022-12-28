package day9.pagi;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal kucing = new Animal();
		
		System.out.println("Nama Hewan : " + kucing.name);
		System.out.println("Kecepatan  : " + kucing.speed);
		System.out.println("Suara      : " + kucing.sound);
		
		kucing.name = "Manis";
		kucing.speed = 20;
		kucing.sound = "Nggggeeekkk...";
				
		System.out.println("Nama Hewan : " + kucing.name);
		System.out.println("Kecepatan  : " + kucing.speed);
		System.out.println("Suara      : " + kucing.sound);
		
		kucing.run();
		System.out.println(kucing.jump());
		String lompat = kucing.jump();
		System.out.println(lompat);
		
		int vol1 = kucing.hitungVolumeBalok(10, 2, 5);
		System.out.println(vol1);
		vol1 = kucing.hitungVolumeBalok(5, 4, 20);
		System.out.println(vol1);
		
		System.out.println();
		
		// Membuat Object melalui Konstraktor
		Animal tupai = new Animal("Sendy");
		tupai.getInfo();
		System.out.println();
		Animal bintangLaut = new Animal("Patrick",1,"Hai Spongebob");
		bintangLaut.getInfo();
		
		//panggil atribut static
		System.out.println();
		System.out.println(Animal.jenisGerak);
		
		Animal.jenisGerak = "terbang";
		System.out.println(Animal.jenisGerak);
		
		System.out.println(bintangLaut.jenisGerak);
		System.out.println(tupai.jenisGerak);
		
		tupai.jenisGerak = "melompat";
		
		System.out.println(tupai.jenisGerak);
		System.out.println(bintangLaut.jenisGerak);
		
		// panggil fungsi static
		System.out.println();
		Animal.hitungPerklaian(3, 6);
		tupai.hitungPerklaian(5, 5);
	}

}
