package ft1;

import java.util.Scanner;

public class Soal7 {
	//alfabet a-z
	// a=1,b=2,......z=26
	//mencocokkan apakah true atau false
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		
		String bobot = " abcdefghijklmnopqrstuvwxyz";
		String[] arrayBobot = bobot.split("");
		
		System.out.print("string: ");
		String x = scan.nextLine();
		String[] arrX = x.split("");
		
		System.out.println("array: ");
		String y = scan.nextLine();
		String[] arrY = y.split(",");
		
		
		
		for (int i = 0; i < arrY.length; i++) {
			String hurufSekarang = arrX[i];
			String indexSekarang = arrY[i];
			
			int indexSekarangInt = Integer.parseInt(indexSekarang);
			
			String hurufBobotIndexSekarang = arrayBobot[indexSekarangInt];
			
			if (hurufSekarang.equals(hurufBobotIndexSekarang)) {
				System.out.print("true ");
			}else {
				System.out.print("false ");
			}
		}
	}

}
