package day2.pagi;

public class MateriWhile {

	public static void main(String[] args) {
		//Perulangan cetak nama kita sebanyak 5 kali
		int i = 0; //Variabel bantu untuk melakukan perulangan
		
		//Perulangan while
		while (i < 5) { //Kondisi jika nilai variabel i kurang dari 5
			System.out.println("Haidar"); //Cetak nama
			i++; //i = i + 1, nilai i akan ditambah 1 setiap perulangan
		}
		
		//Perulangan do-while
		do {
			System.out.println("Amir F");
			i++;
		} while (i < 10);

	}

}
