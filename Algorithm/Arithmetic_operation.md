# 백준 알고리즘

#### 02단계 사칙연산 도전하기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|10998|A × B|
|02|1008|A / B|
|03|10869|사칙연산|
|04|10430|나머지|

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
