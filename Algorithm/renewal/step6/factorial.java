import java.util.Scanner;

// 10872번
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int iNum;
		iNum = scan.nextInt();

		factorial(iNum);
	}

	public static void factorial(int iNum) {

		int res = 1;

		for(int i = iNum; i > 0; i--) {
			res *= i;
		}

		System.out.println(res);
	}

}
