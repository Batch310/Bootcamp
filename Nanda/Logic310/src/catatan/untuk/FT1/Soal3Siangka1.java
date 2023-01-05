package catatan.untuk.FT1;

import java.util.Scanner;

public class Soal3Siangka1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.print("input : "); //5
		int n = input.nextInt();
		
		int awal = 0; //1
		
		for (int i = 100; awal < n ; i++) { //i =103, awal = 3 < 5
			String a = Integer.toString(i); // integer ke string
			String[] arrA = a.split(""); // string arrA = {"1","0","3"}
			
			int tampung = 0;
			for (int j = 0; j < arrA.length; j++) { //012
				int c = Integer.parseInt(arrA[j]); //string to integer arrA[j]
				int hasil = (int) Math.pow(c, 2); // c = 3  pangkat 2
				tampung += hasil; //1+0+9 = 10
			}
				if (tampung == 1) { //tampung = 1
					System.out.println(i+ " adalah Si angka 1"); // 100 adalah si angka 1
					awal++; 
				}else {
					while (tampung > 9) {
						String d = Integer.toString(tampung); //ubah int tampung ke string 
						String[] aarB = d.split(""); //split string d masukkan ke arrB {"1","0"}
						tampung = 0;
						for (int k = 0; k < aarB.length; k++) { //k=1, 0<2,
							int e = Integer.parseInt(aarB[k]); //ubah string ke integer aarB[k]
							int hasil2 = (int) Math.pow(e, 2); // hasil2 = e = 0 pangkat 2
							tampung += hasil2; //1+0 = 1
						}
						if (tampung == 1) { //tampung = 1
							System.out.println(i+ " adalah Si angka 1"); //103 adalah siangka 1
							awal++;
						}
					}
				}
			}
		
		}
	}