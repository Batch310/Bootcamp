package day9.pagi;

class Animal {
	String name;
	int speed;
	String sound;

	public void run() {
		System.out.println(name + " is running at " + speed + "kmph");
	}

	public void makeSound() {
		System.out.println(name + " is making " + sound + " sound");
	}

	public String jump() {
		return name + " lompat";
	}

	public int hitungVolumeBalok(int panjang, int lebar, int tinggi) {
		int volume = panjang * lebar * tinggi;
		return volume;
	}
}
