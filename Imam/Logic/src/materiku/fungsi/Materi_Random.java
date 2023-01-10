package materiku.fungsi;

import java.util.Random;

public class Materi_Random {

	public static void main(String[] args) {

		Random randomGen = new Random();
		int a = randomGen.nextInt(10); // generate 0-9 (bound/batas angka)
		System.out.println(a);

	}

}
