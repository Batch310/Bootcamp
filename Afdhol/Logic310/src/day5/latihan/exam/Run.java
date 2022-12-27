package day5.latihan.exam;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String rute = scan.nextLine();
		
		String[] arrayRute = rute.split("-");
		
		double totJarak = 0;
		
		int urutanRute = 1;
		
		for (int i = urutanRute; i < arrayRute.length; i++) {
			totJarak+=0;
			if (arrayRute[i].equals("Toko")) {
				if (arrayRute[i].equals("Tempat 1") || arrayRute[i-1].equals("Tempat 2") || arrayRute[i-2].equals("Tempat 1")) {
					totJarak += 2; //jarak 2km
				}else if (arrayRute[i-1].equals("Tempat 2")) {
					totJarak += 2.5;
				}else if (arrayRute[i-1].equals("Tempat 3") || arrayRute[i-2].equals("Tempat 2") && arrayRute.equals("Tempat 3")) {
					totJarak += 4; //4 km
				}else if (arrayRute[i-1].equals("Tempat 4") || arrayRute[i-2].equals("Tempat 2") && arrayRute.equals("Tempat2")) {
					totJarak += 6.5;
				}
			}else if (arrayRute[i].equals("Tempat 1")) {
				if (arrayRute[i-1].equals("Toko") || arrayRute[i-2].equals("Tempat 2") && arrayRute[i-1].equals("Toko") ) {
					totJarak+=2;
				}else if (arrayRute[i-1].equals("Tempat 2")) {
					
				}
			}
		}
	}

}
