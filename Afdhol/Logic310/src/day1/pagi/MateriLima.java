package day1.pagi;

import java.util.Random;

public class MateriLima {

	public static void main(String[] args) {

		
		//Random 1
		Random randomGen = new Random();
		
		int a = randomGen.nextInt(10); //membuat batasan generate 0-9
		
		System.out.println(a);
		
		
		//Random 2;
		
		int angkaRandom = (int) (Math.random()*9);
		System.out.println(angkaRandom);
	}

}
