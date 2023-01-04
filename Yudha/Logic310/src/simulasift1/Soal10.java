package simulasift1;

import java.util.Iterator;
import java.util.Scanner;

public class Soal10 {

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
