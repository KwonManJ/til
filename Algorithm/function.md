# 백준 알고리즘

#### 05단계 함수 사용하기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|4673|셀프 넘버|
|02|1065|한수|
|03|2448|별 찍기 - 11|

<hr>

#### 셀프 넘버

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.|입력은 없다.|10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.|

```java
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO

		/*
		셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다.
		양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자.

		예를 들어, d(75) = 75+7+5 = 87이다.
		양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다.

		예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고,
		그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 이런식으로 다음과 같은 수열을 만들 수 있다.
		33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...

		n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다.
		생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다.

		생성자가 없는 숫자를 셀프 넘버라고 한다.
		100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
		10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		*/

		// 함수에 넣어서 나오는 결과값은 모두 생성자를 가지고 있다는 의미이다.
		// 결과값은 모두 셀프넘버가 아니다(false).



		boolean[] selfNumber = new boolean[10001];

		// 이 코드가 없으면 아무것도 출력되지 않는다.
		// boolean[] 배열의 기본 값은 false 임을 알 수 있다.
		Arrays.fill(selfNumber, true);  

		for(int i = 1; i <= 10000; i++) {
			int compare = d(i);

			if(compare <= 10000) {
				selfNumber[compare] = false;
			}
		}

		for(int i=1; i<selfNumber.length; i++) {
			if(selfNumber[i]) {
				System.out.println(i);
			}
		}
	}

	public static int d(int n) {
		int res = n;

		while(n > 0) {
			res += n%10;
			n /= 10;
		}

		return res;
	}

}
```

<hr>

#### 한수

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.|첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.|첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.|

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean[] isNotHanSu = new boolean[1001];

	public static void main(String[] args) {
		// TODO 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다.
		// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
		// N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

		Scanner scan = new Scanner(System.in);

		int N;
		N = scan.nextInt();

		int sum = 99;
		Arrays.fill(isNotHanSu, true);


		if(N>=100) {

			for(int i = 100; i<=N; i++) {
				findHanSu(i);
			}

			for(int i = 100; i<=N; i++) {
				if(isNotHanSu[i] == false) {
					sum++;
				}
			}

			System.out.print(sum);

		} else {
			System.out.print(N);
		}


	}

	private static void findHanSu(int N) {
		int front;
		int mid;
		int rear;

		rear = N % 10;
		mid = N / 10 % 10;
		front = N / 10 / 10;

		if((mid-front) == (rear - mid)) {

			isNotHanSu[N] = false;
		}

	}

}
```

<hr>

#### 별 찍기 - 11

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.|첫째 줄에 N이 주어진다. N은 항상 3×2<sup>k</sup> 수이다. (3, 6, 12, 24, 48, ...) (k ≤ 10)|첫째 줄부터 N번째 줄까지 별을 출력한다.|

```java

```
