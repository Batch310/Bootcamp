package catatan.untuk.FT1;

import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {
Random randomGen = new Random();
		
		int a = randomGen.nextInt(10); //generate 0-9
		
		System.out.println(a);
	}

}
