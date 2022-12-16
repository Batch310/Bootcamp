package day1.pagi;

public class MateriEmpat {

	public static void main(String[] args) {

		// kondisi satu rangkaian if, else if, else
		int a = 10;
		
		if(a>=10) {
			// kalau kondisi terpenuhi apa yang dilakukan
			System.out.println("A bilangan besar");
		}else if(a == 10) {
			System.out.println("A adalah 10");
		}else {
			System.out.println("A bukan bilangan besar");
		}
		
		// Kondisi berdiri sendiri if if if
//		if(a<5) {
//			System.out.println("A lebih kecil dari 5");
//		}
//		if(a<3) {
//			System.out.println("A lebih kecil dari 3");
//		}
		
		//kondisi switch case
		switch (a) {
		case 1:
			System.out.println("A = 1");
			break;
		case 2:
			System.out.println("A = 2");
			break;
		default:
			System.out.println("A bukan siapa-siapa");
			break;
		}
		
	}

}
