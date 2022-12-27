package day6.latihan;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Beli Pulsa Rp.");
		int pulsa = input.nextInt();
		int pointA = 0,pointB = 0,pointC = 0;
		String point = "";
		if(pulsa>=0) {
			point = point + pointA;
		}
		if(pulsa > 10000) {
			if (pulsa > 30000){
				pointB = 20000/1000;
				point = point + " + " + pointB;
			}
			else {
				pointB = pointB + ((pulsa-10000)/1000);
				point = point + " + " + pointB;
			}		
		}
		if(pulsa >= 30000) {
			pointC = (pulsa-30000)/1000*2;
			point = point + " + " + pointC;
		}
		System.out.println("Output : " + point + " = " + (pointA+pointB+pointC) + " point");
		//System.out.println(pointA +" + " + pointB + " + " + pointC + " = " + (pointA+pointB+pointC));
	}

}
