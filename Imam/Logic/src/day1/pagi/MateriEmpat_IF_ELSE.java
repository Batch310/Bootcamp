package day1.pagi;

public class MateriEmpat_IF_ELSE {

	public static void main(String[] args) {
		
		int a = 4;
		
		if(a>10) {
			System.out.println("a bilangan besar 10");	
		}else if(a ==2 ){
			System.out.println("a adalah 2");
		}
		else {
			System.out.println("a bukan bilangan besar");
		}
		
		if (a < 3) {
			System.out.println("a lebih kecil dari3");
		}
		
		if (a<5) {
			System.out.println("a lebih kecil dari 5");
		}
		
		
		//Kondisi Switch Case
		switch(a) {
		case 1:
			System.out.println("A = 1");
			break;
		case 2 :
			System.out.println("A = 2");
			break;
		default:
			System.out.println("A bukan siapa2");
			break;
		}
		
	}
	
	

}
