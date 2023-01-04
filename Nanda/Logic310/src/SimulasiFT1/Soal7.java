package SimulasiFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Kalimat = ");
		String kalimat = input.nextLine();
		
		//variabel bantu kumpulan karakter
		String  kumpulanKarakter = "abcdefghijklmnopqrstuvwxyz";
		
		//lowercase dan split string
		String[] arrN = kalimat.toLowerCase().split("");
		
		//sorting array
		Arrays.sort(arrN);
		
		//variabel bantu hasilnya
		String hasil = "";
		
		//variabel bantu, menyimpan huruf sebelumnya
		String hurufSebelumnya = "";
		
		for (int i = 0; i < arrN.length; i++) {
			String hurufSekarang = arrN[i];
			if(kumpulanKarakter.contains(hurufSekarang)) {
				if(!hurufSekarang.equals(hurufSebelumnya)) {
					if(!hurufSebelumnya.equals("")) {
						hasil = hasil + " | ";
					}
				}
				hasil = hasil + arrN[i];
				hurufSebelumnya = hurufSekarang;
			}
		}
		System.out.println(hasil);
			}


	}