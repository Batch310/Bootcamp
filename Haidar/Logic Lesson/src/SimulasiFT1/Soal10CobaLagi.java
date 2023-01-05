package SimulasiFT1;

import java.util.Scanner;

public class Soal10CobaLagi {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan input string : "); //Cth Input string = ABCZ
		String[] inputString = masukan.nextLine().toUpperCase().split(""); //Input string di Upper, kemudian lgsg di split per Kata
		
		System.out.print("Masukkan input array : "); //Cth input array = 0,2,2,25
		String[] arrIndex = masukan.nextLine().split(","); //Input array lgsg di split per tanda koma (,)
		
		//Variabel bantu huruf urut sesuai index 
		String abjad = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //Dengan catatan, urutan abjad di variabel ini harus urut agar sesuai index
		//Array berisi huruf A - Z sesuai index dari 0 - 25
		String[] arrAbjad = abjad.split("");
		
		for (int i = 0; i < arrIndex.length; i++) { //Kondisi => i < arrIndex.length(6); 1. i = 0, 2. i = 1
			//Mengubah input array dari tipe data String ke int
			int arrIndexInt = Integer.parseInt(arrIndex[i]); //1. arrIndex[0] = "0" -> 0, arrIndex[1] = "2" -> 2
			
			//abjad.contains(inputString[i]) && taroh pada kondisi if jika input ada selain huruf alfabet dan tidak dibutuhkan (diabaikan)
			//Kondisi jika array pada input String index ke-i sama dengan arrAbjad index ke-arrIndex (input array), dan saat ini merupakan perulangan terakhir
			if (inputString[i].equals(arrAbjad[arrIndexInt]) && i == arrIndex.length-1) { //1. inputString[0](A) = arrAbjad[0](A) benar && i = 0 salah
				System.out.print("true");												  //2. inputString[1](B) = arrAbjad[2](C) salah && i = 0 salah
				//Kondisi jika array pada input String index ke-i TIDAK sama dengan arrAbjad index ke-arrIndex (input array), dan saat ini merupakan perulangan terakhir 
			} else if ((!inputString[i].equals(arrAbjad[arrIndexInt])) && i == arrIndex.length-1) { //1. Hanya kondisi pertama yang benar
				System.out.println("false");														//2. Kondisi ke-3 salah
				//Kondisi jika array pada input String index ke-i sama dengan arrAbjad index ke-arrIndex (input array) 
			} else if (inputString[i].equals(arrAbjad[arrIndexInt])) { //1. inputString[0](A) = arrAbjad[0](A) benar
				System.out.print("true, ");							   //2. Kondisi ke-2 salah
			} else { //2. i = 1 masuk ke sini
				System.out.print("false, ");
			} //Output => true, false, true, true
		}
		masukan.close();
	}
}
