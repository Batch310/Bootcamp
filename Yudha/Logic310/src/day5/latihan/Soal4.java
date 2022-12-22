package day5.latihan;

import java.util.Iterator;
import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Rute : ");
		String [] rute = input.next().split("-");
		int r1 = 2000, r2 = 500, r3=1500, r4 = 2500, bensin=2500 ,jarak=0,sumJarak=0,sumBensin;
		for (int i = 0; i < rute.length-1; i++) {
			for (int j = i+1; j < rute.length; j++) {
				if((rute[i]=="toko"&rute[j]=="tempat 1")|(rute[i]=="tempat 1"&rute[j]=="tempat 2")) {
					jarak = r1;
				}
				else if((rute[i]=="tempat 1"&rute[j]=="tempat 2")|(rute[i]=="tempat 2"&rute[j]=="tempat 1")) {
					jarak = r2;
				}
				else if((rute[i]=="tempat 2"&rute[j]=="tempat 3")|(rute[i]=="tempat 3"&rute[j]=="tempat 2")) {
					jarak = r3;
				}
				else if((rute[i]=="tempat 3"&rute[j]=="tempat 4")|(rute[i]=="tempat 4"&rute[j]=="tempat 3")) {
					jarak = r4;
				}
				else if((rute[i]=="toko"&rute[j]=="tempat 2")|(rute[i]=="tempat 2"&rute[j]=="toko")) {
					jarak = r1+r2;
				}
				else if((rute[i]=="toko"&rute[j]=="tempat 3")|(rute[i]=="tempat 3"&rute[j]=="toko")) {
					jarak = r1+r2+r3;
				}
				else if((rute[i]=="toko"&rute[j]=="tempat 4")|(rute[i]=="tempat 4"&rute[j]=="toko")) {
					jarak = r1+r2+r3+r4;
				}
				else if((rute[i]=="tempat 1"&rute[j]=="tempat 3")|(rute[i]=="tempat 3"&rute[j]=="tempat 1")) {
					jarak = r2+r3;
				}
				else if((rute[i]=="tempat 1"&rute[j]=="tempat 3")|(rute[i]=="tempat 4"&rute[j]=="tempat 2")) {
					jarak = r2+r3+r4;
				}
				else if((rute[i]=="tempat 2"&rute[j]=="tempat 4")|(rute[i]=="tempat 4"&rute[j]=="tempat 2")) {
					jarak = r3+r4;
				}
				else {
					
				}
				
			}
			sumJarak= sumJarak + jarak;
		}
		System.out.println(sumJarak/bensin);
		
		
	}

}
