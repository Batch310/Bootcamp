package day4.latihan.exam;

import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int route1 = 2000;
		int route2 = 500;
		int route3 = 1500;
		int route4 = 2500;
		int oil = 2500;
		int distance = 0;
		int sumDistance = 0;

		System.out.println("Insert route : ");
		String[] route = input.next().split("-");

		for (int i = 0; i < route.length; i++) {
			for (int j = 0; j < route.length; j++) {
				if (route[i] == "Toko" && route[j] == "Tempat 1" || route[i] == "Tempat 1" && route[j] == "Toko") {
					distance = route1;
				} else if (route[i] == "Tempat 1" && route[j] == "Tempat 2"
						|| route[i] == "Tempat 2" && route[j] == "Tempat 1") {
					distance = route2;
				} else if (route[i] == "Tempat 2" && route[j] == "Tempat 3"
						|| route[i] == "Tempat 3" && route[j] == "Tempat 2") {
					distance = route3;
				} else if (route[i] == "Tempat 3" && route[j] == "Tempat 4"
						|| route[i] == "Tempat 4" && route[j] == "Tempat 3") {
					distance = route4;
				} else if (route[i] == "Toko" && route[j] == "Tempat 2"
						|| route[i] == "Tempat 2" && route[j] == "Toko") {
					distance = route1 + route2;
				} else if (route[i] == "Toko" && route[j] == "Tempat 3"
						|| route[i] == "Tempat 3" && route[j] == "Toko") {
					distance = route1 + route2 + route3;
				} else if (route[i] == "Toko" && route[j] == "Tempat 4"
						|| route[i] == "Tempat 4" && route[j] == "Toko") {
					distance = route1 + route2 + route3 + route4;
				} else if (route[i] == "Tempat 1" && route[j] == "Tempat 3"
						|| route[i] == "Tempat 3" && route[j] == "Tempat 1") {
					distance = route2 + route3;
				} else if (route[i] == "Tempat 1" && route[j] == "Tempat 4"
						|| route[i] == "Tempat 4" && route[j] == "Tempat 1") {
					distance = route2 + route3 + route4;
				} else if (route[i] == "Tempat 2" && route[j] == "Tempat 4"
						|| route[i] == "Tempat 4" && route[j] == "Tempat 2") {
					distance = route3 + route4;
				}
			}
			sumDistance += distance;
		}
		System.out.println((sumDistance ) + " liter");
		input.close();
	}

}
