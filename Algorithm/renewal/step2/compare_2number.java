import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int iNum1, iNum2;
		iNum1 = scan.nextInt();
		iNum2 = scan.nextInt();

		if(iNum1 < iNum2) {
			System.out.println("<");
		} else if(iNum1 > iNum2) {
			System.out.println(">");
		} else {
			System.out.println("==");
		}
		
	}

}
