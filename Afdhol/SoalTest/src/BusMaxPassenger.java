import java.util.Scanner;

public class BusMaxPassenger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input the number of family(s) : ");
		int jmlFamily = input.nextInt();

		System.out.println("Input the number of members in the family (separated by space) : ");
		input.nextLine();
		
		//memasukkan input jumlah anggota keluarga ke dalam array dengan dipisah spasi " "
		String[] jmlFamilyMember = input.nextLine().split(" ");

		int miniBusMaxPassengers = 4;
		
		//jika panjang tidak sesuai inputan jumlah family 
		while (jmlFamilyMember.length != jmlFamily) {
			System.out.println("Input must be equal with count of family");

			System.out.println("Input the number of members in the family (separated by space) : ");
			jmlFamilyMember = input.nextLine().split(" ");
		}

		int totalPassengers = 0;

		for (int i = 0; i < jmlFamilyMember.length; i++) {
			int countOfFamilyMemberInt = Integer.parseInt(jmlFamilyMember[i]); //convert ke integer karena inputan sebelumnya String
			totalPassengers += countOfFamilyMemberInt;
		}

		int miniBusRequired = (totalPassengers / miniBusMaxPassengers);

		if (totalPassengers % miniBusMaxPassengers != 0) {
			miniBusRequired += 1;
		}

		System.out.println("Minimum bus required is : " + miniBusRequired);
	}
}
