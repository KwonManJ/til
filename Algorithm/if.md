# 백준 알고리즘

#### 04단계 if문 사용해보기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|9498|시험 성적|
|02|10817|세 수|
|03|10871|X보다 작은 수|
|04|1546|평균|
|05|4344|평균은 넘겠지|
|06|1110|더하기 사이클|

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

		Scanner scan = new Scanner(System.in);

		int score;
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
|세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.|첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)|두 번째로 큰 정수를 출력한다.|

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

#### X보다 작은 수

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.|첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000) <br> <br> 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.|X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
		// 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

		Scanner scan = new Scanner(System.in);

		int N, X;
		N = scan.nextInt();
		X = scan.nextInt();

		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (array[i] < X) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
```

<hr>

#### 평균

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M&#42;100으로 고쳤다. <br> <br> 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70&#42;100이 되어 71.43점이 된다. <br> <br> 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.|첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.|첫째 줄에 새로운 평균을 출력한다. 정답과의 절대/상대 오차는 10<sup>-2</sup>까지 허용한다.|

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO

		/*
		 * 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을
		 * M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		 *
		 * 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
		 *
		 * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
		 */

		Scanner scan = new Scanner(System.in);

		int N;
		N = scan.nextInt();

		double[] array = new double[N];

		for (int i = 0; i < N; i++) {
			array[i] = scan.nextDouble();
		}

		Arrays.sort(array);

		/*
		if문을 사용하면 다음과 같다.

		double M = 0;

		for(int i=0; i<N; i++) {
			if(array[i] > M) {
				M = array[i];
			}
		}

		*/

		double M;
		M = array[N - 1];

		for (int i = 0; i < N; i++) {
			array[i] = array[i] / M * 100;
		}

		double sum = 0;
		double avg;

		for (int i = 0; i < N; i++) {
			sum += array[i];
		}

		avg = sum/N;
		System.out.printf("%.2f", avg);
	}

}
```

<hr>

#### 평균은 넘겠지

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.|첫째 줄에는 테스트 케이스의 개수 C가 주어진다. <br> <br> 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. <br> <br> 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.|각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다.
		// 당신은 그들에게 슬픈 진실을 알려줘야 한다.

		Scanner scan = new Scanner(System.in);

		// 첫째 줄 테스트 케이스
		int testCase;
		testCase = scan.nextInt();

		// 둘째 줄 학생의 수
		int[] student = new int[testCase];

		// 학생들의 점수와 평균을 저장할 배열
		int[][] score = new int[testCase][1000];
		double[] avg = new double[testCase];

		// 테스트 케이스 만큼 입력받을 반복문
		for (int i = 0; i < testCase; i++) {

			int sum = 0;

			// 둘째 줄 학생의 수
			student[i] = scan.nextInt();

			// 학생 수 만큼의 점수
			for (int j = 0; j < student[i]; j++) {
				score[i][j] = scan.nextInt();
				sum += score[i][j];
			}

			avg[i] = (double) sum / student[i];
		}

		for (int i = 0; i < testCase; i++) {

			int cnt = 0;

			// 평균을 넘는 사람의 수 카운트
			for(int j = 0; j < student[i]; j++) {
				if(avg[i]<score[i][j]) {
					cnt++;
				}
			}

			System.out.printf("%.3f%%\n", (double)cnt/student[i]*100);
		}

	}

}
```

<hr>

#### 더하기 사이클

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.|첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.|첫째 줄에 N의 사이클 길이를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO

		/*
		0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
		먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
		그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.

		다음 예를 보자.
		26부터 시작한다.
		2+6 = 8이다. 새로운 수는 68이다.
		6+8 = 14이다. 새로운 수는 84이다.
		8+4 = 12이다. 새로운 수는 42이다.
		4+2 = 6이다. 새로운 수는 26이다.

		위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
		N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
		*/

		Scanner scan = new Scanner(System.in);

		int N;
		N = scan.nextInt();

		int front; // 10의 자리수
		int rear; // 1의 자리수

		int newInt = N; // 새로운 수
		int inter; // 생성되는 사이값
		int cycle = 0; // 사이클

		while(true) {

			front = newInt/10;
			rear = newInt%10;

			inter = front + rear;

			newInt = (rear*10) + (inter%10);

			// 사이클 증가
			cycle++;

			// 최초 N과 새로운 수 비교
			if(newInt == N) {
				break;
			}
		}

		System.out.println(cycle);
	}

}
```
