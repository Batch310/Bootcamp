package day5.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal4JarakToko {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> dataList = new ArrayList<>();

		// Kondisi
		// Toko ke Tempat 1 = 2km
		// Tempat 1 ke Tempat 2 = 500m
		// Tempat 2 ke tempat 3 = 1,5km
		// Tempat 3 ke Tempat 4 = 2,5km

		// Jarak perjalanan
//		double jarakToko1 = 2; // dalam km
//		double jarak1Tempat2 = 0.5; // dalam km
//		double jarakTempat2Tempat3 = 1.5; // dalam km
//		double jarakTempat3Tempat4 = 2.5; // dalam km

		double jarak = 0;
//		double jarakTotal = 0;
		double jumlahBensin = 0;

		System.out.print("Rute : ");
		String rute = input.nextLine();

		String[] dataArrRute = rute.split(" - ");
		for (String elemen : dataArrRute) {
			dataList.add(elemen);
		}

		for (int i = 1; i < dataList.size(); i++) {
			if (dataList.get(i).equalsIgnoreCase("Toko")) {
				jarak += 0;
				if (dataList.get(i - 1).equalsIgnoreCase("Tempat 1")) {
					jarak += 2;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 2")) {
					jarak += 2.5;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 3")) {
					jarak += 4;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 4")) {
					jarak += 6.5;
				}
			} else if (dataList.get(i).equalsIgnoreCase("Tempat 1")) {
				if (dataList.get(i - 1).equalsIgnoreCase("Toko")) {
					jarak += 2;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 2")) {
					jarak += 0.5;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 3")) {
					jarak += 2;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 4")) {
					jarak += 4.5;
				}
			} else if (dataList.get(i).equalsIgnoreCase("Tempat 2")) {
				if (dataList.get(i - 1).equalsIgnoreCase("Toko")) {
					jarak += 2.5;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 1")) {
					jarak += 0.5;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 3")) {
					jarak += 1.5;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 4")) {
					jarak += 4;
				}
			} else if (dataList.get(i).equalsIgnoreCase("Tempat 3")) {
				if (dataList.get(i - 1).equalsIgnoreCase("Toko")) {
					jarak += 4;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 1")) {
					jarak += 2;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 2")) {
					jarak += 1.5;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 4")) {
					jarak += 2.5;
				}
			} else if (dataList.get(i).equalsIgnoreCase("Tempat 4")) {
				if (dataList.get(i - 1).equalsIgnoreCase("Toko")) {
					jarak += 6.5;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 1")) {
					jarak += 4.5;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 2")) {
					jarak += 4;
				} else if (dataList.get(i - 1).equalsIgnoreCase("Tempat 3")) {
					jarak += 2.5;
				}
			}
		}
		jumlahBensin = (jarak / 2.5);

		System.out.println((int) (jumlahBensin) + " liter");
	}
}