package SimulasiFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Kalimat = ");
		String kalimat = input.nextLine().toLowerCase(); //sample case

		String[] arrKalimat = kalimat.split("");// {"s", "a", "m","p", "l", "e"," ", "c", "a", "s", "e" }
		Arrays.sort(arrKalimat); //" ", "a", "a","c", "e", "e","l ", "m", "p", "s", "s"

				                                        // tipe double, menghapus duplicate data/mengembalikan nilai beda
//				arrKalimat = Arrays.stream(arrKalimat).distinct().toArray(String[]::new);
				                                                  // convert array ori
				
				              //" ","a","c","e","l", "m", "p", "s"

				String voc = "aiueo";
				String kon = "qwrtypsdfghjklzxcvbnm";
				String hurufVoc = "ae";// 
				String hurufKon = "";//                        //aee

				for (int i = 0; i < arrKalimat.length; i++) { //i=2 , arrKalimat.length=3 
					if (voc.contains(arrKalimat[i])) {
						if(hurufVoc.contains(arrKalimat[i])) {
						}else {
							hurufVoc = hurufVoc+arrKalimat[i];	
						}
					} else if (kon.contains(arrKalimat[i])) {
						if(hurufKon.contains(arrKalimat[i])) {
						}else {
							hurufKon = hurufKon+arrKalimat[i];	
						}			}
				}
//				
//				String[] newVoc = hurufVoc.split("");
//				
//				int found=0;
//				String[] NewVoc= new String[newVoc.length];
//				for (int j = 1; j < newVoc.length; j++) {
//					
//					if (newVoc[j].equals(newVoc[j-1])) {
//						NewVoc[found] = newVoc[j];
//						found++;
//					} else {
//						NewVoc[found] = newVoc[j];
//					}
//				}
				

				System.out.print("Huruf vocal = " + hurufVoc);
				System.out.println();
				System.out.print("Huruf konsonan = " + hurufKon);

			}


	}