package FinalTest1;

import java.util.Scanner;

public class Soal9 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nama Buah : ");
		String buah = input.nextLine().toLowerCase();
		String[] buahArray = buah.split("");
		String vokal = "aiueo";
		int harga = 0;
		
		for (int i = 0; i < buahArray.length; i++) {
			if(vokal.contains(buahArray[i])) {
				harga+=10;
			}
		}
		
		
		System.out.println(buah + " seharga " + harga + " ribu per kg");	
	}

}
