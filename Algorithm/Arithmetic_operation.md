# 백준 알고리즘

#### 02단계 사칙연산 도전하기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|10998|A × B|
|02|1008|A / B|
|03|10869|사칙연산|
|04|10430|나머지|
|05|2558|A+B - 2|
|06|2839|설탕 배달|

<hr>

#### A × B

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.|첫째 줄에 A와 B가 주어진다. (0<A,B<10)|첫째 줄에 A×B를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

		// 입력값을 저장할 변수 선언
		int A, B;

		// 사용자로부터 입력값을 받을 수 있게 Scanner 객체 생성
		Scanner input = new Scanner(System.in);

		// 사용자의 입력을 int값으로 받는다.
		A = input.nextInt();
		B = input.nextInt();

		// 결과 값 출력
		System.out.print(A*B);

	}

}

```

<hr>

#### A / B

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.|첫째 줄에 A와 B가 주어진다. (0<A,B<10)|첫째 줄에 A/B를 출력한다. 절대/상대 오차는 10<sup>-9</sup> 까지 허용한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

		// 조건 1 : 절대/상대 오차는 10^-9까지 허용한다.

		// 입력값을 저장할 변수 선언
		double A, B;

		// 사용자로부터 입력값을 받을 수 있게 Scanner 객체 생성
		Scanner input = new Scanner(System.in);

		// 사용자의 입력을 int값으로 받는다.
		A = input.nextDouble();
		B = input.nextDouble();

		// 결과 값 출력
		System.out.printf("%.9f", A/B);

	}

}
```

<hr>

#### 사칙연산

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|두 자연수 A와 B가 주어진다. 이 때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.|두 자연수 A와 B가 주어진다. (1<=A, B<=10,000)|첫째줄에 A+B, 둘째줄에 A-B, 셋째줄에 A*B, 넷째줄에 A/B, 다섯째줄에 A%B를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 두 자연수 A와 B가 주어진다. 이 때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

		// 입력값을 저장할 변수 선언
		int A, B;

		// 사용자로부터 입력값을 받을 수 있게 Scanner 객체 생성
		Scanner input = new Scanner(System.in);

		// 사용자의 입력을 int값으로 받는다.
		A = input.nextInt();
		B = input.nextInt();

		// 결과 값 출력
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}

}
```

<hr>

#### 나머지

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|(A+B)%C는 (A%C + B%C)%C와 같을까? <br> (A×B)%C는 (A%C × B%C)%C와 같을까? <br> 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오|첫째 줄에 A, B, C가 순서대로 주어진다. (2<=A, B, C<=10000)|첫째 줄에 (A+B)%C <br> 둘째 줄에 (A%C + B%C)%C <br> 셋째 줄에 (A×B)%C <br> 넷째 줄에 (A%C × B%C)%C를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		  	(A+B)%C는 (A%C + B%C)%C 와 같을까?

			(A×B)%C는 (A%C × B%C)%C 와 같을까?

			세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		 */

		int a, b, c;

		Scanner scanner = new Scanner(System.in);

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		System.out.println((a+b)%c);
		System.out.println((a%c + b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c * b%c)%c);
	}

}

```

<hr>

#### A+B - 2

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.|첫째 줄에 A, 둘째 줄에 B가 주어진다. (0<A, B<10)|첫째 줄에 A+B를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

		Scanner scan = new Scanner(System.in);

		int a, b;

		a = scan.nextInt();
		b = scan.nextInt();

		System.out.println(a+b);
	}

}
```

<hr>

#### 설탕 배달

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 잇다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다. <br> <br> 상근이는 귀찮기 때문에 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다. <br> <br> 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.|첫째 줄에 N이 주어진다. (3<=N<=5000)|상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
		설탕공장에서 만드는 설탕은 봉지에 담겨져 잇다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

		상근이는 귀찮기 때문에 최대한 적은 봉지를 들고 가려고 한다.
		예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만,
		5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

		상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
		*/

		// 더 적은 개수의 봉지를 배달하는 것을 선호하므로
		// 5kg 봉지를 중심으로 로직을 작성한다.

		Scanner scan = new Scanner(System.in);

		int N;
		N = scan.nextInt();

		int quotient = N/5; // 몫
		int remainder = N%5; // 나머지

		switch(remainder) {
		case 0:
			System.out.print(quotient);
			break;

		case 1:
			System.out.println(quotient+1);
			break;

		case 2:
			if(N==7) System.out.println(-1);
			else System.out.println(quotient+2);
			break;

		case 3:
			System.out.println(quotient+1);
			break;

		case 4:
			if(N==4) System.out.println(-1);
			else System.out.println(quotient+2);
			break;
		}
	}

}
```
