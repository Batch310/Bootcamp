package day1.pagi;

public class MateriEmpat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		// kondisi satu rangkaian if, else if, else
//		if(a>10) {
//			System.out.println("A bilangan besar");
//		} else {
//			System.out.println("A bukan bilangan besar");
//		}
		// kondisi berdiri sendiri / terpisah if if if
//		if(a<5) {
//			System.out.println("A lebih kecil dari 5");
//		}
//		if(a<3) {
//			System.out.println("A lebih kecil dari 3");
//		}
		
		switch (a) {
		case 1:
			System.out.println("A = 1");
			break;
		case 2:
			System.out.println("A = 2");
			break;

		default:
			System.out.println("A bukan 1 atau 2");
			break;
		}
	}

}
