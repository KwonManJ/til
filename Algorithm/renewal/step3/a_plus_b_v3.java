import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int testCase;
		testCase = scan.nextInt();

		int[] numBox = new int[testCase*2];

		for(int i = 0; i < testCase*2; i++) {
			numBox[i] = scan.nextInt();
		}

		for(int i = 0; i < testCase*2; i += 2) {
			System.out.println(numBox[i]+numBox[i+1]);
		}
    
	}

}
