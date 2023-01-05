package catatan.untuk.FT1;

public class PercabanganIfDanSwitchCase {

	public static void main(String[] args) {
int a = 2;
		
//		//Kondisi satu rangkaian if, else if, else
//		if (a>=10) {
//			//kalau kondisi terpenuhi apa yang dilakukan
//			System.out.println("a bilangan besar");
//	}	else if (a==10) {
//			System.out.println("a adalah 10");
//}		else {
//			System.out.println("a bukan bilangan besar");
//	}
//		
//		// Kondisi berdiri sendiri if if if
//		if (a < 5) {
//			System.out.println("a lebih kecil dari 5");
//		}
//		
//		if (a < 3) {
//			System.out.println("a lebih kecil dari 3");
//		}
		
		//kondisi Switch Case
		switch (a) {
		case 1:
			System.out.println("a = 1");
			break;
		case 2:
			System.out.println("a = 2");
			break;
		default:
			System.out.println("a bukan siapa2");
			break;
		}

	}

}
