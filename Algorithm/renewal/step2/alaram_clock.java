import java.util.Scanner;

// 2884번
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int hour = scan.nextInt();
		int min = scan.nextInt();

		if(min < 45 && hour > 0) {
			hour--;
			min += 15;
			System.out.println(hour + " " + min);
		} else if (min < 45 && hour == 0) {
			hour = 23;
			min += 15;
			System.out.println(hour + " " + min);
		} else if(min > 45) {
			min -= 45;
			System.out.println(hour + " " + min);
		}

	}

}
