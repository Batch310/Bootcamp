package simulasiFT1;

import java.util.Scanner;

public class Soal10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input string: ");
		String data1 = input.next().toUpperCase();
		System.out.print("input array : ");
		String data2 = input.next();

		String[] arr1 = data1.split("");
		String[] arr2 = data2.split(",");

		String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//String angka = "0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25";
		String[] arrAlfabet = alfabet.split("");
		//String[] arrAngka = angka.split(",");

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				String hurufBaru = arr1[i];
				String indexBaru = arr2[i];
				int indexBaruInt = Integer.parseInt(indexBaru);
				String alfabetBaru = arrAlfabet[indexBaruInt];
				if(arr1[i].equals(alfabetBaru)) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
				
			}
		}
	}
}
