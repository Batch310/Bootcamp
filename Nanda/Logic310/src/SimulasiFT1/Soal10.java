package SimulasiFT1;

import java.util.Scanner;

public class Soal10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Variabel Bantu bobot
		String bobot = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] arrBobot = bobot.split("");
		
		System.out.print("Masukkan kata/kalimat :");
		String kata = input.nextLine();
		String[] arrKata = kata.split("");
		
		System.out.print("Masukkan Array : ");
		String Arr = input.nextLine();
		String[] ArrY = Arr.split(",");
		
		for (int i = 0; i < ArrY.length; i++) {
			String hurufSekarang = arrKata[i];
			String indexSekarang = ArrY[i];
			int indexSekarangInt = Integer.parseInt(indexSekarang);
			String hurufBobotIndexSekarang = arrBobot[indexSekarangInt];
			
			if (hurufSekarang.equals(hurufBobotIndexSekarang)){
				System.out.print("true ");
			}else {
				System.out.print("false ");
			}
		}
	}

}