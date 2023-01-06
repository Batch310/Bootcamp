package ujian.FT1;

import java.util.Scanner;

public class No_07 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		String bobot =" abcdefghijklmnopqrstuvwxyz";
		String[] arrBobot=bobot.split("");
		
		System.out.print("Input String = ");
		String x = scanner.nextLine().toLowerCase();
		String[] arrX =x.split("");
		
		System.out.print("Input Array = ");
		String y = scanner.nextLine();
		String[] arrY =y.split(",");
		
		for (int i = 0; i < arrX.length; i++) {
			String hurufSekarang = arrX[i];
			String indexSekarang = arrY[i];
			int indexSekarangInt = Integer.parseInt(indexSekarang);

			// apakah huruf sekarang udh sesuai bobot ?
			String hurufBobotIndekSekarang = arrBobot[indexSekarangInt];

			if (hurufSekarang.equals(hurufBobotIndekSekarang)) {
				System.out.print("true, ");

			} else {
				System.out.print("false, ");
			}
		}
		
		
		
		
	}

}
