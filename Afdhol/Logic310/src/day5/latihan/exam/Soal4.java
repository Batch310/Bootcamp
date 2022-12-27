package day5.latihan.exam;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {

		// diket:
		// toko ke tempat 1 = 2 km
		// tempat1 ke tempat2 = 0,5km
		// tempat2 ke tempat3 = 1,5km
		// tempat3 ke tempat4 = 2,5km

		// soal= toko-tempat 1-tempat 2-toko
		// output 2liter

		Scanner scan = new Scanner(System.in);
		System.out.println("Rute: ");
		String rute = scan.nextLine();
		
		String[] arrayRute = rute.split("-");
		
		double totJarak = 0;
		
		int urutanRute = 1;
		
		for (int i = urutanRute; i < arrayRute.length; i++) {
			totJarak+=0;
			if (arrayRute[i].equalsIgnoreCase("Toko")) {
				if (arrayRute[i].equals("Tempat 1"))  {
					totJarak += 2; //jarak 2km
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 2")) {
					totJarak += 2.5;
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 3")) {
					totJarak += 4; //4 km
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 4")) {
					totJarak += 6.5;
				}
			}else if (arrayRute[i].equalsIgnoreCase("Tempat 1")) {
				if (arrayRute[i-1].equalsIgnoreCase("Toko")) {
					totJarak+=2;
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 2")) {
					totJarak += 0.5;
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 3")) {
					totJarak +=2;
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 4")) {
					totJarak += 4.5;
				}
			}else if (arrayRute[i].equalsIgnoreCase("Tempat 2")) {
				if (arrayRute[i-1].equalsIgnoreCase("Toko")) {
					totJarak += 2.5;
				}else if (arrayRute[i].equals("Tempat 1")) {
					totJarak += 0.5;
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 3")) {
					totJarak += 1.5;
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 4")) {
					totJarak += 4;
				}
			}else if (arrayRute[i].equalsIgnoreCase("Tempat 3")) {
				if (arrayRute[i-1].equalsIgnoreCase("Toko")) {
					totJarak += 4;
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 1")) {
					totJarak += 2;
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 2")) {
					totJarak += 1.5;
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 4")) {
					totJarak += 2.5;
				} 
			}else if (arrayRute[i].equalsIgnoreCase("Tempat 4")) {
				if (arrayRute[i-1].equalsIgnoreCase("Toko")) {
					totJarak += 6.5;
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 1")) {
					totJarak += 4.5;
				}else if (arrayRute[i-1].equalsIgnoreCase("Tempat 2")) {
					totJarak += 4;
				}else if (arrayRute[i].equalsIgnoreCase("Tempat 3")) {
					totJarak += 2.5;
				}
			}else {
				System.out.println("input salah");
			}
		}
		
		double liter = totJarak/2.5;
		System.out.println(totJarak);
		System.out.println((int)liter);
	}

}
