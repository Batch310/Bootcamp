package simulasi.ft1;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// alfabet A=0, B=1, C=2 ,....Z=25
		// input string ABCABC, input array 0,1,2,1,2,3
		// output = true, true ,true false,false,false

		Scanner scan = new Scanner(System.in);

		// variabel bantu bobot
		String bobot = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] arrBobot = bobot.split("");

		System.out.println("input string: ");
		String x = scan.nextLine();
		String[] arrX = x.split("");

		System.out.println("input array: ");
		String y = scan.nextLine();
		String[] arrY = y.split("");

		for (int i = 0; i < arrY.length; i++) {
			String hurufSekarang = arrX[i];
			String indexSekarang = arrY[i];

			int indexSekarangInt = Integer.parseInt(indexSekarang); //karena awalnya String, maka konvert dengan parseint

			//variabel bantu untuk mengecek apakah hurufSekarang sudah sesuai dengan bobot
			String hurufBobotIndexSekarang = arrBobot[indexSekarangInt]; //digunakan untuk membandingkan an

			if (hurufSekarang.equals(hurufBobotIndexSekarang)) {
				System.out.print("true ");
			} else {
				System.out.print("false ");
			}
		}

	}

}
