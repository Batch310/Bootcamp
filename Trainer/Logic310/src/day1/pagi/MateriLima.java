package day1.pagi;

import java.util.Random;

public class MateriLima {
	public static void main(String[] args) {
		
		//Cara 1
//		Random randomGen = new Random();
//		
//		int a = randomGen.nextInt(10); //generate 0-9
//		
//		System.out.println(a);
		
		
		//Cara 2
		int angkaRandom = (int) (Math.random() * 9);
		
		System.out.println(angkaRandom);
	}
}
