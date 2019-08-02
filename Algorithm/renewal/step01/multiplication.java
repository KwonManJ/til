import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int iNum1, iNum2;
        iNum1 = scan.nextInt();
        iNum2 = scan.nextInt();

        int N100 = iNum2 / 100;
        int N10 = iNum2 % 100 / 10;
        int N1 = iNum2 % 10;

        System.out.println(iNum1*N1);
        System.out.println(iNum1*N10);
        System.out.println(iNum1*N100);
        System.out.println(iNum1*iNum2);
    }
}
