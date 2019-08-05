import java.util.Scanner;

// 10952번
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int iNum1;
		int iNum2;
		iNum1 = scan.nextInt();
		iNum2 = scan.nextInt();

		while(iNum1 != 0 && iNum2 != 0) {
			System.out.println(iNum1 + iNum2);

			iNum1 = scan.nextInt();
			iNum2 = scan.nextInt();
		}
	}

}
