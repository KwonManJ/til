import java.util.Scanner;

// 10951번
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int iNum1;
		int iNum2;

		while(scan.hasNextInt()) {
			iNum1 = scan.nextInt();
			iNum2 = scan.nextInt();

			System.out.println(iNum1 + iNum2);
		}

	}

}
