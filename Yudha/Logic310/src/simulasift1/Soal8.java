package simulasift1;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input Panjang Deret : ");
		int n = input.nextInt();
		int x = 0;
		int y=0;
		String aArray = "", bArray="", aPlushb="";
		for (int i = 0; i < n; i++) {
			x = x+3;
			aArray = aArray + (x-1) + " ";
		}
		
		System.out.println(aArray);
		
		for (int i = 0; i < n; i++) {
			y = y+4;
			bArray = bArray + (y/2) +" ";
		}
		
		System.out.println(bArray);
		
		String[] arrayA = aArray.split(" ");
		String[] arrayB = bArray.split(" ");
		for (int i = 0; i < n; i++) {
			int jumlah = Integer.parseInt(arrayA[i])+Integer.parseInt(arrayB[i]);
			aPlushb += jumlah+" ";
			
		}
		System.out.println(aPlushb);
	}

}
