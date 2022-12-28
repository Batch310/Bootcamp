package day9.pagi;

public class RunAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal kocheng = new Animal();
		kocheng.name = "Kocheng Oren";
		kocheng.speed = 20;
		kocheng.sound = "Meong";

		System.out.println("Nama hewan : " + kocheng.name);
		System.out.println("Kecepatan : " + kocheng.speed);
		System.out.println("Suaranya : " + kocheng.sound);
		System.out.println();

		kocheng.run();
		System.out.println();

		String lompat = kocheng.jump();
		System.out.println(lompat);
		System.out.println();

		int volume = kocheng.hitungVolumeBalok(10, 2, 5);
		System.out.println("Volumenya : " + volume);

		volume = kocheng.hitungVolumeBalok(5, 4, 20);
		System.out.println("Volumenya : " + volume);
		System.out.println();

		// Make a new object using a constructor
		Animal tupai = new Animal("Sandy");
		tupai.getInfo();
		System.out.println();
		Animal bintangLaut = new Animal("Petrik", 20, "Hai Spongebob");
		bintangLaut.getInfo();
		System.out.println();

		System.out.println(Animal.typeOfMove);
		System.out.println(tupai.typeOfMove);
		
		Animal.hitungPerkalian(3, 6);
		tupai.hitungPerkalian(5, 5);
	}

}
