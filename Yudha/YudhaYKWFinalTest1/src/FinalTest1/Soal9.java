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
		String a = "";
		
		for (int i = 0; i < buahArray.length; i++) {
			if(vokal.contains(buahArray[i])) {
				a=a+buahArray[i];
				if(a.contains(buahArray[i])) {
					
				}else {
					harga+=10;
				}
				
			}
			
		}
		
		
		System.out.println(a);
		System.out.println(buah + " seharga " + harga + " ribu per kg");	
	}

}
