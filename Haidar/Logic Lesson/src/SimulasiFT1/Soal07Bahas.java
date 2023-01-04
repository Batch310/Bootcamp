package SimulasiFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal07Bahas {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Input n : ");
		String n = masukan.nextLine();
		
		//Variabel bantu kumpulan karakter
		String kumpulanKarakter = "abcdefghijklmnopqrstuvwxyz";
		
		//split string
		String[] arrN = n.toLowerCase().split("");
		
		//Sorting array
		Arrays.sort(arrN);
		
		//Variabel bantu hasil
		String hasil = "";
		
		//Variabel bantu, menyimpan huruf sebelumnya
		String hurufSebelumnya = "";
		
		for (int i = 0; i < arrN.length; i++) {
			String hurufSekarang = arrN[i];
			if (kumpulanKarakter.contains(hurufSekarang)) {
				if (!(hurufSekarang.equals(hurufSebelumnya))) {
					if (!(hurufSebelumnya.equals(""))) {
						hasil = hasil + " | ";
					}
				}
				hasil = hasil + hurufSekarang;
				hurufSebelumnya = hurufSekarang;
			}
		}
		System.out.println(hasil);
		masukan.close();
		
	}
}
