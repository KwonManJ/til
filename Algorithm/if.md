# 백준 알고리즘

#### 04단계 if문 사용해보기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|9498|시험 성적|
|02|10817|세 수|

<hr>

#### 시험 성적

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|시험 점수를 입력받아 등급을 출력하는 프로그램을 작성하시오.|첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.|시험 성적을 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO

		/*
		90 ~ 100점 A
		80 ~ 89점 B
		70 ~ 79점 C
		60 ~ 69점 D
		나머지 점수는 F
		*/

		int score;

		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();

		if(score>=90) System.out.println("A");
		else if(score>=80) System.out.println("B");
		else if(score>=70) System.out.println("C");
		else if(score>=60) System.out.println("D");
		else System.out.println("F");

	}

}

```

<hr>

#### 세 수

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. |첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)|두 번째로 큰 정수를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 세 정수 A, B, C가 주어진다.
		// 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.

		Scanner scan = new Scanner(System.in);

		int[] input = new int[3];
		int temp;

		for (int i = 0; i < 3; i++) {
			input[i] = scan.nextInt();
		}

		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					temp = input[j];
					input[j] = input[i];
					input[i] = temp;
				}
			}
		}

		System.out.print(input[1]);
	}

}

```

위의 코드는 2중 for문을 이용한 오름차순 정렬 방법이다. 이보다 더 간단한 방법이 있는데 Arrays 클래스의 sort 메소드를 활용하면 된다.

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 세 정수 A, B, C가 주어진다.
		// 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.

		Scanner scan = new Scanner(System.in);

		int[] input = new int[3];

		for (int i = 0; i < 3; i++) {
			input[i] = scan.nextInt();
		}

		Arrays.sort(input);

		System.out.print(input[1]);
	}

}

```

<hr>
