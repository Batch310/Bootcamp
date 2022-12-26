package day5.latihanFT;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int ruteTokoTempat1 = 2000;
		int ruteTempat1Tempat2 = 500;
		int ruteTempat2Tempat3 = 1500;
		int ruteTempat3Tempat4 = 2500;
		int bensin = 2500;
		int jarak = 0;
		double totaljarak = 0;

		System.out.print("Masukkan Rute : ");
		String[] rute = input.next().split("-");

		for (int i = 0; i < rute.length; i++) {
			for (int j = 0; j < rute.length; j++) {
				if (rute[i] == "Toko" && rute[j] == "Tempat 1" || rute[i] == "Tempat 1" && rute[j] == "Toko") {
					jarak = ruteTokoTempat1; 
				} else if (rute[i] == "Tempat 1" && rute[j] == "Tempat 2"
						|| rute[i] == "Tempat 2" && rute[j] == "Tempat 1") {
					jarak = ruteTempat1Tempat2;
				} else if (rute[i] == "Tempat 2" && rute[j] == "Tempat 3"
						|| rute[i] == "Tempat 3" && rute[j] == "Tempat 2") {
					jarak = ruteTempat2Tempat3;
				} else if (rute[i] == "Tempat 3" && rute[j] == "Tempat 4"
						|| rute[i] == "Tempat 4" && rute[j] == "Tempat 3") {
					jarak = ruteTempat3Tempat4;
				} else if (rute[i] == "Toko" && rute[j] == "Tempat 2"
						|| rute[i] == "Tempat 2" && rute[j] == "Toko") {
					jarak = ruteTokoTempat1 + ruteTempat1Tempat2;
				} else if (rute[i] == "Toko" && rute[j] == "Tempat 3"
						|| rute[i] == "Tempat 3" && rute[j] == "Toko") {
					jarak = ruteTokoTempat1 + ruteTempat1Tempat2 + ruteTempat2Tempat3;
				} else if (rute[i] == "Toko" && rute[j] == "Tempat 4"
						|| rute[i] == "Tempat 4" && rute[j] == "Toko") {
					jarak = ruteTokoTempat1 + ruteTempat1Tempat2 + ruteTempat2Tempat3 + ruteTempat3Tempat4;
				} else if (rute[i] == "Tempat 1" && rute[j] == "Tempat 3"
						|| rute[i] == "Tempat 3" && rute[j] == "Tempat 1") {
					jarak = ruteTempat1Tempat2 + ruteTempat2Tempat3;
				} else if (rute[i] == "Tempat 1" && rute[j] == "Tempat 4"
						|| rute[i] == "Tempat 4" && rute[j] == "Tempat 1") {
					jarak = ruteTempat1Tempat2 + ruteTempat2Tempat3 + ruteTempat3Tempat4;
				} else if (rute[i] == "Tempat 2" && rute[j] == "Tempat 4"
						|| rute[i] == "Tempat 4" && rute[j] == "Tempat 2") {
					jarak = ruteTempat2Tempat3 + ruteTempat3Tempat4;
				}
			}
			totaljarak += jarak;
		}
		System.out.println((totaljarak / bensin) + " liter");
	}

}
