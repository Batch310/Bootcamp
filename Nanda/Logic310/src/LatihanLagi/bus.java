package LatihanLagi;

import java.util.Scanner;

public class bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan Banyaknya Keluarga = ");
		int n = input.nextInt();

		System.out.print("Masukkan jumlah anggota keluarga : ");
		input.nextLine();
		String[] member = input.nextLine().split(" ");
		
		int maxPass = 4;
		
		while (member.length != n) {
			System.out.println("input jumlah keluarga harus sama dengan banyakny keluarga");
			
			System.out.println("Masukkan jumlah anggota keluarga : ");
			member = input.nextLine().split(" ");
		}
		
		int totalPass = 0;
		int miniBus = 0;
		
		for (int i = 0; i < member.length; i++) {
			int memberInt = Integer.parseInt(member[i]);
			if (memberInt > maxPass) {
				for (int j = maxPass; j < memberInt; j += 4 ) {
					miniBus++;
				}
			}
			totalPass += memberInt;
		}
		
		miniBus +=  (totalPass / maxPass);
		
		if (totalPass % maxPass != 0) {
			miniBus++;
		}
		
		System.out.println("Minimum mini bus : " + miniBus);
	}

}
