package day9.pagi;

public class ProgramUtama {

	public static void main(String[] args) {
		Animal kucing = new Animal();

		kucing.name = "Rikaaa";
		kucing.speed = 20;

		System.out.println("Nama kucing : " + kucing.name);
		
		System.out.println();
		
		//fungsi 1(void)
		kucing.run();
		
		//memanggil fungsi, lalu simpan di var lompat
		String lompat=kucing.jump();
		System.out.println(lompat);
		
		//memanggil fungsi hitung volume
         int volume1 = kucing.hitungVolume(5, 2, 4);
         System.out.println("Volumenya : "+ volume1);
         
         volume1 = kucing.hitungVolume(7, 4, 5);
         System.out.println("Volumenya : "+volume1);
         
         System.out.println();
         
         //buat object melalui konstruktor custom 1
         Animal tupai = new Animal("Sandy");
         tupai.getInfo();
         
         //buat object melalui konstruktor custom 2
         Animal bintangLaut = new Animal("Petrix",30,"Hai spongebob");
         bintangLaut.getInfo();
         
         System.out.println();
         
         //panggil atribut static
         System.out.println(Animal.jenisGerak);
         Animal.jenisGerak="Melompat";
         System.out.println(Animal.jenisGerak);
         System.out.println();
         
         //atribut static buat semua object
         System.out.println(tupai.jenisGerak);
         
         //Panggil fungsi static(bisa dari class dan object)
         Animal.hitungPerkalian(7, 2);
         Animal.hitungPerkalian(7, 3);
         
         
         
	}

}
