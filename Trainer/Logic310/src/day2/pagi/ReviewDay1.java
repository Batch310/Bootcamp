package day2.pagi;

public class ReviewDay1 {

	public static void main(String[] args) {
		System.out.print("Hello World");
		
//		System.exit(0);
		
		System.out.println();
		
		//_____________________________
		
		int angka = 3;
		String huruf;
		
		//_____________________________
		
		if(angka<=10) {
			System.out.println(angka+" adalah bilangan kecil");
			System.out.println("halo");
		}else {
			System.out.println(angka+" adalah bilangan besar");
		}
		
		//output : 3 adalah bilangan kecil
		
		if(angka <= 10) {
			System.out.println(angka+" adalah bilangan kecil");
		} else if(angka <= 5) {
			System.out.println(angka+" adalah bilangan lebih kecil");
		}
		
		//output :
		//3 adalah bilangan kecil
	}
	
}
