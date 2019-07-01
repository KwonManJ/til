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
|09|8393|합|
|10|11720|숫자의 합|
|11|11721|열 개씩 끊어 출력하기|
|12|15552|빠른 A+B|

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

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

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

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

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

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

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

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

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

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

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

#### 합

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.|첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.|1부터 n까지 합을 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

}
```

<hr>

#### 숫자의 합

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.|첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.|입력으로 주어진 숫자 N개의 합을 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

		/*
		 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다.

		 둘째 줄에 숫자 N개가 공백없이 주어진다.

		 입력으로 주어진 숫자 N개의 합을 출력한다.
		*/

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		String temp = scan.next();

		int sum=0;

		for(int i=0; i<N; i++) {
			// String >> Char >> int 변환이 핵심인 문제
			sum += temp.charAt(i) - 48;
		}

		System.out.println(sum);
	}

}

```

<hr>

#### 열 개씩 끊어 출력하기

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다. <br><br> 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.|첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.|입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다. 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO
		// 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
		// 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.

		Scanner scan = new Scanner(System.in);
		String N = scan.next();

		int sum = 0;

		for (int i = 0; i < N.length(); i++) {

			if(sum%10 == 0 && sum != 0) {
				System.out.println(" ");
			}

			System.out.print(N.charAt(i));
			sum ++;
		}
	}

}

```

<hr>

#### 빠른 A+B

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|주어진 테스트 케이스 개수 만큼 A, B 두 정수를 입력받아 A+B 를 출력한다.|첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.|각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.|

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 주어진 테스트 케이스 개수 만큼 A, B 두 정수를 입력받아 A+B 를 출력한다.

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		ArrayList<Integer> storage = new ArrayList<>();

		Integer A, B;

		for(int i=0; i<T; i++) {
			A = scan.nextInt();
			B = scan.nextInt();

			storage.add(A);
			storage.add(B);
		}

		for(int i=0; i<T*2; i += 2) {
			System.out.println(storage.get(i) + storage.get(i+1));
		}

	}

}

```

> 이와 같은 방식으로 풀 수 있지만, 문제에서 **시간 제한을 1초**로 두고 있기 때문에 **더 빠른 처리 방식이 필요**하다.

 - **Java**를 사용하고 있다면, `Scanner`와 `System.out.println` 대신 `BufferedReader`와 `BufferedWriter`를 사용할 수 있다.
 - `BufferedWriter.flush`는 맨 마지막에 한 번만 하면 된다.
 - `BufferedReader`와 `BufferedWriter`에 대해서는 [java 포스팅](../Java/bufferedreader_bufferedwriter.md)을 참조하자

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 주어진 테스트 케이스 개수 만큼 A, B 두 정수를 입력받아 A+B 를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		int a, b;

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			bw.write(a+b + "\n");
		}

		bw.flush();
		bw.close();

	}

}
```
