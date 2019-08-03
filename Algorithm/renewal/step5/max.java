import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> iArray = new ArrayList<Integer>();
		ArrayList<Integer> cArray = new ArrayList<Integer>();

		int cnt = 0;
		iArray.add(scan.nextInt());
		cArray.add(iArray.get(0));

		while(cnt < 8) {
			int temp = scan.nextInt();

			if(iArray.get(cnt) != temp) {
				iArray.add(temp);
				cArray.add(temp);
				cnt++;
			}
		}

		iArray.sort(null);

		System.out.println(iArray.get(cnt));
		System.out.println(cArray.indexOf(iArray.get(cnt))+1);
	}

}
