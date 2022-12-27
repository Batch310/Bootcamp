package day7.latihan;

import java.util.Scanner;

public class soal1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Point
		// 0 - 10.000 10.000
		// 10.000 - 30.000 20.000
		// 30.000

		int pulsa = 20000;
		int pulsa1 = 0;
		int pulsaSisa = 0;
		int point = 0, point1 = 0, point2 = 0, pointTotal = 0;
		int sisaPoint = 0;

		if (pulsa <= 10000) {
			pulsa = pulsa - 10000;
			point= pulsa/1000;
			System.out.print(point + " + " + point + "=" + point1);
		}else if(pulsa>10001 && pulsa<30000) {
			pulsa = pulsa - 20000;
			point1  = pulsa/1000;
			System.out.print(point + " + " + point1 + "=" + point1);
		}

//		if (pulsa > 0) {
//			pulsa = pulsa - 10000;
//			point2 = pulsa / 1000;
//			if (pulsa < 10001) {
//				pulsa = pulsa - 10000;
//			}
//
//		}
//
//		if (pulsa > 10000) {
//			pulsa = pulsa - 25000;
//			point1 = pulsa / 1000;
//			if (pulsa > 0) {
//				pulsa = pulsa - 10000;
//				point2 = point2 + 0;
//			}
//		}
//
//		if (pulsa > 30000) {
//			pulsa = pulsa - 30000;
//			point = (pulsa / 1000) * 2;
//			if (pulsa > 10000) {
//				pulsa = pulsa - 25000;
//				point1 = pulsa / 1000;
//			}
//			if (pulsa > 0) {
//				pulsa = pulsa - 10000;
//				point2 = point2 + 0;
//			}
//		}

//		if (pulsa > 10001 && pulsa < 30000) {
//			pulsa = pulsa - 1000;
//			point = pulsa / 1000;
//		}
//	
//			if(pulsa<10001) {
//				pulsa = pulsa - 10000;
//				point = pulsa / 1000;
//			}
//		}else if(pulsa > 30000) {
//			pulsa = pulsa - 30000;
//		}

	}

}
