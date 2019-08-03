import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int iCase;
		iCase = scan.nextInt();

		int[] iArray = new int[iCase];

		for(int i = 0; i < iArray.length; i++) {
			iArray[i] = scan.nextInt();
		}

		Arrays.sort(iArray);

		System.out.println(iArray[0] + " " + iArray[iArray.length-1]);
	}

}
