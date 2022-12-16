package day1.pagi;

public class MateriEmpat {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 4;
		int x = 1;
		
		//Satu komposisi if else
		if (a>=10) {
			System.out.println("A bilangan besar");
		} else if (a == 10) {
			System.out.println("A adalah 10");
		} else {
			System.out.println("A bukan bilangan besar");
		}

		//if
		if (b<5) {
			System.out.println("B kurang dari 5");
		}
		if (b<3) {
			System.out.println("B kurang dari 3");
		}
		
		
		//Switch Case
		switch (x) {
		case 1:
			System.out.println("X = 1");
			break;

		default:
			System.out.println("not define");
			break;
		}
	}

}
