package simulasift1;

import java.util.Scanner;

public class soal8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// kelipatan 4 dikurang 1  3,7,11,15....
		// kelipatan 3 dibagi 2
		
		

		System.out.print("Input n : ");
		int n = input.nextInt();
		
	
		int arr4[] = new int[n];
		int arr3[] = new int[n];
		int tampung[] = new int[n];
		
		int kel4 = 0;
		for(int i=0;i<n;i++) {
			if(arr4[i]==0) {
				arr4[i]= (kel4+=4)-1;
				System.out.print(arr4[i]+" ");
			}
		}
		
		System.out.println();
		int kel3=0;
		for(int i=0;i<n;i++) {
			if(arr3[i]==0) {
				arr3[i]= (kel3+=3)/2;
				System.out.print(arr3[i]+" ");
			}
		}
		System.out.println();
		for (int i = 0; i < arr3.length; i++) {
			tampung[i] = arr4[i] + arr3[i];
			
			System.out.print(tampung[i]+" ");
		}
		

	}

}
