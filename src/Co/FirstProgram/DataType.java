package Co.FirstProgram;

import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathsOperation mo = new MathsOperation();

		Scanner s = new Scanner(System.in);
gti
		System.out.println("Enter Number 1 = hi prashant ");
		int n1 = s.nextInt();

		System.out.println("Enter Number 2 = ");
		int n2 = s.nextInt();

		System.out.printf("\n Enter 1 for Addition \n 2 for Multiply \n 3 for Substraction");
		int c = s.nextInt();

		mo.a = n1;
		mo.b = n2;

		if (c == 1) {
			mo.add();
		} else if (c == 2) {
			mo.multiply();

		} else if (c == 3) {
			mo.substract();
		} else {
			System.out.println("You have entered fghgjh lid choice = ");
		}

	}

}
