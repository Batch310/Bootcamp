package simulasift1;

import java.util.Iterator;
import java.util.Scanner;

public class Soal10 {
	
/*
Huruf alfabet dalam huruf besar di bawah ini mengandung bobot yang sudah ditentukan sebagai 
berikut: A = 0; B = 1; C = 2; D = 3; .... Z = 25.
Tentukan apakah dalam sebuah input string sudah memiliki bobot yang sesuai.
Batasan : - string hanya mengandung huruf besar
Input string : mengandung kata/kalimat
Input array n : mengandung array angka yang harus dicocokkan terhadap string harus sepanjang n
Contoh
Input string : ABCABC
Input array : [0, 1, 2, 1, 2, 3]

Output : true, true, true, false, false, false
Penjelasan :

A = 0 -> true
B = 1 - > true
C = 2 -> true
A = 1 -> false
B = 2 -> false
C = 3 -> false	Contoh
Input string : ABCZ
Input array : [0, 2, 2, 25]

Output : true, true, true, false, false, false
Penjelasan :

A = 0 -> true
B = 2 - > false
C = 2 -> true
Z = 25 -> true

*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input String : ");
		String[] arrayA = input.next().split("");
		System.out.print("Input Angka : ");
		String[] arrayB = input.next().split(",");
		String[] c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		String indexOfA = "",hasil="";
		
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if(arrayA[i].equals(c[j])) {
					indexOfA = indexOfA + j+",";
					break;
				}
			}
		}
		//System.out.println(indexOfA);
		String [] indexOfArray = indexOfA.split(",");
		for (int i = 0; i < arrayA.length; i++) {
			hasil = hasil + arrayB[i].equals(indexOfArray[i])+" "; 
			
		}
		System.out.println(hasil);
	}

}
