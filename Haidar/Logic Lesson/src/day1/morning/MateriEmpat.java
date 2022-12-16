package day1.morning;

public class MateriEmpat {

	public static void main(String[] args) {
		
		int a = 10;
		
		//If else jika salah satu kondisi teratas sudah terpenuhi, maka kondisi dibawahnya tidak membaca kembali
		if (a > 10) {
			//Hasil kondisi benar
			System.out.println("A merupakan bilangan lebih besar dari 10");
		} else if (a == 10) {
			System.out.println("A merupakan bilangan 10");
		} else {
			//Hasil kondisi tidak terpenuhi
			System.out.println("A merupakan bilangan lebih kecil dari 10");
		}
		
		// If saja berdiri sendiri sendiri, maka walaupun kondisi teratas sudah terpenuhi, kondisi dibawahnya tetap membaca
		if (a < 5) {
			System.out.println("A lebih kecil dari 5");
		}
		if (a < 3) {
			System.out.println("A lebih kecil dari 3");
		}
		
		//Kondisi Switch Case
		switch (a) {
		case 1:
			System.out.println("A = 1");
			break;
		case 2:
			System.out.println("A = 2");
		default:
			System.out.println("A bukan siapa - siapa");
			break;
		}

	}

}
