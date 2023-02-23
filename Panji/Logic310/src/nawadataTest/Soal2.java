package nawadataTest;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Input the number of family(s) : ");
		int countOfFamily = input.nextInt();

		System.out.print("Input the number of members in the family : ");
		input.nextLine();
		String[] countMember = input.nextLine().split(" ");

		int miniBusMaxPass = 4;

		while (countMember.length != countOfFamily) {
			System.out.println("Input must be equal with count of family");

			System.out.print("Input the number of members in the family : ");
			countMember = input.nextLine().split(" ");
		}

		int totalPass = 0;
		int miniBusRequired = 0;

		for (int i = 0; i < countMember.length; i++) {
			int countOfFamilyMemberInt = Integer.parseInt(countMember[i]);
			if (countOfFamilyMemberInt > miniBusMaxPass) {
				for (int j = miniBusMaxPass; j < countOfFamilyMemberInt; j += 4) {
					miniBusRequired += 1;
				}
			}
			totalPass += countOfFamilyMemberInt;
		}

		miniBusRequired += (totalPass / miniBusMaxPass);

		if (totalPass % miniBusMaxPass != 0) {
			miniBusRequired += 1;
		}

		System.out.println("Minimum bus required is : " + miniBusRequired);
	}
}
