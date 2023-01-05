package coba.coba;

public class CobaGanjilGenap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=15;
		
		for (int i = 0; i < n; i++) {
			if (i%2==0) {
				System.out.print(i+" ");	
			}
			
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			if (i%2==1) {
				System.out.print(i+" ");
			}
		}
	}

}
