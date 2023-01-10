package SimulasiFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal07CobaLagi {
	public static void main(String[] args) {
	
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan input : ");
		String[] arrKata = masukan.nextLine().toLowerCase().split(""); //sample case
		
		Arrays.sort(arrKata); // aaceelmpss
		
		String abjad = "abcdefghijklmnopqrstuvwxyz";
		
		String hasil = ""; //"aa | c
		String hurufSekarang = ""; //" ", "a", "a", "c", dst
		String hurufSebelumnya = ""; //"", "a", "a", dst
		
		for (int i = 0; i < arrKata.length; i++) { //i = 0, i = 1, i = 2, i = 3, dst
			hurufSekarang = arrKata[i]; 
			if (abjad.contains(hurufSekarang)) { //false, true, true, true, dst
				if (!(hurufSekarang.equals(hurufSebelumnya)) && !(hurufSebelumnya.equals(""))) { //false, false, false, true, dst
					hasil += " | "; //aa |, dst
				}
				hasil += arrKata[i]; //-, aa | c, dst
				hurufSebelumnya = hurufSekarang;
			}
		}
		System.out.println(hasil);
		masukan.close();
		
	}
}
