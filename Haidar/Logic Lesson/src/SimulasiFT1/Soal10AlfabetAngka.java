package SimulasiFT1;

import java.util.Scanner;

public class Soal10AlfabetAngka {
	public static void main(String[] args) {
		//Alfabet A-Z
		//Bobot alfabet 0-25
		//Misal A=0, B=1, dst
		//Batasan : 
		//1. String hanya mengandung huruf besar
		//Input String : mengandung kata/kalimat
		//Input array n : mengandung array angka yang harus dicocokkan terhadap String harus sepanjang n
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan input String : ");
		String[] arrString = masukan.next().toUpperCase().split("");
		
		System.out.print("Masukkan input Array : ");
		String[] arrInput = masukan.next().split(",");
		int found = 0;
		int newFound = 0;
		
		String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] arrAlfabet = alfabet.split("");

		for (int i = 0; i < arrInput.length; i++) {
			for (int j = 0; j < arrAlfabet.length; j++) {
				String jStr = Integer.toString(j);
				if ((arrString[i].equals(arrAlfabet[j])) && (arrInput[i].equals(jStr))) {
					newFound++;
					break;
				}
			}
			if (found == newFound) {
				System.out.println("false");
			} else {
				System.out.println("true");
				found = newFound;
			}
		}
		masukan.close();
		
	}
}
