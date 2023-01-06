package coba.coba;

import java.util.Arrays;

public class CobaSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n = "qwertyuiop asdfghjkl";
		
		String[] arrPisah = n.split("");
		String hasilPisah="";
		Arrays.sort(arrPisah);
		
		for (int i = 0; i < arrPisah.length; i++) {
			hasilPisah = arrPisah[i];
			System.out.print(arrPisah[i]);	
		}
	}

}
