package filteringtest1;

import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("String :");
		String data1 = input.nextLine().toUpperCase();
		System.out.print("Array :");
		String data2 = input.nextLine();

		String[] arrData1 = data1.split("");
		String[] arrData2 = data2.split(",");

		String alfabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] arrAlfabet = alfabet.split("");

		for (int i = 0; i < arrData1.length; i++) {
			String hurufBaru = arrData1[i];
			String indexBaru = arrData2[i];

			int indexBaruInt = Integer.parseInt(indexBaru);
			String allfabetBaru = arrAlfabet[indexBaruInt];
			if (arrData1[i].equals(allfabetBaru)) {
				System.out.print("true ");
			} else {
				System.out.print("false ");
			}
		}
	}

}
