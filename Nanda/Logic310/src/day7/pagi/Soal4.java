package day7.pagi;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Rute: ");
		String rute = input.nextLine();
		
		String[] arrRute = rute.split(" - ");
		
		double totalJarak = 0;
		int urutanRute = 1;
		
		for (int i = urutanRute; i < arrRute.length; ) {
			if (arrRute[i].equals("Toko")) {
				totalJarak += 0;
				if (arrRute[i-1].equals("Tempat 1")) {
					totalJarak += 2;
					i++;
				} else if (arrRute[i-1].equals("Tempat 2")) {
					totalJarak += 2.5;
					i++;
				} else if (arrRute[i-1].equals("Tempat 3")) {
					totalJarak += 4;
					i++;
				} else if (arrRute[i-1].equals("Tempat 4")) {
					totalJarak += 6.5;
					i++;
				}
			} else if (arrRute[i].equals("Tempat 1")) {
				if (arrRute[i-1].equals("Toko")) {
					totalJarak += 2;
					i++;
				} else if (arrRute[i-1].equals("Tempat 2")) {
					totalJarak += 0.5;
					i++;
				} else if (arrRute[i-1].equals("Tempat 3")) {
					totalJarak += 2;
					i++;
				} else if (arrRute[i-1].equals("Tempat 4")) {
					totalJarak += 4.5;
					i++;
				}
			} else if (arrRute[i].equals("Tempat 2")) {
				if (arrRute[i-1].equals("Toko")) {
					totalJarak += 2.5;
					i++;
				} else if (arrRute[i-1].equals("Tempat 1")) {
					totalJarak += 0.5;
					i++;
				} else if (arrRute[i-1].equals("Tempat 3")) {
					totalJarak += 1.5;
					i++;
				} else if (arrRute[i-1].equals("Tempat 4")) {
					totalJarak += 4;
					i++;
				}
			} else if (arrRute[i].equals("Tempat 3")) {
				if (arrRute[i-1].equals("Toko")) {
					totalJarak += 4;
					i++;
				} else if (arrRute[i-1].equals("Tempat 1")) {
					totalJarak += 2;
					i++;
				} else if (arrRute[i-1].equals("Tempat 2")) {
					totalJarak += 1.5;
					i++;
				} else if (arrRute[i-1].equals("Tempat 4")) {
					totalJarak += 2.5;
					i++;
				}
			} else if (arrRute[i].equals("Tempat 4")) {
				if (arrRute[i-1].equals("Toko")) {
					totalJarak += 6.5;
					i++;
				} else if (arrRute[i-1].equals("Tempat 1")) {
					totalJarak += 4.5;
					i++;
				} else if (arrRute[i-1].equals("Tempat 2")) {
					totalJarak += 4;
					i++;
				} else if (arrRute[i-1].equals("Tempat 3")) {
					totalJarak += 2.5;
					i++;
				}
			} else {
				System.out.println("Rute tidak valid!");
				System.exit(0);
			}
			
		}
		double liter = (totalJarak/2.5);
		if (totalJarak%2.5 == 0) {
			System.out.println((int) (liter) + " liter");
		} else {
			System.out.println(((int) (liter) + 1) + " liter");
		}

		
	}
}