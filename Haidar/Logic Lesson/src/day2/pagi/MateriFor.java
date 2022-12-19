package day2.pagi;

import java.util.Iterator;

public class MateriFor {

	public static void main(String[] args) {
		//Perulangan cetak nama kita sebanyak 5 kali
		int i = 0; //Variabel bantu untuk i melakukan perulangan
				
		//Perulangan while
		while (i < 5) { //Kondisi jika nilai variabel bantu i kurang dari 5
			System.out.println("Haidar"); //Cetak nama
			i++; //i = i + 1, nilai i akan ditambah 1 setiap perulangan
		}
		
		System.out.println(); //Cetak Enter atau baris baru
		
		//Perulangan for, mirip while
		int j = 0; //Deklarasi variabel bantu
		for(;j < 5;) { //Kondisi jika nilai variabel bantu j kurang dari 5
			System.out.println("Amir"); //Cetak nama
			j++; //nilai variabel bantu j ditambah 1 setiap perulangan
		}
		
		System.out.println(); //Cetak Enter atau baris baru
		
		//Perulangan for, rill no fek
		for (int k = 0; k < 5; k++) { //Deklarasi variabel bantu k, kemudian kondisi jika nilai variabel bantu k kurang dari 5, nilai variabel bantu k ditambah 1 setiap perulangan
			System.out.println("Faruqi"); //Cetak nama
		}

	}

}
