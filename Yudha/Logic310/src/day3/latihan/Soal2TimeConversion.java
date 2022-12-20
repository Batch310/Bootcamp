package day3.latihan;

import java.util.Scanner;

public class Soal2TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan input Time : ");
		String time = input.next();
		if(time.length()==10) {
			int hour = Integer.parseInt(time.substring(0,2));
			int minute = Integer.parseInt(time.substring(3,5));
			int second = Integer.parseInt(time.substring(6,8));
			if(hour>=1 & hour <=12 & minute >=0 & minute <=59 & second>=0 & second <=59) {
				if(time.substring(8).equals("AM")) {
					System.out.println(time.substring(0,8));
				}
				else if(time.substring(8).equals("PM")){
					hour = hour+12;
					time = time.substring(2,8);
					if(hour==24) {
						hour = 0;
						time = "0"+hour+time;
					}
					else {
						time = hour+time;
					}
					System.out.println(time);
				}
				else {
					System.out.println("Format Salah");
				}
			}
			else {
				System.out.println("Format Salah");
			}
			
		}
		else {
			System.out.println("Format Salah");
		}
	}

}
