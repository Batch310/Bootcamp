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

		String lompat = kocheng.jump();
		System.out.println(lompat);

		int volume = kocheng.hitungVolumeBalok(10, 2, 5);
		System.out.println("Volumenya : " + volume);
		
		volume = kocheng.hitungVolumeBalok(5, 4, 20);
		System.out.println("Volumenya : " + volume);
	}

}
