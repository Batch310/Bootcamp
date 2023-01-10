package simulasift1;

import java.util.Scanner;

public class Soal2 {
	
/*
Diketahui Chef Yudha ingin membuat resep indomie super ala Jambrong. Jika diketahui untuk membuat 1 indomie super ala Jambrong dibutuhkan 2 bungkus indomie, 100 gr garam, 3 butir telur, dan 50 gr gula pasir.
Berapakah bungkus indomie, garam, butir telur dan gula pasir untuk membuat indomie super ala Jambrong sebanyak n.
Input :
n = 1

Output : 
Dibutuhkan 2 bungkus indomie 100 gr garam, 3 butir telur, dan 50 gr gula pasir.

Input :
n = 2

Output : 
Dibutuhkan 4 bungkus indomie 200 gr garam, 6 butir telur, dan 100 gr gula pasir.



*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		int mie = 2*n;
		int garam = 100*n;
		int telur = 3*n;
		int gula = 50*n;
		System.out.println("Dibutuhkan " + mie + " bungkus Indomie, " + garam + " gr garam, " + telur + " butir telur, dan " + gula + " gr gula pasir.");
		
	}

}
