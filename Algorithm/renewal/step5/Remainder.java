import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] remainder = new int[10];

		for(int i = 0; i < 10; i++) {
			remainder[i] = scan.nextInt() % 42;
		}

		int count = 10;

		for(int i = 0; i < 9; i++) {
			for(int j = i+1; j < 10; j++) {
				if(remainder[i] == remainder[j]) {
					count--;
					break;
				}
			}
		}

		System.out.println(count);

	}

}
