package pembahasan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal07 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input n : ");
		String n = scanner.nextLine(); // CBAA
		
		//variabel bantu kumpulan karakter
		String kumpulanKarakter = "abcdefghijklmnopqrstuvwxyz";
		
		//split string 
		String[] arrN = n.toLowerCase().split(""); // [c,b,a,a]
		
		//sorting array 
		Arrays.sort(arrN); // [a,a,b,c]
		
		//Variabel bantu hasilnya
		String hasil = "";
		
		//Variabel bantu, menyimpan huruf sebelumnya
		String hurufSebelumnya = "";
		
		for (int i = 0; i < arrN.length; i++) {
			String hurufSekarang = arrN[i];
			if(kumpulanKarakter.contains(hurufSekarang)) {
				if(!hurufSekarang.equals(hurufSebelumnya)) {
					if(!hurufSebelumnya.equals("")) {
						hasil = hasil + " | ";
					}
					
				}
				hasil = hasil + hurufSekarang;
				hurufSebelumnya = hurufSekarang;
			}
			
		}
		
		System.out.println(hasil);
		
		
		
		
		
		
		
		
		
		
		
	}
}
