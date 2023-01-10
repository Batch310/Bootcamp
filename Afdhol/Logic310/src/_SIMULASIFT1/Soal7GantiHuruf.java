package _SIMULASIFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal7GantiHuruf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// urutkan huruf /karakter dari gabungan bbrp kata sesuai abjad
		// batasan
		// -urut dan pisahkan huruf/karakter dengan tanda |
		// kelompokkan huruf sama
		// diproses sebagai huruf kecil
		// input : sample case
		// output aa|c|ee|l|m|p|ss

		Scanner scan = new Scanner(System.in);

		System.out.println("Kalimat: ");
		String n = scan.nextLine();


		String kumpulanKarakter = "abcdefghijklmnopqrstuvwxyz";//variabel bantu untuk kumpulan karakter abjad
		
		String[] arrN = n.toLowerCase().split("");//lakukan spit per karakter
		
		Arrays.sort(arrN);//lakukan sorting 
		
		String hasil =""; //untuk menampung hasil
		
		String hurufSebelumnya = "";//variabel bantu untuk menyimpan huruf sebelumnya agar bisa dibandingkan
		
		for (int i = 0; i < arrN.length; i++) {
			String hurufSekarang = arrN[i]; //menampung array ke variabel hurufSekarang
			if (kumpulanKarakter.contains(hurufSekarang)) {//apakah kumpulanKarakter mengandung hurufSekarang
				if (!hurufSekarang.equals(hurufSebelumnya)) {// jika hurufSekarang tidak sama dengan hurufSebelum
					if (!hurufSebelumnya.equals("")) {
						hasil = hasil + "|";
					}
				}
				hasil = hasil+hurufSekarang;//mengisi variabel hasil dengan hurufSekarang dimana hurufSekarang adalah arrN[i]
				hurufSebelumnya = hurufSekarang; //mengisi variabel hurufSebelumnya 
			}
		}
		System.out.println(hasil);
	}
}
