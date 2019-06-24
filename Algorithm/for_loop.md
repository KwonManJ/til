# 백준 알고리즘

#### 03단계 for문 사용해보기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|2741|N 찍기|
|02|2742|기찍 N|
|03|2739|구구단|
|04|2438|별 찍기 - 1|
|05|2439|별 찍기 - 2|
|06|2440|별 찍기 - 3|
|07|2441|별 찍기 - 4|
|08|1924|2007년|

<hr>

#### N 찍기

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.|첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.|첫째 줄부터 N번째 줄 까지 차례대로 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for(int i=1; i<=N; i++) {
			System.out.println(i);
		}
	}

}

```

<hr>

#### 기찍 N

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.|첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.|첫째 줄부터 N번째 줄 까지 차례대로 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for(int i=N; i>0; i--) {
			System.out.println(i);
		}
	}

}

```

<hr>

#### 구구단

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.|첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.|출력형식과 같게 N*1부터 N*9까지 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

		int N;

		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();

		for(int i=1; i<10; i++) {
			System.out.println(N + " * " + i + " = " + N*i);
		}
	}

}

```

<hr>

#### 별 찍기 - 1

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제|첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.|첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

		int N;

		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();

		// 전체루틴
		for(int i=1; i<=N; i++) {

			// 내부루틴
			/*
				전체 루틴에 따라 내부 루틴의 반복횟수가 달라지므로
				전체 루틴의 영향을 받을 수 있게 로직을 작성한다.
			*/
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}

			// 다음 전체루틴으로 넘어가기 전 개행
			System.out.println("");
		}

	}

}

```

<hr>

#### 별 찍기 - 2

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제<br><br>하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.|첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.|첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO

		/*
		 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

		 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		 */

		int N;

		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();

		for(int i=1; i<=N; i++) {

			// 공백 생성
			for(int k=N-i; k>0; k--) {
				System.out.print(" ");
			}

			// 별 찍기
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}

			// 개행
			System.out.println("");

		}
	}

}
```

<hr>

#### 별 찍기 - 3

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제|첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.|첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

		int i; // 전체루틴 변수

		int N;

		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();

		for(i=N; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
```

<hr>

#### 별 찍기 - 4

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제<br><br>하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.|첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.|첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

		 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		 */
		int i; // 전체루틴 변수

		int N;

		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();

		for(i=1; i<=N; i++) {
			for(int j=0; j<i-1; j++) {
				System.out.print(" ");
			}
			for(int k=N; k>i-1; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
```

<hr>

#### 2007년

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.|첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.|첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 오늘은 2007년 1월 1일 월요일이다.
		// 그렇다면 2007년 x월 y일은 무슨 요일일까?
		// 이를 알아내는 프로그램을 작성하시오.

		int x, y;

		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();

		int num=0;

		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for(int i=1; i<=12; i++) {
			if(i==x) {
				break;
			}
			y += months[i];
		}

		int remainder = y%7;

		System.out.println(day[remainder]);
	}

}

```

<hr>
