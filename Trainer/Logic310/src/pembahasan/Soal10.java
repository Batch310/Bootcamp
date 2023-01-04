package pembahasan;

import java.util.Scanner;

public class Soal10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variabel bantu bobot
		String bobot = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] arrBobot = bobot.split("");
		
		System.out.print("Input string : ");
		String x = scanner.nextLine();
		String[] arrX = x.split(""); //XYZ
		
		System.out.print("Input array : ");
		String y = scanner.nextLine();
		String[] arrY = y.split(",");//1,24,25
		
		for (int i = 0; i < arrY.length; i++) {// i = 1
			String hurufSekarang = arrX[i];//Y
			String indexSekarang = arrY[i];//24
			int indexSekarangInt = Integer.parseInt(indexSekarang);//1
			
			//variabel bantu untuk mengecek apakah hurufSekarang sudah sesuai
			//dengan bobot
			String hurufBobotIndexSekarang = arrBobot[indexSekarangInt];//Y
			
			if (hurufSekarang.equals(hurufBobotIndexSekarang)) {
				System.out.print("true ");
			} else {
				System.out.print("false ");
			}
		}
		
		
		
	}
}
