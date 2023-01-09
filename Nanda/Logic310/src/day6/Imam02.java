package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Imam02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan kalimat = ");     
		String kalimat = scanner.nextLine().toLowerCase();  //Buat inputan = "ImAm" => "imam"

		String[] arrKalimat = kalimat.split(""); //hasil split, cth="imam" => "i", "m", "a", "m".
		Arrays.sort(arrKalimat);//data arrKalimat(sorting)=> "a", "i", "m", "m".

//		for (String string : arrKalimat) {
//		System.out.print(string);
//		}
//		
//		System.exit(0);

		String voc = "aiueo";
		String kon = "qwrtypsdfghjklzxcvbnm";
		String hurufVoc = ""; //""
		String hurufKon = "";// ""
		for (int i = 0; i < arrKalimat.length; i++) { //i=1, arrKalimat.length = 5,
			if (voc.contains(arrKalimat[i])) { //arrKalimat(3)= "m"
				hurufVoc = hurufVoc + arrKalimat[i];
			} else if (kon.contains(arrKalimat[i])) {
				hurufKon = hurufKon + arrKalimat[i];
			}

		}

		System.out.print("Huruf vocal = " + hurufVoc); //cetak => Huruf vocal = ai
		System.out.println();//pindah baris
		System.out.print("Huruf konsonan = " + hurufKon);// cetak => Huruf konsonan = mm

//		String[] arrVocal = new String[] { "a", "e", "i", "o", "u" };

//		String[] voc= new String[];
//		String[] kon=new String[];
//		for (int i = 0; i < arrVocal.length; i++) {
//		        if(n.contains(arrVocal[i])) {
//		        	voc=arrVocal[i];
//		        }else if(n.contains(arrVocal[1])){
//		        	
//		        }
//			

	}

}
