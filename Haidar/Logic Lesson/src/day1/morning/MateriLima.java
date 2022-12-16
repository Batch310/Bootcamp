package day1.morning;

import java.util.Random;

public class MateriLima {

	public static void main(String[] args) {
		
		//Cara 1
		Random randomGen = new Random();
		
		int a = randomGen.nextInt(10);
		System.out.println(a);
		
		//Cara 2 - 1. Kenapa di casting (diubah tipe datanya) ke int? Karena tipe data Math bawaannya double; 2. Kenapa di kali 9? Karena bawannya mengacak nilai antara 0 sampai 1; 3. 
		int angkaRandom = (int) (Math.random()*9);
		System.out.println(angkaRandom);
	}

}
